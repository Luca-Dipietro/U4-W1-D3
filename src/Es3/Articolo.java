package Es3;

public class Articolo {
    private int codiceArticolo;
    private String descrizione;
    private double prezzo;
    private int numeroPezziDisponibili;

    public Articolo(int codiceArticolo, String descrizione, double prezzo, int numeroPezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    public int getCodiceArticolo() {
        return codiceArticolo;
    }

    public void setCodiceArticolo(int codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getNumeroPezziDisponibili() {
        return numeroPezziDisponibili;
    }

    public void setNumeroPezziDisponibili(int numeroPezziDisponibili) {
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    public String toString() {
        return this.getCodiceArticolo() + " " + this.getDescrizione() + " " + this.getPrezzo();
    }
}
