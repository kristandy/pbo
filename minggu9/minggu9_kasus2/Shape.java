package minggu9_kasus2;

abstract class Shape {
    private String shapeName;

    protected Shape(String name) {
        shapeName = name;
    }

    public abstract double area();

    public String toString() {
        return shapeName;
    }
}
