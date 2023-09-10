package minggu3;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();

        String[] tokenArray = x.split("\\W");
        int n = tokenArray.length;

        System.out.println(n);
        for ( int i = 0; i <= n - 1; i++ ) {
            System.out.println(tokenArray[i]);
        }
        scan.close();
    }
}