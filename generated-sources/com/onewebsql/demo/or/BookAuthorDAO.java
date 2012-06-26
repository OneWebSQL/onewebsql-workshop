package com.onewebsql.demo.or;

/**
 * DAO (DataAccessObject) interface for table book_author.
 */
public interface BookAuthorDAO extends com.onewebsql.dao.DAO<BookAuthor> {
    /**
     * Table expression representing table book_author.
     */
    BookAuthorDAOTableExpression TABLE_EXPRESSION = new BookAuthorDAOTableExpression();
    /**
     * Corresponding POJO class.
     */
    public static final java.lang.Class<BookAuthor> POJO_CLASS = BookAuthor.class;

    /**
     * Table expression class representing table book_author.
     */
    class BookAuthorDAOTableExpression extends com.onewebsql.query.TableExpression {
        /**
         * Default constructor.
         */
        public BookAuthorDAOTableExpression() {
            super("book_author");
            java.util.ArrayList<com.onewebsql.query.Column> pkColumns = new java.util.ArrayList<com.onewebsql.query.Column>();
            // bean columns
            pkColumns.add(addColumn("author_id", java.sql.Types.INTEGER));
            pkColumns.add(addColumn("book_id", java.sql.Types.INTEGER));
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
     * Column object representing column book_id.
     */
    com.onewebsql.query.Column BOOK_ID = TABLE_EXPRESSION.getColumn("book_id");
    /**
     * Row handler for table book_author.
     */
    BookAuthorRowHandler BOOK_AUTHOR_ROW_HANDLER = new BookAuthorRowHandler();

    /**
     * Row handler class for table book_author.
     */
    class BookAuthorRowHandler implements com.onewebsql.util.jdbc.RowHandler<BookAuthor> {
        public BookAuthor getObject(java.sql.ResultSet rs) throws java.sql.SQLException {
            BookAuthor obj = new BookAuthor();
            obj.setAuthorId(new Integer(rs.getInt(1)));
            if (rs.wasNull()) {
                obj.setAuthorId(null);
            }

            obj.setBookId(new Integer(rs.getInt(2)));
            if (rs.wasNull()) {
                obj.setBookId(null);
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
     * Retrieves row from table book_author based on value of key Key_1.
     * @param authorId value of column author_id.
     * @param bookId value of column book_id.
     * @return object representing single row of table book_author.
     */
    BookAuthor getByPK(java.lang.Integer authorId, java.lang.Integer bookId);
    /**
     * Returns list of rows from table book_author referencing given row from table book.
     * @param book object representing row referenced by rows from table book_author.
     * @return list of rows from table book_author referencing given row from table book.
     */
    java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.demo.or.Book book);
    /**
     * Returns list of rows from table book_author referencing given row from table book
     * ordered by given column.
     * @param book object representing row referenced by rows from table book_author.
     * @param orderByColumn order by column.
     * @return list of rows from table book_author referencing given row from table book.
     */
    java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.demo.or.Book book, com.onewebsql.query.AExp orderByColumn);
    /**
     * Returns list of rows from table book_author referencing given row from table book
     * ordered by given column.
     * @param book object representing row referenced by rows from table book_author.
     * @param orderByColumn order by column.
     * @param orderByDirection order by direction (true - ascending, false - descending).
     * @return list of rows from table book_author referencing given row from table book.
     */
    java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.demo.or.Book book, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection);
    /**
     * Returns list of rows from table book_author referencing given row from table author.
     * @param author object representing row referenced by rows from table book_author.
     * @return list of rows from table book_author referencing given row from table author.
     */
    java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.demo.or.Author author);
    /**
     * Returns list of rows from table book_author referencing given row from table author
     * ordered by given column.
     * @param author object representing row referenced by rows from table book_author.
     * @param orderByColumn order by column.
     * @return list of rows from table book_author referencing given row from table author.
     */
    java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.demo.or.Author author, com.onewebsql.query.AExp orderByColumn);
    /**
     * Returns list of rows from table book_author referencing given row from table author
     * ordered by given column.
     * @param author object representing row referenced by rows from table book_author.
     * @param orderByColumn order by column.
     * @param orderByDirection order by direction (true - ascending, false - descending).
     * @return list of rows from table book_author referencing given row from table author.
     */
    java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.demo.or.Author author, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection);
    /**
     * Returns all rows from table book_author satisfying given where clause.
     * @param whereClause where clause.
     * @return all rows from table book_author satisfying given where clause.
     */
    java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.query.LExp whereClause);
    /**
     * Returns all rows from table book_author satisfying given where clause
     * ordered by given column.
     * @param whereClause where clause.
     * @param orderByColumn order by column.
     * @return all rows from table book_author satisfying given where clause
     * order by given column.
     */
    java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn);
    /**
     * Returns all rows from table book_author satisfying given where clause
     * ordered by given column.
     * @param whereClause where clause.
     * @param orderByColumn order by column.
     * @param orderByDirection order by direction (true - ascending, false - descending).
     * @return all rows from table book_author satisfying given where clause
     * order by given column.
     */
    java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection);
    /**
     * Returns all rows from table book_author.
     * @return all rows from table book_author.
     */
    java.util.List<BookAuthor> getBookAuthorList();
    /**
     * Returns all rows from table book_author ordered by given column.
     * @param orderByColumn order by column.
     * @return all rows from table book_author.
     */
    java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.query.AExp orderByColumn);
    /**
     * Returns all rows from table book_author ordered by given column.
     * @param orderByColumn order by column.
     * @param orderByDirection order by direction (true - ascending, false - descending).
     * @return all rows from table book_author.
     */
    java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.query.AExp orderByColumn, boolean orderByDirection);
    /**
     * Returns all rows from table book_author fetched by executing supplied query.
     * Query's select phrase must be congruent with DAO row handler.
     * @param selectQuery query returing rows from table book_author.
     * @return all rows from table book_author fetched by executing supplied query.
     */
    java.util.List<BookAuthor> getBookAuthorList(com.onewebsql.query.SelectQuery selectQuery);
    /**
     * Returns number of rows in table book_author.
     * @return number of rows in table book_author
     */
    Long getCount() ;
    /**
     * Returns number of rows in table book_author satisfying WHERE clause.
     * @param whereClause WHERE clause determinig counted rows
     * @return number of rows in table book_author
     */
    Long getCount(com.onewebsql.query.LExp whereClause) ;
    /**
     * Returns execution result of an aggregate function on table book_author.
     * @param name name of the aggregate function
     * @param argExpr expression passed as an argument to the aggregate function
     * @return result of aggregate function execution
     */
    <U> U aggregateFunction(String name, com.onewebsql.query.AExp argExpr) ;
    /**
     * Returns execution result of an aggregate function on table book_author on rows satisfying WHERE clause.
     * @param name name of the aggregate function
     * @param argExpr expression passed as an argument to the aggregate function
     * @param whereClause WHERE clause determinig processed rows
     * @return result of aggregate function execution
     */
    <U> U aggregateFunction(String name, com.onewebsql.query.AExp argExpr, com.onewebsql.query.LExp whereClause) ;
    /**
     * Prepares values map, as needed by insert statement, from given row object.
     * @param bookAuthor row object from table book_author.
     * @return map of values, keyed by column objects, ready to use in insert statement.
     */
    java.util.Map<com.onewebsql.query.Column, Object> getValuesMap(BookAuthor bookAuthor);
    /**
     * Inserts supplied row object into table book_author.
     * @param bookAuthor row object to insert.
     * @return number of rows updated.
     */
    java.lang.Integer insert(BookAuthor bookAuthor);
    /**
     * Inserts supplied row objects into table book_author.
     * @param bookAuthorList collection of row objects to insert.
     * @return list of numbers of rows updated.
     */
    java.util.List<Integer> insert(java.util.Collection<BookAuthor> bookAuthorList);
    /**
     * Updates supplied row object in database.
     * @param bookAuthor row object to update.
     * @return number of rows updated.
     */
    java.lang.Integer update(BookAuthor bookAuthor);
    /**
     * Updates supplied row objects in database.
     * @param bookAuthorList collection of row objects to update.
     * @return list of number of rows updated.
     */
    java.util.List<Integer> update(java.util.Collection<BookAuthor> bookAuthorList);
    /**
     * Deletes row from database based on row's primary key.
     * @param authorId value of column author_id.
     * @param bookId value of column book_id.
     * @return number of rows deleted.
     */
    java.lang.Integer delete(java.lang.Integer authorId, java.lang.Integer bookId);
    /**
     * Deletes supplied row object from database.
     * @param bookAuthor row object to delete from database.
     * @return number of rows deleted.
     */
    java.lang.Integer delete(BookAuthor bookAuthor);
    /**
     * Deletes supplied row objects from database.
     * @param bookAuthorList collection of row objects to delete from database.
     * @return list of number of rows deleted.
     */
    java.util.List<Integer> delete(java.util.Collection<BookAuthor> bookAuthorList);
    /**
     * Updates rows in table book_author using generic update statement.
     * @param valuesMap map containg values row should be updated to, keyed by column objects.
     * @param whereClause where clause determining which rows should be updated.
     * @return number of rows updated.
     */
    java.lang.Integer update(java.util.Map<com.onewebsql.query.Column, ? extends Object> valuesMap, com.onewebsql.query.LExp whereClause);
    /**
     * Deletes rows in table book_author using generic delete statement.
     * @param whereClause where clause determining which rows should be deleted.
     * @return number of rows deleted.
     */
    java.lang.Integer delete(com.onewebsql.query.LExp whereClause);
    /**
     * Tests whether two row objects have equal primary key columns' properties.
     * @param bookAuthor1 first object to compare.
     * @param bookAuthor2 second object to compare.
     * @return <code>true</code> if both objects have equal primary key, <code>false</code> otherwise.
     */
    boolean equalPrimaryKeys(BookAuthor bookAuthor1, BookAuthor bookAuthor2);
}

