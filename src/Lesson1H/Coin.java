package Lesson1H;

import java.util.Random;

public class Coin {
    public static void main(String[] args) {
        double no = 0;
        double yes = 0;
        Random rnd = new Random();
        int k = rnd.nextInt(2);
        int m = rnd.nextInt(800);
//        answer(k);
        System.out.println(m);
        for (int i = 0; i < m; i++) {
            k = rnd.nextInt(2);
            if (k == 0) no++;
            if (k == 1) yes++;
        }
        if (yes > no) System.out.println("да - " + yes / (no + yes) * 100);
        else if (no > yes) System.out.println("нет - " + no / (no + yes) * 100);
        else System.out.println("50/50");
        System.out.println("no: " + no);
        System.out.println("yes: " + yes);
//        answer(k);
    }
    public static void answer(Integer k) {
        if (k == 1) System.out.println("Да");
        else System.out.println("Нет");
    }
}
