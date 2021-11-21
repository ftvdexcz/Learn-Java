/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author 84362
 */
public class Thread1 extends Thread{
    private int num;

    public Thread1(int num) {
        this.num = num;
    }
    
    public void run(){
        while(num>=0){
            System.out.println("\33[31m" + num);
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            num--;
        }
    }
}
