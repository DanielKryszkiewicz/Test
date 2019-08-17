package com.kodilla.testing.shape;

public class Circle implements Shape {

   private final static String name = "Circle";
    Double radius;

    public Circle(Double radius ){
        this.radius = radius;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        if (radius != circle.radius) return false;
        return name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = (int) (31 * result + radius);
        return result;
    }
}
