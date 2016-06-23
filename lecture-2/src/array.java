import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by admin on 16.06.2016.
 */
public class array {
    public static void main(String[] params) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        //Создаем массив случайных чисел
        Integer arr[] = new Integer[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
