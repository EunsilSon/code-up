import java.util.Scanner;

public class j1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt(); // 불린 출석 번호
        }

        for (int i = count-1; i >= 0; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
