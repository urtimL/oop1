package Lesson2H.base;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> listOfAnimals = new ArrayList<>();

    public void addAnimal (Animal animal){
        listOfAnimals.add(animal);
    }
    private Animal getAnimal(int index){
        return listOfAnimals.get(index);
    }
    public void removeAnimal(int index){
        listOfAnimals.remove(index);
    }

  public void seeInfo(int index){
        Animal an = getAnimal(index);
        an.printInfo();
  }


  public void makeSound(int index){
      Animal an = getAnimal(index);
      an.makeSound();
  }

  public void whoIsInZoo(){
      for (Animal animal : listOfAnimals) {
          animal.printInfo();
      }
  }
    public void everyoneScream(){
      for (Animal animal : listOfAnimals) {
          animal.makeSound();
      }
  }
}
