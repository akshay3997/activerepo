package com.company;
import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int X=sc.nextInt();
       int Ans=X;
        System.out.println("enter power");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            Ans=Ans*X;
        }
    }
}
