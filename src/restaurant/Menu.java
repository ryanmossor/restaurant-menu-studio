package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private static ArrayList<MenuItem> menuItems = new ArrayList<>();
    private static Date lastUpdated;

    public Menu(Date lastUpdated, ArrayList<MenuItem> menuItems) {
        this.lastUpdated = lastUpdated;
        this.menuItems = menuItems;
    }

    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.menuItems.add(item);
        return this.menuItems;
    }

    public ArrayList<MenuItem> removeItem(MenuItem item) {
        if (this.menuItems.contains(item)) {
            this.menuItems.remove(item);
            return this.menuItems;
        } else {
            System.out.println("Menu does not contain " + item);
            return this.menuItems;
        }
    }

    private void updateDate() {
        this.lastUpdated = new Date();
        for (MenuItem item : this.menuItems) {
            item.updateIsNew();
        }
    }

    public static Date getLastUpdated() {
        return lastUpdated;
    }

    public static void printMenu() {
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem.getDescription());
        }
    }

    public boolean areItemsEqual(MenuItem item1, MenuItem item2) {
        return item1.getDescription().equals(item2.getDescription());
    }
}
