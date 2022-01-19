package be.intecbrussel;

public class TranslateApp{

    public static void main(String[] args) {

        int randomNumber;

        EnglishMan englishMan = new EnglishMan("George");
        Dutchman dutchMan = new Dutchman("Matthias");
        Frenchman frenchman = new Frenchman("Louis");
        Number number = new Number();


        randomNumber = (int) (Math.random() * 6);

        number.setNumber(randomNumber);
        System.out.println("Random number: " + number.getNumber());


        englishMan.readNumber(number);
        System.out.println(englishMan.readNumber(number));





    }


}
