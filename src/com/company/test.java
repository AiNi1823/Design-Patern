package com.company;

import java.util.List;

public class test {

    public static void main(String[] args) {
        String a = "i am so by happy";
        String b = "so";
        String[] result = a.split("z");
        for (String s : result) {
            System.out.println(s);
        }
        System.out.println(result.length - 1);
    }
}
