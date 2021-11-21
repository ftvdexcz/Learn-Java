package bai1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
                while(true){
                    System.out.println("\33[31m" + f.format(new Date()));
                    try{
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
