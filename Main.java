package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Please Enter Character");
        Scanner sc=new Scanner(System.in);
   int sum1=0;
   int sum2=0;
    int N=sc.nextInt();
for(int i=0;i<=N;i++){
    if(i%2!=0){
         sum1=sum1;
    }
else{
    sum2=sum2;
    }
}

        System.out.println(sum1+sum2);
    }
}
