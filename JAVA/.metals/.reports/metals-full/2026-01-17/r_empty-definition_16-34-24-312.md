error id: file:///C:/Users/USER/Desktop/Verilog/JAVA/Basic/Example01.java:
file:///C:/Users/USER/Desktop/Verilog/JAVA/Basic/Example01.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 194
uri: file:///C:/Users/USER/Desktop/Verilog/JAVA/Basic/Example01.java
text:
```scala
// package com.apress.ch.one.hw;

import java.util.List;

public class Example01{
    
    public Example01(){
    }
    public void list_Display(){
        java.util.List<String> items@@ = List.of("1", "a", "2", "a", "3", "a");

        items.forEach(item ->{
            if(item.equals("a")){
                System.out.println("A");
            }else{
                System.out.println("Not A");
            }
        });
    }
    public static void main(String[] args){
        Example01 Ex1 = new Example01();
        Ex1.list_Display();
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 