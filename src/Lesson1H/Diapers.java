package Lesson1H;

public class Diapers extends ChildensGoods{

    protected String size;
    protected Double minWeight;
    protected Double maxWeight;
    protected String type;

    public Diapers(String nameN, Double priceN, Double quantityN, String unitN, Integer minimumAgeN,
                   String hypoallergenicN, String sizeN, Double minWeightN, Double maxWeightN, String typeN) {
        super(nameN, priceN, quantityN, unitN, minimumAgeN, hypoallergenicN);
        this.size = sizeN;
        this.minWeight = minWeightN;
        this.maxWeight = maxWeightN;
        this.type = typeN;
    }

    @Override
    public String toString() {
        return "Подгузники (" +
                "Название = '" + name + '\'' +
                ", Цена = " + price +
                ", Количество = " + quantity +
                " " + unit +
                ", Гипоаллергенность = " + hypoallergenic +
                ", Минимальный возраст = " + minimumAge +
                ", Размер = " + size +
                ", Минимальный вес = " + minWeight +
                ", Максимальный вес = " + maxWeight +
                ", Тип = " + type +
                ')';
    }
}
