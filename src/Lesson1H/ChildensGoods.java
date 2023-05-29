package Lesson1H;

public class ChildensGoods extends Prodact{
    protected Integer minimumAge;
    protected String hypoallergenic;

    public ChildensGoods(String nameN, Double priceN, Double quantityN, String unitN,
                         Integer minimumAgeN, String hypoallergenicN) {
        super(nameN, priceN, quantityN, unitN);
        this.minimumAge = minimumAgeN;
        this.hypoallergenic = hypoallergenicN;
    }

    @Override
    public String toString() {
        return "Детский товар {" +
                "Название = '" + name + '\'' +
                ", Цена = " + price +
                ", Количество = " + quantity +
                ", Единица измерения = '" + unit +
                ", Гипоаллергенность = '" + hypoallergenic +
                ", Минимальный возраст = " + minimumAge + '\'' +
                '}';
    }
}
