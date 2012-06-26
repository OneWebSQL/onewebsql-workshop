package com.onewebsql.demo.or;

/**
 * POJO representing row from table category.
 */
public class Category implements java.io.Serializable {
    /**
     * Serialization UID.
     */
    static final long serialVersionUID = -5671231881300428939L;
    /**
     * Corresponding DAO interface class.
     */
    public static final java.lang.Class<CategoryDAO> DAO_INTERFACE_CLASS = com.onewebsql.demo.or.CategoryDAO.class;
    /**
     * Name of JavaBean property representing column category_code.
     */
    public static final String CATEGORY_CODE = "categoryCode";
    /**
     * Name of JavaBean property representing column category_name.
     */
    public static final String CATEGORY_NAME = "categoryName";
    /**
     * Property representing column category_code.
     */
    protected java.lang.String categoryCode;
    /**
     * Property representing column category_name.
     */
    protected java.lang.String categoryName;
    /**
     * Default constructor.
     */
    public Category() {
    }

    /**
     * All columns constructor.
     *
     * @param categoryCode value of column category_code.
     * @param categoryName value of column category_name.
     */
    public Category(java.lang.String categoryCode, java.lang.String categoryName) {
        setCategoryCode(categoryCode);
        setCategoryName(categoryName);
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
     * Returns value of property {@link #categoryName}.
     * @return value of property {@link #categoryName}.
     */
    public java.lang.String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets new value of property {@link #categoryName}.
     * @param categoryName new value of property {@link #categoryName}.
     */
    public void setCategoryName(java.lang.String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        builder.append(this.getClass().getName());
        builder.append('@');
        builder.append(java.lang.Integer.toHexString(System.identityHashCode(this)));
        builder.append("[");

        builder.append("categoryCode");
        builder.append("=");
        if (this.categoryCode == null) {
            builder.append("<null>");
        } else {
            builder.append(this.categoryCode);
        }

        builder.append(",");
        builder.append("categoryName");
        builder.append("=");
        if (this.categoryName == null) {
            builder.append("<null>");
        } else {
            builder.append(this.categoryName);
        }

        builder.append("]");

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int iTotal = 17;
        int iConstant = 37;
        if (this.categoryCode == null) {
            iTotal = iTotal * iConstant;
        } else {
            iTotal = iTotal * iConstant + this.categoryCode.hashCode();
        }

        if (this.categoryName == null) {
            iTotal = iTotal * iConstant;
        } else {
            iTotal = iTotal * iConstant + this.categoryName.hashCode();
        }

        return iTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Category) {
            Category other = (Category) o;
            boolean isEquals = true;
            if (this.categoryCode != other.categoryCode) {
                if (this.categoryCode == null || other.categoryCode == null) {
                    return false;
                }

                isEquals = isEquals && this.categoryCode.equals(other.categoryCode);
            }

            if (this.categoryName != other.categoryName) {
                if (this.categoryName == null || other.categoryName == null) {
                    return false;
                }

                isEquals = isEquals && this.categoryName.equals(other.categoryName);
            }

            return isEquals;
        }

        return false;
    }

}

