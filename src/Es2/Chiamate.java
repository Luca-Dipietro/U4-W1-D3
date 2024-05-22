package Es2;

public class Chiamate {
    private int durataMinuti;
    private String numeroChiamato;

    public Chiamate(int durataMinuti, String numeroChiamato) {
        this.durataMinuti = durataMinuti;
        this.numeroChiamato = numeroChiamato;
    }

    @Override
    public String toString() {
        return "Durata: " + durataMinuti + " minuti, Numero chiamato: " + numeroChiamato;
    }
}
