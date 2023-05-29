package Lesson7H.presenter;

import Lesson7H.model.base.Personage;
import Lesson7H.view.View;
import Lesson7H.model.armor.ChainArmor;
import Lesson7H.model.armor.Shield;
import Lesson7H.model.soldiers.Spearman;
import Lesson7H.model.soldiers.Swordsman;
import Lesson7H.model.weapons.Spear;
import Lesson7H.model.weapons.Sword;

public class Presenter {
    private Spearman sold1;
    private Swordsman sold2;
    private View view;

    public Presenter() {
        this.sold1 = new Spearman("Копьеносец Джон",
                new ChainArmor("Кольчуга", 5),
                50,
                new Spear("Копье", 15));
        this.sold2 = new Swordsman("Мечник Майкл",
                new Shield("Щит", 10),
                50,
                new Sword("Мечь", 10));
        this.view = new View(this.sold1, this.sold2);
    }

    public void duel(){
        view.greetings(sold1, sold2);

        while (sold1.getHealthPoints() > 0 && sold2.getHealthPoints() > 0){
            view.fight(sold1, sold2);
            sold1.attack(sold2);

            view.fight(sold2, sold1);
            sold2.attack(sold1);

            view.intermediateResults(sold1, sold2);
        }

        int sold1HP = sold1.getHealthPoints();
        int sold2HP = sold2.getHealthPoints();

        if (sold1HP == sold2HP){
            view.resultOtFight(sold1, sold2, true);
        } else {
            Personage winner = sold1HP > sold2HP ? sold1 : sold2;
            Personage loser = sold1HP > sold2HP ? sold1 : sold2;

            view.resultOtFight(sold1, sold2, false);
        }
    }
}
