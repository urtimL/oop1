package Lesson1H;

public class Lemonade extends Beverages{
    public Lemonade(String nameN, Double priceN, Double quantityN, String unitN, String volumeN) {
        super(nameN, priceN, quantityN, unitN, volumeN);
    }
    @Override
    public String toString() {
        return "Лимонад (" +
                "Название = '" + name + '\'' +
                ", Цена = " + price +
                ", Количество = " + quantity +
                " " + unit +
                ", Объём = " + volume +
                ')';
    }
}
