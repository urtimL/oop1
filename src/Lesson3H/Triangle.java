package Lesson3H;

import Lesson3H.base.Polygon;

public class Triangle extends Polygon {
    Double a, b, c;
    public Triangle(Double a1, Double b1, Double c1) {
        super(3, new Double[]{a1, b1, c1});
        this.a = a1;
        this.b = b1;
        this.c = c1;
    }

    @Override
    public Double getArea() {
        Double p = (a + b + c) / 2;
        // Формула Герона
        return Math.sqrt(p * (p - getlSides()[0]) * (p - getlSides()[1]) * (p - getlSides()[2]));
    }

    @Override
    public Double getPeremetr() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangle" +
                ", side a = " + a +
                ", side b = " + b +
                ", side c = " + c + ";";
    }

    public void setA(Double a1) {
        this.a = a1;
    }

    public void setB(Double b1) {
        this.b = b1;
    }

    public void setC(Double c1) {
        this.c = c1;
    }
}
