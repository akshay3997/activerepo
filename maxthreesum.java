package com.company;
import java.util.*;
public class maxthreesum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
       int s=3;
        int maxsum=0;
       int[] arr=new int[N];
//        int[] sumarr= new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N-2;i++){
         int sum= arr[i]+arr[i+1]+arr[i+2];

//        for(int j=0;j<N;j++){
//            sumarr[j]=sum;
//        }
//        }
//    for(int j=0;j<N;j++){
//      if(maxsum<sumarr[j]){
//          maxsum=sumarr[j];
//      }
//    }
//        System.out.println(maxsum/s);


//            2nd way of doing it.

            if(sum>maxsum){
       maxsum=sum;
   }
        }
        System.out.println(maxsum/s);
    }
}