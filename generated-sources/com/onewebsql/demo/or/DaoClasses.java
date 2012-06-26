package com.onewebsql.demo.or;

/**
 * Container for all DAO classes in package.
 */
public interface DaoClasses {
    /**
     * Table with all DAO classes in package.
     */
    public static final Class<?>[] ALL = {
        CategoryDAOImpl.class,
        BookAuthorDAOImpl.class,
        AuthorDAOImpl.class,
        BookDAOImpl.class,
    };
}

