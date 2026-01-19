import java.io.*;

public class Example2 {
    public Example2(){
    }    

    public static void main(String args[]) throws IOException{
        String str;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);

        System.out.print("Input a String: ");
        str = buf.readLine();
        System.out.println("String= "+str);
    }
}
