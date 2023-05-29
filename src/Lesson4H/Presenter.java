package Lesson4H;

import Lesson4H.Core.Models.DynArray;

import java.util.ArrayList;

public class Presenter {
    private static DynamicArray<String> strData;
    private static DynamicArray<Integer> intData;
    private static DynamicArray<Double> dblData;

    public static void Demo() {
        //Создадим массивы для тестирования

        //Создание конструктором без параметров
        strData = new DynamicArray<>();
        intData = new DynamicArray<>();

        ArrayList<Double> newArr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            strData.putElInArr("Строка №" + (1000 - i));
            intData.putElInArr(120 - i);
            newArr.add(new Double(520 - i));
        }

        //Создание конструктором с параметрами
        dblData = new DynamicArray<>(newArr);
    }

    public static DynamicArray<String> getStrData() {
        return strData;
    }

    public static DynamicArray<Integer> getIntData() {
        return intData;
    }

    public static DynamicArray<Double> getDblData() {
        return dblData;
    }
}
