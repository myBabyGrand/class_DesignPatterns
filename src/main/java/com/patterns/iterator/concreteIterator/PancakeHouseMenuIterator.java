package com.patterns.iterator.concreteIterator;

import com.patterns.iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {

    ArrayList<MenuItem> menuItems;
    Iterator menuItemIterator;
    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
        menuItemIterator = menuItems.iterator();
    }

    @Override
    public boolean hasNext() {
        return menuItemIterator.hasNext();
    }

    @Override
    public Object next() {
        return menuItemIterator.next();
    }
}
