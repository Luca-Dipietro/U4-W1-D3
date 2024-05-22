package Es1;

public class Rettangolo {

    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1");
        r1.stampaRettangolo();
        System.out.println();
        System.out.println("Rettangolo 2");
        r2.stampaRettangolo();
        double sommaAree = r1.Area() + r2.Area();
        double sommaPerimetri = r1.Perimetro() + r2.Perimetro();
        System.out.println();
        System.out.println("Somma dei perimetri dei rettangoli r1 e r2: " + sommaPerimetri);
        System.out.println("Somma delle aree dei rettangolo r1 e r2: " + sommaAree);

    }

    public static void stampaUnRettangolo(Rettangolo r) {
        System.out.println("Rettangolo Solitario");
        r.stampaRettangolo();
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double Perimetro() {
        return 2 * (altezza + larghezza);
    }

    public double Area() {
        return altezza * larghezza;
    }

    public void stampaRettangolo() {
        System.out.println("Altezza: " + altezza);
        System.out.println("Larghezza: " + larghezza);
        System.out.println("Perimetro: " + Perimetro());
        System.out.println("Area: " + Area());
    }
}
