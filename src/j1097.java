import java.util.Scanner;

public class j1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        int x, y;

        // 바둑판 입력 받기
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 뒤집을 좌표 개수 입력 받기
        int count = sc.nextInt();

        // 좌표를 기준으로 10자를 그려서 0 -> 1, 1 -> 0 바꾸기
        for (int i = 0; i < count; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            for (int j = 0; j < arr.length; j++) { // x축
                arr[j][y-1] = (arr[j][y-1] == 0) ? 1 : 0;
            }

            for (int j = 0; j < arr.length; j++) { // y축
                arr[x-1][j] = (arr[x-1][j] == 0) ? 1 : 0;
            }

        }

        // 뒤집은 바둑판 출력
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
