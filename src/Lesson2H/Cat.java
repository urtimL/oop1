package Lesson2H;

import Lesson2H.base.Pet;

public class Cat extends Pet {

    private Boolean fur;
    public Cat(Double growthAn, Double weightAn, String eyeColorAn, String nameN,
               String breedN, String vaccinationsN, String coatColorN, String dateOfBirthN, Boolean furN) {
        super(growthAn, weightAn, eyeColorAn, nameN, breedN, vaccinationsN, coatColorN, dateOfBirthN);
        this.fur = furN;
    }

    @Override
    public String toString() {
        return "Кот: " + super.toString() +
                ", Наличие шерсти = " + fur;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }

    @Override
    public void showAffection() {
        System.out.println("Проявляет ласку");
    }

    public Boolean getFur() {
        return fur;
    }
}
