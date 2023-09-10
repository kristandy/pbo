package minggu3;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] kata1 = new String[3];
        int[] nomor = new int[3];

        for (int i = 0; i < 3; i++) {
            String x = scan.nextLine();
            String[] kata = x.split("(?<=\\D)(?=\\d)");

            if (kata.length != 2) {
                System.out.println("Gunakan satu kata/kalimat dan angka");
                i--;
            } else {
                kata1[i] = kata[0].substring(0, Math.min(kata[0].length(), 10));
                nomor[i] = Integer.parseInt(kata[1]);
            }
        }

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s %03d%n", kata1[i], nomor[i]);
        }
        System.out.println("================================");

        scan.close();
    }
}
