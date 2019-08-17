package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private final static String name = "Triangle";
    int a;
    int h;

    public Triangle(int a , int h){
        this.a = a;
        this.h = h;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (a != triangle.a) return false;
        if (h != triangle.h) return false;
        return name.equals(name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + a;
        result = 31 * result + h;
        return result;
    }
}
