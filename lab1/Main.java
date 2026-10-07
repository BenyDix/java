import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main app = new Main();

        // ============ Задание 1. Методы ============

        System.out.println("=== Задание 1. Задача 2. Сумма знаков ===");
        System.out.println("Число: 4568");
        System.out.println("Сумма двух последних цифр: " + app.sumLastNums(4568));

        System.out.println("\n=== Задание 1. Задача 4. Есть ли позитив ===");
        System.out.println("Число: -9");
        System.out.println("Положительное? " + app.isPositive(-9));

        System.out.println("\n=== Задание 1. Задача 6. Большая буква ===");
        System.out.println("Символ: 'q'");
        System.out.println("Большая буква? " + app.isUpperCase('q'));

        System.out.println("\n=== Задание 1. Задача 8. Делитель ===");
        System.out.println("Числа: 12 и 4");
        System.out.println("Одно делит другое? " + app.isDivisor(12, 4));

        System.out.println("\n=== Задание 1. Задача 10. Многократный вызов ===");
        int acc = 5;
        int[] nums = {53, 90, 51, 74};
        System.out.println("Начальное значение: " + acc);
        for (int n : nums) {
            int old = acc;
            acc = app.lastNumSum(acc, n);
            System.out.println("  " + old + " + " + n + " -> " + acc);
        }
        System.out.println("Итог: " + acc);

        // ============ Задание 2. Условия ============

        System.out.println("\n=== Задание 2. Задача 2. Безопасное деление ===");
        System.out.println("5 / 0 = " + app.safeDiv(5, 0));
        System.out.println("8 / 2 = " + app.safeDiv(8, 2));

        System.out.println("\n=== Задание 2. Задача 4. Строка сравнения ===");
        System.out.println(app.makeDecision(5, 7));
        System.out.println(app.makeDecision(8, -1));
        System.out.println(app.makeDecision(4, 4));

        System.out.println("\n=== Задание 2. Задача 6. Тройная сумма ===");
        System.out.println("5, 7, 2 -> " + app.sum3(5, 7, 2));
        System.out.println("8, -1, 4 -> " + app.sum3(8, -1, 4));

        System.out.println("\n=== Задание 2. Задача 8. Возраст ===");
        System.out.println("5 -> " + app.age(5));
        System.out.println("31 -> " + app.age(31));
        System.out.println("44 -> " + app.age(44));

        System.out.println("\n=== Задание 2. Задача 10. Вывод дней недели ===");
        System.out.println("Начало с 'среда':");
        app.printDays("среда");
        System.out.println("Начало с 'чг':");
        app.printDays("чг");

        // ============ Задание 3. Циклы ============

        System.out.println("\n=== Задание 3. Задача 2. Числа наоборот ===");
        System.out.println("x = 5 -> " + app.reverseListNums(5));

        System.out.println("\n=== Задание 3. Задача 4. Степень числа ===");
        System.out.println("2 в степени 5 = " + app.pow(2, 5));

        System.out.println("\n=== Задание 3. Задача 6. Одинаковость ===");
        System.out.println("1111 -> " + app.equalNum(1111));
        System.out.println("1211 -> " + app.equalNum(1211));

        System.out.println("\n=== Задание 3. Задача 8. Левый треугольник ===");
        System.out.println("Высота 4:");
        app.leftTriangle(4);

        System.out.println("\n=== Задание 3. Задача 10. Угадайка ===");
        app.guessGame();

        // ============ Задание 4. Массивы ============

        System.out.println("\n=== Задание 4. Задача 2. Поиск последнего значения ===");
        int[] arr1 = {1, 2, 3, 4, 2, 2, 5};
        System.out.println("Массив: " + Arrays.toString(arr1));
        System.out.println("Индекс последнего вхождения 2: " + app.findLast(arr1, 2));

        System.out.println("\n=== Задание 4. Задача 4. Добавление в массив ===");
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Исходный: " + Arrays.toString(arr2));
        System.out.println("Вставить 9 в позицию 3: " + Arrays.toString(app.add(arr2, 9, 3)));

        System.out.println("\n=== Задание 4. Задача 6. Реверс ===");
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Исходный: " + Arrays.toString(arr3));
        app.reverse(arr3);

        System.out.println("\n=== Задание 4. Задача 8. Объединение ===");
        int[] arrA = {1, 2, 3};
        int[] arrB = {7, 8, 9};
        System.out.println("arr1: " + Arrays.toString(arrA));
        System.out.println("arr2: " + Arrays.toString(arrB));
        System.out.println("Объединение: " + Arrays.toString(app.concat(arrA, arrB)));

        System.out.println("\n=== Задание 4. Задача 10. Удалить негатив ===");
        int[] arr4 = {1, 2, -3, 4, -2, 2, -5};
        System.out.println("Исходный: " + Arrays.toString(arr4));
        System.out.println("Без негатива: " + Arrays.toString(app.deleteNegative(arr4)));
    }

    // ============ Задание 1. Методы ============

    // 2.
    public int sumLastNums(int x) {
        int x1 = x % 10;
        int x2 = x / 10 % 10;
        return x1 + x2;
    }

    // 4.
    public boolean isPositive(int x) {
        return x > 0;
    }

    // 6.
    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    // 8.
    public boolean isDivisor(int a, int b) {
        return a % b == 0 || b % a == 0;
    }

    // 10.
    public int lastNumSum(int a, int b) {
        return a % 10 + b % 10;
    }

    // ============ Задание 2. Условия ============

    // 2.
    public double safeDiv(int x, int y) {
        if (y == 0) return 0;
        return (double) x / y;
    }

    // 4.
    public String makeDecision(int x, int y) {
        if (x < y) return x + " < " + y;
        if (x > y) return x + " > " + y;
        return x + " == " + y;
    }

    // 6.
    public boolean sum3(int x, int y, int z) {
        return x + y == z || x + z == y || y + z == x;
    }

    // 8.
    public String age(int x) {
        if (x % 10 == 1 && x != 11) {
            return x + " год";
        } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && x != 12 && x != 13 && x != 14) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    // 10.
    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    // ============ Задание 3. Циклы ============

    // 2.
    public String reverseListNums(int x) {
        String res = "";
        if (x > 0) {
            while (x != -1) { res += x + " "; x--; }
        } else {
            while (x != 1)  { res += x + " "; x++; }
        }
        return res.trim();
    }

    // 4.
    public int pow(int x, int y) {
        int result = 1;
        while (y != 0) { result *= x; y--; }
        return result;
    }

    // 6.
    public boolean equalNum(int x) {
        int last = x % 10;
        x /= 10;
        while (x != 0) {
            if (x % 10 != last) return false;
            x /= 10;
        }
        return true;
    }

    // 8.
    public void leftTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) System.out.print('*');
            System.out.println();
        }
    }

    // 10.
    public void guessGame() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int secretNum = (int) (Math.random() * 10);

        while (true) {
            System.out.print("Введите число от 0 до 9: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ошибка! Введите целое число: ");
                scanner.next();
            }
            int userNum = scanner.nextInt();
            attempts++;

            if (userNum == secretNum) {
                System.out.println("Вы угадали!");
                System.out.println("Количество попыток: " + attempts);
                break;
            }
            System.out.println("Вы не угадали.");
        }
    }

    // ============ Задание 4. Массивы ============

    // 2.
    public int findLast(int[] arr, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == x) index = i;
        return index;
    }

    // 4.
    public int[] add(int[] arr, int x, int pos) {
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) res[i] = arr[i];
        res[pos] = x;
        for (int i = pos; i < arr.length; i++) res[i + 1] = arr[i];
        return res;
    }

    // 6.
    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }
        System.out.println("Перевернутый массив: " + Arrays.toString(arr));
    }

    // 8.
    public int[] concat(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) res[i] = arr1[i];
        for (int i = 0; i < arr2.length; i++) res[arr1.length + i] = arr2[i];
        return res;
    }

    // 10.
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int v : arr) if (v >= 0) count++;
        int[] res = new int[count];
        int j = 0;
        for (int v : arr) if (v >= 0) res[j++] = v;
        return res;
    }
}