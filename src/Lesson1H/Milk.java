package Lesson1H;

public class Milk extends Beverages{

    protected Double fatPercentage;
    protected Integer expirationDate;
    public Milk(String nameN, Double priceN, Double quantityN, String unitN, String volumeN,
                Double fatPercentageN, Integer expirationDateN) {
        super(nameN, priceN, quantityN, unitN, volumeN);
        this.fatPercentage = fatPercentageN;
        this.expirationDate = expirationDateN;
    }

    @Override
    public String toString() {
        return "Молоко (" +
                "Название = '" + name + '\'' +
                ", Цена = " + price +
                ", Количество = " + quantity +
                " " + unit +
                ", Объём = " + volume +
                ", Процент жирности = " + fatPercentage + " %" +
                ", Срок годности = " + expirationDate + " дн." +
                ')';
    }
}
