package Lesson3H.base;

public abstract class Figure {
    public abstract Double getArea();

    public void printInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "";
    }
}
