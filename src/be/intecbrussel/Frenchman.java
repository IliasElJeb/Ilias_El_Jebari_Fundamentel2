package be.intecbrussel;

public class Frenchman extends Citizen {

    public Frenchman(String name) {
        super(name, Language.FRENCH);


    }

    @Override
    public String readNumber(Number number) {
        String[][] NUMBERS = getNUMBERS();
        for (int i = 0; i < NUMBERS.length; i++) {
            if (i == 1)
                for (int j = 0; j < NUMBERS[i].length; j++) {
                    if (number.getNumber() == j) {
                        return NUMBERS[i][j];
                    }
                }

        }
        return null;
    }

}
