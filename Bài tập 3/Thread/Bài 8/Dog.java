/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

/**
 *
 * @author NC
 */
public class Dog extends Thread{
    public void run(){
        int i = 0;
        while(i < 5){
            System.out.println("Dog: Watching!! Watching!!");
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            i++;
        }
        System.out.println("Go,go,go,go...");
    }
}
