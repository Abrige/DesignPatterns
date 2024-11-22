package patterns.behavioral.chainofresponsibility;

public class GestoreFacile implements GestoreRichieste{

    GestoreRichieste prossimoGestore;


    @Override
    public void gestisciRichiesta(RichiestaSupporto richiesta) {

    }

    @Override
    public void setProssimo(GestoreRichieste prossimo) {

    }
}
