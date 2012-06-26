package com.onewebsql.demo.or;

/**
 * POJO representing row from table book.
 */
public class Book implements java.io.Serializable {
    /**
     * Serialization UID.
     */
    static final long serialVersionUID = 621924171412553176L;
    /**
     * Corresponding DAO interface class.
     */
    public static final java.lang.Class<BookDAO> DAO_INTERFACE_CLASS = com.onewebsql.demo.or.BookDAO.class;
    /**
     * Name of JavaBean property representing column book_id.
     */
    public static final String BOOK_ID = "bookId";
    /**
     * Name of JavaBean property representing column category_code.
     */
    public static final String CATEGORY_CODE = "categoryCode";
    /**
     * Name of JavaBean property representing column number_of_pages.
     */
    public static final String NUMBER_OF_PAGES = "numberOfPages";
    /**
     * Name of JavaBean property representing column publication_year.
     */
    public static final String PUBLICATION_YEAR = "publicationYear";
    /**
     * Name of JavaBean property representing column title.
     */
    public static final String TITLE = "title";
    /**
     * Property representing column book_id.
     */
    protected java.lang.Integer bookId;
    /**
     * Property representing column category_code.
     */
    protected java.lang.String categoryCode;
    /**
     * Property representing column number_of_pages.
     */
    protected java.lang.Integer numberOfPages;
    /**
     * Property representing column publication_year.
     */
    protected java.lang.Integer publicationYear;
    /**
     * Property representing column title.
     */
    protected java.lang.String title;
    /**
     * Default constructor.
     */
    public Book() {
    }

    /**
     * All columns constructor.
     *
     * @param bookId value of column book_id.
     * @param categoryCode value of column category_code.
     * @param numberOfPages value of column number_of_pages.
     * @param publicationYear value of column publication_year.
     * @param title value of column title.
     */
    public Book(java.lang.Integer bookId, java.lang.String categoryCode, java.lang.Integer numberOfPages, java.lang.Integer publicationYear, java.lang.String title) {
        setBookId(bookId);
        setCategoryCode(categoryCode);
        setNumberOfPages(numberOfPages);
        setPublicationYear(publicationYear);
        setTitle(title);
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

    /**
     * Returns value of property {@link #categoryCode}.
     * @return value of property {@link #categoryCode}.
     */
    public java.lang.String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets new value of property {@link #categoryCode}.
     * @param categoryCode new value of property {@link #categoryCode}.
     */
    public void setCategoryCode(java.lang.String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * Returns value of property {@link #numberOfPages}.
     * @return value of property {@link #numberOfPages}.
     */
    public java.lang.Integer getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets new value of property {@link #numberOfPages}.
     * @param numberOfPages new value of property {@link #numberOfPages}.
     */
    public void setNumberOfPages(java.lang.Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    /**
     * Returns value of property {@link #publicationYear}.
     * @return value of property {@link #publicationYear}.
     */
    public java.lang.Integer getPublicationYear() {
        return publicationYear;
    }

    /**
     * Sets new value of property {@link #publicationYear}.
     * @param publicationYear new value of property {@link #publicationYear}.
     */
    public void setPublicationYear(java.lang.Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    /**
     * Returns value of property {@link #title}.
     * @return value of property {@link #title}.
     */
    public java.lang.String getTitle() {
        return title;
    }

    /**
     * Sets new value of property {@link #title}.
     * @param title new value of property {@link #title}.
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        builder.append(this.getClass().getName());
        builder.append('@');
        builder.append(java.lang.Integer.toHexString(System.identityHashCode(this)));
        builder.append("[");

        builder.append("bookId");
        builder.append("=");
        if (this.bookId == null) {
            builder.append("<null>");
        } else {
            builder.append(this.bookId);
        }

        builder.append(",");
        builder.append("categoryCode");
        builder.append("=");
        if (this.categoryCode == null) {
            builder.append("<null>");
        } else {
            builder.append(this.categoryCode);
        }

        builder.append(",");
        builder.append("numberOfPages");
        builder.append("=");
        if (this.numberOfPages == null) {
            builder.append("<null>");
        } else {
            builder.append(this.numberOfPages);
        }

        builder.append(",");
        builder.append("publicationYear");
        builder.append("=");
        if (this.publicationYear == null) {
            builder.append("<null>");
        } else {
            builder.append(this.publicationYear);
        }

        builder.append(",");
        builder.append("title");
        builder.append("=");
        if (this.title == null) {
            builder.append("<null>");
        } else {
            builder.append(this.title);
        }

        builder.append("]");

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int iTotal = 17;
        int iConstant = 37;
        if (this.bookId == null) {
            iTotal = iTotal * iConstant;
        } else {
            iTotal = iTotal * iConstant + this.bookId.hashCode();
        }

        if (this.categoryCode == null) {
            iTotal = iTotal * iConstant;
        } else {
            iTotal = iTotal * iConstant + this.categoryCode.hashCode();
        }

        if (this.numberOfPages == null) {
            iTotal = iTotal * iConstant;
        } else {
            iTotal = iTotal * iConstant + this.numberOfPages.hashCode();
        }

        if (this.publicationYear == null) {
            iTotal = iTotal * iConstant;
        } else {
            iTotal = iTotal * iConstant + this.publicationYear.hashCode();
        }

        if (this.title == null) {
            iTotal = iTotal * iConstant;
        } else {
            iTotal = iTotal * iConstant + this.title.hashCode();
        }

        return iTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Book) {
            Book other = (Book) o;
            boolean isEquals = true;
            if (this.bookId != other.bookId) {
                if (this.bookId == null || other.bookId == null) {
                    return false;
                }

                isEquals = isEquals && this.bookId.equals(other.bookId);
            }

            if (this.categoryCode != other.categoryCode) {
                if (this.categoryCode == null || other.categoryCode == null) {
                    return false;
                }

                isEquals = isEquals && this.categoryCode.equals(other.categoryCode);
            }

            if (this.numberOfPages != other.numberOfPages) {
                if (this.numberOfPages == null || other.numberOfPages == null) {
                    return false;
                }

                isEquals = isEquals && this.numberOfPages.equals(other.numberOfPages);
            }

            if (this.publicationYear != other.publicationYear) {
                if (this.publicationYear == null || other.publicationYear == null) {
                    return false;
                }

                isEquals = isEquals && this.publicationYear.equals(other.publicationYear);
            }

            if (this.title != other.title) {
                if (this.title == null || other.title == null) {
                    return false;
                }

                isEquals = isEquals && this.title.equals(other.title);
            }

            return isEquals;
        }

        return false;
    }

}

