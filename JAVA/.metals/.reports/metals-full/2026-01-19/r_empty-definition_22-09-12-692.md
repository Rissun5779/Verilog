error id: file:///C:/Users/USER/Desktop/Verilog/JAVA/IO/ScannerTE.java:java/util/Scanner#nextLine().
file:///C:/Users/USER/Desktop/Verilog/JAVA/IO/ScannerTE.java
empty definition using pc, found symbol in pc: java/util/Scanner#nextLine().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 246
uri: file:///C:/Users/USER/Desktop/Verilog/JAVA/IO/ScannerTE.java
text:
```scala
import java.io.*;
import java.util.Scanner;

public class ScannerTE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");

        String str = in.nextLin@@e();
        System.out.println("String: "+str);
        System.out.print("Input a Short: ");
        short a = in.nextShort();
        System.out.println("Your short is: "+str);
        System.out.println(a);
    }    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Scanner#nextLine().