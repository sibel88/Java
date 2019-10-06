
public class CoffeeMakerTest {
    public static void main(String[] args) {

        CoffeeMaker myCoffee = new CoffeeMaker();
        myCoffee.checTheStatus();
        myCoffee.resetTimer();
        myCoffee.checTheStatus();
        CoffeeMaker myCoffee2 = new CoffeeMaker(3, 0);
        myCoffee2.checTheStatus();

    }

}
