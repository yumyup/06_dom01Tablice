import java.util.Random;

public class Tablica {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        int[] tablica = new int[100];
        Random random = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(100);
            System.out.println(tablica[i]);
        }
        for (int i : tablica) {

            if (i < 50) {
                sum1++;
            }

            if (i > 50) {
                sum2++;
            }
            if (i % 2 == 0) {
                 sum3++;
            }
            if (i % 2 != 0) {
                sum4++;
            }
        }
        System.out.println("i<50 " + sum1);
        System.out.println("i>50 " + sum2);
        System.out.println("parzyste " + sum3);
        System.out.println("nieparzyste " + sum4);
    }
}

