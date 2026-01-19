import java.io.*;

public class InINT {
    public static void main(String[] args) throws IOException{
        String str;
        int a;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);

        str = buf.readLine();
        a = Integer.parseInt(str);

        System.out.printf("You can input number: %2d\n", a);
        a++;
        System.out.printf("%2d", a);
    }
}
