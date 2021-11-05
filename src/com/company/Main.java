package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num;
    int reverse=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Input your digits");
        num=sc.nextInt();

    for(;num!=0; num=num/10){
        int remainder= num%10;
        reverse=reverse*10+remainder;
        }
        System.out.println("Your number is: "+ reverse);

    }
}
