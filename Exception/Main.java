package mainPackage;

import Model.SinhVien;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
//        SinhVien s=null;
//        try{
//            s = new SinhVien(-1, "long");
//        }catch(KhongRongException e){
//            System.out.println(e);
//        }catch(SoDuongException e){
//            System.out.println(e);
//        }
//        System.out.println(s);

        int ma=0;
        String ten="";
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try{
            // ma
            while(true){
                try{
                    System.out.println("ma:");
                    ma = Integer.parseInt(b.readLine());
                    if(ma<=0) throw new SoDuongException("ma khong am");
                    break;
                }catch(NumberFormatException e){
                    System.err.println(e);
                }catch(SoDuongException e){
                    System.err.println(e);
                }
            }
            
            while(true){
                try{
                    System.out.println("ten:");
                    ten = b.readLine();
                    if(ten.equals("")) throw new KhongRongException("ten khong de trong");
                    break;
                }catch(KhongRongException e){
                    System.err.println(e);
                }
            }
        }catch(IOException e){
            System.err.println(e);
        }
        
        SinhVien s = new SinhVien(ma, ten);
        System.out.println(s);
    }
}
