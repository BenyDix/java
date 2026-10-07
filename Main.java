import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main app = new Main();

        System.out.println(app.sumLastNums(4712));
        System.out.println(app.isPositive(-9));
        System.out.println(app.isUpperCase('q'));
        System.out.println(app.isDivisor(12, 4));

        int s = 5;
        s = app.lastNumSum(s, 53);
        s = app.lastNumSum(s, 90);
        s = app.lastNumSum(s, 51);
        s = app.lastNumSum(s, 74);
        System.out.println(s);

        System.out.println(app.safeDiv(5, 2));
        System.out.println(app.makeDecision(5, 7));
        System.out.println(app.sum3(2, 8, 6));
        System.out.println(app.age(21));
        app.printDays("среда");

        System.out.println(app.reverseListNums(5));
        System.out.println(app.pow(2, 4));
        System.out.println(app.equalNum(2222));
        app.leftTriangle(5);
        // app.guessGame();   // интерактивная

        System.out.println(app.findLast(new int[]{1, 2, 1, 1, 7}, 0));
        System.out.println(Arrays.toString(app.add(new int[]{1, 2, 3, 4}, 0, 2)));
        app.reverse(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(app.concat(new int[]{1, 2, 3}, new int[]{5, 6, 7})));
        System.out.println(Arrays.toString(app.deleteNegative(new int[]{1, -2, 3, -4, 5})));
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
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    // 4.
    public String makeDecision(int x, int y) {
        if (x < y) {
            return x + " < " + y;
        } else if (x > y) {
            return x + " > " + y;
        } else {
            return x + " == " + y;
        }
    }

    // 6.
    public boolean sum3(int x, int y, int z) {
        return x + y == z || x + z == y || y + z == x;
    }

    // 8.
    public String age(int x) {
        int last = x % 10;
        int lastTwo = x % 100;

        if (last == 1 && lastTwo != 11) {
            return x + " год";
        }
        if (last >= 2 && last <= 4 && !(lastTwo >= 12 && lastTwo <= 14)) {
            return x + " года";
        }
        return x + " лет";
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
        String str = "";
        if (x > 0) {
            while (x >= 0) {
                str += x + " ";
                x--;
            }
        } else if (x == 0) {
            str += x;
        }
        return str;
    }

    // 4.
    public int pow(int x, int y) {
        int result = 1;
        while (y > 0) {
            result *= x;
            y--;
        }
        return result;
    }

    // 6.
    public boolean equalNum(int x) {
        int lastNum = x % 10;
        x = x / 10;

        while (x != 0) {
            if (x % 10 != lastNum) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }

    // 8.
    public void leftTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // 10.
    public void guessGame() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int secretNum = (int) (Math.random() * 10);
        System.out.print("Введите число от 0 до 9: ");

        while (true) {
            int userNum = scanner.nextInt();
            attempts++;

            if (userNum == secretNum) {
                System.out.println("Вы угадали!");
                System.out.println("Количество попыток: " + attempts);
                break;
            }
            System.out.print("Вы не угадали, введите число от 0 до 9: ");
        }
    }

    // ============ Задание 4. Массивы ============

    // 2. 
    public int findLast(int[] arr, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index = i;
            }
        }
        return index;
    }

    // 4.
    public int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    // 6.
    public void reverse(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Перевернутый массив: " + Arrays.toString(arr));
    }

    // 8.
    public int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }
        return newArr;
    }

    // 10.
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }

        int[] newArr = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }
}