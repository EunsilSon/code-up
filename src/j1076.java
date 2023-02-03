import java.util.Scanner;

public class j1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        char word = 'a';

        do {
            System.out.print(word++ + " ");
        } while (word <= alphabet);
    }
}