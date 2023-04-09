import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Etapa 1");
        int numOps = 10000;
        int numAuxNext = 0;
        LinkedListOfInteger lista = new LinkedListOfInteger();
        ListWithCurrent lista2 = new  ListWithCurrent();

        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            if (i % 1000 == 0)
                System.out.println("Mais 1000...");
            lista.add(rand.nextInt(1000));
        }
        System.out.println("A lista tem " + lista.size() + " elementos.");

        for (int i = 0; i < numOps; i++) {
            int op = rand.nextInt(3);
            int value = rand.nextInt(100);

            switch (op) {
                case 0:
                    lista.add(value, value);
                    break;
                case 1:
                    lista.get(value);
                    break;
                case 2:
                    lista.removeByIndex(value);
                    break;
            }

            numAuxNext += lista.getNumAuxNext();
        }
        System.out.println("Etapa 2");

        for (int i = 0; i < 1000; i++) {
            if (i % 1000 == 0)
                System.out.println("Mais 1000...");
            lista2.add(rand.nextInt(1000));
        }
        System.out.println("A lista tem " + lista2.size() + " elementos.");

        for (int i = 0; i < numOps; i++) {
            int op = rand.nextInt(3);
            int value = rand.nextInt(100);

            switch (op) {
                case 0:
                    lista2.add(value, value);
                    break;
                case 1:
                    lista2.get(value);
                    break;
                case 2:
                    lista2.removeByIndex(value);
                    break;
            }

            numAuxNext += lista2.getNumAuxNext();
        }

    }
}
