import java.util.Scanner;
public class Lesson_2 {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = -2000;
        int b = 450;
        int summa = a + b;
        if (summa >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 40;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 20;
        int b = 1;
        if (a >= b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
    public static void returnsum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        boolean result = checksumma(a, b);
        System.out.println("Результат: " + result);
    }
    public static boolean checksumma(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void positive_negative() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Ваше число положительное");
        } else {
            System.out.println("Ваше число отрицательное");
        }
    }
    public static void positive_negative_TF() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        boolean result = checkpositive_negative(a);
        System.out.println("Результат: " + result);
    }
    public static boolean checkpositive_negative(int a) {
        return a < 0;
    }
    public static void stroka() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scanner.nextLine();
        System.out.println("Введите число повтора: ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(line);
        }
    }
    public static boolean checkYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
    public static void Year() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        boolean result = checkYear(year);
        System.out.println("Год " + year + " високосный: " + result);
    }
    public static void massive() {
        int [] arr = {1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;} else {
                arr[i] = 1;}
            }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public  static void massive2() {
        int [] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
    public static void massivelessthan6() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <6) {
                arr[i] = arr[i] * 2;}
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void massivewhith1() {
        int counter = 1;
        int[][] square = new int[3][3];
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                square[i][j] = counter;
                counter++;
                if (i == j) {
                    square[i][j] = 1;
                }
                square[0][2] = 1;
                square[2][0] = 1;
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void SvoiMassive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элемент массива: ");
        String initialValue = scanner.nextLine();
        System.out.println("Введите длину массива: ");
        int len = scanner.nextInt();
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
