package ua.ithillel.oop;

import ua.ithillel.oop.encapsulation.EncapsulationExample;

import java.util.ArrayList;
import java.util.List;

public abstract class EncapsulationChildExample extends EncapsulationExample implements Comparable, List {

    private int count;
    protected int protectedVariable;


    public EncapsulationChildExample(int count) {
        this.protectedVariable = count;

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
