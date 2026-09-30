import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gra = 2;
        Scanner myObj = new Scanner(System.in);
        Random random = new Random();

        while (gra == 2) {
            int liczbakostek = 0;

            while (!(liczbakostek >= 3 && liczbakostek <= 10)) {
                System.out.println("Ile kostek chcesz rzucić? (3-10)");
                liczbakostek = myObj.nextInt();
            }

            for (int i = 0; i < liczbakostek; i++) {
                int wynik = random.nextInt(6) + 1;
                System.out.println("Kostka " + (i + 1) + ": " + wynik);
            }

            System.out.println("Czy chcesz zagrać jeszcze raz? (T/N)");

            String czygra = myObj.next();


            czygra = czygra.toLowerCase();


            if (czygra.equals("n")) {
                gra = 1;
            }
        }


        myObj.close();
    }
}
