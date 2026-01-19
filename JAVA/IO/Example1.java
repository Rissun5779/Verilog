import java.io.*;

public class Example1 {
    Example1(){
    }

    public static void main(String args[]) throws IOException{
        System.out.print("Please Press any char: ");
        int b;
        char c;

        b=System.in.read();
        c=(char)b;
        System.out.println("Your byte is " +b);
        System.out.println("Your char is " +c);
    }
}
