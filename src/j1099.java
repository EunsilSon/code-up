import java.util.Scanner;

public class j1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] maze = new int[10][10];

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        int x = 1, y = 1;

        while (maze[x][y] != 2) {
            maze[x][y] = 9;

            if (maze[x][y+1] != 1) { // 오른쪽이 벽이 아닌 경우
                y++;
            } else if (maze[x+1][y] != 1) { // 밑이 벽이 아닌 경우
                x++;
            } else { // 둘 다 벽인 경우
                break;
            }
        }
        maze[x][y] = 9;

        /*
         * 결과 출력
         */
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.printf("%d ", maze[i][j]);
            }
            System.out.println();
        }

    }
}
