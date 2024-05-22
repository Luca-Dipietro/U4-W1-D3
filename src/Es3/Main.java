package Es3;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Luca Dipietro", "luca@example.com", new Date());
        System.out.println("Cliente: " + cliente1.getNomeCognome());
        System.out.println("Codice cliente: " + cliente1.getCodiceCliente());

        Articolo articolo1 = new Articolo(1, "Smartphone", 1250, 0);
        Articolo articolo2 = new Articolo(2, "Laptop", 1000, 3);
        Articolo articolo3 = new Articolo(3, "Tablet", 500, 4);
        Articolo[] listaArticoliComprati = {articolo1, articolo2, articolo3};
        System.out.println("Lista Articoli");
        System.out.println(Arrays.toString(listaArticoliComprati));

        Carrello carrelloCliente1 = new Carrello(cliente1);
        System.out.println("Carrello Cliente");

        carrelloCliente1.setArticoli(listaArticoliComprati);
        System.out.println("Il costo totale degli articoli è " + carrelloCliente1.getTotaleCostoArticoli());
    }
}
