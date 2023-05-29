package Lesson2H;

import Lesson2H.base.WildAnimal;

public class Tiger extends WildAnimal {
    public Tiger(Double growthAn, Double weightAn, String eyeColorAn, String habitatN, String dateFoundN) {
        super(growthAn, weightAn, eyeColorAn, habitatN, dateFoundN);
    }

    @Override
    public String toString() {
        return "Тигр: " + super.toString();
    }

    @Override
    public void makeSound() {
        System.out.println("Рык");
    }
}
