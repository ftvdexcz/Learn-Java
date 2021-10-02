/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap;
import java.util.Scanner;
/**
 *
 * @author 84362
 */
public class Bai6 {
    private double epsilon;
    private double x;
    
    public void nhapEpsilon(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số epsilon");
        epsilon = in.nextDouble();
    }
    
    public double pi(){
        double s=0;
        int i = 0,sig; 
        double tmp = 1.0/(2*i+1);
        while(tmp>=epsilon){
            sig = (i%2==0) ? 1 : -1;
            s += sig*tmp;
            i++;
            tmp=1.0/(2*i+1);
        }
        return s*4;
    }
    
    private double tinhSin(int i, double x){
        double res=1.0;
        for(int j = 1; j <= 2*i+1; j++){
            res=res*x/j;
        }
        return res;
    }
    
    private double tinhCos(int i, double x){
        double res=1.0;
        for(int j = 1; j <= 2*i; j++){
            res=res*x/j;
        }
        return res;
    }
    
    public double sinx(){
        double sinx=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số thực x");
        x = in.nextDouble();
        int i = 0; 
        double tmp = tinhSin(i, x);
        while(Math.abs(tmp)>epsilon){
            int sig=(i%2==0) ? 1 : -1;
            sinx+= sig*tmp;
            i++;
            tmp = tinhSin(i, x);
        }
        return sinx;
    }
    
    public double cosx(){
        double cosx=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số thực x");
        x = in.nextDouble();
        int i = 0; 
        double tmp = tinhCos(i,x);
        while(Math.abs(tmp)>epsilon){
            int sig=(i%2==0) ? 1 : -1;
            cosx+= sig*tmp;
            i++;
            tmp = tinhCos(i,x);
        }
        return cosx;
    }
    
    public double getEpsilon(){
        return epsilon;
    }
    
    public double getX(){
        return x;
    }
    
    public static void main(String[] args) {
        Bai6 b = new Bai6();
        b.nhapEpsilon();
        System.out.println("Giá trị của pi = " + b.pi() + " với epsilon = " + b.getEpsilon());
        System.out.println("Giá trị của sinx = " + b.sinx() + " với epsilon = " + b.getEpsilon() + " và x = " + b.getX());
        System.out.println("Giá trị của cosx = " + b.cosx() + " với epsilon = " + b.getEpsilon() + " và x = " + b.getX());
    }
}
