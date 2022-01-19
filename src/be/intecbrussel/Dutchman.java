package be.intecbrussel;

public class Dutchman extends Citizen {


    public Dutchman (String name) {
        super(name, Language.DUTCH);


    }


    public String readNumber(Number number) {
        String[][] NUMBERS = getNUMBERS();
        for (int i = 0; i < NUMBERS.length; i++) {
            if (i == 0)
                for (int j = 0; j < NUMBERS[i].length; j++) {
                    if ( number.getNumber() == j) {
                        return NUMBERS[i][j];
                    }
                }

        }
            return null;
    }

}
