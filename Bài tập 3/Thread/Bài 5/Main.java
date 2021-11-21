package bai5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập màu:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] w = s.split("\\s+");
        Map<String, String> m = new HashMap<>();
        m.put("BLACK", "\033[0m BLACK");
        m.put("RED", "\033[31m RED");
        m.put("GREEN", "\033[32m GREEN");
        m.put("YELLOW", "\033[33m YELLOW");
        m.put("BLUE", "\033[34m BLUE");
        m.put("MAGENTA", "\033[35m MAGENTA");
        m.put("CYAN", "\033[36m CYAN");
        m.put("WHITE", "\033[37m WHITE");
        
        
        Thread t = new Thread(){
            int n = 0;
            public void run(){
                while(n < 10){
                    String color = w[n%w.length].toUpperCase();
                    System.out.println(m.get(color));
                    try{
                        sleep(500);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                    n++;
                }
            }
        };
        t.start();
    }
}
