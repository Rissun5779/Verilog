// package com.apress.ch.one.hw;

import java.util.List;

public class Example01{
    java.util.List<String> items;

    public Example01(){
        items = List.of("1", "a", "2", "a", "3", "a");
    }
    public void list_Display(){
        this.items.forEach(item ->{
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