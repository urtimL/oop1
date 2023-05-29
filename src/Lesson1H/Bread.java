package Lesson1H;

public class Bread extends Food{

    protected String flourType;
    public Bread(String nameN, Double priceN, Double quantityN, String unitN, Integer expirationDateN, String flourTypeN) {
        super(nameN, priceN, quantityN, unitN, expirationDateN);
        this.flourType = flourTypeN;
    }

    @Override
    public String toString() {
        return "Хлеб (" +
                "Название = '" + name + '\'' +
                ", Цена = " + price +
                ", Количество = " + quantity +
                " " + unit +
                ", Срок годности = " + expirationDate + " мес." +
                ", Тип муки = " + flourType +
                ')';
    }
}
