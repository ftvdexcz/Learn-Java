package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Thread1 t1 = new Thread1(n);
        Thread t2 = new Thread2(n);
        t1.start();
        t2.start();
    }
}
