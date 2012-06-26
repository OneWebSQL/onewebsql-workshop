package com.onewebsql.demo.or;

/**
 * DAO (DataAccessObject) interface for table book.
 */
public interface BookDAO extends com.onewebsql.dao.DAO<Book> {
    /**
     * Table expression representing table book.
     */
    BookDAOTableExpression TABLE_EXPRESSION = new BookDAOTableExpression();
    /**
     * Corresponding POJO class.
     */
    public static final java.lang.Class<Book> POJO_CLASS = Book.class;

    /**
     * Table expression class representing table book.
     */
    class BookDAOTableExpression extends com.onewebsql.query.TableExpression {
        /**
         * Default constructor.
         */
        public BookDAOTableExpression() {
            super("book");
            java.util.ArrayList<com.onewebsql.query.Column> pkColumns = new java.util.ArrayList<com.onewebsql.query.Column>();
            // bean columns
            pkColumns.add(addColumn("book_id", java.sql.Types.INTEGER));
            addColumn("category_code", java.sql.Types.VARCHAR);
            addColumn("number_of_pages", java.sql.Types.INTEGER);
            addColumn("publication_year", java.sql.Types.INTEGER);
            addColumn("title", java.sql.Types.VARCHAR);
            // primary key columns
            pkColumns.trimToSize();
            setPrimaryKeyColumns(pkColumns);
        }

    }

    // bean columns
    /**
     * Column object representing column book_id.
     */
    com.onewebsql.query.Column BOOK_ID = TABLE_EXPRESSION.getColumn("book_id");
    /**
     * Column object representing column category_code.
     */
    com.onewebsql.query.Column CATEGORY_CODE = TABLE_EXPRESSION.getColumn("category_code");
    /**
     * Column object representing column number_of_pages.
     */
    com.onewebsql.query.Column NUMBER_OF_PAGES = TABLE_EXPRESSION.getColumn("number_of_pages");
    /**
     * Column object representing column publication_year.
     */
    com.onewebsql.query.Column PUBLICATION_YEAR = TABLE_EXPRESSION.getColumn("publication_year");
    /**
     * Column object representing column title.
     */
    com.onewebsql.query.Column TITLE = TABLE_EXPRESSION.getColumn("title");
    /**
     * Row handler for table book.
     */
    BookRowHandler BOOK_ROW_HANDLER = new BookRowHandler();

    /**
     * Row handler class for table book.
     */
    class BookRowHandler implements com.onewebsql.util.jdbc.RowHandler<Book> {
        public Book getObject(java.sql.ResultSet rs) throws java.sql.SQLException {
            Book obj = new Book();
            obj.setBookId(new Integer(rs.getInt(1)));
            if (rs.wasNull()) {
                obj.setBookId(null);
            }

            obj.setCategoryCode(rs.getString(2));
            if (rs.wasNull()) {
                obj.setCategoryCode(null);
            }

            obj.setNumberOfPages(new Integer(rs.getInt(3)));
            if (rs.wasNull()) {
                obj.setNumberOfPages(null);
            }

            obj.setPublicationYear(new Integer(rs.getInt(4)));
            if (rs.wasNull()) {
                obj.setPublicationYear(null);
            }

            obj.setTitle(rs.getString(5));
            if (rs.wasNull()) {
                obj.setTitle(null);
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
     * Retrieves row from table book based on value of key Key_1.
     * @param bookId value of column book_id.
     * @return object representing single row of table book.
     */
    Book getByPK(java.lang.Integer bookId);
    /**
     * Returns list of rows from table book referencing given row from table category.
     * @param category object representing row referenced by rows from table book.
     * @return list of rows from table book referencing given row from table category.
     */
    java.util.List<Book> getBookList(com.onewebsql.demo.or.Category category);
    /**
     * Returns list of rows from table book referencing given row from table category
     * ordered by given column.
     * @param category object representing row referenced by rows from table book.
     * @param orderByColumn order by column.
     * @return list of rows from table book referencing given row from table category.
     */
    java.util.List<Book> getBookList(com.onewebsql.demo.or.Category category, com.onewebsql.query.AExp orderByColumn);
    /**
     * Returns list of rows from table book referencing given row from table category
     * ordered by given column.
     * @param category object representing row referenced by rows from table book.
     * @param orderByColumn order by column.
     * @param orderByDirection order by direction (true - ascending, false - descending).
     * @return list of rows from table book referencing given row from table category.
     */
    java.util.List<Book> getBookList(com.onewebsql.demo.or.Category category, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection);
    /**
     * Returns row from table book referenced by given row from table book_author.
     * @param bookAuthor object representing row referencing row from table book.
     * @return row from table book referenced by given row from table book_author.
     */
    Book getBook(com.onewebsql.demo.or.BookAuthor bookAuthor);
    /**
     * Returns all rows from table book satisfying given where clause.
     * @param whereClause where clause.
     * @return all rows from table book satisfying given where clause.
     */
    java.util.List<Book> getBookList(com.onewebsql.query.LExp whereClause);
    /**
     * Returns all rows from table book satisfying given where clause
     * ordered by given column.
     * @param whereClause where clause.
     * @param orderByColumn order by column.
     * @return all rows from table book satisfying given where clause
     * order by given column.
     */
    java.util.List<Book> getBookList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn);
    /**
     * Returns all rows from table book satisfying given where clause
     * ordered by given column.
     * @param whereClause where clause.
     * @param orderByColumn order by column.
     * @param orderByDirection order by direction (true - ascending, false - descending).
     * @return all rows from table book satisfying given where clause
     * order by given column.
     */
    java.util.List<Book> getBookList(com.onewebsql.query.LExp whereClause, com.onewebsql.query.AExp orderByColumn, boolean orderByDirection);
    /**
     * Returns all rows from table book.
     * @return all rows from table book.
     */
    java.util.List<Book> getBookList();
    /**
     * Returns all rows from table book ordered by given column.
     * @param orderByColumn order by column.
     * @return all rows from table book.
     */
    java.util.List<Book> getBookList(com.onewebsql.query.AExp orderByColumn);
    /**
     * Returns all rows from table book ordered by given column.
     * @param orderByColumn order by column.
     * @param orderByDirection order by direction (true - ascending, false - descending).
     * @return all rows from table book.
     */
    java.util.List<Book> getBookList(com.onewebsql.query.AExp orderByColumn, boolean orderByDirection);
    /**
     * Returns all rows from table book fetched by executing supplied query.
     * Query's select phrase must be congruent with DAO row handler.
     * @param selectQuery query returing rows from table book.
     * @return all rows from table book fetched by executing supplied query.
     */
    java.util.List<Book> getBookList(com.onewebsql.query.SelectQuery selectQuery);
    /**
     * Returns number of rows in table book.
     * @return number of rows in table book
     */
    Long getCount() ;
    /**
     * Returns number of rows in table book satisfying WHERE clause.
     * @param whereClause WHERE clause determinig counted rows
     * @return number of rows in table book
     */
    Long getCount(com.onewebsql.query.LExp whereClause) ;
    /**
     * Returns execution result of an aggregate function on table book.
     * @param name name of the aggregate function
     * @param argExpr expression passed as an argument to the aggregate function
     * @return result of aggregate function execution
     */
    <U> U aggregateFunction(String name, com.onewebsql.query.AExp argExpr) ;
    /**
     * Returns execution result of an aggregate function on table book on rows satisfying WHERE clause.
     * @param name name of the aggregate function
     * @param argExpr expression passed as an argument to the aggregate function
     * @param whereClause WHERE clause determinig processed rows
     * @return result of aggregate function execution
     */
    <U> U aggregateFunction(String name, com.onewebsql.query.AExp argExpr, com.onewebsql.query.LExp whereClause) ;
    /**
     * Prepares values map, as needed by insert statement, from given row object.
     * @param book row object from table book.
     * @return map of values, keyed by column objects, ready to use in insert statement.
     */
    java.util.Map<com.onewebsql.query.Column, Object> getValuesMap(Book book);
    /**
     * Inserts supplied row object into table book.
     * @param book row object to insert.
     * @return number of rows updated.
     */
    java.lang.Integer insert(Book book);
    /**
     * Inserts supplied row objects into table book.
     * @param bookList collection of row objects to insert.
     * @return list of numbers of rows updated.
     */
    java.util.List<Integer> insert(java.util.Collection<Book> bookList);
    /**
     * Updates supplied row object in database.
     * @param book row object to update.
     * @return number of rows updated.
     */
    java.lang.Integer update(Book book);
    /**
     * Updates supplied row objects in database.
     * @param bookList collection of row objects to update.
     * @return list of number of rows updated.
     */
    java.util.List<Integer> update(java.util.Collection<Book> bookList);
    /**
     * Deletes row from database based on row's primary key.
     * @param bookId value of column book_id.
     * @return number of rows deleted.
     */
    java.lang.Integer delete(java.lang.Integer bookId);
    /**
     * Deletes supplied row object from database.
     * @param book row object to delete from database.
     * @return number of rows deleted.
     */
    java.lang.Integer delete(Book book);
    /**
     * Deletes supplied row objects from database.
     * @param bookList collection of row objects to delete from database.
     * @return list of number of rows deleted.
     */
    java.util.List<Integer> delete(java.util.Collection<Book> bookList);
    /**
     * Updates rows in table book using generic update statement.
     * @param valuesMap map containg values row should be updated to, keyed by column objects.
     * @param whereClause where clause determining which rows should be updated.
     * @return number of rows updated.
     */
    java.lang.Integer update(java.util.Map<com.onewebsql.query.Column, ? extends Object> valuesMap, com.onewebsql.query.LExp whereClause);
    /**
     * Deletes rows in table book using generic delete statement.
     * @param whereClause where clause determining which rows should be deleted.
     * @return number of rows deleted.
     */
    java.lang.Integer delete(com.onewebsql.query.LExp whereClause);
    /**
     * Tests whether two row objects have equal primary key columns' properties.
     * @param book1 first object to compare.
     * @param book2 second object to compare.
     * @return <code>true</code> if both objects have equal primary key, <code>false</code> otherwise.
     */
    boolean equalPrimaryKeys(Book book1, Book book2);
}

