package Lesson2H.base;

public abstract class Pet extends Animal{

    private String nameAn;
    private String breed;
    private String vaccinations;
    private String coatColor;
    private String dateOfBirth;

    //Проявлять ласку
    public abstract void showAffection(); //метод проявлять ласку

    public Pet(Double growthAn, Double weightAn, String eyeColorAn,
               String nameN, String breedN, String vaccinationsN,
               String coatColorN, String dateOfBirthN) {
        super(growthAn, weightAn, eyeColorAn);
        this.nameAn = nameN;
        this.breed = breedN;
        this.vaccinations = vaccinationsN;
        this.coatColor = coatColorN;
        this.dateOfBirth = dateOfBirthN;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Кличка = " + nameAn +
                ", Порода = " + breed +
                ", Наличие прививок = " + vaccinations +
                ", Цвет шерсти = " + coatColor +
                ", Дата рождения = " + dateOfBirth;
    }

    @Override
    public void printInfo(){
        System.out.println(this.toString());
    }

}