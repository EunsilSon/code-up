import java.util.Scanner;

public class j1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자 3개 입력 받기
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = sc.nextInt();
        }

        // 가장 큰 수 찾기
        int max = numbers[0];
        for (int n : numbers) {
            if (max < n) {
                max = n;
            }
        }

        // 최소공배수 구하기
        while (true) {
            if (max % numbers[0] == 0 && max % numbers[1] == 0 && max % numbers[2] == 0) {
                System.out.println(max);
                break;
            } else {
                max++;
            }
        }
    }
}