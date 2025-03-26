public class Lesson4 {

    public static void main(String[] args) {
        // 1. Печать трёх слов
        printThreeWords();

        // 2. Проверка суммы чисел
        checkSumSign();

        // 3. Проверка диапазона и цвета
        printColor();

        // 4. Сравнение двух чисел
        compareNumbers();

        // 5. Проверка, лежит ли сумма в диапазоне 10–20
        System.out.println(isSumWithin10to20(7, 9));

        // 6. Определение знака числа
        checkPositiveOrNegative(-5);

        // 7. Проверка, отрицательное ли число
        System.out.println(isNegative(-3));

        // 8. Повторение строки N раз
        printStringNTimes("Hello, world!", 3);

        // 9. Проверка високосного года
        System.out.println(isLeapYear(2020));


        // 10. Замена 0 и 1 в массиве
        replaceZeroesAndOnes();


        // 11. Заполнение массива числами от 1 до 100
        fillArrayFrom1To100();

        // 12. Умножение чисел меньше 6 на 2
        multiplyLessThan6();


        // 13. Заполнение главной диагонали матрицы
        fillDiagonalMatrix(5);

        // 14. Создание массива с одинаковыми значениями
        int[] resultArray = createArray(5, 7);
        System.out.print("Созданный массив: ");
        for (int val : resultArray) {
            System.out.print(val + " ");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 55;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 15;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumWithin10to20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        return x < 0;
    }

    public static void printStringNTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void replaceZeroesAndOnes() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
        System.out.print("Массив после замены: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void fillArrayFrom1To100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.print("Массив от 1 до 100: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void multiplyLessThan6() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.print("После умножения (<6 * 2): ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void fillDiagonalMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        System.out.println("Матрица с главной диагональю:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}