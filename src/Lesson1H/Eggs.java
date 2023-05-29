package Lesson1H;

public class Eggs extends Food{
    protected Integer amountInPackage;
    public Eggs(String nameN, Double priceN, Double quantityN, String unitN, Integer expirationDateN, Integer amountInPackageN) {
        super(nameN, priceN, quantityN, unitN, expirationDateN);
        this.amountInPackage = amountInPackageN;
    }

    @Override
    public String toString() {
        return "Яйца (" +
                "Название = '" + name + '\'' +
                ", Цена = " + price +
                ", Количество = " + quantity +
                " " + unit +
                ", Срок годности = " + expirationDate + " мес." +
                ", Количество в упаковке = " + amountInPackage + " шт." +
                ')';
    }
}
