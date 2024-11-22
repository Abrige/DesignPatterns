package patterns.behavioral.chainofresponsibility;

public class GestoreDifficile implements GestoreRichieste{
    @Override
    public void gestisciRichiesta(RichiestaSupporto richiesta) {
        if(richiesta.getLivello() == LivelloDifficolta.DIFFICILE){
            System.out.println("Richiesta gestita da un gestore difficile");

        }
        else{
            System.out.println("Nessun gestore disponibile per questa richiesta");
        }
    }

    @Override
    public void setProssimo(GestoreRichieste prossimo) {

    }
}
