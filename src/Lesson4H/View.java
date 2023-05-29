package Lesson4H;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

import Lesson4H.Presenter;

public class View {

    public void menu() throws Exception{
        Presenter presenter = new Presenter();
        presenter.Demo();

        int userNum = 0;
        while (userNum != 4) {
            printFilterParameters("Рабта с массивом String;>" +
                    "Работа с массивом Integer;>" +
                    "Работа с массивом Double;>" +
                    "Exit");
            System.out.println("Введите номер операции");
            userNum = userDataInt();
            switch (userNum) {
                case 1:
                    demoString(presenter.getStrData());
                    break;
                case 2:
                    demoInteger(presenter.getIntData());
                    break;
                case 3:
                    demoDouble(presenter.getDblData());
                    break;
                default:
                    userNum = 4;
            }
        }
    }

    public static void demoString(DynamicArray<String> stringDA) {
        System.out.println("Пример использования DynamicArray с типом данных String");
        stringDA.printArr();
        System.out.println();

        System.out.println("Вставка в массив: вставляем строку Строка №55");
        stringDA.putElInArr("Строка №55");
        stringDA.printArr();
        System.out.println();

        System.out.println("Удаление элемента по индексу: удаляем 0-й элемент");
        stringDA.removeEl(0);
        stringDA.printArr();
        System.out.println();

        System.out.println("Удаление всех элементов с заданным значением: удоляем элемент со значением Строка №995");
        stringDA.removingAllElementsWithGivenValue("Строка №995");
        stringDA.printArr();
        System.out.println();

        System.out.println("Поиск минимума");
        System.out.println("Минимальный элемент = " + stringDA.minEl((s0, s1) -> s0.length() - s1.length()));
        System.out.println();

        System.out.println("Поиск максимума");
        System.out.println("Максимальный элемент = " + stringDA.maxEl((s0, s1) -> s0.length() - s1.length()));
        System.out.println();

        System.out.println("Поиск суммы элементов массива");
        try {
            System.out.println("Сумма элементов = " + stringDA.sumEl());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        System.out.println("Поиск произведения элементов массива");
        try {
            System.out.println("Произведние элементов = " + stringDA.multiplyEl());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        System.out.println("Поиск индекса заданного элемента в массиве, " +
                "если такого элемента в массиве нет то возвращать -1");
        System.out.println("Ещем индекс элемента со значением: Строка №55");
        System.out.println("Результат поиска: " + stringDA.indexOfEl("Строка №55"));
        System.out.println("Ещем индекс элемента со значением: Строка №10");
        System.out.println("Результат поиска: " + stringDA.indexOfEl("Строка №10"));
        System.out.println();

        System.out.println("Проверка наличия элемента в массиве." +
                "Возвращает true, если элемент в массиве есть, false – нет.");
        System.out.println("Ищем элемент со значением: Строка №55");
        System.out.println("Результат поиска: " + stringDA.containsEl("Строка №55"));
        System.out.println("Ещем элемент со значением: Строка №10");
        System.out.println("Результат поиска: " + stringDA.containsEl("Строка №10"));
        System.out.println();

        System.out.println("Пузырьковая сортировка");
        stringDA.bubbleSort(java.util.Comparator.naturalOrder());
        stringDA.printArr();
        System.out.println();

        System.out.println("Получение элемента массива по индексу");
        System.out.println("Значение элемента с индексом 5 = " + stringDA.getEl(5));
        System.out.println();

        System.out.println("Задание значения элементу массива с заданным индексом");
        System.out.println("Установим элементу с индексом 5 значение 88");
        stringDA.setEl(5, "Строка №88");
        stringDA.printArr();
        System.out.println();
    }

    public static void demoInteger(DynamicArray<Integer> integerDA) {
        System.out.println("Пример использования DynamicArray с типом данных Integer");
        integerDA.printArr();
        System.out.println();

        System.out.println("Вставка в массив: вставляем число 55");
        integerDA.putElInArr(55);
        integerDA.printArr();
        System.out.println();

        System.out.println("Удаление элемента по индексу: удаляем 0-й элемент");
        integerDA.removeEl(0);
        integerDA.printArr();
        System.out.println();

        System.out.println("Удаление всех элементов с заданным значением: удоляем элемент со значением 105");
        integerDA.removingAllElementsWithGivenValue(105);
        integerDA.printArr();
        System.out.println();

        System.out.println("Поиск минимума");
        System.out.println("Минимальный элемент = " + integerDA.minEl(Integer::compare));
        System.out.println();

        System.out.println("Поиск максимума");
        System.out.println("Максимальный элемент = " + integerDA.maxEl(Integer::compare));
        System.out.println();

        System.out.println("Поиск суммы элементов массива");
        try {
            System.out.println("Сумма элементов = " + integerDA.sumEl());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        System.out.println("Поиск произведения элементов массива");
        try {
            System.out.println("Произведние элементов = " + integerDA.multiplyEl());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        System.out.println("Поиск индекса заданного элемента в массиве, " +
                "если такого элемента в массиве нет то возвращать -1");
        System.out.println("Ещем индекс элемента со значением: 110");
        System.out.println("Результат поиска: " + integerDA.indexOfEl(110));
        System.out.println("Ещем индекс элемента со значением: 10");
        System.out.println("Результат поиска: " + integerDA.indexOfEl(10));
        System.out.println();

        System.out.println("Проверка наличия элемента в массиве." +
                "Возвращает true, если элемент в массиве есть, false – нет.");
        System.out.println("Ещем элемент со значением: 110");
        System.out.println("Результат поиска: " + integerDA.containsEl(110));
        System.out.println("Ещем элемент со значением: 10");
        System.out.println("Результат поиска: " + integerDA.containsEl(10));
        System.out.println();

        System.out.println("Пузырьковая сортировка");
        integerDA.bubbleSort(Integer::compare);
        integerDA.printArr();
        System.out.println();

        System.out.println("Получение элемента массива по индексу");
        System.out.println("Значение элемента с индексом 5 = " + integerDA.getEl(5));
        System.out.println();

        System.out.println("Задание значения элементу массива с заданным индексом");
        System.out.println("Установим элементу с индексом 5 значение 88");
        integerDA.setEl(5, 88);
        integerDA.printArr();
        System.out.println();

    }

    public static void demoDouble(DynamicArray<Double> doubleDA) {
        System.out.println("Пример использования DynamicArray с типом данных Double");
        doubleDA.printArr();
        System.out.println();

        System.out.println("Вставка в массив: вставляем число 55,5");
        doubleDA.putElInArr(55.55);
        doubleDA.printArr();
        System.out.println();

        System.out.println("Удаление элемента по индексу: удаляем 0-й элемент");
        doubleDA.removeEl(0);
        doubleDA.printArr();
        System.out.println();

        System.out.println("Удаление всех элементов с заданным значением: удоляем элемент со значением 505,0");
        doubleDA.removingAllElementsWithGivenValue(505.0);
        doubleDA.printArr();
        System.out.println();

        System.out.println("Поиск минимума");
        System.out.println("Минимальный элемент = " + doubleDA.minEl(Double::compare));
        System.out.println();

        System.out.println("Поиск максимума");
        System.out.println("Максимальный элемент = " + doubleDA.maxEl(Double::compare));
        System.out.println();

        System.out.println("Поиск суммы элементов массива");
        try {
            System.out.println("Сумма элементов = " + doubleDA.sumEl());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        System.out.println("Поиск произведения элементов массива");
        try {
            System.out.println("Произведние элементов = " + doubleDA.multiplyEl());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        System.out.println("Поиск индекса заданного элемента в массиве, " +
                "если такого элемента в массиве нет то возвращать -1");
        System.out.println("Ещем индекс элемента со значением: 510,0");
        System.out.println("Результат поиска: " + doubleDA.indexOfEl(510.0));
        System.out.println("Ещем индекс элемента со значением: 10,0");
        System.out.println("Результат поиска: " + doubleDA.indexOfEl(10.0));
        System.out.println();

        System.out.println("Проверка наличия элемента в массиве." +
                "Возвращает true, если элемент в массиве есть, false – нет.");
        System.out.println("Ещем элемент со значением: 510,0");
        System.out.println("Результат поиска: " + doubleDA.containsEl(510.0));
        System.out.println("Ещем элемент со значением: 10,0");
        System.out.println("Результат поиска: " + doubleDA.containsEl(10.0));
        System.out.println();

        System.out.println("Пузырьковая сортировка");
        doubleDA.bubbleSort(Double::compare);
        doubleDA.printArr();
        System.out.println();

        System.out.println("Получение элемента массива по индексу");
        System.out.println("Значение элемента с индексом 5 = " + doubleDA.getEl(5));
        System.out.println();

        System.out.println("Задание значения элементу массива с заданным индексом");
        System.out.println("Установим элементу с индексом 5 значение 88,88");
        doubleDA.setEl(5, 88.88);
        doubleDA.printArr();
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

    public static void printFilterParameters(String str){
        String[] words = str.split(">");
        int np = 1;
        for (String word : words) {
            System.out.println("" + np++ + ". " + word);
        }
        System.out.println();
    }
}
