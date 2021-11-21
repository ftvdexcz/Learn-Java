/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 84362
 */
public class Thread2 extends Thread{
    private int num;
    private int[] list;
    
    private boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public Thread2(int num) {
        this.num = num;
        list = new int[num+1];
        int n = 3, idx=0;
        while(idx<=num){
            while(!isPrime(n)) 
                n+=10;
            list[idx] = n;
            n+=10;
            idx++;
        }
    }
    
    public void run(){
        int idx=0;
        while(num>=0){ 
            System.out.println("\33[31m" + list[idx++]);
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            num--;
        }
        
    }
}
