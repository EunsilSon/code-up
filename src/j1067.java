import java.util.Scanner;

public class j1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 0) { // 음수
            System.out.println("minus");
            checkEvenOrOdd(num);
        } else {
            System.out.println("plus");
            checkEvenOrOdd(num);
        }
    }

    public static void checkEvenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}