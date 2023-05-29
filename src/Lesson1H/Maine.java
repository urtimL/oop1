package Lesson1H;

public class Maine {

    public static void main(String[] args) {
        createProdacts();
    }

    private static void createProdacts(){
        Prodact[] prodacts = {new Bread("Бородинский", 49.5d, 1d, "шт.",
                1, "мука грубого помола"),
                new Eggs("Фермерские", 99.9d, 1d, "уп.",
                        1, 20),
                new Milk("Буренка", 149.5d, 1d, "бут.", "1 л.",
                3.5d, 5),
                new Lemonade("Дюшес", 79d,1d, "бут.", "0.5 л."),
                new ToiletPaper("Zewa", 199.5d, 1d, "уп.", 4, 3),
                new Masks("Avocado Nourishing Hydration Mask", 999.98d, 1d, "уп.", 1),
                new Diapers("Pampers", 1499.5d, 1d, "уп.", 1, "да", "5",
                        0.5d, 2d,"Pants"),
                new Pacifier("Chicco Physio", 299.5d, 1d, "шт.", 1, "да")};

        for (Prodact prod:prodacts) {
            Program.getInfo(prod);
        }


    }

}
