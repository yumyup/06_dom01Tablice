import java.util.Random;

public class Tablica {
    public static void main(String[] args) {
        int sum = 0;

        int[] tablica = new int[5];
        Random random = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(100);
            System.out.println(tablica[i]);
        }
        for (int i : tablica) {

            if (i < 50) {
                sum++;

            }

            if (i > 50) {
                 sum++;

            }
            if (i % 2 == 0) {
                sum = sum++;

            }
            if (i % 2 != 0) {
                sum = sum++;

            }
        }
        System.out.println("i<50 " + sum);
        System.out.println("i>50 " + sum);
        System.out.println("parzyste " + sum);
        System.out.println("nieparzyste " + sum);
    }
}

