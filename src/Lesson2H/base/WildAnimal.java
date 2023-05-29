package Lesson2H.base;

public abstract class WildAnimal extends Animal{
    private String habitat;
    private String dateFound;
    public WildAnimal(Double growthAn, Double weightAn, String eyeColorAn,
                      String habitatN, String dateFoundN) {
        super(growthAn, weightAn, eyeColorAn);
        this.habitat = habitatN;
        this.dateFound = dateFoundN;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Место обитания = " + habitat +
                ", Дата нахождения = " + dateFound;
    }

    @Override
    public void printInfo(){
        System.out.println(this.toString());
    }

}
