package lw.demo;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] arg){
        int u = 110611;
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("HelloWorld!"+" "+u+" "+name);
    }
}
