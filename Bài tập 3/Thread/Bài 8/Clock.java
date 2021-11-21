/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NC
 */
public class Clock extends Thread{
    public void run(){
        SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
        int i=0;
        while(i<5){
            System.out.println("Time: " + f.format(new Date()));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            i++;
        }
       
    }
}
