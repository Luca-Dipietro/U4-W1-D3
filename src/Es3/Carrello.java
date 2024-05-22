package Es3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;

    public Carrello(Cliente c) {
        this.cliente = c;
        this.articoli = new Articolo[0];
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
    }

    public double getTotaleCostoArticoli() {
        double totale = 0;
        for (Articolo articolo : articoli) {
            int disponibilità = articolo.getNumeroPezziDisponibili();
            if (disponibilità == 0) {
                System.out.println("Codice articolo: " + articolo.getCodiceArticolo() + " disponibilità terminata");
            } else {
                System.out.println("Codice articolo: " + articolo.getCodiceArticolo());
                totale += articolo.getPrezzo();
            }
        }
        return totale;
    }
}
