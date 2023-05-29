package Lesson1H;

public class Masks extends HygieneItems{
    public Masks(String nameN, Double priceN, Double quantityN, String unitN, Integer NumberOfPiecesInPackageN) {
        super(nameN, priceN, quantityN, unitN, NumberOfPiecesInPackageN);
    }
    @Override
    public String toString() {
        return "Маска (" +
                "Название = '" + name + '\'' +
                ", Цена = " + price +
                ", Количество = " + quantity +
                " " + unit +
                ", Количество штук в упаковке = " + NumberOfPiecesInPackage + " шт." +
                ')';
    }
}
