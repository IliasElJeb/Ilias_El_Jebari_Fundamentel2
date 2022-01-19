package Dierenven;

import java.util.Comparator;
import java.util.Objects;

public abstract class Lid implements Extra, Comparable<Lid> {

    private int lidNummer;
    private String naam;
    private Beloning beloning;
    private float donatie;

    public Lid(String naam) {
        this.naam = naam;
    }

    public Lid() {

    }

    public int getLidNummer() {
        return lidNummer;
    }

    public void setLidNummer(int lidNummer) {
        this.lidNummer = lidNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Beloning getBeloning() {
        return beloning;
    }

    public void setBeloning(Beloning beloning) {
        this.beloning = beloning;
    }

    public float getDonatie() {
        return donatie;
    }

    public void setDonatie(float donatie) {
        this.donatie = donatie;
    }

    public static Comparator <Lid> sorteerOpNaam(){

        return new NaamComparator();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lid)) return false;
        Lid lid = (Lid) o;
        return getLidNummer() == lid.getLidNummer() && Float.compare(lid.getDonatie(), getDonatie()) == 0 && Objects.equals(getNaam(), lid.getNaam()) && getBeloning() == lid.getBeloning();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLidNummer(), getNaam(), getBeloning(), getDonatie());
    }

    @Override
    public Beloning kiesBeloning(Beloning beloning) {
        return null;
    }

    @Override
    public float geefDonatie(float donatie) {
        return 0;
    }

    @Override
    public int compareTo(Lid o) {

        return this.getLidNummer() - o.getLidNummer();

    }

    @Override
    public String toString() {
        return "Lid{" +
                "lidNummer=" + lidNummer +
                ", naam='" + naam + '\'' +
                ", beloning=" + beloning +
                ", donatie=" + donatie +
                '}';
    }
}
