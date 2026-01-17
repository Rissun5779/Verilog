// package com.apress.ch.one.hw;

import java.util.List;

public class Example01{
    public static void main(String[] args){
        java.util.List<String> items = List.of("1", "a", "2", "a", "3", "a");

        items.forEach(item ->{
            if(item.equals("a")){
                System.out.println("A");
            }else{
                System.out.println("Not A");
            }
        });
    }
}