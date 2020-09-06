public class TestDish {
    public static void main(String[] args) {
        testClassKnife();
        testClassGlass();
    }

    private static void testClassGlass() {
        System.out.println("Тест класса Knife\n");

        double volume = 100;
        Glass glass = new Glass(volume);

        glass.actionWithFood();

        testTypeDish(glass, "стакан");
        testPurposeDish(glass, "Для сервировки");
        testVolumeGlass(glass, volume);

        System.out.println("\n\n");
    }

    private static void testClassKnife() {
        System.out.println("Тест класса Knife\n");

        double length1 = 15;
        String purpose1 = "Для приготовления пищи";

        double length2 = 10;
        String purpose2 = "Для сервировки";

        Knife knife = new Knife(purpose1, length1);
        knife.actionWithFood();
        knife.sharpenKnife();

        testTypeDish(knife, "нож");

        testLengthKnife(knife, length1);
        testPurposeDish(knife, purpose1);

        knife.setLength(length2);
        knife.setPurpose(purpose2);

        testLengthKnife(knife, length2);
        testPurposeDish(knife, purpose2);

        System.out.println("\n\n");
    }

    private static void testTypeDish(Dish dish, String expectedType) {
        String type = dish.getType();

        String message = "Ожидался тип " + expectedType + ", получен " + type;

        if (type.equals(expectedType)) {
            System.out.println("Тест пройден. " + message);
        } else {
            System.err.println("Ошибка! " + message);
        }
    }

    private static void testPurposeDish(Dish dish, String expectedPurpose) {
        String purpose = dish.getPurpose();

        String message = "Ожидалось назначение " + expectedPurpose + ", получено " + purpose;

        if (purpose.equals(expectedPurpose)) {
            System.out.println("Тест пройден. " + message);
        } else {
            System.err.println("Ошибка! " + message);
        }
    }

    private static void testLengthKnife(Knife knife, double expectedLength) {
        double length = knife.getLength();

        String message = "Ожидалась длина " + expectedLength + ", получена " + length;

        if (length == expectedLength) {
            System.out.println("Тест пройден. " + message);
        } else {
            System.err.println("Ошибка! " + message);
        }
    }

    private static void testVolumeGlass(Glass glass, double expectedVolume) {
        double volume = glass.getVolume();

        String message = "Ожидался объём " + expectedVolume + ", получен " + volume;

        if (volume == expectedVolume) {
            System.out.println("Тест пройден. " + message);
        } else {
            System.err.println("Ошибка! " + message);
        }
    }
}
