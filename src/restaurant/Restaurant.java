package restaurant;

import java.util.Date;
import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<MenuItem> items = new ArrayList<>();
        Date today = new Date();
        Menu mainMenu = new Menu(today, items);

        // Sample menu items from Firefly Grill, Effingham, IL
        MenuItem friedGreenTomatoes = new MenuItem(14.99F, "Fried Green Tomatoes", MenuItem.Category.appetizer);
        MenuItem chickenWings = new MenuItem(12.49F, "Chicken Wings", MenuItem.Category.appetizer);
        MenuItem specialtyPizza = new MenuItem(16.49F, "Firefly Specialty Pizza",  MenuItem.Category.entree);

        mainMenu.addItem(friedGreenTomatoes);
        mainMenu.addItem(chickenWings);
        mainMenu.addItem(specialtyPizza);

        System.out.println(friedGreenTomatoes);
        System.out.println(chickenWings);
        System.out.println(specialtyPizza);
    }
}
