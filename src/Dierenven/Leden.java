package Dierenven;

import java.util.ArrayList;
import java.util.List;

public class Leden {
    private List<Lid> alleLeden = new ArrayList<>();

    public void lidToevoegen(Lid lid) {

        alleLeden.add(lid);

    }
    public void sorterenOpNaam(){
        Lid.sorteerOpNaam();
    }
    public void toonAlleLeden(){

        for( Lid lid :alleLeden) {
            System.out.println(lid);
        }
    }
}
