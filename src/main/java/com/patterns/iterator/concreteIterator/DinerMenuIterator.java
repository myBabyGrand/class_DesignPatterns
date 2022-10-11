package com.patterns.iterator.concreteIterator;

import com.patterns.iterator.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;
    public DinerMenuIterator (MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length) {
            return false;
        }
        else {
            return !(items[position]== null);
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position ++;
        return menuItem;
    }

}
