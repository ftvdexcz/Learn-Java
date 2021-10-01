package project1;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Bai3 {
    private int m;
    private int n;
    
    public void enter2_Number(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập hai số nguyên m và n");
        m = in.nextInt();
        n = in.nextInt();
    }
    
    public int gcd(){
        int a = m, b = n;
        while(a!=b){
            if(a>b) a-=b;
            else b-=a;
        }
        return a;
    }
    
    public long lcm(){
        return (long)m/gcd()*n;
    }
    
    private boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return true;
    }
    
    public void showPrime(){
        for(int i = m; i <= n; i++)
               if(isPrime(i)) 
                   System.out.print(i + " ");
        System.out.println();
    }
    
    public void showReversible(){
        for(int i = m; i <= n; i++){
            StringBuilder s = new StringBuilder(Integer.toString(i));
            if(s.toString().equals(s.reverse().toString()))
                System.out.print(i + " ");
        }   
        System.out.println();
    }
    
    public static void main(String[] args) {
        Bai3 b = new Bai3();
        b.enter2_Number();
        System.out.println(b.gcd());
        System.out.println(b.lcm());
        b.showPrime();
        b.showReversible();
    }
}
