import java.util.Scanner;

public class j1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char str = sc.next().charAt(0);

        switch(str) {
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
                break;
        }
    }
}