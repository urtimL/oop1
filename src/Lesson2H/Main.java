package Lesson2H;

import Lesson2H.base.Animal;
import Lesson2H.base.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> executableCommands;
    private static ArrayList<String> animals;
    private static Zoo newZoo = new Zoo();

    public static void main(String[] args) {
        fillFilterCriteria();
        fillAnimals();
        consoleMenu();
    }

    private static void consoleMenu() {
        Integer numberOp = 0;
        while (numberOp != 9) {
            System.out.println("Список операций: ");
            executableCommands.forEach(System.out::println);
            System.out.print("Введите номер операции: ");
            numberOp = userDataInt();
            selectionProcessing(numberOp);
        }
    }

    private static void selectionProcessing(Integer numOp) {
        switch (numOp) {
            case (1):
                newZoo.addAnimal(createAnimal());
                newZoo.whoIsInZoo();
                break;
            case (2):
                System.out.print("Введите номер животного начиная с 0: ");
                newZoo.removeAnimal(userDataInt());
                break;
            case (3):
                System.out.print("Введите номер животного начиная с 0: ");
                newZoo.seeInfo(userDataInt());
                break;
            case (4):
                System.out.print("Введите номер животного начиная с 0: ");
                newZoo.makeSound(userDataInt());
                break;
            case (5):
                newZoo.whoIsInZoo();
                break;
            case (6):
                newZoo.everyoneScream();
                break;
        }
    }

    private static Animal createAnimal() {
        System.out.println("Список животных: ");
        animals.forEach(System.out::println);
        System.out.print("Введите номер животного: ");

        Animal newAnimal = null;
        int userNum = userDataInt();
        switch (userNum) {
            case (1):
                newAnimal = createCat();
                break;
            case (2):
                newAnimal = createDog();
                break;
            case (3):
                newAnimal = createTigr();
                break;
            case (4):
                newAnimal = createWolf();
                break;
            case (5):
                newAnimal = createChicken();
                break;
            case (6):
                newAnimal = createStork();
                break;
        }

        return newAnimal;
    }

    private static Stork createStork(){

        System.out.print("Введите Рост птицы: ");
        Double growthAn = userDataDouble();

        System.out.print("Введите Вес птицы: ");
        Double weightAn = userDataDouble();

        System.out.print("Введите Цвет глаз птицы: ");
        String eyeColorAn = userDataStr();

        System.out.print("Введите Высоту полёта птицы: ");
        Double flightAltitudeN = userDataDouble();

        Animal newStork = new Stork(growthAn, weightAn, eyeColorAn, flightAltitudeN);

        return (Stork) newStork;
    }

    private static Chicken createChicken(){

        System.out.print("Введите Рост птицы: ");
        Double growthAn = userDataDouble();

        System.out.print("Введите Вес птицы: ");
        Double weightAn = userDataDouble();

        System.out.print("Введите Цвет глаз птицы: ");
        String eyeColorAn = userDataStr();

        System.out.print("Введите Высоту полёта птицы: ");
        Double flightAltitudeN = userDataDouble();

        Animal newChicken = new Chicken(growthAn, weightAn, eyeColorAn, flightAltitudeN);

        return (Chicken) newChicken;
    }

    private static Wolf createWolf(){

        System.out.print("Введите Рост животного: ");
        Double growthAn = userDataDouble();

        System.out.print("Введите Вес животного: ");
        Double weightAn = userDataDouble();

        System.out.print("Введите Цвет глаз животного: ");
        String eyeColorAn = userDataStr();

        System.out.print("Введите Место обитания животного: ");
        String habitatN = userDataStr();

        System.out.print("Введите Дату нахождения животного: ");
        String dateFoundN = userDataStr();

        System.out.print("Введите признак Вожак стаи: ");
        Boolean leaderN = userDataBool();

        Animal newWolf = new Wolf(growthAn, weightAn, eyeColorAn, habitatN,
                dateFoundN, leaderN);

        return (Wolf) newWolf;
    }

    private static Tiger createTigr(){

        System.out.print("Введите Рост животного: ");
        Double growthAn = userDataDouble();

        System.out.print("Введите Вес животного: ");
        Double weightAn = userDataDouble();

        System.out.print("Введите Цвет глаз животного: ");
        String eyeColorAn = userDataStr();

        System.out.print("Введите Место обитания животного: ");
        String habitatN = userDataStr();

        System.out.print("Введите Дату нахождения животного: ");
        String dateFoundN = userDataStr();

        Animal newTiger = new Tiger(growthAn, weightAn, eyeColorAn, habitatN, dateFoundN);

        return (Tiger) newTiger;
    }
    private static Dog createDog(){

        System.out.print("Введите Рост животного: ");
        Double growthAn = userDataDouble();

        System.out.print("Введите Вес животного: ");
        Double weightAn = userDataDouble();

        System.out.print("Введите Цвет глаз животного: ");
        String eyeColorAn = userDataStr();

        System.out.print("Введите Кличку животного: ");
        String nameN = userDataStr();

        System.out.print("Введите Породу животного: ");
        String breedN = userDataStr();

        System.out.print("Введите Наличие прививок: ");
        String vaccinationsN = userDataStr();

        System.out.print("Введите Цвет шерсти животного: ");
        String coatColorN = userDataStr();

        System.out.print("Введите Дата рождения животного: ");
        String dateOfBirthN = userDataStr();

        System.out.print("Введите Наличие дрессировки животного: ");
        Boolean isTrainedN = userDataBool();

        Animal newDog = new Dog(growthAn, weightAn, eyeColorAn, nameN, breedN,
                vaccinationsN, coatColorN, dateOfBirthN, isTrainedN);

        return (Dog) newDog;
    }

    private static Cat createCat() {
        System.out.print("Введите Рост животного: ");
        Double growthAn = userDataDouble();

        System.out.print("Введите Вес животного: ");
        Double weightAn = userDataDouble();

        System.out.print("Введите Цвет глаз животного: ");
        String eyeColorAn = userDataStr();

        System.out.print("Введите Кличку животного: ");
        String nameN = userDataStr();

        System.out.print("Введите Породу животного: ");
        String breedN = userDataStr();

        System.out.print("Введите Наличие прививок: ");
        String vaccinationsN = userDataStr();

        System.out.print("Введите Наличие шерсти: ");
        Boolean furN = userDataBool();

        String coatColorN = "нет шерсти";
        if (furN) {
            System.out.print("Введите Цвет шерсти животного: ");
            coatColorN = userDataStr();
        }

        System.out.print("Введите Дата рождения животного: ");
        String dateOfBirthN = userDataStr();


        Animal newCat = new Cat(growthAn, weightAn, eyeColorAn, nameN,
                breedN, vaccinationsN, coatColorN, dateOfBirthN, furN);

        return (Cat) newCat;
    }

    private static Integer userDataInt() {
        Integer num = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

        return num;
    }

    private static Double userDataDouble() {
        Double num = 0d;
        try {
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextDouble();
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

        return (double) num;
    }

    private static String userDataStr() {
        String str = "";
        try {
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

        return str;
    }

    private static Boolean userDataBool() {
        Boolean str = null;
        try {
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextBoolean();
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

        return str;
    }

    private static void fillFilterCriteria() {
        executableCommands = new ArrayList<>();
        executableCommands.add("1. Добавить животное в зоопарк");
        executableCommands.add("2. Убирает животное с номером i из зоопарка");
        executableCommands.add("3. Посмотреть информацию о животном с номером i");
        executableCommands.add("4. Заставить животное с номером i издать звук");
        executableCommands.add("5. Напечатать информацию о животных, которые есть на данный момент в зоопарке");
        executableCommands.add("6. Заставить всех животных, которые на данный момент есть в зоопарке, издать звук");
        executableCommands.add("9. Завершить работу программы.");
    }

    private static void fillAnimals() {
        animals = new ArrayList<>();
        animals.add("1. Кот");
        animals.add("2. Собака");
        animals.add("3. Тигр");
        animals.add("4. Волк");
        animals.add("5. Курица");
        animals.add("6. Аист");
    }
}
