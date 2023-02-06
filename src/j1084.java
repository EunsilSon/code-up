import java.io.*;

public class j1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] rgb = br.readLine().split(" ");
        int count = 0;

        for (int i = 0; i < Integer.parseInt(rgb[0]); i++) {
            for (int j = 0; j < Integer.parseInt(rgb[1]); j++) {
                for (int k = 0; k < Integer.parseInt(rgb[2]); k++) {
                    count++;
                    bw.write(i + " " + j + " " + k + "\n");
                }
            }
        }
        bw.flush();
        System.out.printf("%d",count);
        bw.close();
    }
}