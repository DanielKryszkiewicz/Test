package com.kodilla.testing.shape;

public class Square implements Shape {

    private final static String name = "Square";
    int a;
    int b;

    public Square(int a ,int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        if (a != square.a) return false;
        if (b != square.b) return false;
        return name.equals(name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + a;
        result = 31 * result + b;
        return result;
    }
}
