package com.onewebsql.demo.or;

/**
 * DAO (DataAccessObject) implementation for table category.
 */
public class CategoryDAOImpl extends com.onewebsql.dao.BaseDAO<Category> implements CategoryDAO {
    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     */
    public CategoryDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter) {
        super(ds, dbAdapter);
    }

    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     * @param schema database schema DAO is ssociated with.
     */
    public CategoryDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter, com.onewebsql.dao.DaoSchema schema) {
        super(ds, dbAdapter, schema);
    }

    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     * @param daoMonitor DAO monitor.
     */
    public CategoryDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter, com.onewebsql.dao.DaoMonitor daoMonitor) {
        super(ds, dbAdapter, daoMonitor);
    }

    /**
     * Constructor.
     * @param ds datasource associated with DAO.
     * @param dbAdapter database adapter associated with DAO.
     * @param schema database schema DAO is ssociated with.
     * @param daoMonitor DAO monitor.
     */
    public CategoryDAOImpl(javax.sql.DataSource ds, com.onewebsql.query.DBAdapter dbAdapter, com.onewebsql.dao.DaoSchema schema, com.onewebsql.dao.DaoMonitor daoMonitor) {
        super(ds, dbAdapter, schema, daoMonitor);
    }

    public CategoryDAOTableExpression getTableExpression() {
        return TABLE_EXPRESSION;
    }

    public CategoryRowHandler getRowHandler() {
        return CATEGORY_ROW_HANDLER;
    }

    public Class<Category> getPojoClass() {
        return POJO_CLASS;
    }

    public Category getByPK(java.lang.String categoryCode) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(CATEGORY_CODE.eq(categoryCode));
        return (Category) selectObject(selectQuery, CATEGORY_ROW_HANDLER);
    }

    public Category getCategory(com.onewebsql.demo.or.Book book) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(CATEGORY_CODE.eq(book.getCategoryCode()));
        return (Category) selectObject(selectQuery, CATEGORY_ROW_HANDLER);
    }

    public java.util.List<Category> getCategoryList(com.onewebsql.query.LExp whereClause) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(whereClause);
        return selectObjectList(selectQuery, CATEGORY_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Category> getCategoryList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(whereClause);
        selectQuery.orderBy(orderByColumn);
        return selectObjectList(selectQuery, CATEGORY_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Category> getCategoryList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.setWhere(whereClause);
        selectQuery.orderBy(orderByColumn, orderByDirection);
        return selectObjectList(selectQuery, CATEGORY_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Category> getCategoryList() {
        return getCategoryList((com.onewebsql.query.LExp) null);
    }

    public java.util.List<Category> getCategoryList(com.onewebsql.query.AExp orderByColumn) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.orderBy(orderByColumn);
        return selectObjectList(selectQuery, CATEGORY_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Category> getCategoryList(com.onewebsql.query.AExp orderByColumn, boolean orderByDirection) {
        com.onewebsql.query.SelectQuery selectQuery = new com.onewebsql.query.SelectQuery(TABLE_EXPRESSION);
        selectQuery.orderBy(orderByColumn, orderByDirection);
        return selectObjectList(selectQuery, CATEGORY_ROW_HANDLER).getObjectList();
    }

    public java.util.List<Category> getCategoryList(com.onewebsql.query.SelectQuery selectQuery) {
        return selectObjectList(selectQuery, CATEGORY_ROW_HANDLER).getObjectList();
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

    public java.util.Map<com.onewebsql.query.Column, Object> getValuesMap(Category category) {
        java.util.Map<com.onewebsql.query.Column, Object> map = new java.util.HashMap<com.onewebsql.query.Column, Object>(2, 1);
        map.put(CATEGORY_NAME, category.getCategoryName());
        return map;
    }

    public java.lang.Integer insert(Category category) {
        if (category == null) {
            throw new java.lang.IllegalArgumentException("category is null");
        }

        com.onewebsql.query.InsertQuery insertStatement = new com.onewebsql.query.InsertQuery(TABLE_EXPRESSION);
        java.util.Map<com.onewebsql.query.Column, Object> values = getValuesMap(category);
        java.lang.String id = category.getCategoryCode();
        values.put(CATEGORY_CODE, id);
        insertStatement.values(values);
        return insert(insertStatement);
    }

    public java.util.List<Integer> insert(java.util.Collection<Category> categoryList) {
        if (categoryList == null) {
            throw new java.lang.IllegalArgumentException("categoryList is null");
        }

        int c = 0;
        java.util.List<Integer> results = new java.util.ArrayList<Integer>(categoryList.size());
        com.onewebsql.query.InsertQuery insertStatement = new com.onewebsql.query.InsertQuery(TABLE_EXPRESSION);
        java.util.Iterator<Category> i = categoryList.iterator();
        while(i.hasNext()) {
            Category category = i.next();
            if (category == null) {
                throw new java.lang.IllegalArgumentException("categoryList element at index "+c+" is null");
            }

            java.util.Map<com.onewebsql.query.Column, Object> values = getValuesMap(category);
            java.lang.String id = category.getCategoryCode();
            values.put(CATEGORY_CODE, id);
            insertStatement.values(values);
            results.add(insert(insertStatement));
            c++;
        }

        return results;
    }

    public java.lang.Integer update(Category category) {
        if (category == null) {
            throw new java.lang.IllegalArgumentException("category is null");
        }

        com.onewebsql.query.UpdateQuery updateStatement = new com.onewebsql.query.UpdateQuery(TABLE_EXPRESSION);
        updateStatement.set(getValuesMap(category));
        updateStatement.setWhere(CATEGORY_CODE.eq(category.getCategoryCode()));
        return update(updateStatement);
    }

    public java.util.List<Integer> update(java.util.Collection<Category> categoryList) {
        if (categoryList == null) {
            throw new java.lang.IllegalArgumentException("categoryList is null");
        }

        int c = 0;
        java.util.List<Integer> results = new java.util.ArrayList<Integer>(categoryList.size());
        com.onewebsql.query.UpdateQuery updateStatement = new com.onewebsql.query.UpdateQuery(TABLE_EXPRESSION);
        java.util.Iterator<Category> i = categoryList.iterator();
        while(i.hasNext()) {
            Category category = i.next();
            if (category == null) {
                throw new java.lang.IllegalArgumentException("categoryList element at index "+c+" is null");
            }

            updateStatement.set(getValuesMap(category));
            updateStatement.setWhere(CATEGORY_CODE.eq(category.getCategoryCode()));
            results.add(update(updateStatement));
            c++;
        }

        return results;
    }

    public java.lang.Integer delete(java.lang.String categoryCode) {
        com.onewebsql.query.DeleteQuery deleteStatement = new com.onewebsql.query.DeleteQuery(TABLE_EXPRESSION);
        deleteStatement.setWhere(CATEGORY_CODE.eq(categoryCode));
        return delete(deleteStatement);
    }

    public java.lang.Integer delete(Category category) {
        if (category == null) {
            throw new java.lang.IllegalArgumentException("category is null");
        }

        com.onewebsql.query.DeleteQuery deleteStatement = new com.onewebsql.query.DeleteQuery(TABLE_EXPRESSION);
        deleteStatement.setWhere(CATEGORY_CODE.eq(category.getCategoryCode()));
        return delete(deleteStatement);
    }

    public java.util.List<Integer> delete(java.util.Collection<Category> categoryList) {
        if (categoryList == null) {
            throw new java.lang.IllegalArgumentException("categoryList is null");
        }

        int c = 0;
        java.util.List<Integer> results = new java.util.ArrayList<Integer>(categoryList.size());
        com.onewebsql.query.DeleteQuery deleteStatement = new com.onewebsql.query.DeleteQuery(TABLE_EXPRESSION);
        java.util.Iterator<Category> i = categoryList.iterator();
        while(i.hasNext()) {
            Category category = i.next();
            if (category == null) {
                throw new java.lang.IllegalArgumentException("categoryList element at index "+c+" is null");
            }

            deleteStatement.setWhere(CATEGORY_CODE.eq(category.getCategoryCode()));
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

    public boolean equalPrimaryKeys(Category category1, Category category2) {
        boolean isEquals = true;
        if (category1.categoryCode != category2.categoryCode) {
            if (category1.categoryCode == null || category2.categoryCode == null) {
                return false;
            }

            isEquals = isEquals && category1.categoryCode.equals(category2.categoryCode);
        }

        return isEquals;
    }

}

