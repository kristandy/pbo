package minggu3;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int v = scan.nextInt();

        float gabungan = (float) x + y + z + v;
        if ( (gabungan - 999999) % 5 == 0 ) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
        scan.close();
    }
}
