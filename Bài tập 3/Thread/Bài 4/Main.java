package bai4;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                String line="Học viện công nghệ bưu chính viễn thông-khoa cntt 1";
                while(true){
                    // sang phai
//                    line = line.charAt(line.length()-1) + line.substring(0,line.length()-1);
                    // sang trai
                    line = line.substring(1,line.length()-1)+line.charAt(0);
                    System.out.println("\33[31m"+line);
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
