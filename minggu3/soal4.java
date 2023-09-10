package minggu3;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //input jumlah penjualan bulan ini
        int x = scan.nextInt();
        int gaji = 500000;
        int hargaBarang = 50000;
        int bonus = 0;
        int gajiBonus = 0;
        int denda = 0;

        if ( x >= 40 && x <= 80 ) {
            bonus = (int) ( x * 0.25 * hargaBarang );
        } else if ( x > 80 ) {
            bonus = (int) (x * 0.35 * hargaBarang);
        } else if ( x < 15 ) {
            denda = (int) ((15 - x) * hargaBarang * 0.15);
            gaji -= denda;
        } else {
            bonus = (int) (x * 0.10 * hargaBarang);
        }

        gajiBonus = gaji + bonus;

        System.out.println(gajiBonus);

        scan.close();
    }
    
}
