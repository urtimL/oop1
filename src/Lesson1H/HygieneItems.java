package Lesson1H;

public class HygieneItems extends Prodact{
    protected Integer NumberOfPiecesInPackage;
    public HygieneItems(String nameN, Double priceN, Double quantityN, String unitN, Integer NumberOfPiecesInPackageN) {
        super(nameN, priceN, quantityN, unitN);
        this.NumberOfPiecesInPackage = NumberOfPiecesInPackageN;
    }

    @Override
    public String toString() {
        return "Предмет гигиены {" +
                "Название = '" + name + '\'' +
                ", Цена = " + price +
                ", Количество = " + quantity +
                ", Единица измерения = '" + unit +
                ", Количество штук в упаковке = " + NumberOfPiecesInPackage + '\'' +
                '}';
    }
}
