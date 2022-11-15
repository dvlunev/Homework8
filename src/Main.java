import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Тренировака
        System.out.println("Тренировка");
        int [] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights [january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        int[] arr = new int[10]; // Создали массив на 10 элементов
        int arrSize = arr.length;
        System.out.println(arr.length);
        System.out.println(arr.length - 1);
        System.out.println(arrSize);
        System.out.println(arrSize - 1);
        System.out.println(" ");
        // Задача 1
        int [] arrInt = new int[] {1, 2, 3};
        double [] arrDouble = {1.57, 7.654, 9.986};
        boolean [] arrBoolean = {true, false, 2 < 3, 3 < 2};
        // Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < arrInt.length; i++) {
            if (i != (arrInt.length - 1)) System.out.print(arrInt[i] + ", ");
            else System.out.print(arrInt[i]);
            }
        System.out.println(" ");
        for (int i = 0; i < arrDouble.length; i++) {
            if (i != (arrDouble.length - 1)) System.out.print(arrDouble[i] + ", ");
            else System.out.print(arrDouble[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < arrBoolean.length; i++) {
            if (i != (arrBoolean.length - 1)) System.out.print(arrBoolean[i] + ", ");
            else System.out.print(arrBoolean[i]);
        }
        System.out.println(" ");
        System.out.println(" ");
        // Задача 3
        System.out.println("Задача 3");
        for (int i = arrInt.length - 1; i >= 0; i--) {
            if (i != 0) System.out.print(arrInt[i] + ", ");
            else System.out.print(arrInt[i]);
        }
        System.out.println(" ");
        for (int i = arrDouble.length - 1; i >= 0; i--) {
            if (i != 0) System.out.print(arrDouble[i] + ", ");
            else System.out.print(arrDouble[i]);
        }
        System.out.println(" ");
        for (int i = arrBoolean.length - 1; i >= 0; i--) {
            if (i != 0) System.out.print(arrBoolean[i] + ", ");
            else System.out.print(arrBoolean[i]);
        }
        System.out.println(" ");
        System.out.println(" ");
        // Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) arrInt[i] += 1;
            if (i != (arrInt.length - 1)) System.out.print(arrInt[i] + ", ");
            else System.out.print(arrInt[i]);
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(arrInt));
    }
}