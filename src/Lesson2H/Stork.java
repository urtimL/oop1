package Lesson2H;

import Lesson2H.base.Bird;

public class Stork extends Bird {
    public Stork(Double growthAn, Double weightAn, String eyeColorAn, Double flightAltitudeN) {
        super(growthAn, weightAn, eyeColorAn, flightAltitudeN);
    }

    @Override
    public String toString() {
        return "Аист: " + super.toString();
    }

    @Override
    public void makeSound() {
        System.out.println("Аистинное ку-ка-ре-ку");
    }
}
