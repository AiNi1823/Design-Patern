package com.company.HomeWork.ThoughtWorks;

import com.sun.tools.javac.util.StringUtils;

import java.util.Scanner;

public class TestUnit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(str);
        while (!str.isEmpty()) {
            String[] inputInfo = str.split(" ");
            String result = MethodUitls.deal(inputInfo);
            String output = MethodUitls.formatOutPut(result);
            System.out.println(output);
            input = new Scanner(System.in);
            str = input.nextLine();
        }
        //计算所有预定以及取消预定带来的收入情况，以不同的场馆分组
        String totalResult = MethodUitls.calculateTotal();
        String output = MethodUitls.formatOutPut(totalResult);
    }
    //需要一个场馆类，用以保存预定信息、取消信息、以及对应的收入
}
