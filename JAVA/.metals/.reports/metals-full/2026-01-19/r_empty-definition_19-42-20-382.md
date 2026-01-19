error id: file:///C:/Users/USER/Desktop/Verilog/JAVA/IO/Example1.java:java/lang/System#
file:///C:/Users/USER/Desktop/Verilog/JAVA/IO/Example1.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 282
uri: file:///C:/Users/USER/Desktop/Verilog/JAVA/IO/Example1.java
text:
```scala
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
        @@System.out.print("Your byte is " +b);
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#