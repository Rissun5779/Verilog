error id: file:///C:/Users/USER/Desktop/Verilog/JAVA/Sandbox1/Pass1.java:java/lang/String#
file:///C:/Users/USER/Desktop/Verilog/JAVA/Sandbox1/Pass1.java
empty definition using pc, found symbol in pc: java/lang/String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 338
uri: file:///C:/Users/USER/Desktop/Verilog/JAVA/Sandbox1/Pass1.java
text:
```scala
public class Pass1 {
    int A;
    double Score;

    Pass1(int number, double Value){
        A=number;
        Score=Value;
    }

    public static void main(String args[]){
        Pass1 pa = new Pass1(0, 3.45);
        System.out.println();
    }

    class pass(){
        int a;
        double Score;
        Stri@@ng result;

        pass(int number, double Value){
            a = number;
            Score = Value;
        }

        void dispose(){
            result="不及格";
            if (Score>=60) {
                result="及格";
            }
        }
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#