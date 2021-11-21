/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 84362
 */
public class Thread2 extends Thread{
    private int num;

    public Thread2(int num) {
        this.num = num;
    }

    public void run(){
        SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
        while(num>=0){
            System.out.println("\33[31m" + f.format(new Date()));
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            num--;
        }
    }
}
