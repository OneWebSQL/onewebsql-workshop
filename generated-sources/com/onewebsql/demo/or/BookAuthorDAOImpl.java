package com.onewebsql.demo.or;

/**
 * DAO (DataAccessObject) implementation for table book_author.
 */
public class BookAuthorDAOImpl extends com.onewebsql.dao.BaseDAO<BookAuthor> implements BookAuthorDAO {
    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     */
    public BookAuthorDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter) {
        super(ds, dbAdapter);
    }

    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     * @param schema database schema DAO is ssociated with.
     */
    public BookAuthorDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter, com.onewebsql.dao.DaoSchema schema) {
        super(ds, dbAdapter, schema);
    }

    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     * @param daoMonitor DAO monitor.
     */
    public BookAuthorDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter, com.onewebsql.dao.DaoMonitor daoMonitor) {
        super(ds, dbAdapter, daoMonitor);
    }

    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     * @param schema database schema DAO is ssociated with.
     * @param daoMonitor DAO monitor.
     */
    public BookAuthorDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter, com.onewebsql.dao.DaoSchema schema, com.onewebsql.dao.DaoMonitor daoMonitor) {
        super(ds, dbAdapter, schema, daoMonitor);
    }

    public BookAuthorDAOTableExpression getTableExpression() {
        return TABLE_EXPRESSION;
    }

    public BookAuthorRowHandler getRowHandler() {
        return BOOK_AUTHOR_ROW_HANDLER;
    }

    public Class<BookAuthor> getPojoClass() {
        return POJO_CLASS;
    }

    public BookAuthor getByPK(java.lang.Integer authorId, java.lang.Integer bookId) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(AUTHOR_ID.eq(authorId).and(BOOK_ID.eq(bookId)));
        return (BookAuthor) selectObject(selectQuery, BOOK_AUTHOR_ROW_HANDLER);
    }

    public java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.demo.or.Book book) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(BOOK_ID.eq(book.getBookId()));
        return selectObjectList(selectQuery, BOOK_AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.demo.or.Book book, com.onewebsql.query.AExp orderByColumn) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(BOOK_ID.eq(book.getBookId()));
        selectQuery.orderBy(orderByColumn);
        return selectObjectList(selectQuery, BOOK_AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.demo.or.Book book, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(BOOK_ID.eq(book.getBookId()));
        selectQuery.orderBy(orderByColumn, orderByDirection);
        return selectObjectList(selectQuery, BOOK_AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.demo.or.Author author) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(AUTHOR_ID.eq(author.getAuthorId()));
        return selectObjectList(selectQuery, BOOK_AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.demo.or.Author author, com.onewebsql.query.AExp orderByColumn) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(AUTHOR_ID.eq(author.getAuthorId()));
        selectQuery.orderBy(orderByColumn);
        return selectObjectList(selectQuery, BOOK_AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.demo.or.Author author, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(AUTHOR_ID.eq(author.getAuthorId()));
        selectQuery.orderBy(orderByColumn, orderByDirection);
        return selectObjectList(selectQuery, BOOK_AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.query.LExp whereClause) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(whereClause);
        return selectObjectList(selectQuery, BOOK_AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(whereClause);
        selectQuery.orderBy(orderByColumn);
        return selectObjectList(selectQuery, BOOK_AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(whereClause);
        selectQuery.orderBy(orderByColumn, orderByDirection);
        return selectObjectList(selectQuery, BOOK_AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<BookAuthor> getBookAuthorList() {
        return getBookAuthorList((com.onewebsql.query.LExp) null);
    }

    public java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.query.AExp orderByColumn) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.orderBy(orderByColumn);
        return selectObjectList(selectQuery, BOOK_AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.query.AExp orderByColumn, boolean orderByDirection) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.orderBy(orderByColumn, orderByDirection);
        return selectObjectList(selectQuery, BOOK_AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.query.SelectQuery selectQuery) {
        return selectObjectList(selectQuery, BOOK_AUTHOR_ROW_HANDLER).getObjectList();
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

    public java.util.Map<com.onewebsql.query.Column, Object> getValuesMap(BookAuthor bookAuthor) {
        java.util.Map<com.onewebsql.query.Column, Object> map = new java.util.HashMap<com.onewebsql.query.Column, Object>(2, 1);
        return map;
    }

    public java.lang.Integer insert(BookAuthor bookAuthor) {
        if (bookAuthor == null) {
            throw new java.lang.IllegalArgumentException("bookAuthor is null");
        }

        com.onewebsql.query.InsertQuery insertStatement = new com.onewebsql.query.InsertQuery(TABLE_EXPRESSION);
        java.util.Map<com.onewebsql.query.Column, Object> valuesMap = getValuesMap(bookAuthor);
        valuesMap.put(AUTHOR_ID, bookAuthor.getAuthorId());
        valuesMap.put(BOOK_ID, bookAuthor.getBookId());
        insertStatement.values(valuesMap);
        return insert(insertStatement);
    }

    public java.util.List<Integer> insert(java.util.Collection<BookAuthor> bookAuthorList) {
        if (bookAuthorList == null) {
            throw new java.lang.IllegalArgumentException("bookAuthorList is null");
        }

        int c = 0;
        java.util.List<Integer> results = new java.util.ArrayList<Integer>(bookAuthorList.size());
        com.onewebsql.query.InsertQuery insertStatement = new com.onewebsql.query.InsertQuery(TABLE_EXPRESSION);
        java.util.Iterator<BookAuthor> i = bookAuthorList.iterator();
        while(i.hasNext()) {
            BookAuthor bookAuthor = i.next();
            if (bookAuthor == null) {
                throw new java.lang.IllegalArgumentException("bookAuthorList element at index "+c+" is null");
            }

            java.util.Map<com.onewebsql.query.Column, Object> valuesMap = getValuesMap(bookAuthor);
            valuesMap.put(AUTHOR_ID, bookAuthor.getAuthorId());
            valuesMap.put(BOOK_ID, bookAuthor.getBookId());
            insertStatement.values(valuesMap);
            results.add(insert(insertStatement));
            c++;
        }

        return results;
    }

    public java.lang.Integer update(BookAuthor bookAuthor) {
        if (bookAuthor == null) {
            throw new java.lang.IllegalArgumentException("bookAuthor is null");
        }

        com.onewebsql.query.UpdateQuery updateStatement = new com.onewebsql.query.UpdateQuery(TABLE_EXPRESSION);
        updateStatement.set(getValuesMap(bookAuthor));
        updateStatement.setWhere(AUTHOR_ID.eq(bookAuthor.getAuthorId()).and(BOOK_ID.eq(bookAuthor.getBookId())));
        return update(updateStatement);
    }

    public java.util.List<Integer> update(java.util.Collection<BookAuthor> bookAuthorList) {
        if (bookAuthorList == null) {
            throw new java.lang.IllegalArgumentException("bookAuthorList is null");
        }

        int c = 0;
        java.util.List<Integer> results = new java.util.ArrayList<Integer>(bookAuthorList.size());
        com.onewebsql.query.UpdateQuery updateStatement = new com.onewebsql.query.UpdateQuery(TABLE_EXPRESSION);
        java.util.Iterator<BookAuthor> i = bookAuthorList.iterator();
        while(i.hasNext()) {
            BookAuthor bookAuthor = i.next();
            if (bookAuthor == null) {
                throw new java.lang.IllegalArgumentException("bookAuthorList element at index "+c+" is null");
            }

            updateStatement.set(getValuesMap(bookAuthor));
            updateStatement.setWhere(AUTHOR_ID.eq(bookAuthor.getAuthorId()).and(BOOK_ID.eq(bookAuthor.getBookId())));
            results.add(update(updateStatement));
            c++;
        }

        return results;
    }

    public java.lang.Integer delete(java.lang.Integer authorId, java.lang.Integer bookId) {
        com.onewebsql.query.DeleteQuery deleteStatement = new com.onewebsql.query.DeleteQuery(TABLE_EXPRESSION);
        deleteStatement.setWhere(AUTHOR_ID.eq(authorId).and(BOOK_ID.eq(bookId)));
        return delete(deleteStatement);
    }

    public java.lang.Integer delete(BookAuthor bookAuthor) {
        if (bookAuthor == null) {
            throw new java.lang.IllegalArgumentException("bookAuthor is null");
        }

        com.onewebsql.query.DeleteQuery deleteStatement = new com.onewebsql.query.DeleteQuery(TABLE_EXPRESSION);
        deleteStatement.setWhere(AUTHOR_ID.eq(bookAuthor.getAuthorId()).and(BOOK_ID.eq(bookAuthor.getBookId())));
        return delete(deleteStatement);
    }

    public java.util.List<Integer> delete(java.util.Collection<BookAuthor> bookAuthorList) {
        if (bookAuthorList == null) {
            throw new java.lang.IllegalArgumentException("bookAuthorList is null");
        }

        int c = 0;
        java.util.List<Integer> results = new java.util.ArrayList<Integer>(bookAuthorList.size());
        com.onewebsql.query.DeleteQuery deleteStatement = new com.onewebsql.query.DeleteQuery(TABLE_EXPRESSION);
        java.util.Iterator<BookAuthor> i = bookAuthorList.iterator();
        while(i.hasNext()) {
            BookAuthor bookAuthor = i.next();
            if (bookAuthor == null) {
                throw new java.lang.IllegalArgumentException("bookAuthorList element at index "+c+" is null");
            }

            deleteStatement.setWhere(AUTHOR_ID.eq(bookAuthor.getAuthorId()).and(BOOK_ID.eq(bookAuthor.getBookId())));
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

    public boolean equalPrimaryKeys(BookAuthor bookAuthor1, BookAuthor bookAuthor2) {
        boolean isEquals = true;
        if (bookAuthor1.authorId != bookAuthor2.authorId) {
            if (bookAuthor1.authorId == null || bookAuthor2.authorId == null) {
                return false;
            }

            isEquals = isEquals && bookAuthor1.authorId.equals(bookAuthor2.authorId);
        }

        if (bookAuthor1.bookId != bookAuthor2.bookId) {
            if (bookAuthor1.bookId == null || bookAuthor2.bookId == null) {
                return false;
            }

            isEquals = isEquals && bookAuthor1.bookId.equals(bookAuthor2.bookId);
        }

        return isEquals;
    }

}

