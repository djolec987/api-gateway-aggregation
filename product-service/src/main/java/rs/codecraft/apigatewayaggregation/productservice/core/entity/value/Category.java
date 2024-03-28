package rs.codecraft.apigatewayaggregation.productservice.core.entity.value;

public enum Category {

    BOOK("book"),
    PHONE("phone");

    private String name;

    Category(String name) {
        this.name = name;
    }

    /**
     * Returns the {@link Category} with the specified name, or null if no such category exists.
     *
     * @param name the name of the category to search for
     * @return the {@link Category} with the specified name, or null if no such category exists
     */
    public static Category fromName(String name) {
        for (Category category : values()) {
            if (category.getName().equals(name)) {
                return category;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

}
