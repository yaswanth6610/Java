package calculator;
import java.lang.Math;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Average a = new Average();
        double res = 10/3;
        double v = 100.0;
        double b = Math.round( ((double) 10/3)  * 100.0)/100.0;
        System.out.println(b);
        System.out.println(a.average(12,8,15));
        System.out.println(a.average(10,20,30));

    }
}

class Average{
    public double average(int n1, int n2, int n3) {
        int sum = n1+n2+n3;
        double v = Math.round(((double) sum / 3) * 100.0) / 100.0;
        return v;
    }
}