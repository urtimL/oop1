package Lesson3H;

import Lesson3H.base.*;

public class Circle extends Figure implements CurvedLen {
    public Double radius;

    public Circle(Double radius) {
        if (radius > 0.0)
            this.radius = radius;
        else
            System.out.println("Нулевой радиус");
    }

    @Override
    public Double gelLen() {
        return 2.0 * Math.PI * radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public String toString() {
        return super.toString() + "Circle" +
        ", radius = " + radius + " ;";
    }

    public void setRadius(Double radiusN) {
        this.radius = radiusN;
    }
}
