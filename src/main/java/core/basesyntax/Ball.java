package core.basesyntax;

public class Ball {
    // ToDo Encapsulation breach: fields should be private - in current set up are package-private and since everything is placed in one package are de facto public
    // ToDo Colors.java not used: ballColor should be of the enum type {core.basesynax.Colors} NOT of the String type.
    String ballColor;
    int ballNumber;

    //ToDo No need for the no-args constructor to be declared
    public Ball() {
    }

    public Ball(String color, int number) {
        this.ballColor = color;
        this.ballNumber = number;
    }

    public String getBallColor() {
        return this.ballColor;
    }

    public void setBallColor(String ballColor) {
        this.ballColor = ballColor;
    }

    public int getBallNumber() {
        return this.ballNumber;
    }

    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public String toString() {
        String ball = "ball"; //ToDo string not used: better to remove;
        return "Ball with number: " + ballNumber + " and color: " + ballColor; //ToDo Better use String.format() https://www.geeksforgeeks.org/java-string-format-method-with-examples/
    }
}
