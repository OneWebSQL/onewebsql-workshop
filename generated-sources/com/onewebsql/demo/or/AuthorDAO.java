package com.onewebsql.demo.or;

/**
 * DAO (DataAccessObject) interface for table author.
 */
public interface AuthorDAO extends com.onewebsql.dao.DAO<Author> {
    /**
     * Table expression representing table author.
     */
    AuthorDAOTableExpression TABLE_EXPRESSION = new AuthorDAOTableExpression();
    /**
     * Corresponding POJO class.
     */
    public static final java.lang.Class<Author> POJO_CLASS = Author.class;

    /**
     * Table expression class representing table author.
     */
    class AuthorDAOTableExpression extends com.onewebsql.query.TableExpression {
        /**
         * Default constructor.
         */
        public AuthorDAOTableExpression() {
            super("author");
            java.util.ArrayList<com.onewebsql.query.Column> pkColumns = new java.util.ArrayList<com.onewebsql.query.Column>();
            // bean columns
            pkColumns.add(addColumn("author_id", java.sql.Types.INTEGER));
            addColumn("name", java.sql.Types.VARCHAR);
            // primary key columns
            pkColumns.trimToSize();
            setPrimaryKeyColumns(pkColumns);
        }

    }

    // bean columns
    /**
     * Column object representing column author_id.
     */
    com.onewebsql.query.Column AUTHOR_ID = TABLE_EXPRESSION.getColumn("author_id");
    /**
     * Column object representing column name.
     */
    com.onewebsql.query.Column NAME = TABLE_EXPRESSION.getColumn("name");
    /**
     * Row handler for table author.
     */
    AuthorRowHandler AUTHOR_ROW_HANDLER = new AuthorRowHandler();

    /**
     * Row handler class for table author.
     */
    class AuthorRowHandler implements com.onewebsql.util.jdbc.RowHandler<Author> {
        public Author getObject(java.sql.ResultSet rs) throws java.sql.SQLException {
            Author obj = new Author();
            obj.setAuthorId(new Integer(rs.getInt(1)));
            if (rs.wasNull()) {
                obj.setAuthorId(null);
            }

            obj.setName(rs.getString(2));
            if (rs.wasNull()) {
                obj.setName(null);
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
     * Retrieves next identifier for DAO table.
     * @return next unused row identifier.
     */
    Long getNextId();
    /**
     * Retrieves row from table author based on value of key Key_1.
     * @param authorId value of column author_id.
     * @return object representing single row of table author.
     */
    Author getByPK(java.lang.Integer authorId);
    /**
     * Returns row from table author referenced by given row from table book_author.
     * @param bookAuthor object representing row referencing row from table author.
     * @return row from table author referenced by given row from table book_author.
     */
    Author getAuthor(com.onewebsql.demo.or.BookAuthor bookAuthor);
    /**
     * Returns all rows from table author satisfying given where clause.
     * @param whereClause where clause.
     * @return all rows from table author satisfying given where clause.
     */
    java.util.List<Author> getAuthorList(com.onewebsql.query.LExp whereClause);
    /**
     * Returns all rows from table author satisfying given where clause
     * ordered by given column.
     * @param whereClause where clause.
     * @param orderByColumn order by column.
     * @return all rows from table author satisfying given where clause
     * order by given column.
     */
    java.util.List<Author> getAuthorList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn);
    /**
     * Returns all rows from table author satisfying given where clause
     * ordered by given column.
     * @param whereClause where clause.
     * @param orderByColumn order by column.
     * @param orderByDirection order by direction (true - ascending, false - descending).
     * @return all rows from table author satisfying given where clause
     * order by given column.
     */
    java.util.List<Author> getAuthorList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection);
    /**
     * Returns all rows from table author.
     * @return all rows from table author.
     */
    java.util.List<Author> getAuthorList();
    /**
     * Returns all rows from table author ordered by given column.
     * @param orderByColumn order by column.
     * @return all rows from table author.
     */
    java.util.List<Author> getAuthorList(com.onewebsql.query.AExp orderByColumn);
    /**
     * Returns all rows from table author ordered by given column.
     * @param orderByColumn order by column.
     * @param orderByDirection order by direction (true - ascending, false - descending).
     * @return all rows from table author.
     */
    java.util.List<Author> getAuthorList(com.onewebsql.query.AExp orderByColumn, boolean orderByDirection);
    /**
     * Returns all rows from table author fetched by executing supplied query.
     * Query's select phrase must be congruent with DAO row handler.
     * @param selectQuery query returing rows from table author.
     * @return all rows from table author fetched by executing supplied query.
     */
    java.util.List<Author> getAuthorList(com.onewebsql.query.SelectQuery selectQuery);
    /**
     * Returns number of rows in table author.
     * @return number of rows in table author
     */
    Long getCount() ;
    /**
     * Returns number of rows in table author satisfying WHERE clause.
     * @param whereClause WHERE clause determinig counted rows
     * @return number of rows in table author
     */
    Long getCount(com.onewebsql.query.LExp whereClause) ;
    /**
     * Returns execution result of an aggregate function on table author.
     * @param name name of the aggregate function
     * @param argExpr expression passed as an argument to the aggregate function
     * @return result of aggregate function execution
     */
    <U> U aggregateFunction(String name, com.onewebsql.query.AExp argExpr) ;
    /**
     * Returns execution result of an aggregate function on table author on rows satisfying WHERE clause.
     * @param name name of the aggregate function
     * @param argExpr expression passed as an argument to the aggregate function
     * @param whereClause WHERE clause determinig processed rows
     * @return result of aggregate function execution
     */
    <U> U aggregateFunction(String name, com.onewebsql.query.AExp argExpr, com.onewebsql.query.LExp whereClause) ;
    /**
     * Prepares values map, as needed by insert statement, from given row object.
     * @param author row object from table author.
     * @return map of values, keyed by column objects, ready to use in insert statement.
     */
    java.util.Map<com.onewebsql.query.Column, Object> getValuesMap(Author author);
    /**
     * Inserts supplied row object into table author.
     * @param author row object to insert.
     * @return number of rows updated.
     */
    java.lang.Integer insert(Author author);
    /**
     * Inserts supplied row objects into table author.
     * @param authorList collection of row objects to insert.
     * @return list of numbers of rows updated.
     */
    java.util.List<Integer> insert(java.util.Collection<Author> authorList);
    /**
     * Updates supplied row object in database.
     * @param author row object to update.
     * @return number of rows updated.
     */
    java.lang.Integer update(Author author);
    /**
     * Updates supplied row objects in database.
     * @param authorList collection of row objects to update.
     * @return list of number of rows updated.
     */
    java.util.List<Integer> update(java.util.Collection<Author> authorList);
    /**
     * Deletes row from database based on row's primary key.
     * @param authorId value of column author_id.
     * @return number of rows deleted.
     */
    java.lang.Integer delete(java.lang.Integer authorId);
    /**
     * Deletes supplied row object from database.
     * @param author row object to delete from database.
     * @return number of rows deleted.
     */
    java.lang.Integer delete(Author author);
    /**
     * Deletes supplied row objects from database.
     * @param authorList collection of row objects to delete from database.
     * @return list of number of rows deleted.
     */
    java.util.List<Integer> delete(java.util.Collection<Author> authorList);
    /**
     * Updates rows in table author using generic update statement.
     * @param valuesMap map containg values row should be updated to, keyed by column objects.
     * @param whereClause where clause determining which rows should be updated.
     * @return number of rows updated.
     */
    java.lang.Integer update(java.util.Map<com.onewebsql.query.Column, ? extends Object> valuesMap, com.onewebsql.query.LExp whereClause);
    /**
     * Deletes rows in table author using generic delete statement.
     * @param whereClause where clause determining which rows should be deleted.
     * @return number of rows deleted.
     */
    java.lang.Integer delete(com.onewebsql.query.LExp whereClause);
    /**
     * Tests whether two row objects have equal primary key columns' properties.
     * @param author1 first object to compare.
     * @param author2 second object to compare.
     * @return <code>true</code> if both objects have equal primary key, <code>false</code> otherwise.
     */
    boolean equalPrimaryKeys(Author author1, Author author2);
}

