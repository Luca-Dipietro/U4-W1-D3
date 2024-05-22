package Es2;

public class Chiamate {
    private int durataMinuti;
    private int numeroChiamato;

    public Chiamate(int numeroChiamato, int durataMinuti) {
        this.numeroChiamato = numeroChiamato;
        this.durataMinuti = durataMinuti;

    }

    @Override
    public String toString() {
        return "Numero = " + numeroChiamato + ", Durata = " + durataMinuti;
    }
}
