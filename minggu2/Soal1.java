package minggu2;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int x = 0;
        //membuat scanner untuk input yang dilakukan oleh user
        Scanner scan = new Scanner(System.in);
        System.out.print("Berapa kasus yang ingin dijalankan: ");
        x = scan.nextInt();
        
        for (int i = 0; i < x; i++) {
            System.out.print("\nMasukkan angka: ");
            //method ini mereturn true jika nilai yang diinputkan berupa long
            if (scan.hasNextLong()) { 
                long y = scan.nextLong();
                
                System.out.println(y + " can be fitted in: ");

                //pengecekan nilai yang diinput user dengan nilai maksimum
                //dan minimum yang dapat ditampung suatu tipe data
                if (y >= Byte.MIN_VALUE && y <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (y >= Short.MIN_VALUE && y <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (y >= Integer.MIN_VALUE && y <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (y >= Long.MIN_VALUE && y <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } else {
                String invalidInput = scan.next();
                System.out.println(invalidInput + " can't be fitted anywhere");
            }
        }
        
        scan.close();
    }
}