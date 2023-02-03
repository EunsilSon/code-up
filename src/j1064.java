import java.util.Scanner;

public class j1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp = a > b ? b : a;
        int result = temp > c ? c : temp;

        System.out.println(result);
    }
}