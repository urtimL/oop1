package Lesson3H;

public class Square extends Rectangle{
    Double width;

    public Square(Double widthN) {
        super(widthN);
        this.width = widthN;
    }

    @Override
    public Double getPeremetr() {
        return width * 4;
    }

    @Override
    public Double getArea() {
        return width * width;
    }

    @Override
    public String toString() {
        return "Square, width- " + width + ";";
    }

    @Override
    public void setWidth(Double widthN) {
        this.width = widthN;
    }
}
