package org.homework.drugs;


import lombok.Getter;

import java.util.Objects;
@Getter
public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return power == component.power &&
                Objects.equals(name, component.name) &&
                Objects.equals(weight, component.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.weight,this.power);
    }
}
