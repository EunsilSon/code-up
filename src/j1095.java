import java.util.Scanner;

public class j1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt(); // 불린 출석 번호
        }

        int min = arr[0];

        for (int n : arr) {
            if (min > n) {
                min = n;
            }
        }

        System.out.println(min);
    }
}
