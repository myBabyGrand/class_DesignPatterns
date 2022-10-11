package com.patterns.iterator.concreteAggregate;

import com.patterns.iterator.Menu;
import com.patterns.iterator.MenuItem;
import com.patterns.iterator.concreteIterator.DinerMenuIterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Bacon with Lettuce & tomato on whole wheat", true, 2.99);
        addItem("Soup of the Day", "Soup of the Day with potato salad", false, 3.29);
// other items
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry menu is full! Can’t add any more items");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
