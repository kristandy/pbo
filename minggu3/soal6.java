package minggu3;

import java.math.BigInteger;
import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        String y = scan.nextLine();

        if(!nomorValid(x) || !nomorValid(y)) {
            System.out.println("Input tidak valid");
            scan.close();
            return;
        }

        BigInteger a = new BigInteger(x);
        BigInteger b = new BigInteger(y);

        BigInteger hasilJumlah = a.add(b);
        BigInteger hasilKali = a.multiply(b);

        System.out.println(hasilJumlah);
        System.out.println(hasilKali);

        scan.close();
    }

    static boolean nomorValid(String str) {
        return str.matches("\\d{1,200}") && !str.startsWith("-");
    }
    
}
