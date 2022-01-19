package be.intecbrussel;

import java.util.Arrays;

public abstract class  Citizen {
    private String name;
    private Language language;
    private final String[][] NUMBERS = {{"een","twee","drie","vier","vijf"}, {"un", "deux", "trois","quatre","cinq"}, {"one","two","three","four", "five"}}; ;


    public Citizen(String name, Language language) {
        this.name = name;
        this.language = language;
    }


    public String getName() {
        return name;
    }

    public Language getLanguage() {
        return language;
    }

    public String[][] getNUMBERS() {

        return NUMBERS;
    }

    public abstract String readNumber(Number number);

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", language=" + language +
                ", NUMBERS=" + Arrays.toString(NUMBERS) +
                '}';
    }
}





