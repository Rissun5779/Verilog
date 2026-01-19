error id: file:///C:/Users/USER/Desktop/Verilog/JAVA/IO/InINT.java:java/io/PrintStream#print#
file:///C:/Users/USER/Desktop/Verilog/JAVA/IO/InINT.java
empty definition using pc, found symbol in pc: java/io/PrintStream#print#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 427
uri: file:///C:/Users/USER/Desktop/Verilog/JAVA/IO/InINT.java
text:
```scala
import java.io.*;

public class InINT {
    public static void main(String[] args) throws IOException{
        String str;
        int a;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);

        str = buf.readLine();
        a = Integer.parseInt(str);

        System.out.print("You can input number: %2d", a);
        a++;
        System.out.@@print("You can input number: %2d", a);
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/io/PrintStream#print#