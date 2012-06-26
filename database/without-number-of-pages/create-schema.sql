/*==============================================================*/
/* DBMS name:      PostgreSQL 7.3                               */
/* Created on:     2012-06-11 14:27:24                          */
/*==============================================================*/


create sequence author_seq
start 10000;

create sequence book_seq
start 10000;

/*==============================================================*/
/* Table: author                                                */
/*==============================================================*/
create table author (
author_id            INT4                 not null,
name                 VARCHAR(100)         not null,
constraint PK_AUTHOR primary key (author_id)
);

/*==============================================================*/
/* Table: book                                                  */
/*==============================================================*/
create table book (
book_id              INT4                 not null,
title                VARCHAR(128)         not null,
publication_year     INT4                 not null,
category_code        VARCHAR(16)          not null,
constraint PK_BOOK primary key (book_id)
);

/*==============================================================*/
/* Table: book_author                                           */
/*==============================================================*/
create table book_author (
author_id            INT4                 not null,
book_id              INT4                 not null,
constraint PK_BOOK_AUTHOR primary key (author_id, book_id)
);

/*==============================================================*/
/* Table: category                                              */
/*==============================================================*/
create table category (
category_code        VARCHAR(16)          not null,
category_name        VARCHAR(100)         not null,
constraint PK_CATEGORY primary key (category_code)
);

/*==============================================================*/
/* View: book_with_author                                       */
/*==============================================================*/
create view book_with_author as
SELECT
    book.book_id,
    book.category_code,
    category.category_name,
    book.title,
    book.publication_year
FROM
    book JOIN category 
    ON book.category_code = category.category_code;

alter table book
   add constraint FK_BOOK_REFERENCE_CATEGORY foreign key (category_code)
      references category (category_code)
      on delete restrict on update restrict;

alter table book_author
   add constraint FK_BOOK_AUT_REFERENCE_BOOK foreign key (book_id)
      references book (book_id)
      on delete restrict on update restrict;

alter table book_author
   add constraint FK_BOOK_AUT_REFERENCE_AUTHOR foreign key (author_id)
      references author (author_id)
      on delete restrict on update restrict;

