package com.onewebsql.demo.or;

/**
 * DAO (DataAccessObject) interface for table category.
 */
public interface CategoryDAO extends com.onewebsql.dao.DAO<Category> {
    /**
     * Table expression representing table category.
     */
    CategoryDAOTableExpression TABLE_EXPRESSION = new CategoryDAOTableExpression();
    /**
     * Corresponding POJO class.
     */
    public static final java.lang.Class<Category> POJO_CLASS = Category.class;

    /**
     * Table expression class representing table category.
     */
    class CategoryDAOTableExpression extends com.onewebsql.query.TableExpression {
        /**
         * Default constructor.
         */
        public CategoryDAOTableExpression() {
            super("category");
            java.util.ArrayList<com.onewebsql.query.Column> pkColumns = new java.util.ArrayList<com.onewebsql.query.Column>();
            // bean columns
            pkColumns.add(addColumn("category_code", java.sql.Types.VARCHAR));
            addColumn("category_name", java.sql.Types.VARCHAR);
            // primary key columns
            pkColumns.trimToSize();
            setPrimaryKeyColumns(pkColumns);
        }

    }

    // bean columns
    /**
     * Column object representing column category_code.
     */
    com.onewebsql.query.Column CATEGORY_CODE = TABLE_EXPRESSION.getColumn("category_code");
    /**
     * Column object representing column category_name.
     */
    com.onewebsql.query.Column CATEGORY_NAME = TABLE_EXPRESSION.getColumn("category_name");
    /**
     * Row handler for table category.
     */
    CategoryRowHandler CATEGORY_ROW_HANDLER = new CategoryRowHandler();

    /**
     * Row handler class for table category.
     */
    class CategoryRowHandler implements com.onewebsql.util.jdbc.RowHandler<Category> {
        public Category getObject(java.sql.ResultSet rs) throws java.sql.SQLException {
            Category obj = new Category();
            obj.setCategoryCode(rs.getString(1));
            if (rs.wasNull()) {
                obj.setCategoryCode(null);
            }

            obj.setCategoryName(rs.getString(2));
            if (rs.wasNull()) {
                obj.setCategoryName(null);
            }

            return obj;
        }

    }

    /**
     * Retrieves data source associated with DAO.
     * @return datasource instance associated with DAO.
     */
    javax.sql.DataSource getDataSource();
    /**
     * Retrieves database adapter associated with DAO.
     * @return database adapter instance associated with DAO.
     */
    com.onewebsql.query.DBAdapter getDbAdapter();
    /**
     * Invokes given insert statement.
     * @param insertStatement insert statement.
     * @return number of rows inserted.
     */
    Integer insert(com.onewebsql.query.InsertQuery insertStatement);
    /**
     * Invokes given update statement.
     * @param updateStatement update statement.
     * @return number of rows updated.
     */
    Integer update(com.onewebsql.query.UpdateQuery updateStatement);
    /**
     * Invokes given delete statement.
     * @param deleteStatement delete statement.
     * @return number of rows deleted.
     */
    Integer delete(com.onewebsql.query.DeleteQuery deleteStatement);
    /**
     * Retrieves row from table category based on value of key Key_1.
     * @param categoryCode value of column category_code.
     * @return object representing single row of table category.
     */
    Category getByPK(java.lang.String categoryCode);
    /**
     * Returns row from table category referenced by given row from table book.
     * @param book object representing row referencing row from table category.
     * @return row from table category referenced by given row from table book.
     */
    Category getCategory(com.onewebsql.demo.or.Book book);
    /**
     * Returns all rows from table category satisfying given where clause.
     * @param whereClause where clause.
     * @return all rows from table category satisfying given where clause.
     */
    java.util.List<Category> getCategoryList(com.onewebsql.query.LExp whereClause);
    /**
     * Returns all rows from table category satisfying given where clause
     * ordered by given column.
     * @param whereClause where clause.
     * @param orderByColumn order by column.
     * @return all rows from table category satisfying given where clause
     * order by given column.
     */
    java.util.List<Category> getCategoryList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn);
    /**
     * Returns all rows from table category satisfying given where clause
     * ordered by given column.
     * @param whereClause where clause.
     * @param orderByColumn order by column.
     * @param orderByDirection order by direction (true - ascending, false - descending).
     * @return all rows from table category satisfying given where clause
     * order by given column.
     */
    java.util.List<Category> getCategoryList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection);
    /**
     * Returns all rows from table category.
     * @return all rows from table category.
     */
    java.util.List<Category> getCategoryList();
    /**
     * Returns all rows from table category ordered by given column.
     * @param orderByColumn order by column.
     * @return all rows from table category.
     */
    java.util.List<Category> getCategoryList(com.onewebsql.query.AExp orderByColumn);
    /**
     * Returns all rows from table category ordered by given column.
     * @param orderByColumn order by column.
     * @param orderByDirection order by direction (true - ascending, false - descending).
     * @return all rows from table category.
     */
    java.util.List<Category> getCategoryList(com.onewebsql.query.AExp orderByColumn, boolean orderByDirection);
    /**
     * Returns all rows from table category fetched by executing supplied query.
     * Query's select phrase must be congruent with DAO row handler.
     * @param selectQuery query returing rows from table category.
     * @return all rows from table category fetched by executing supplied query.
     */
    java.util.List<Category> getCategoryList(com.onewebsql.query.SelectQuery selectQuery);
    /**
     * Returns number of rows in table category.
     * @return number of rows in table category
     */
    Long getCount() ;
    /**
     * Returns number of rows in table category satisfying WHERE clause.
     * @param whereClause WHERE clause determinig counted rows
     * @return number of rows in table category
     */
    Long getCount(com.onewebsql.query.LExp whereClause) ;
    /**
     * Returns execution result of an aggregate function on table category.
     * @param name name of the aggregate function
     * @param argExpr expression passed as an argument to the aggregate function
     * @return result of aggregate function execution
     */
    <U> U aggregateFunction(String name, com.onewebsql.query.AExp argExpr) ;
    /**
     * Returns execution result of an aggregate function on table category on rows satisfying WHERE clause.
     * @param name name of the aggregate function
     * @param argExpr expression passed as an argument to the aggregate function
     * @param whereClause WHERE clause determinig processed rows
     * @return result of aggregate function execution
     */
    <U> U aggregateFunction(String name, com.onewebsql.query.AExp argExpr, com.onewebsql.query.LExp whereClause) ;
    /**
     * Prepares values map, as needed by insert statement, from given row object.
     * @param category row object from table category.
     * @return map of values, keyed by column objects, ready to use in insert statement.
     */
    java.util.Map<com.onewebsql.query.Column, Object> getValuesMap(Category category);
    /**
     * Inserts supplied row object into table category.
     * @param category row object to insert.
     * @return number of rows updated.
     */
    java.lang.Integer insert(Category category);
    /**
     * Inserts supplied row objects into table category.
     * @param categoryList collection of row objects to insert.
     * @return list of numbers of rows updated.
     */
    java.util.List<Integer> insert(java.util.Collection<Category> categoryList);
    /**
     * Updates supplied row object in database.
     * @param category row object to update.
     * @return number of rows updated.
     */
    java.lang.Integer update(Category category);
    /**
     * Updates supplied row objects in database.
     * @param categoryList collection of row objects to update.
     * @return list of number of rows updated.
     */
    java.util.List<Integer> update(java.util.Collection<Category> categoryList);
    /**
     * Deletes row from database based on row's primary key.
     * @param categoryCode value of column category_code.
     * @return number of rows deleted.
     */
    java.lang.Integer delete(java.lang.String categoryCode);
    /**
     * Deletes supplied row object from database.
     * @param category row object to delete from database.
     * @return number of rows deleted.
     */
    java.lang.Integer delete(Category category);
    /**
     * Deletes supplied row objects from database.
     * @param categoryList collection of row objects to delete from database.
     * @return list of number of rows deleted.
     */
    java.util.List<Integer> delete(java.util.Collection<Category> categoryList);
    /**
     * Updates rows in table category using generic update statement.
     * @param valuesMap map containg values row should be updated to, keyed by column objects.
     * @param whereClause where clause determining which rows should be updated.
     * @return number of rows updated.
     */
    java.lang.Integer update(java.util.Map<com.onewebsql.query.Column, ? extends Object> valuesMap, com.onewebsql.query.LExp whereClause);
    /**
     * Deletes rows in table category using generic delete statement.
     * @param whereClause where clause determining which rows should be deleted.
     * @return number of rows deleted.
     */
    java.lang.Integer delete(com.onewebsql.query.LExp whereClause);
    /**
     * Tests whether two row objects have equal primary key columns' properties.
     * @param category1 first object to compare.
     * @param category2 second object to compare.
     * @return <code>true</code> if both objects have equal primary key, <code>false</code> otherwise.
     */
    boolean equalPrimaryKeys(Category category1, Category category2);
}

