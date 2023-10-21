package core.basesyntax;

//ToDo It is a good practice to include JavaDocs describing the usage - important for ColorSupplier.java and Lottery.java
public class Application {

    //ToDo Not tested as specified: no need for creation of three separate lotteries - one is enough to test the required behaviour.
    public static void main(String[] args) {
        Lottery ball1 = new Lottery();
        System.out.println(ball1.getRandomBall().toString());
        Lottery ball2 = new Lottery();
        System.out.println(ball2.getRandomBall().toString());
        Lottery ball3 = new Lottery();
        System.out.println(ball3.getRandomBall().toString());
    }
}
