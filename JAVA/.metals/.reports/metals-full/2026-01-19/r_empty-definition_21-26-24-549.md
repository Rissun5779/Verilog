error id: file:///C:/Users/USER/Desktop/Verilog/JAVA/IO/InINT.java:java/lang/System#
file:///C:/Users/USER/Desktop/Verilog/JAVA/IO/InINT.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 343
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

        @@System.out.print("You can input number: %2d", a);
        a++;
        
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#