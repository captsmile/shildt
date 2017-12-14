package com.book.part1.chapter15;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

interface Func<T>{
    boolean func(T v1, T v2);
}

class HighTemp{
    private int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean sameTemp (HighTemp highTemp){
        return hTemp == highTemp.hTemp;
    }

    boolean lessThanTemp (HighTemp highTemp){
        return hTemp < highTemp.hTemp;
    }
}

class HighTempArr{
    boolean sameTemp (int highTemp, int hTemp){
        return highTemp == hTemp;
    }
}

public class InstanceMathWithObjectRefDemo {
    static <T> int counter(T[] vals, Func<T> f, T v) {
        int count=0;
        for (int i = 0; i < vals.length; i++)
            if(f.func(vals[i],v)) count ++;
            return count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHighs = {new HighTemp(89),new HighTemp(82),
                new HighTemp(90),new HighTemp(89),
                new HighTemp(89),new HighTemp(91),
                new HighTemp(84),new HighTemp(83),};
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count);

        HighTempArr highTempArr = new HighTempArr();

        int[] tempArr = {89,82,90,89,89,91,84,83};
        //System.out.println(counter(tempArr, highTempArr::sameTemp, 89));
    }
}

class MM {
    public static void main(String[] args) {
        AlwaysSafePublished alwaysSafePublished = new AlwaysSafePublished();
        System.out.println(alwaysSafePublished.number());
    }
    public static class AlwaysSafePublished{
        private final Map map = new HashMap();

        public AlwaysSafePublished() {
            Collection c = new ArrayList();
            c.add("a");
            c.add("A");
            map.put("1", c.size());
        }

        public int number(){
            return (Integer) map.get("1");
        }
    }
}

class Atom{
    public static void main(String[] args) {
        String s;
        int i;
        Integer ss;
        s = new String("dfdfdfdfd");
        System.out.println(Integer.parseInt(s));
    }
}