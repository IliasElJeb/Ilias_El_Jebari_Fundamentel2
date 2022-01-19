package Dierenven;

import java.util.Comparator;

public class NaamComparator implements Comparator<Lid> {

    @Override
    public int compare(Lid o1, Lid o2) {

        return o1.getNaam().compareTo(o2.getNaam());
    }
}
