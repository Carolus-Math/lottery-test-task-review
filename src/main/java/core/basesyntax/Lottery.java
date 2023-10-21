package core.basesyntax;

import java.util.Random;

//ToDo If ColorSupplier.java made utility class, then remove inheritance here.
public class Lottery extends ColorSupplier {

//ToDo getRandomColor ought to be invoked statically
    public Ball getRandomBall() {


        //ToDo Instantiate Ball with args constructor; setters ought to be used only to change the internal state.
        Ball ball = new Ball();

        ball.setBallColor(ColorSupplier.getRandomColor());

        //ToDo Refactor Magic Number 100 to a constant

        ball.setBallNumber(new Random().nextInt(100));

        return ball;
    }
}
