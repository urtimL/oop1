package Lesson4H;

import java.util.*;
import java.util.function.Predicate;

public class DynamicArray <T> {
    //1. Сам массив произвольных данных.
    private ArrayList<T> arr;

    //2. Длинна массива
    private Integer arrSize;

    public DynamicArray() {
        this.arr = new ArrayList<T>();
    }

    public DynamicArray(ArrayList<T> arr) {
        this.arr = arr;
        this.arrSize = arr.size();
    }

    //    1. Вставка в массив
    public void putElInArr(T el) { arr.add(el); }

    //    2. Удаление элемента по индексу
    public void removeEl(int index) { arr.remove(index); }

    //    3. Удаление всех элементов с заданным значением
    public void removingAllElementsWithGivenValue(T el) {
        Iterator<T> itr = (Iterator<T>) arr.iterator();

        while (itr.hasNext())
        {
            T t = itr.next();
            if (t.equals(el)) {
                itr.remove();
            }
        }
    }

    //    4. Поиск минимума
    public T minEl(java.util.Comparator<? super T> comparator) {
        T min = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if(comparator.compare(min, arr.get(i)) > 0) {
                min = arr.get(i);
            }
        }
        return min;
    }

    //    5. Поиск максимума
    public T maxEl(java.util.Comparator<? super T> comparator) {
        T max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if(comparator.compare(max, arr.get(i)) < 0) {
                max = arr.get(i);
            }
        }
        return max;
    }

    //    6. Поиск суммы элементов массива
    public T sumEl() throws Exception {
        T el = arr.get(0);
        if (    el instanceof Long ||
                el instanceof Integer ||
                el instanceof Short ||
                el instanceof Byte  ) {
            Long sumRes = 0L;
            for (int i = 0; i < arr.size(); i++)
                sumRes += ((Number) arr.get(i)).longValue();
            return (T) sumRes;
        } else if ( el instanceof Double ||
                    el instanceof Float) {
            Double sumRes = 0.0;
            for (int i = 0; i < arr.size(); i++)
                sumRes += ((Number) arr.get(i)).doubleValue();
            return (T) sumRes;
        } else if ( el instanceof String ) {
                    String sumRes = "";
            for (int i = 0; i < arr.size(); i++)
                sumRes += ((String) arr.get(i)).toString();
            return (T) sumRes;
        } else
            throw new Exception(el.getClass().getSimpleName() + " невозможно суммировать");
    }

    //    7. Поиск произведения элементов массива
    public T multiplyEl() throws Exception {
        T el = arr.get(0);
        if (    el instanceof Long ||
                el instanceof Integer ||
                el instanceof Short ||
                el instanceof Byte  ) {
            Long sumRes = 1L;
            for (int i = 0; i < arr.size(); i++)
                sumRes *= ((Number) arr.get(i)).longValue();
            return (T) sumRes;
        } else if ( el instanceof Double ||
                el instanceof Float) {
            Double sumRes = 1.0;
            for (int i = 0; i < arr.size(); i++)
                sumRes *= ((Number) arr.get(i)).doubleValue();
            return (T) sumRes;
        }else if ( el instanceof String ) {
            String sumRes = "Невозможно произвести операцию умножения для строк";
             return (T) sumRes;
        } else
            throw new Exception(el.getClass().getSimpleName() + " невозможно перемножать");
    }

    //    8. Поиск индекса заданного элемента в массиве,
    //    если такого элемента в массиве нет то возвращать -1
    public Integer indexOfEl(T el) { return arr.indexOf(el); }

    //    9. Проверка наличия элемента в массиве.
    //    Возвращает true, если элемент в массиве есть, false – нет.
    public Boolean containsEl(T el) { return arr.contains(el); }

    //    10. Пузырьковая сортировка
    public void bubbleSort(java.util.Comparator<? super T> comparator) {
        for (int i = 0; i < arr.size(); i++) {
            T k1, k2, k3;
            Boolean isSorted = true;
            for (int k = 0; k < arr.size() - i - 1; k++) {
                k1 = arr.get(k);
                k2 = arr.get(k + 1);
                if (comparator.compare(k1, k2) > 0) {
                    k3 = k1;
                    arr.set(k, k2);
                    arr.set(k + 1, k3);
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    }

    //    11. Сортировка простыми вставками
    public void insertionSort(java.util.Comparator<? super T> comparator) {
        for (int i = 1; i < arr.size(); i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            T swap = arr.get(i);
            int j;
            for (j = i; j > 0 && comparator.compare(swap, arr.get(j - 1)) < 0; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                arr.set(j, arr.get(j - 1));
            }
            arr.set(j, swap);
        }
    }

    //    12. Сортировка простым выбором
    public void selectionSort(java.util.Comparator<? super T> comparator) {
        for (int i = 0; i < arr.size(); i++) {
            int pos = i;
            T min = arr.get(i);
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < arr.size(); j++) {
                if (comparator.compare(arr.get(j), min) < 0) {
                    //pos - индекс наименьшего элемента
                    pos = j;
                    min = arr.get(j);
                }
            }
            arr.set(pos, arr.get(i));
            //меняем местами наименьший с sortArr[i]
            arr.set(i, min);
        }
    }

    //    13. Получение элемента массива по индексу
    public T getEl(int index) { return arr.get(index); }

    //    14. Задание значения элементу массива с заданным индексом
    public void setEl(int index, T el) { arr.set(index, el); }

    //    15. Печать массива на экран
    public void printArr() { System.out.println(arr); }

    @Override
    public String toString() {
        String delimiter = ", ";
        StringJoiner joiner = new StringJoiner(delimiter);
        for (T item : arr) { joiner.add(String.valueOf(item)); }

        return "DynamicArray{" +
                "arr=" + joiner.toString() +
                '}';
    }

    //    16. Длинна массива
    public Integer getArrSize() {
        arrSize = this.arr.size();

        return arrSize; }
}
