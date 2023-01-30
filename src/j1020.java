import java.util.Scanner;

public class j1020 {
    public static void main(String[] args) {
        String number;
        String result = "";

        Scanner sc = new Scanner(System.in);
        number = sc.next();

        for (int i = 0; i < number.length(); i++) {
            if (!(number.charAt(i) == '-')) {
                result += number.charAt(i);
            }
        }
        System.out.println(result);
    }
}
