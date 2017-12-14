package com.book.part1.chapter15;

interface MyGen<S> {
    int func(S[] vals, S v);
}
class MyArrOps<T> {
    int countMatching(T[] vals, T v){
        int count=0;
        for (int i = 0; i < vals.length; i++)
            if (vals[i] == v) count++;
            return count;
    }
}

public class GenericMethodRefDemo<T>  {
    int myOp(MyGen<T> f, T[] vals, T v){
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1,2,3,4,2,3,4,4,5};
        String[] strs = {"One", "Two","Three","Two"};
        int count;
        GenericMethodRefDemo genericMethodRefDemo = new GenericMethodRefDemo();
        MyArrOps myArrOps = new MyArrOps();
        count = genericMethodRefDemo.myOp(myArrOps::countMatching,vals,4);
        System.out.println(count);
        count = genericMethodRefDemo.myOp(myArrOps::countMatching,strs,"Two");
        System.out.println(count);
    }
}
