import java.util.Scanner;

public class j1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] data = new int[5];
        String temp = Integer.toString(num);

        for (int i = 0; i < temp.length(); i++) {
            data[i] = Character.getNumericValue(temp.charAt(i));
        }

        System.out.printf("[%d]\n", data[0] * 10000);
        System.out.printf("[%d]\n", data[1] * 1000);
        System.out.printf("[%d]\n", data[2] * 100);
        System.out.printf("[%d]\n", data[3] * 10);
        System.out.printf("[%d]\n", data[4]);
    }
}