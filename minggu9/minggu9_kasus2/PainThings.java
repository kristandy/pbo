package minggu9_kasus2;

import java.text.DecimalFormat;

public class PainThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        final String GALLONS = " gallons";
        Paint paint = new Paint(COVERAGE);

        // Menginisiasi tiga bentuk
        Rectangle deck = new Rectangle(20, 35);  
        Sphere bigBall = new Sphere(15);         
        Cylinder tank = new Cylinder(10, 30);    

        // Menghitung jumlah cat yang dibutuhkan
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        // Mencetak hasil
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck: " + fmt.format(deckAmt) +  GALLONS);
        System.out.println("Big Ball: " + fmt.format(ballAmt) + GALLONS);
        System.out.println("Tank: " + fmt.format(tankAmt) + GALLONS);
    }
}
