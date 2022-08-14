package Studios.RestaurantMenu;
import java.util.Date;

public class MenuItems {
    private String name;
    private String isNewItem;
    private String category;
    private String description;
    private double price;



    public MenuItems(String name, String isNewItem, String category, String description, double price) {
        this.name = name;
        this.isNewItem = isNewItem;
        this.category = category;
        this.description = description;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIsNewItem(){
        return isNewItem;
    }
    public void setIsNewItem(){
        this.isNewItem = isNewItem;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
