package Es2;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim(123456789);
        Chiamate[] ultimeChiamate = new Chiamate[5];
        ultimeChiamate[0] = new Chiamate(238475908, 2);
        ultimeChiamate[1] = new Chiamate(457290768, 3);
        ultimeChiamate[2] = new Chiamate(234789056, 5);
        ultimeChiamate[3] = new Chiamate(123456789, 1);
        ultimeChiamate[4] = new Chiamate(345612345, 4);

        sim.setUltimeChiamate(ultimeChiamate);
        sim.stampaDatiSIM();
    }
}
