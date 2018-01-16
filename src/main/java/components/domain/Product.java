package components.domain;

public class Product {

    private String description;

    public Product() {
    }

    public Product(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
