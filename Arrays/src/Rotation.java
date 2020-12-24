import java.util.Arrays;

public class Rotation {
    static void reverseArr(int[] arr, int start, int end) {

        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArr(int[] arr, int num) {

        int size = arr.length;
        num = num % size;

        reverseArr(arr, 0, num - 1);
        reverseArr(arr, num, size - 1);
        reverseArr(arr, 0, size - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int num = 4;

        rotateArr(arr, num);

        System.out.println(Arrays.toString(arr));

    }
}
