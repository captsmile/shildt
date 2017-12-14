package com.book.part1.chapter15;
/*

Ссылки на статические методы
Такая ссылка позволяет обращаться к методу не вызывая его
Для создания ссылки на статический метод служит следующая форма имя_класса::имя_метода

*/

interface StringFunc {
    String func(String str);
}

interface StringFuncEmptryParam {
    String func();
}

class MyStringOps {
    static String strReverse(String str){
        StringBuilder result = new StringBuilder(str);
        /*String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }*/
        return result.reverse().toString();
    }

    static String hello(){
        return "hi";
    }
}
public class MethodRefDemo {
    static String stringOp (StringFunc sf, String s){
        return sf.func(s);
    }

    static String stringOp (StringFuncEmptryParam sf){
        return sf.func();
    }

    public static void main(String[] args) {
        String inStr = "Hello world!";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Before: " + inStr);
        System.out.println("After: " + outStr);
        System.out.println("say hi: " + stringOp(MyStringOps::hello));
    }
}
