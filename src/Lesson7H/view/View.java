package Lesson7H.view;

import Lesson7H.model.base.Personage;

public class View {
    private Personage soldier1;
    private Personage soldier2;

    public View(Personage sold1, Personage sold2) {
        this.soldier1 = sold1;
        this.soldier2 = sold2;
    }

    public void greetings(Personage soldier1, Personage soldier2){
        System.out.println("Начинается бой между воинами: " +
                soldier1.getName() +
                " и воином: " +
                soldier2.getName());
    }

    public void fight(Personage soldier1, Personage soldier2){
        System.out.println("Воин: " + soldier1.getName() + " атакует воина: " + soldier2.getName());
    }

    public void intermediateResults(Personage soldier1, Personage soldier2){
        System.out.println("У вона: " + soldier1.getName() + " осталось " + soldier1.getHealthPoints() + " очков здоровья.");
        System.out.println("У вона: " + soldier2.getName() + " осталось " + soldier2.getHealthPoints() + " очков здоровья.");
    }

    public void resultOtFight(Personage winner, Personage loser, boolean isDraw){
        System.out.println("Бой завершился!");
        if(isDraw) {
            System.out.println("Результатом боя стала ничья");
        }else{
            System.out.println("Победитель боя: " + winner.getName());
            System.out.println("проигравший: " + loser.getName());
        }
    }
}
