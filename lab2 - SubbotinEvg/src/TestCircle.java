public class TestCircle {
    public static void main(String[] args) {
        Circle circle;
        double radius1 = 1 / Math.PI;
        double radius2 = 1 / (2 * Math.PI);
        try {
            circle = new Circle(radius1);
            System.out.println("Тест пройден. Исключение при положительных числах не вывело");

            testRadius(circle, radius1);
            testLength(circle, 2);

            circle.setRadius(radius2);

            testRadius(circle, radius2);
            testLength(circle, 1);

        } catch (Exception e) {
            System.err.println("Ошибка! Исключение не должно было выводиться при радиусе большем нуля (r = "
                    + radius1 + ")");
            e.printStackTrace();
        }

        double radius3 = -1;
        String message = "Окружности с радиусом меньшим или равным нуля не существует";
        try {
            Circle errorCircle = new Circle(radius3);
            System.err.println("Ошибка! " + message);
        } catch (Exception e) {
            System.out.println("Тест пройден. " + message);
        }

        testCalculateLength(1 / Math.PI, 2);
        testCalculateLength(2 / Math.PI, 4);
    }

    private static void testRadius(Circle circle, double expectedRadius) {
        double radius = circle.getRadius();

        if (radius == expectedRadius) {
            System.out.println("Тест пройден. Ожидался радиус " + expectedRadius + ", получен " + radius);
        } else {
            System.err.println("Ошибка! Ожидался радиус " + expectedRadius + ", получен " + radius);
        }
    }

    private static void testLength(Circle circle, double expectedLength) {
        double length = circle.getLength();

        if (length == expectedLength) {
            System.out.println("Тест пройден. Ожидалась длина " + expectedLength + ", получена " + length);
        } else {
            System.err.println("Ошибка! Ожидалась длина " + expectedLength + ", получена " + length);
        }
    }

    private static void testCalculateLength(double radius, double expectedLength) {
        double length = Circle.calculateLength(radius);

        if (length == expectedLength) {
            System.out.println("Тест пройден. Ожидалась длина " + expectedLength +
                    ", получена длина путём вычисления " + length);
        } else {
            System.err.println("Ошибка! Ожидалась длина " + expectedLength +
                    ", получена длина путём вычисления " + length);
        }
    }
}
