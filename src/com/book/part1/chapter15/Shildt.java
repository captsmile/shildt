package com.book.part1.chapter15;

public class Shildt {
}

interface DoubleNum {
    double func(double[] n) throws EmptyArr;
}

class EmptyArr extends Exception{
    EmptyArr(){
        super("empty array");
    }
}
class Lambd{
    public static void main(String[] args) throws EmptyArr {
        double[] val = {1.0, 2.0, 3.0, 4.0};
        DoubleNum doubleNum = n -> {
            int sum=0;
           if (n.length == 0)
               throw new EmptyArr();
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };

        System.out.println("avg = " + doubleNum.func(val));
        System.out.println("avg = " + doubleNum.func(new double[0]));
    }


}
