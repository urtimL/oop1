package Lesson3H;

import Lesson3H.base.Polygon;

public class Rectangle extends Polygon {

    Double width, height;

    public Rectangle(Double widthN, Double heightN) {
        super(4, new Double[]{widthN, heightN, widthN, heightN});
        this.width = widthN;
        this.height = heightN;

        if (width <= 0.0 || height <= 0.0 || width == height)
            System.out.println("Это не прямоугольник или стороны неверны!");
    }

    public Rectangle(Double widthN) {
        super(4, new Double[]{widthN, widthN, widthN, widthN});
        this.width = widthN;
        this.height = widthN;

        if (width <= 0.0)
            System.out.println("Стороны неверны!"); ;
    }

    @Override
    public Double getArea() {
        return getlSides()[0] * getlSides()[1];
    }

    @Override
    public Double getPeremetr() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle" +
                ", width = " + width +
                ", height = " + height + ";";
    }

    public void setWidth(Double widthN) {
        this.width = widthN;
    }

    public void setHeight(Double heightN) {
        this.height = heightN;
    }
}
