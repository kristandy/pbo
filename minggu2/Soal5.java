package minggu2;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan kata atau kalimat pertama: ");
        String A = scan.nextLine();
        System.out.print("Masukkan kata atau kalimat kedua: ");
        String B = scan.nextLine();

        int jumlahA = A.length();
        int jumlahB = B.length();
        int jumlahTotal = jumlahA + jumlahB;
        System.out.println(jumlahTotal);
        
        if (A.compareTo(B) > 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        String disatukan = A + " " + B;

        char[] charArray = disatukan.toCharArray();
        boolean adaSpasi = true;

        for (int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(adaSpasi) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    adaSpasi = false;
                }
            } else {
                adaSpasi = true;
            }
        }
        
        disatukan = String.valueOf(charArray);
        System.out.println(disatukan);

        scan.close();
    }
    
}