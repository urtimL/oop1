package Lesson7H.model.base;

import java.util.Random;

public abstract class Personage {
    private String name;
    private Armor armor;
    private int healthPoints;
    private Weapon weapon;

    public Personage(String name1, Armor armor1, int healthPoints1, Weapon weapon1) {
        this.name = name1;
        this.armor = armor1;
        this.healthPoints = healthPoints1;
        this.weapon = weapon1;
    }

    public String getName() {
        return name;
    }

    public Armor getArmor() {
        return armor;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void attack(Personage target) {
        Random rnd = new Random();

        int thisDamage = rnd.nextInt(weapon.getDamage() + 1);
        //System.out.println("Damage: " + thisDamage);
        int targetDefense = rnd.nextInt(target.getArmor().getDefense() + 1);
        //System.out.println("Defense: " + targetDefense);

        int resDamage = thisDamage - targetDefense;
        resDamage = resDamage > 0 ? resDamage : 0;
        System.out.println("Нанесен урон: " + resDamage);

        //System.out.println("hp before: " + target.getHealthPoints());
        int targetHealthPoints = target.getHealthPoints() - resDamage;
        target.setHealthPoints(targetHealthPoints > 0 ? targetHealthPoints : 0);
        //System.out.println("hp after: " + (targetHealthPoints > 0 ? targetHealthPoints : 0));
    }

    @Override
    public String toString() {
        return "(name='" + name + '\'' +
                ", weapon=" + weapon +
                ", armor=" + armor +
                ", healthPoints=" + healthPoints +
                ')';
    }
}
