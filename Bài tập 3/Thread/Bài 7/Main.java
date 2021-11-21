/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author 84362
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] w = s.split("\\:");
        Thread t = new Thread() {
            public void run() {
                while (true) {
                    Calendar now = Calendar.getInstance();
                    int h = now.get(Calendar.HOUR_OF_DAY);
                    int m = now.get(Calendar.MINUTE);
                    int s = now.get(Calendar.SECOND);
                    if(h==Integer.parseInt(w[0]) && m==Integer.parseInt(w[1])
                            && s==Integer.parseInt(w[2])){
                        System.out.println("RENG RENG RENG");
                        break;
                    }
                        
                    try {
                        sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        };
        t.start();
    }
}
