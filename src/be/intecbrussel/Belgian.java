package be.intecbrussel;

public class Belgian extends Citizen{

    public Belgian(String name, Language language) {
        super(name,language);

    }
    public String readNumber (Number number) {

        for (Language b : Language.values())
            System.out.println(b.ordinal());

    return null;
    }

}
