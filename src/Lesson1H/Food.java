package Lesson1H;


public class Food extends Prodact{
    protected Integer expirationDate;

    public Food(String nameN, Double priceN, Double quantityN, String unitN, Integer expirationDateN) {
        super(nameN, priceN, quantityN, unitN);
        this.expirationDate = expirationDateN;
    }


    @Override
    public String toString() {
        return "Продукт питания {" +
                "Название = '" + name + '\'' +
                ", Цена = " + price +
                ", Количество = " + quantity +
                ", Единица измерения = '" + unit +
                ", Срок годности = " + expirationDate + '\'' +
                '}';
    }
}
