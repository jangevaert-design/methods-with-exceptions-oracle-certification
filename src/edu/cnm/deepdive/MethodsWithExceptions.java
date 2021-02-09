package edu.cnm.deepdive;

class NoMoreMeatException extends Exception {

}

class NoMorePlantsException extends RuntimeException {}

interface Omnivore {
  void eatMeat(int amount) throws NoMoreMeatException;
  void eatPlants(int amount);

}

class Bear implements Omnivore {

  @Override
  public void eatMeat(int amount) throws NoMoreMeatException {
      if (amount <= 0) {
        throw new NoMoreMeatException();
      }
    System.out.println("Eating Meat.");
  }

  @Override
  public void eatPlants(int amount) throws NoMorePlantsException {
      if (amount <= 0) {
        throw new NoMorePlantsException();
      }
  }
}

public class MethodsWithExceptions {

  public static void main(String[] args) {
      Bear bear = new Bear();
      try {
        bear.eatMeat(2);
        bear.eatPlants(-2);
      } catch(NoMoreMeatException e) {
        e.printStackTrace();
        System.out.println("Bear goes hungry");
      } finally {
        System.out.println("finally");
      }
// issues with Github.Trying to push this amended project.

  }

}
