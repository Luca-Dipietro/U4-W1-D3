package Es3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo(1, "Smartphone", 599.99, 10);
        Articolo articolo2 = new Articolo(2, "Laptop", 999.99, 5);
        Articolo articolo3 = new Articolo(3, "Tablet", 299.99, 8);

        // Creazione di un cliente
        Cliente cliente1 = new Cliente(1, "Mario Rossi", "mario@example.com", new Date());

        // Creazione del carrello per il cliente
        Carrello carrelloCliente1 = new Carrello(cliente1);

        // Aggiunta di articoli al carrello
        carrelloCliente1.aggiungiArticolo(articolo1);
        carrelloCliente1.aggiungiArticolo(articolo2);

        // Visualizzazione del contenuto del carrello e del totale
        System.out.println("Carrello di " + cliente1.getNomeCognome());
        for (Articolo articolo : carrelloCliente1.getElencoArticoli()) {
            System.out.println(articolo.getDescrizione() + " - Prezzo: " + articolo.getPrezzo());
        }
        System.out.println("Totale: " + carrelloCliente1.getTotaleCostoArticoli());
    }
}
