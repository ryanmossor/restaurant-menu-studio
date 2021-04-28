package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    ArrayList<MenuItem> menuItems = new ArrayList<>();
    Date lastUpdated;

    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    private void updateDate() {
        this.lastUpdated = new Date();
        for (MenuItem item : menuItems) {
            item.updateIsNew();
        }
    }
}
