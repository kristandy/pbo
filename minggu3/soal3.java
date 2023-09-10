package minggu3;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String x = scan.nextLine();
        String[] pisah = x.split("\\s+");
        int a = Integer.parseInt(pisah[0]);
        String operator = pisah[1];
        int b = Integer.parseInt(pisah[2]);
        int hasil = 0;
        boolean validInput = a >= 1 && a <= 1000 && b >= 1 && b <= 1000;

        if ( pisah.length != 3 ) {
            System.out.println("Masukkan operasi dengan format 'A operator B'"); 
        } else {
            if ( !validInput ) {
                System.out.println("Inputan tidak valid, masukkan angka di antara 1 dan 1000");
                System.exit(0);
            } else {
                if ( operator.equals("+") ) {
                    hasil = a + b;
                } else if ( operator.equals("-") ) {
                    hasil = a - b;
                } else if ( operator.equals("*") ) {
                    hasil = a * b;
                } else if ( operator.equals("/") ) {
                    hasil = a / b;
                } else if ( operator.equals("%") ) {
                    hasil = a % b;
                } else {
                    System.out.println("Operator tidak valid. Gunakan +, -, *, /, atau %");
                    System.exit(0);
                }
            }          
        System.out.println(hasil);
        }
    scan.close();
    }
}
