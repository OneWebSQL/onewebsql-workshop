package com.onewebsql.demo.or;

/**
 * POJO representing row from table author.
 */
public class Author implements java.io.Serializable {
    /**
     * Serialization UID.
     */
    static final long serialVersionUID = -2125522763776485384L;
    /**
     * Corresponding DAO interface class.
     */
    public static final java.lang.Class<AuthorDAO> DAO_INTERFACE_CLASS = com.onewebsql.demo.or.AuthorDAO.class;
    /**
     * Name of JavaBean property representing column author_id.
     */
    public static final String AUTHOR_ID = "authorId";
    /**
     * Name of JavaBean property representing column name.
     */
    public static final String NAME = "name";
    /**
     * Property representing column author_id.
     */
    protected java.lang.Integer authorId;
    /**
     * Property representing column name.
     */
    protected java.lang.String name;
    /**
     * Default constructor.
     */
    public Author() {
    }

    /**
     * All columns constructor.
     *
     * @param authorId value of column author_id.
     * @param name value of column name.
     */
    public Author(java.lang.Integer authorId, java.lang.String name) {
        setAuthorId(authorId);
        setName(name);
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
     * Returns value of property {@link #name}.
     * @return value of property {@link #name}.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets new value of property {@link #name}.
     * @param name new value of property {@link #name}.
     */
    public void setName(java.lang.String name) {
        this.name = name;
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
        builder.append("name");
        builder.append("=");
        if (this.name == null) {
            builder.append("<null>");
        } else {
            builder.append(this.name);
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

        if (this.name == null) {
            iTotal = iTotal * iConstant;
        } else {
            iTotal = iTotal * iConstant + this.name.hashCode();
        }

        return iTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Author) {
            Author other = (Author) o;
            boolean isEquals = true;
            if (this.authorId != other.authorId) {
                if (this.authorId == null || other.authorId == null) {
                    return false;
                }

                isEquals = isEquals && this.authorId.equals(other.authorId);
            }

            if (this.name != other.name) {
                if (this.name == null || other.name == null) {
                    return false;
                }

                isEquals = isEquals && this.name.equals(other.name);
            }

            return isEquals;
        }

        return false;
    }

}

