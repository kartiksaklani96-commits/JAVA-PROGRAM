import java.util.Arrays;

public class Reverce {
    public static void main(String[] args) {
        int arr[] = {23, 45, 67, 78};

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}