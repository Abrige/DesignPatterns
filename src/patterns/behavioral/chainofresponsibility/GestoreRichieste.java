package patterns.behavioral.chainofresponsibility;

public interface GestoreRichieste {
    public void gestisciRichiesta(RichiestaSupporto richiesta);
    public void setProssimo(GestoreRichieste prossimo);
}
