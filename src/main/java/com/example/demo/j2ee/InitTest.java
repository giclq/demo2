package com.example.demo.j2ee;

import org.aspectj.weaver.ast.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//https://blog.csdn.net/u013115610/article/details/70768271
public class InitTest {

    public static  void test(){

    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(){{
            add("1");
            add("b");
        }};

        Map map = new HashMap<String, String>(){{
            put("22","33");
        }};

    }
}
