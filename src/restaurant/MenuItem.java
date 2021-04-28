package restaurant;

import java.util.Date;

public class MenuItem {
    private float price;
    private String description;
    private enum Category {appetizer, entree, dessert}
    private Category category;
    private boolean isNew;
    private final Date CREATED_DATE;

    // Constructor
    public MenuItem(float price, String description, Category category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.CREATED_DATE = new Date();
    }

    // Method to update isNew status based on created date
    public void updateIsNew() {
        int thirtyDaysInSeconds = 2592000;
        int createdDateInSeconds = (int) (this.CREATED_DATE.getTime() / 1000);
        if (createdDateInSeconds < new Date().getTime() - thirtyDaysInSeconds) {
            this.isNew = false;
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
