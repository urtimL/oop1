package Lesson3H.base;

import Lesson3H.Circle;
import Lesson3H.Rectangle;
import Lesson3H.Square;
import Lesson3H.Triangle;

import java.util.ArrayList;
import java.util.Comparator;

public class FigureCollection {

    private static ArrayList<Figure> collectionOfFigure = new ArrayList<>();

    public void addFigure (Figure figure){ collectionOfFigure.add(figure); }
    private Figure getFigure(int index){
        return collectionOfFigure.get(index);
    }
    public void removeFigure(int index){
        collectionOfFigure.remove(index);
    }

    public void changeFigure() {
        Integer index = 0;
        System.out.println("Введите номер изменяемой фигуры: ");
        index = Metods.userDataInt();
        Figure figure = getFigure(index);
        seeInfo(index);

        String name = figure.getClass().getSimpleName();
        if(name.equals("Circle")){
            System.out.println("Введите новый радиус: ");
            ((Circle) figure).setRadius(Metods.userDataDouble());
        } else if (name.equals("Rectangle")) {
            System.out.println("Введите новый width: ");
            ((Rectangle) figure).setWidth(Metods.userDataDouble());

            System.out.println("Введите новый height: ");
            ((Rectangle) figure).setHeight(Metods.userDataDouble());
        } else if (name.equals("Square")){
            System.out.println("Введите новый width: ");
            ((Square) figure).setWidth(Metods.userDataDouble());
        } else if (name.equals("Triangle")){
            System.out.println("Введите сторону а: ");
            Double a = Metods.userDataDouble();

            System.out.println("Введите сторону b: ");
            Double b = Metods.userDataDouble();

            System.out.println("Введите сторону c: ");
            Double c = Metods.userDataDouble();

            if ((a <= 0.0 || b <= 0.0 || c <= 0.0) || !(a + b > c && a + c > b && b + c > a))
                System.out.println("Неправильные стороны!");
            else {
                ((Triangle) figure).setA(a);
                ((Triangle) figure).setB(b);
                ((Triangle) figure).setC(c);
            }
        }


        System.out.println("Фигура после изменений");
        seeInfo(index);
        System.out.println();
    }
    public void seeInfo(int index){
        Figure fig = getFigure(index);
        fig.printInfo();
    }
    public void figuresInCollection(){
        for (Figure figure : collectionOfFigure) {
            figure.printInfo();
        }
        System.out.println();
    }
    public void sortCollection(){
        Comparator comparator = new FigureAreaComparator();
        collectionOfFigure.sort(comparator);
    }

    public void getPeremetrAndArea(){
        for (Figure fig : collectionOfFigure) {
            String name = fig.getClass().getSimpleName();
            Double perimetr = (fig instanceof Polygon) ? ((Polygon) fig).getPeremetr() : 0;
            Double area = fig.getArea();
            System.out.printf("%s площадь = %s, периметр = %s",name, area, perimetr);
            System.out.println();
        }
        System.out.println();
    }
}
