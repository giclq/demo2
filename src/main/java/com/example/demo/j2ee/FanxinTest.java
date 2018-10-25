package com.example.demo.j2ee;

import java.util.List;

public class FanxinTest {

    public static void main(String[] args) {
        //public interface List<E> extends Collection<E>
        //占位符T和?区别
    }

//只能放入一种类型
    public static <T> void show1(List<T> list){
        for (Object object : list) {
            System.out.println(object.toString());
        }
    }
//能放多种效果和object一样，可以缩小范围【? extends Test】表示包括T在内的任何T的子类
    //<? super Test> 包括T在内的任何T的父类
    public static void show2(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }

}
