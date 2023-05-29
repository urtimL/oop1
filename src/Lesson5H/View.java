package Lesson5H;

import Lesson5H.Core.ExpressionParser;
import Lesson5H.Core.Сalculator;

import java.util.List;
import java.util.Scanner;



public class View {
    public void menu() {
        System.out.print("Введите строку для расчета: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        ExpressionParser n = new ExpressionParser();
        List<String> expression = n.parse(s);
        boolean flag = n.flag;
        if (flag) {
            for (String x : expression) System.out.print(x + " ");
            System.out.println();
            Сalculator calc = new Сalculator(expression);
            System.out.println(calc.getRez());
        }
    }
}
