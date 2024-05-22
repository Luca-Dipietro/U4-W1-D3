package Es1;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangoloAlone = new Rettangolo(5, 10);
        Rettangolo rettangolo1 = new Rettangolo(4, 16);
        Rettangolo rettangolo2 = new Rettangolo(10, 20);

        Rettangolo.stampaUnRettangolo(rettangoloAlone);

        System.out.println();
        
        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}
