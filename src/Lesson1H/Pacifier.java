package Lesson1H;

public class Pacifier extends ChildensGoods{
    public Pacifier(String nameN, Double priceN, Double quantityN, String unitN, Integer minimumAgeN, String hypoallergenicN) {
        super(nameN, priceN, quantityN, unitN, minimumAgeN, hypoallergenicN);
    }
    @Override
    public String toString() {
        return "Соска (" +
                "Название = '" + name + '\'' +
                ", Цена = " + price +
                ", Количество = " + quantity +
                " " + unit +
                ", Гипоаллергенность = " + hypoallergenic +
                ", Минимальный возраст = " + minimumAge +
                ')';
    }
}
