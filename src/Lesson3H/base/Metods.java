package Lesson3H.base;

import Lesson3H.Circle;
import Lesson3H.Rectangle;
import Lesson3H.Square;
import Lesson3H.Triangle;

import java.util.Scanner;

public class Metods {

    public static Figure createNewFigure(){
        Figure newFigure = null;

        printFilterParameters("Треугольникв;>Квадрат;>Прямоугольник;>Круг;");
        System.out.println("Введите код фигуры - ");
        Integer userNum = userDataInt();

        switch (userNum) {
            case 1:
                newFigure = createNewTriangle();
                break;
            case 2:
                System.out.println("Введите длину стороны квадрата - ");

                newFigure = new Square(userDataDouble());
                break;
            case 3:
                Double a, b;
                System.out.println("Введите длину стороны a - ");
                a = userDataDouble();
                System.out.println("Введите длину стороны b - ");
                b = userDataDouble();

                newFigure = new Rectangle(a, b);
                break;
            case 4:
                System.out.println("Введите длину радиуса окружности - ");

                newFigure = new Circle(userDataDouble());
                break;
        }

        return newFigure;
    }

    public static Figure createNewTriangle(){
        Figure newTriangele = null;
        Double a, b, c;
        System.out.println("Введите длину стороны a - ");
        a = userDataDouble();
        System.out.println("Введите длину стороны b - ");
        b = userDataDouble();
        System.out.println("Введите длину стороны c - ");
        c = userDataDouble();

        if ((a <= 0.0 || b <= 0.0 || c <= 0.0) || !(a + b > c && a + c > b && b + c > a))
            System.out.println("Неправильные стороны!");
        else newTriangele = new Triangle(a, b, c);

        return newTriangele;
    }

    public static void printFilterParameters(String str){
        String[] words = str.split(">");
        int np = 1;
        for (String word : words) {
            System.out.println("" + np++ + ". " + word);
        }
        System.out.println();
    }

    public static Integer userDataInt() {
        Integer num = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
        return num;
    }

    public static Double userDataDouble() {
        Double num = 0d;
        try {
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextDouble();
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

        return (double) num;
    }
}
