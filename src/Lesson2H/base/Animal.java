package Lesson2H.base;

public abstract class Animal {
    private Double growthAn;
    private Double weightAn;
    private String eyeColorAn;

    public abstract void makeSound();

    public void printInfo(){
        System.out.println(this.toString());
    }

    public Animal(Double growthAn, Double weightAn, String eyeColorAn) {
        this.growthAn = growthAn;
        this.weightAn = weightAn;
        this.eyeColorAn = eyeColorAn;
    }

    @Override
    public String toString() {
        return  "Рост животного = " + growthAn +
                ", Вес животного = " + weightAn +
                ", Цвет глаз животного = " + eyeColorAn;
    }

    public Double getGrowthAn() {
        return growthAn;
    }

    public void setGrowthAn(Double growthAn) {
        this.growthAn = growthAn;
    }

    public Double getWeightAn() {
        return weightAn;
    }

    public void setWeightAn(Double weightAn) {
        this.weightAn = weightAn;
    }

    public String getEyeColorAn() {
        return eyeColorAn;
    }

    public void setEyeColorAn(String eyeColorAn) {
        this.eyeColorAn = eyeColorAn;
    }
}