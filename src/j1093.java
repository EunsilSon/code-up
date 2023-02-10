import java.util.Scanner;

public class j1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[23];
        int count = sc.nextInt();
        int num;

        for (int i = 0; i < count; i++) {
            num = sc.nextInt();
            arr[num-1]++;
        }

        for (int n : arr) {
            System.out.printf("%d ", n);
        }
    }
}
