package minggu7_exercise2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1.toString());

        Shape s2 = new Shape("red", false);
        System.out.println(s2.toString());

        Circle c1 = new Circle();
        System.out.println(c1.toString());

        Circle c2 = new Circle(4.0);
        System.out.println(c2.toString());

        Circle c3 = new Circle("blue", true, 8.0);
        System.out.println(c3.toString());

        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());

        Rectangle r2 = new Rectangle(5, 10);
        System.out.println(r2.toString());

        Rectangle r3 = new Rectangle(5, 10, "No color", false);
        System.out.println(r3.toString());

        Square sq1 = new Square(4);
        System.out.println(sq1.toString());
    }
}
