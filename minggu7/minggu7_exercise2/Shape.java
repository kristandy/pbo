package minggu7_exercise2;

public class Shape {
    private boolean filled;
    private String color;

    public Shape() {
        filled = true;
        color = "green";
    }

    public Shape(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "A Shape with color of " + color + " and filled = " + filled + "";
    }
}
