package Lesson3H;

import Lesson3H.base.Figure;
import Lesson3H.base.Polygon;
import Lesson3H.base.Metods;
import Lesson3H.base.FigureCollection;

import java.util.ArrayList;

public class Main{
    private static ArrayList<Figure> figDB;

    public static void main(String[] args) {
        int userNum = 0;
        System.out.println("Выбирите номер операции: ");
        Metods.printFilterParameters("Работа с массивом фигур;>Работа с коллекцией фигур;");
        userNum = Metods.userDataInt();
        switch (userNum) {
            case 1:
                workWithArray();
                break;
            case 2:
                workWithCollection();
                break;
        }
    }

    private static void createFigDB(){
        figDB = new ArrayList<>();
//        figDB.add(new Triangle(3.0, 4.0, 5.0));
//        figDB.add(new Square(Math.random() * 100));
//        figDB.add(new Rectangle(Math.random() * 100, Math.random() * 100));
//        figDB.add(new Circle(Math.random() * 100));
    }


    private static void workWithArray(){
        createFigDB();
        Integer userNum = 0;
        while (userNum != 4) {
            createOperationsOnAnArrayOfShapes();
            System.out.println("Введите код операции - ");
            userNum = Metods.userDataInt();
            switch (userNum) {
                case 1:
                    Figure newFigure = Metods.createNewFigure();

                    if(newFigure == null){
                        System.out.println("Фигура не была создана, попробуйте еще раз");
                    }else figDB.add(newFigure);
                    break;
                case 2:
                    for (Figure fig : figDB) {
                        if (fig instanceof Polygon)
                            System.out.println("Периметр " + fig.getClass().getSimpleName() + " = " + ((Polygon) fig).getPeremetr());
                    }
                    break;
                case 3:
                    for (Figure fig : figDB) {
                        System.out.println("Площадь " + fig.getClass().getSimpleName() + " = " + fig.getArea());
                    }
                    break;
            }
        }
    }


    private static void createOperationsOnAnArrayOfShapes(){
        Metods.printFilterParameters("Добавить новую фигуру в массив;>" +
                "Посчитать периметр у всех фигур;>" +
                "Посчитать площадь у всех фигур;>" +
                "Завершить работу с программой;");
    }

    private static void workWithCollection() {
        Integer userNum = 0;
        while (userNum != 6) {
            createOperationsOnAnCollectionOfShapes();
            FigureCollection figColl = new FigureCollection();
            System.out.println("Введите код операции: ");
            userNum = Metods.userDataInt();

            switch (userNum) {
                case 1:
                    figColl.getPeremetrAndArea();
                    break;
                case 2:
                    Figure newFigure = Metods.createNewFigure();
                    if(newFigure == null){
                        System.out.println("Фигура не была создана, попробуйте еще раз");
                    }else figColl.addFigure(newFigure);
                    break;
                case 3:
                    System.out.println("Введите номер удоляемой фигуры: ");
                    figColl.removeFigure(Metods.userDataInt());
                    break;
                case 4:
                    figColl.changeFigure();
                    break;
                case 5:
                    System.out.println("Фигуры в коллекции до сортировки: ");
                    figColl.figuresInCollection();
                    figColl.sortCollection();
                    System.out.println("Фигуры в коллекции после сортировки: ");
                    figColl.figuresInCollection();
                    break;
            }
        }
    }

    private static void createOperationsOnAnCollectionOfShapes(){
        Metods.printFilterParameters("Вывод площадей и периметров всех фигур коллекции;>" +
                "Добавления новой фигуры в коллекцию;>" +
                "Удаления фигуры из коллекции;>" +
                "Изменения фигуры по ндексу;>" +
                "Сортировка по площади, вывод информации о всех фигурах коллекции;>" +
                "Завершить работу с программой");
    }
}