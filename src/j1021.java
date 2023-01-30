import java.util.Scanner;

public class j1021 {
    public static void main(String[] args) {
        boolean check = true;
        String word = "";
        char[] data = new char[51];
        Scanner sc = new Scanner(System.in);

        while (check) {
            word = sc.next();

            if (word.length() <= 50) {
                for (int i = 0; i < word.length(); i++) {
                    data[i] = word.charAt(i);
                }
                check = false;
            }
        }
        System.out.println(word);
    }
}
