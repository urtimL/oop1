package Lesson1H;

public class Beverages extends Prodact{
    protected String volume;

    public Beverages(String nameN, Double priceN, Double quantityN, String unitN, String volumeN) {
        super(nameN, priceN, quantityN, unitN);
        this.volume = volumeN;
    }

    @Override
    public String toString() {
        return "Напиток {" +
                "Название = '" + name + '\'' +
                ", Цена = " + price +
                ", Количество = " + quantity +
                " " + unit +
                ", Объём = " + volume + '\'' +
                '}';
    }
}
