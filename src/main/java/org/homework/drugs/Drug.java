package org.homework.drugs;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
    @Override
    public int compareTo(@NotNull Drug o) {
        int power = getDrugPower();
        int powerCompare = Integer.compare(power, o.getDrugPower());
        if (powerCompare != 0) {
            return powerCompare;
        }

        return getFirstComponentName().compareTo(o.getFirstComponentName());
    }

    @NotNull
    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            public boolean hasNext() {
                return index < components.size();
            }

            public Component next() {
                return components.get(index++);
            }
        };
    }

    private List<Component> components;
    int index;

    public Drug(List<Component> component) {
        this.components = component;
        this.index = 0;
    }

    public int getDrugPower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();
        }
        return power;
    }

    public String getFirstComponentName() {
        Component firstName = this.iterator().next();
        return firstName.getName();
    }

    @Override
    public String toString() {
        return String.format("\n" +
                "%s {   components: %s, power: %s   }%n", this.getClass().getSimpleName(), components, getDrugPower()
        );
    }

}
