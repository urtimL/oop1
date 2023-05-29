package Lesson2H;

import Lesson2H.base.WildAnimal;

public class Wolf extends WildAnimal {
    private Boolean leader;
    public Wolf(Double growthAn, Double weightAn, String eyeColorAn, String habitatN,
                String dateFoundN, Boolean leaderN) {
        super(growthAn, weightAn, eyeColorAn, habitatN, dateFoundN);
        this.leader = leaderN;
    }

    @Override
    public String toString() {
        return "Волк: " + super.toString() +
                ", Вожак стаи = " + leader;
    }

    public Boolean getLeader() {
        return leader;
    }

    @Override
    public void makeSound() {
        System.out.println("Уууууу");
    }
}
