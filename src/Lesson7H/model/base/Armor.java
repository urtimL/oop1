package Lesson7H.model.base;

public abstract class Armor {
    private String namme;
    private int defense;

    public Armor(String namme1, int defense1) {
        this.namme = namme1;
        this.defense = defense1;
    }

    public String getNamme() {
        return namme;
    }

    public int getDefense() {
        return defense;
    }
}
