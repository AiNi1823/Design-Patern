package com.company.HomeWork.ThoughtWorks;

public class Test {
    private static int i = 1;
    public int getNext() {
        return i++;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Test testObj = new Test();
        test.getNext();
        testObj.getNext();
        System.out.println(testObj.getNext());
    }
}
