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
                return new Square(color, random.nextInt(MAX_VALUE) + 1);

            case 1:
                return new Rectangle(
                        color,
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1);

            case 2:
                return new RightTriangle(
                        color,
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1);

            case 3:
                return new Circle(color, random.nextInt(MAX_VALUE) + 1);

            case 4:
                return new IsoscelesTrapezoid(
                        color,
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1,
                        random.nextInt(MAX_VALUE) + 1);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Square("white", 10);
    }
}
