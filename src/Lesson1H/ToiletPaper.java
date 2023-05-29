package Lesson1H;

public class ToiletPaper extends HygieneItems{
    protected Integer numberOfLayers;
    public ToiletPaper(String nameN, Double priceN, Double quantityN, String unitN,
                       Integer NumberOfPiecesInPackageN, Integer numberOfLayersN) {
        super(nameN, priceN, quantityN, unitN, NumberOfPiecesInPackageN);
        this.numberOfLayers = numberOfLayersN;
    }

    @Override
    public String toString() {
        return "Туалетная бумага (" +
                "Название = '" + name + '\'' +
                ", Цена = " + price +
                ", Количество = " + quantity +
                " " + unit +
                ", Количество штук в упаковке = " + NumberOfPiecesInPackage +
                ", Количество слоёв = " + numberOfLayers +
                ')';
    }
}
