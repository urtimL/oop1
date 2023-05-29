package Lesson7H.model.soldiers;

import Lesson7H.model.base.Armor;
import Lesson7H.model.base.Personage;
import Lesson7H.model.base.Weapon;

public class Spearman extends Personage {
    public Spearman(String name1, Armor armor1, int healthPoints1, Weapon weapon1) {
        super(name1, armor1, healthPoints1, weapon1);
    }

    @Override
    public String toString() {
        return "Spearman" + super.toString();
    }
}
