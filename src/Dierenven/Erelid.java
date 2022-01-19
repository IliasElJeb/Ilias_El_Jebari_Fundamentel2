package Dierenven;

public class Erelid extends Lid{
    public Erelid(String naam) {
        super(naam);
    }
    public EreLid(String naam, Beloning beloning, float donatie) {
        super(naam);
        setBeloning(kiesBeloning(beloning));
        setDonatie(geefDonatie(donatie));

    }

    @Override
    public Beloning kiesBeloning(Beloning beloning) {
        return beloning;
    }

    @Override
    public float geefDonatie(float donatie) {
        if(donatie >= 70 && donatie <= 80)


        return donatie;

        else
             return 70;
    }

}
