package Lesson2H;

import Lesson2H.base.Pet;

public class Dog extends Pet {

    private Boolean isTrained;
    public Dog(Double growthAn, Double weightAn, String eyeColorAn, String nameN,
               String breedN, String vaccinationsN, String coatColorN, String dateOfBirthN, Boolean isTrainedN) {
        super(growthAn, weightAn, eyeColorAn, nameN, breedN, vaccinationsN, coatColorN, dateOfBirthN);
        this.isTrained = isTrainedN;
    }

    @Override
    public String toString() {
        return "Собака: "  + super.toString() +
                ", Наличие дрессировки = " + isTrained;
    }

    public Boolean getTrained() {
        return isTrained;
    }

    public void train(){
        this.isTrained = true;
    } //Дрессировка

    @Override
    public void makeSound() {
        System.out.println("Гав");
    }

    @Override
    public void showAffection() {
        System.out.println("Проявляет ласку");
    }


}
