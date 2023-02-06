import java.util.Scanner;

public class j1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String charHex = sc.next();
        int intHex = Integer.parseInt(charHex, 16); // 16진수 변환
        int result;

        for (int i = 1; i <= 15; i++) {
            result = intHex * i;
            if (i < 10) {
                System.out.printf("%s*%d=%s\n",charHex, i, Integer.toHexString(result).toUpperCase());
            } else {
                System.out.printf("%s*%s=%s\n",charHex, Integer.toHexString(i).toUpperCase(), Integer.toHexString(result).toUpperCase());
            }

        }

    }
}