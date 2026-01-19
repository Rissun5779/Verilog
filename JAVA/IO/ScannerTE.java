import java.io.*;
import java.util.Scanner;

public class ScannerTE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");

        String str = in.nextLine();
        System.out.println("String: "+str);
        System.out.print("Input a Short: ");
        short a = in.nextShort();
        System.out.print("Your short is: ");
        System.out.println(a);
    }    
}
