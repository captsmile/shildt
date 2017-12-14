package com.book.part1.chapter15;

interface my {
    int method(int n);
}

class myimpl implements my{
    public int var;

    int getVar(){
        return var;
    }

    void setVar(int var){
        this.var = var;
    }
    public int method(int n){
        return n+11;
    }
}

public class mail {
    public static void main(String[] args) {
        my k = (z) -> z*10;
        System.out.println(k.method(11));
        myimpl my = new myimpl();
        my.setVar(15);
        System.out.println(my.getVar());
    }
}

