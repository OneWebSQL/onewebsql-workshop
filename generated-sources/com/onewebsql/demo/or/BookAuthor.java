package com.onewebsql.demo.or;

/**
 * POJO representing row from table book_author.
 */
public class BookAuthor implements java.io.Serializable {
    /**
     * Serialization UID.
     */
    static final long serialVersionUID = -4190769133022898992L;
    /**
     * Corresponding DAO interface class.
     */
    public static final java.lang.Class<BookAuthorDAO> DAO_INTERFACE_CLASS = com.onewebsql.demo.or.BookAuthorDAO.class;
    /**
     * Name of JavaBean property representing column author_id.
     */
    public static final String AUTHOR_ID = "authorId";
    /**
     * Name of JavaBean property representing column book_id.
     */
    public static final String BOOK_ID = "bookId";
    /**
     * Property representing column author_id.
     */
    protected java.lang.Integer authorId;
    /**
     * Property representing column book_id.
     */
    protected java.lang.Integer bookId;
    /**
     * Default constructor.
     */
    public BookAuthor() {
    }

    /**
     * All columns constructor.
     *
     * @param authorId value of column author_id.
     * @param bookId value of column book_id.
     */
    public BookAuthor(java.lang.Integer authorId, java.lang.Integer bookId) {
        setAuthorId(authorId);
        setBookId(bookId);
    }

    /**
     * Returns value of property {@link #authorId}.
     * @return value of property {@link #authorId}.
     */
    public java.lang.Integer getAuthorId() {
        return authorId;
    }

    /**
     * Sets new value of property {@link #authorId}.
     * @param authorId new value of property {@link #authorId}.
     */
    public void setAuthorId(java.lang.Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * Returns value of property {@link #bookId}.
     * @return value of property {@link #bookId}.
     */
    public java.lang.Integer getBookId() {
        return bookId;
    }

    /**
     * Sets new value of property {@link #bookId}.
     * @param bookId new value of property {@link #bookId}.
     */
    public void setBookId(java.lang.Integer bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        builder.append(this.getClass().getName());
        builder.append('@');
        builder.append(java.lang.Integer.toHexString(System.identityHashCode(this)));
        builder.append("[");

        builder.append("authorId");
        builder.append("=");
        if (this.authorId == null) {
            builder.append("<null>");
        } else {
            builder.append(this.authorId);
        }

        builder.append(",");
        builder.append("bookId");
        builder.append("=");
        if (this.bookId == null) {
            builder.append("<null>");
        } else {
            builder.append(this.bookId);
        }

        builder.append("]");

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int iTotal = 17;
        int iConstant = 37;
        if (this.authorId == null) {
            iTotal = iTotal * iConstant;
        } else {
            iTotal = iTotal * iConstant + this.authorId.hashCode();
        }

        if (this.bookId == null) {
            iTotal = iTotal * iConstant;
        } else {
            iTotal = iTotal * iConstant + this.bookId.hashCode();
        }

        return iTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof BookAuthor) {
            BookAuthor other = (BookAuthor) o;
            boolean isEquals = true;
            if (this.authorId != other.authorId) {
                if (this.authorId == null || other.authorId == null) {
                    return false;
                }

                isEquals = isEquals && this.authorId.equals(other.authorId);
            }

            if (this.bookId != other.bookId) {
                if (this.bookId == null || other.bookId == null) {
                    return false;
                }

                isEquals = isEquals && this.bookId.equals(other.bookId);
            }

            return isEquals;
        }

        return false;
    }

}

