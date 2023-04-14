import java.util.Arrays;
import java.util.Collections;

public class soru {
    public static void main(String[] args) {
        int[] array0 = {0, 0, -1, 0, 2, 5, 3, 6, 0};
        int[] array1 = {-1, 0, 6, 0, 2, 7, 0, 5};
        int[] array2 = {2, 0, 0, 1, 0, 0};
        int[] array3 = {0, 0, 0, 0, 2, -4, 0, 0, 8, 0, 0, 0, 0, 1, 0, 0};
        int[] array4 = {-1, 2, 3, 4, 5, 0, 2, 3, 4};
        result(array0);

    }

    public static void cozum(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && i != 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (array[j] == 0) {
                        break;
                    } else {
                        array[j + 1] = array[j];
                        array[j] = 0;
                    }
                }
            }
        }
        display(array);
    }

    public static void cozum2(int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && index == -1) {
                index = i;
            }
            if (array[i] == 0 && i != 0 && index != -1) {
                array[i] = array[index];
                array[index] = 0;
                index += 1;
            }
        }
        display(array);
    }

    public static void cozum3(int[] arr) {

        int z = arr.length - 1;
        for (int i = 0; i <= z; i++) {
            if (arr[i] != 0) {
                swap(arr, i, z);
                z--;
                i--;
            }
        }
        display(arr);
    }

    private static void swap(int[] arr, int i, int z) {
        int temp = arr[i];
        arr[i] = arr[z];
        arr[z] = temp;
    }


    public static void result(int[] array) {
        System.out.println(Arrays.toString(array));
        cozum4(array);
    }

    public static void display(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println("]");
    }

    public static void cozum4(int[] array) {
        int z = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                swap(array, i, z);
                z--;
            }
        }

        display(array);
    }


}
