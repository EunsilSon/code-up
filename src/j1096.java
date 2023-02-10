import java.util.Scanner;

public class j1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] arr = new int[19][19];
        int x;
        int y;

        for (int i = 0; i < count; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            arr[x-1][y-1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
