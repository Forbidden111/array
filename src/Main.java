import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        задание 1
        int[] arrays = new int[]{1, 2, 3};
        double[] array = {1.57, 7.654, 9.986};
        char[] arrak = {'a', 'b', 'c'};
//             задание 2
        for (int i = 0; i < arrays.length; i++) {
            if (i != arrays.length - 1) {
                System.out.print(arrays[i] + ", ");
            } else {
                System.out.print(arrays[i] + " \n");
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + " \n");
            }

        }
        for (int i = 0; i < arrak.length; i++) {
            if (i != arrak.length - 1) {
                System.out.print(arrak[i] + ", ");
            } else {
                System.out.print(arrak[i] + " \n");
            }

        }
//        задание 3
        for (int i = arrays.length - 1; i >= 0; i--) {
            if (i != 0 ) {
                System.out.print(arrays[i] + ", ");
            } else {
                System.out.print(arrays[i] + " \n");
            }

        }
        for (int i = array.length -1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + " \n");
            }

        }
        for (int i = arrak.length -1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrak[i] + ", ");
            } else {
                System.out.print(arrak[i] + " \n");
            }

        }
//        задание4
        for (int i = 0 ; i < arrays.length ; i++) {
            if (arrays[i] % 2 != 0)arrays[i]++;

            
        }
        System.out.println(Arrays.toString(arrays));



    }

}





