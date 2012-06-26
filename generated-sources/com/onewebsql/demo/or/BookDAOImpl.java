package com.onewebsql.demo.or;

/**
 * DAO (DataAccessObject) implementation for table book.
 */
public class BookDAOImpl extends com.onewebsql.dao.BaseDAO<Book> implements BookDAO {
    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     */
    public BookDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter) {
        super(ds, dbAdapter);
    }

    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     * @param schema database schema DAO is ssociated with.
     */
    public BookDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter, com.onewebsql.dao.DaoSchema schema) {
        super(ds, dbAdapter, schema);
    }

    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     * @param daoMonitor DAO monitor.
     */
    public BookDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter, com.onewebsql.dao.DaoMonitor daoMonitor) {
        super(ds, dbAdapter, daoMonitor);
    }

    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     * @param schema database schema DAO is ssociated with.
     * @param daoMonitor DAO monitor.
     */
    public BookDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter, com.onewebsql.dao.DaoSchema schema, com.onewebsql.dao.DaoMonitor daoMonitor) {
        super(ds, dbAdapter, schema, daoMonitor);
    }

    public Long getNextId() {
        return getNextId(TABLE_EXPRESSION);
    }

    public BookDAOTableExpression getTableExpression() {
        return TABLE_EXPRESSION;
    }

    public BookRowHandler getRowHandler() {
        return BOOK_ROW_HANDLER;
    }

    public Class<Book> getPojoClass() {
        return POJO_CLASS;
    }

    public Book getByPK(java.lang.Integer bookId) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(BOOK_ID.eq(bookId));
        return (Book) selectObject(selectQuery, BOOK_ROW_HANDLER);
    }

    public java.util.List<Book> getBookList(com.onewebsql.demo.or.Category category) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(CATEGORY_CODE.eq(category.getCategoryCode()));
        return selectObjectList(selectQuery, BOOK_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Book> getBookList(com.onewebsql.demo.or.Category category, com.onewebsql.query.AExp orderByColumn) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(CATEGORY_CODE.eq(category.getCategoryCode()));
        selectQuery.orderBy(orderByColumn);
        return selectObjectList(selectQuery, BOOK_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Book> getBookList(com.onewebsql.demo.or.Category category, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(CATEGORY_CODE.eq(category.getCategoryCode()));
        selectQuery.orderBy(orderByColumn, orderByDirection);
        return selectObjectList(selectQuery, BOOK_ROW_HANDLER).getObjectList();
    }

    public Book getBook(com.onewebsql.demo.or.BookAuthor bookAuthor) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(BOOK_ID.eq(bookAuthor.getBookId()));
        return (Book) selectObject(selectQuery, BOOK_ROW_HANDLER);
    }

    public java.util.List<Book> getBookList(com.onewebsql.query.LExp whereClause) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(whereClause);
        return selectObjectList(selectQuery, BOOK_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Book> getBookList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(whereClause);
        selectQuery.orderBy(orderByColumn);
        return selectObjectList(selectQuery, BOOK_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Book> getBookList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(whereClause);
        selectQuery.orderBy(orderByColumn, orderByDirection);
        return selectObjectList(selectQuery, BOOK_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Book> getBookList() {
        return getBookList((com.onewebsql.query.LExp) null);
    }

    public java.util.List<Book> getBookList(com.onewebsql.query.AExp orderByColumn) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.orderBy(orderByColumn);
        return selectObjectList(selectQuery, BOOK_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Book> getBookList(com.onewebsql.query.AExp orderByColumn, boolean orderByDirection) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.orderBy(orderByColumn, orderByDirection);
        return selectObjectList(selectQuery, BOOK_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Book> getBookList(com.onewebsql.query.SelectQuery selectQuery) {
        return selectObjectList(selectQuery, BOOK_ROW_HANDLER).getObjectList();
    }

    public Long getCount() {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION,
        com.onewebsql.query.AExp.fun("count", new com.onewebsql.query.VirtualColumn("*")));
        return selectObject(selectQuery, com.onewebsql.util.jdbc.LongRowHandler.INSTANCE);
    }

    public Long getCount(com.onewebsql.query.LExp whereClause) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION,
        com.onewebsql.query.AExp.fun("count", new com.onewebsql.query.VirtualColumn("*")));
        selectQuery.setWhere(whereClause);
        return selectObject(selectQuery, com.onewebsql.util.jdbc.LongRowHandler.INSTANCE);
    }

    public <U> U aggregateFunction(String name, com.onewebsql.query.AExp argExpr) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION,
        com.onewebsql.query.AExp.fun(name, argExpr));
        return selectObject(selectQuery, new com.onewebsql.util.jdbc.SingleColumnObjectRowHandler<U>());
    }

    public <U> U aggregateFunction(String name, com.onewebsql.query.AExp argExpr, com.onewebsql.query.LExp whereClause) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION,
        com.onewebsql.query.AExp.fun(name, argExpr));
        selectQuery.setWhere(whereClause);
        return selectObject(selectQuery, new com.onewebsql.util.jdbc.SingleColumnObjectRowHandler<U>());
    }

    public java.util.Map<com.onewebsql.query.Column, Object> getValuesMap(Book book) {
        java.util.Map<com.onewebsql.query.Column, Object> map = new java.util.HashMap<com.onewebsql.query.Column, Object>(5, 1);
        map.put(CATEGORY_CODE, book.getCategoryCode());
        map.put(NUMBER_OF_PAGES, book.getNumberOfPages());
        map.put(PUBLICATION_YEAR, book.getPublicationYear());
        map.put(TITLE, book.getTitle());
        return map;
    }

    public java.lang.Integer insert(Book book) {
        if (book == null) {
            throw new java.lang.IllegalArgumentException("book is null");
        }

        com.onewebsql.query.InsertQuery insertStatement = new com.onewebsql.query.InsertQuery(TABLE_EXPRESSION);
        java.util.Map<com.onewebsql.query.Column, Object> values = getValuesMap(book);
        java.lang.Integer id = book.getBookId();
        if (id != null) {
            values.put(BOOK_ID, id);
        } else {
            id = new java.lang.Integer(getNextId().intValue());
            book.setBookId(id);
            values.put(BOOK_ID, id);
        }

        insertStatement.values(values);
        return insert(insertStatement);
    }

    public java.util.List<Integer> insert(java.util.Collection<Book> bookList) {
        if (bookList == null) {
            throw new java.lang.IllegalArgumentException("bookList is null");
        }

        int c = 0;
        java.util.List<Integer> results = new java.util.ArrayList<Integer>(bookList.size());
        com.onewebsql.query.InsertQuery insertStatement = new com.onewebsql.query.InsertQuery(TABLE_EXPRESSION);
        java.util.Iterator<Book> i = bookList.iterator();
        while(i.hasNext()) {
            Book book = i.next();
            if (book == null) {
                throw new java.lang.IllegalArgumentException("bookList element at index "+c+" is null");
            }

            java.util.Map<com.onewebsql.query.Column, Object> values = getValuesMap(book);
            java.lang.Integer id = book.getBookId();
            if (id != null) {
                values.put(BOOK_ID, id);
            } else {
                id = new java.lang.Integer(getNextId().intValue());
                book.setBookId(id);
                values.put(BOOK_ID, id);
            }

            insertStatement.values(values);
            results.add(insert(insertStatement));
            c++;
        }

        return results;
    }

    public java.lang.Integer update(Book book) {
        if (book == null) {
            throw new java.lang.IllegalArgumentException("book is null");
        }

        com.onewebsql.query.UpdateQuery updateStatement = new com.onewebsql.query.UpdateQuery(TABLE_EXPRESSION);
        updateStatement.set(getValuesMap(book));
        updateStatement.setWhere(BOOK_ID.eq(book.getBookId()));
        return update(updateStatement);
    }

    public java.util.List<Integer> update(java.util.Collection<Book> bookList) {
        if (bookList == null) {
            throw new java.lang.IllegalArgumentException("bookList is null");
        }

        int c = 0;
        java.util.List<Integer> results = new java.util.ArrayList<Integer>(bookList.size());
        com.onewebsql.query.UpdateQuery updateStatement = new com.onewebsql.query.UpdateQuery(TABLE_EXPRESSION);
        java.util.Iterator<Book> i = bookList.iterator();
        while(i.hasNext()) {
            Book book = i.next();
            if (book == null) {
                throw new java.lang.IllegalArgumentException("bookList element at index "+c+" is null");
            }

            updateStatement.set(getValuesMap(book));
            updateStatement.setWhere(BOOK_ID.eq(book.getBookId()));
            results.add(update(updateStatement));
            c++;
        }

        return results;
    }

    public java.lang.Integer delete(java.lang.Integer bookId) {
        com.onewebsql.query.DeleteQuery deleteStatement = new com.onewebsql.query.DeleteQuery(TABLE_EXPRESSION);
        deleteStatement.setWhere(BOOK_ID.eq(bookId));
        return delete(deleteStatement);
    }

    public java.lang.Integer delete(Book book) {
        if (book == null) {
            throw new java.lang.IllegalArgumentException("book is null");
        }

        com.onewebsql.query.DeleteQuery deleteStatement = new com.onewebsql.query.DeleteQuery(TABLE_EXPRESSION);
        deleteStatement.setWhere(BOOK_ID.eq(book.getBookId()));
        return delete(deleteStatement);
    }

    public java.util.List<Integer> delete(java.util.Collection<Book> bookList) {
        if (bookList == null) {
            throw new java.lang.IllegalArgumentException("bookList is null");
        }

        int c = 0;
        java.util.List<Integer> results = new java.util.ArrayList<Integer>(bookList.size());
        com.onewebsql.query.DeleteQuery deleteStatement = new com.onewebsql.query.DeleteQuery(TABLE_EXPRESSION);
        java.util.Iterator<Book> i = bookList.iterator();
        while(i.hasNext()) {
            Book book = i.next();
            if (book == null) {
                throw new java.lang.IllegalArgumentException("bookList element at index "+c+" is null");
            }

            deleteStatement.setWhere(BOOK_ID.eq(book.getBookId()));
            results.add(delete(deleteStatement));
            c++;
        }

        return results;
    }

    public java.lang.Integer update(java.util.Map<com.onewebsql.query.Column, ? extends Object> valuesMap, com.onewebsql.query.LExp whereClause) {
        com.onewebsql.query.UpdateQuery updateStatement = new com.onewebsql.query.UpdateQuery(TABLE_EXPRESSION);
        updateStatement.set(valuesMap);
        updateStatement.setWhere(whereClause);
        return update(updateStatement);
    }

    public java.lang.Integer delete(com.onewebsql.query.LExp whereClause) {
        com.onewebsql.query.DeleteQuery deleteStatement = new com.onewebsql.query.DeleteQuery(TABLE_EXPRESSION);
        deleteStatement.setWhere(whereClause);
        return delete(deleteStatement);
    }

    public boolean equalPrimaryKeys(Book book1, Book book2) {
        boolean isEquals = true;
        if (book1.bookId != book2.bookId) {
            if (book1.bookId == null || book2.bookId == null) {
                return false;
            }

            isEquals = isEquals && book1.bookId.equals(book2.bookId);
        }

        return isEquals;
    }

}

