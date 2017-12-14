package com.book.part1.chapter15;

public class Shildt2 {
}

interface MyFunc{
    int func(int n);
}

class VarCapture{
    public static void main(String[] args) {
        int num = 10;

        MyFunc myLambda = n->{
            int v = num + n;
            return v;
        };


        System.out.println(myLambda.func(10));
    }
}
