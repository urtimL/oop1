package Lesson3H.base;

import java.util.Arrays;

public abstract class Polygon extends Figure implements Peremetr {
    private Integer nSides;
    private Double[] lSides = new Double[100];


    public Polygon(Integer nSidesN, Double[] lSidesN) {
        this.nSides = nSidesN;
        this.lSides = lSidesN;
    }

    public Double[] getlSides() {
        return lSides;
    }


    @Override
    public abstract Double getPeremetr();

    @Override
    public String toString() {
        return super.toString() + "";
    }

}
