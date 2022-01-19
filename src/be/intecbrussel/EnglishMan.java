package be.intecbrussel;

public class EnglishMan extends Citizen {


    public EnglishMan(String name) {
        super(name, Language.ENGLISH);

    }

    @Override
    public String readNumber(Number number) {
        String[][] NUMBERS = getNUMBERS();
        for (int i = 0; i < NUMBERS.length; i++) {
            if (i == 2)
            for (int j = 0; j < NUMBERS[i].length; j++) {
                if ( number.getNumber() == j + 1) {
                    return NUMBERS[i][j];
                }
            }

        }
        return null;
    }

}
