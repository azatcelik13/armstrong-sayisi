package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayıyı giriniz=");
        int number = inp.nextInt();
        int tempnumber=number;
        int basNumber=0,basvalue=0,baspow;
        int result=0;

        while (tempnumber!=0){
            tempnumber/=10;
            basNumber++;

        }
        tempnumber=number;
                System.out.println("Basamak sayısı="+basNumber);
        while (tempnumber!=0){
            basvalue=tempnumber%10;
            baspow=1;
            for (int i=1;i<=basNumber;i++){
            baspow=baspow*basvalue;
        } result+=baspow;
            tempnumber/=10;
        }
        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }


    }
}
