import java.util.Scanner;

public class j1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 격자판
        int height = sc.nextInt();
        int width = sc.nextInt();
        int[][] arr = new int[height][width];

        // 막대 개수, 길이, 방향, 좌표
        int n = sc.nextInt();
        int length, direction, x, y;

        for (int i = 0; i < n; i++) {
            length = sc.nextInt();
            direction = sc.nextInt();
            x = sc.nextInt()-1;
            y = sc.nextInt()-1;

            for (int j = 0; j < length; j++) {
                if (direction == 1) { // 세로
                    arr[x++][y] = 1;
                } else { // 가로
                    arr[x][y++] = 1;
                }
            }
        }

        // 출력
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
