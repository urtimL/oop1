package Lesson2H;

import Lesson2H.base.Bird;

public class Chicken extends Bird {
    public Chicken(Double growthAn, Double weightAn, String eyeColorAn, Double flightAltitudeN) {
        super(growthAn, weightAn, eyeColorAn, flightAltitudeN);
    }

    @Override
    public String toString() {
        return "Курица: " + super.toString();
    }

    @Override
    public void makeSound() {
        System.out.println("Ку-ка-ре-ку");
    }
}
