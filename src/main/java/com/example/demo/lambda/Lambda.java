package com.example.demo.lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {

        Runnable r = ()->{
            System.out.println(123);
        };
        new Thread(r).start();
        //////////////
        new Thread(()->{
            System.out.println(234);
        }).start();
        //////////////
        Arrays.asList("clq","qq2").forEach(Outprint::write);
        /////////////
        List<String> arr = Arrays.asList("444", "5555");
        arr.forEach(n-> System.out.println(n));
        ///////////
    }
}
