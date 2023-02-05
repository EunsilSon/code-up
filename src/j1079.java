import java.util.Scanner;

public class j1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char word = sc.next().charAt(0);
            System.out.println(word);

            if (word == 'q') {
                break;
            }
        }
    }
}