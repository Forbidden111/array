import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("task1");
        double[] array = new double[]{1.57, 7.654, 9.986};
        double array1 = array[1];
        System.out.println(array[0]);


        // task2
        System.out.println("task2");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {

                System.out.print(",");
                System.out.println();
            }
        }
        //task3
        System.out.println("task3");
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + ",");

            System.out.print(array[i]);
            System.out.println();
        }


        System.out.println("задача 4");
        int[] weight = {1, 2, 3};
        for (
                int i = 0;
                i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i]++;
                System.out.println(weight[i]);
                System.out.println();


            }
        }
    }
}

