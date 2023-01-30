import java.util.Scanner;

public class j1022 {
    public static void main(String[] args) {
        boolean check = true;
        String str = "";
        char[] data = new char[2000];
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        while (check) {
            str = sc.next();

            if (str.length() <= 2000) {
                data = str.toCharArray();
                check = false;
            }
        }
        System.out.println(str);
    }
}
