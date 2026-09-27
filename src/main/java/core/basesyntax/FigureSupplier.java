package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 10;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Square(random.nextInt(MAX_VALUE) + 1, color);

            case 1:
                return new Rectangle(
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1,
                        color);

            case 2:
                return new RightTriangle(
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1,
                        color);

            case 3:
                return new Circle(random.nextInt(MAX_VALUE) + 1, color);

            case 4:
                return new IsoscelesTrapezoid(
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1,
                        color);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Square(10, "white");
    }
}
