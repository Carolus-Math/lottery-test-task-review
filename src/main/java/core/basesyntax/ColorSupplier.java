package core.basesyntax;

import java.util.Random;

public class ColorSupplier {


    //ToDo Method should return enum {core.basesynax.Colors} NOT a String
    //ToDo Since this class has a single static method I would recommend to refactor it as a Utility Class cf. https://www.baeldung.com/java-helper-vs-utility-classes $ 3
    public static String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return Colors.values()[index].toString();
    }
}
