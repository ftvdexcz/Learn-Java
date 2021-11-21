package bai6;

import java.util.Calendar;

//Calendar now = Calendar.getInstance();
//int h = now.get(Calendar.HOUR_OF_DAY);
//int m = now.get(Calendar.MINUTE);
//int s = now.get(Calendar.SECOND);


public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                int i = 0; 
                Calendar now;
                while(i < 10){
                    now = Calendar.getInstance();
                    int m = now.get(Calendar.MINUTE);
                    int s = now.get(Calendar.SECOND);
                    if(s==0 && m==0) System.out.println("cuc cu-cuc cu-cuc cu");
                    else System.out.println("cuc cu");
                    try{
                        sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                    i++;
                }
            }
        };
        t.start();  
    }
}
