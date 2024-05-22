package Es3;

import java.util.ArrayList;

public class Carrello {
    private Cliente clienteAssociato;
    private ArrayList<Articolo> elencoArticoli;
    private double totaleCostoArticoli;

    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = new ArrayList<>();
        this.totaleCostoArticoli = 0.0;
    }

    public void aggiungiArticolo(Articolo articolo) {
        elencoArticoli.add(articolo);
        totaleCostoArticoli += articolo.getPrezzo();
    }

    public void rimuoviArticolo(Articolo articolo) {
        elencoArticoli.remove(articolo);
        totaleCostoArticoli -= articolo.getPrezzo();
    }

    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public void setClienteAssociato(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
    }

    public double getTotaleCostoArticoli() {
        return totaleCostoArticoli;
    }

    public void setTotaleCostoArticoli(double totaleCostoArticoli) {
        this.totaleCostoArticoli = totaleCostoArticoli;
    }

    public ArrayList<Articolo> getElencoArticoli() {
        return elencoArticoli;
    }

    public void setElencoArticoli(ArrayList<Articolo> elencoArticoli) {
        this.elencoArticoli = elencoArticoli;
    }
}
