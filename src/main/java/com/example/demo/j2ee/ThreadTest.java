package com.example.demo.j2ee;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadTest {
    private static Executor execute = Executors.newFixedThreadPool(10);

    public static void main2(String[] args) {
        Runnable r = ()->{
            System.out.println(111);
        };
        execute.execute(r);
    }

    public static void main(String[] args) throws Exception {
/*        for (int i = 0; i <100 ; i++) {
            Callable<Integer> call;
            FutureTask<Integer> task;
            int finalI = i;
            call = new Callable<Integer>() {

                @Override
                public Integer call() throws Exception {
                    //System.out.println("正在计算结果...");
                    Thread.sleep(3000);
                    System.out.println(finalI);
                    return finalI;
                }
            };
            task = new FutureTask<>(call);
            //System.out.println(System.currentTimeMillis()+" 干点别的...");
            execute.execute(task);

           System.out.println(System.currentTimeMillis()+":"+i);
        }*/


//        Thread thread = new Thread(task);
//        thread.start();

        // do something





    }
}
