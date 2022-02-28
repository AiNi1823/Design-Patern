package com.company.practice;

import java.util.HashMap;
import java.util.Scanner;

public class BookNet {
    static double getSum(HashMap<Integer, Books> map) {
        double sum = 0;
        for (int i = 0; i < map.size(); i++) {
            Books t = map.get(i);
            sum += (t.price * t.getNumbers());
        }
        return sum;
    }

    public static void main(String[] args) {
        HashMap<Integer, Books> m = new HashMap<Integer,Books>();
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入书的数量");
        int n = sca.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "本书的名字，价格，数量");
            String nm = sca.next();
            double p = sca.nextDouble();
            int nb = sca.nextInt();
            m.put(i, new Books(nm, p, nb));
        }
        double s = getSum(m);
        System.out.println("书的总价为： " + s);
        sca.close();
    }
}
