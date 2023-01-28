import java.util.Scanner;

public class j1014 {
    public static void main(String[] args) {
        char word1, word2;
        Scanner sc = new Scanner(System.in);
        word1 = sc.next().charAt(0);
        word2 = sc.next().charAt(0);
        System.out.printf("%c %c", word2, word1);
    }
}
