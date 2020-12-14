package main;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        Map<Integer,Integer> map = new HashMap<>();
//        MyStream s = new MyStream();
//        s.myForEach(str->{
//            if(str.equals("i")){
//                return;
//            }
//            System.out.println(str);
//        });
//
//        s.walk((n,i)->{
//            map.put(n,i);
//            System.out.println(map.values());
//        });
//        s.testRun(()->{
//            System.out.println("3434");
//        });
//        s.testRun(()->{
//            System.out.println("123");
//        });
//        int result = 0;
//        result = BitExample.win(result);
//        result = BitExample.win(result);
//        result = BitExample.winTimes(result);
//        System.out.println(Integer.toBinaryString(result));
        BitSet marks = new BitSet(120);
        marks.set(32);
        marks.clear(32);
        System.out.println("length:"+((1L<<64)));
    }
}
