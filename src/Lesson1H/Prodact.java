package Lesson1H;

public class Prodact {
    protected String name;
    protected Double price;
    protected Double quantity;
    protected String unit;

    public Prodact(String nameN, Double priceN, Double quantityN, String unitN){
        this.name = nameN;
        this.price = priceN;
        this.quantity = quantityN;
        this.unit = unitN;
    }

    @Override
    public String toString() {
        return "Товар {" +
                "Название = '" + name + '\'' +
                ", Цена = " + price +
                ", Количество = " + quantity +
                ", Единица измерения = '" + unit + '\'' +
                '}';
    }
}
