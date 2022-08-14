package classAnimalAndInterface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "chicken: ò ó o";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
