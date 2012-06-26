package com.onewebsql.demo.or;

/**
 * DAO (DataAccessObject) implementation for table author.
 */
public class AuthorDAOImpl extends com.onewebsql.dao.BaseDAO<Author> implements AuthorDAO {
    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     */
    public AuthorDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter) {
        super(ds, dbAdapter);
    }

    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     * @param schema database schema DAO is ssociated with.
     */
    public AuthorDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter, com.onewebsql.dao.DaoSchema schema) {
        super(ds, dbAdapter, schema);
    }

    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     * @param daoMonitor DAO monitor.
     */
    public AuthorDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter, com.onewebsql.dao.DaoMonitor daoMonitor) {
        super(ds, dbAdapter, daoMonitor);
    }

    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     * @param schema database schema DAO is ssociated with.
     * @param daoMonitor DAO monitor.
     */
    public AuthorDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter, com.onewebsql.dao.DaoSchema schema, com.onewebsql.dao.DaoMonitor daoMonitor) {
        super(ds, dbAdapter, schema, daoMonitor);
    }

    public Long getNextId() {
        return getNextId(TABLE_EXPRESSION);
    }

    public AuthorDAOTableExpression getTableExpression() {
        return TABLE_EXPRESSION;
    }

    public AuthorRowHandler getRowHandler() {
        return AUTHOR_ROW_HANDLER;
    }

    public Class<Author> getPojoClass() {
        return POJO_CLASS;
    }

    public Author getByPK(java.lang.Integer authorId) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(AUTHOR_ID.eq(authorId));
        return (Author) selectObject(selectQuery, AUTHOR_ROW_HANDLER);
    }

    public Author getAuthor(com.onewebsql.demo.or.BookAuthor bookAuthor) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(AUTHOR_ID.eq(bookAuthor.getAuthorId()));
        return (Author) selectObject(selectQuery, AUTHOR_ROW_HANDLER);
    }

    public java.util.List<Author> getAuthorList(com.onewebsql.query.LExp whereClause) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(whereClause);
        return selectObjectList(selectQuery, AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Author> getAuthorList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(whereClause);
        selectQuery.orderBy(orderByColumn);
        return selectObjectList(selectQuery, AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Author> getAuthorList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(whereClause);
        selectQuery.orderBy(orderByColumn, orderByDirection);
        return selectObjectList(selectQuery, AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Author> getAuthorList() {
        return getAuthorList((com.onewebsql.query.LExp) null);
    }

    public java.util.List<Author> getAuthorList(com.onewebsql.query.AExp orderByColumn) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.orderBy(orderByColumn);
        return selectObjectList(selectQuery, AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Author> getAuthorList(com.onewebsql.query.AExp orderByColumn, boolean orderByDirection) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.orderBy(orderByColumn, orderByDirection);
        return selectObjectList(selectQuery, AUTHOR_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Author> getAuthorList(com.onewebsql.query.SelectQuery selectQuery) {
        return selectObjectList(selectQuery, AUTHOR_ROW_HANDLER).getObjectList();
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

    public java.util.Map<com.onewebsql.query.Column, Object> getValuesMap(Author author) {
        java.util.Map<com.onewebsql.query.Column, Object> map = new java.util.HashMap<com.onewebsql.query.Column, Object>(2, 1);
        map.put(NAME, author.getName());
        return map;
    }

    public java.lang.Integer insert(Author author) {
        if (author == null) {
            throw new java.lang.IllegalArgumentException("author is null");
        }

        com.onewebsql.query.InsertQuery insertStatement = new com.onewebsql.query.InsertQuery(TABLE_EXPRESSION);
        java.util.Map<com.onewebsql.query.Column, Object> values = getValuesMap(author);
        java.lang.Integer id = author.getAuthorId();
        if (id != null) {
            values.put(AUTHOR_ID, id);
        } else {
            id = new java.lang.Integer(getNextId().intValue());
            author.setAuthorId(id);
            values.put(AUTHOR_ID, id);
        }

        insertStatement.values(values);
        return insert(insertStatement);
    }

    public java.util.List<Integer> insert(java.util.Collection<Author> authorList) {
        if (authorList == null) {
            throw new java.lang.IllegalArgumentException("authorList is null");
        }

        int c = 0;
        java.util.List<Integer> results = new java.util.ArrayList<Integer>(authorList.size());
        com.onewebsql.query.InsertQuery insertStatement = new com.onewebsql.query.InsertQuery(TABLE_EXPRESSION);
        java.util.Iterator<Author> i = authorList.iterator();
        while(i.hasNext()) {
            Author author = i.next();
            if (author == null) {
                throw new java.lang.IllegalArgumentException("authorList element at index "+c+" is null");
            }

            java.util.Map<com.onewebsql.query.Column, Object> values = getValuesMap(author);
            java.lang.Integer id = author.getAuthorId();
            if (id != null) {
                values.put(AUTHOR_ID, id);
            } else {
                id = new java.lang.Integer(getNextId().intValue());
                author.setAuthorId(id);
                values.put(AUTHOR_ID, id);
            }

            insertStatement.values(values);
            results.add(insert(insertStatement));
            c++;
        }

        return results;
    }

    public java.lang.Integer update(Author author) {
        if (author == null) {
            throw new java.lang.IllegalArgumentException("author is null");
        }

        com.onewebsql.query.UpdateQuery updateStatement = new com.onewebsql.query.UpdateQuery(TABLE_EXPRESSION);
        updateStatement.set(getValuesMap(author));
        updateStatement.setWhere(AUTHOR_ID.eq(author.getAuthorId()));
        return update(updateStatement);
    }

    public java.util.List<Integer> update(java.util.Collection<Author> authorList) {
        if (authorList == null) {
            throw new java.lang.IllegalArgumentException("authorList is null");
        }

        int c = 0;
        java.util.List<Integer> results = new java.util.ArrayList<Integer>(authorList.size());
        com.onewebsql.query.UpdateQuery updateStatement = new com.onewebsql.query.UpdateQuery(TABLE_EXPRESSION);
        java.util.Iterator<Author> i = authorList.iterator();
        while(i.hasNext()) {
            Author author = i.next();
            if (author == null) {
                throw new java.lang.IllegalArgumentException("authorList element at index "+c+" is null");
            }

            updateStatement.set(getValuesMap(author));
            updateStatement.setWhere(AUTHOR_ID.eq(author.getAuthorId()));
            results.add(update(updateStatement));
            c++;
        }

        return results;
    }

    public java.lang.Integer delete(java.lang.Integer authorId) {
        com.onewebsql.query.DeleteQuery deleteStatement = new com.onewebsql.query.DeleteQuery(TABLE_EXPRESSION);
        deleteStatement.setWhere(AUTHOR_ID.eq(authorId));
        return delete(deleteStatement);
    }

    public java.lang.Integer delete(Author author) {
        if (author == null) {
            throw new java.lang.IllegalArgumentException("author is null");
        }

        com.onewebsql.query.DeleteQuery deleteStatement = new com.onewebsql.query.DeleteQuery(TABLE_EXPRESSION);
        deleteStatement.setWhere(AUTHOR_ID.eq(author.getAuthorId()));
        return delete(deleteStatement);
    }

    public java.util.List<Integer> delete(java.util.Collection<Author> authorList) {
        if (authorList == null) {
            throw new java.lang.IllegalArgumentException("authorList is null");
        }

        int c = 0;
        java.util.List<Integer> results = new java.util.ArrayList<Integer>(authorList.size());
        com.onewebsql.query.DeleteQuery deleteStatement = new com.onewebsql.query.DeleteQuery(TABLE_EXPRESSION);
        java.util.Iterator<Author> i = authorList.iterator();
        while(i.hasNext()) {
            Author author = i.next();
            if (author == null) {
                throw new java.lang.IllegalArgumentException("authorList element at index "+c+" is null");
            }

            deleteStatement.setWhere(AUTHOR_ID.eq(author.getAuthorId()));
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

    public boolean equalPrimaryKeys(Author author1, Author author2) {
        boolean isEquals = true;
        if (author1.authorId != author2.authorId) {
            if (author1.authorId == null || author2.authorId == null) {
                return false;
            }

            isEquals = isEquals && author1.authorId.equals(author2.authorId);
        }

        return isEquals;
    }

}

