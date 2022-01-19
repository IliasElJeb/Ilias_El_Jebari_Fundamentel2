package Dierenven;

public class GewoonLid extends Lid {
    public GewoonLid(String naam) {
        super(naam);
    }

    public GewoonLid(String naam, Beloning beloning, float donatie) {
        super(naam);
        setBeloning(kiesBeloning(beloning));
        setDonatie(geefDonatie(donatie));

    }


    @Override
    public Beloning kiesBeloning(Beloning beloning) {

        return Beloning.SMARTPHONE;
    }

    @Override
    public float geefDonatie(float donatie) {
        if(donatie >= 20 && donatie <= 30)


            return donatie;

        else
            return 20;
    }

}
