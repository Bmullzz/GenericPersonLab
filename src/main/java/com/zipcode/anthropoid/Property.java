package com.zipcode.anthropoid;

/** Created by leon on 5/1/17. */
public class Property<E> {
    private E val;

    public Property(E val) {
        this.val = val;
    }

    public E getValue() {
        return val;
    }

    public void setVal(E val) {
        this.val = val;
    }
}
