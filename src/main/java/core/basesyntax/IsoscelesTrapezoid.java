package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase, int secondBase,
                              int height, String color) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq. units, firstBase: " + firstBase
                + " units, secondBase: " + secondBase
                + " units, height: " + height
                + " units, color: " + color);
    }
}
