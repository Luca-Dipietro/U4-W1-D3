package Es2;

public class Sim {
    private String numeroTelefono;
    private double creditoDisponibile;
    private Chiamate[] ultimeChiamate;

    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0.0;
        this.ultimeChiamate = new Chiamate[5];
    }

    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + creditoDisponibile + " euro");
        System.out.println("Ultime 5 chiamate effettuate: ");
        for (int i = 0; i < ultimeChiamate.length; i++) {
            if (ultimeChiamate[i] != null) {
                System.out.println(ultimeChiamate[i].toString());
            }
        }
    }
}