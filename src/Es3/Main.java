package Es3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo(1, "Smartphone", 1250, 16);
        Articolo articolo2 = new Articolo(2, "Laptop", 1000, 4);
        Articolo articolo3 = new Articolo(3, "Tablet", 500, 10);

        Cliente cliente1 = new Cliente(1, "Luca Dipietro", "mario@example.com", new Date());

        Carrello carrelloCliente1 = new Carrello(cliente1);

        carrelloCliente1.aggiungiArticolo(articolo1);
        carrelloCliente1.aggiungiArticolo(articolo2);
        carrelloCliente1.aggiungiArticolo(articolo3);

        System.out.println("Carrello di " + cliente1.getNomeCognome());
        for (Articolo articolo : carrelloCliente1.getElencoArticoli()) {
            System.out.println(articolo.getDescrizione() + " - Prezzo: " + articolo.getPrezzo() + " $");
        }
        System.out.println("Totale: " + carrelloCliente1.getTotaleCostoArticoli());
    }
}
