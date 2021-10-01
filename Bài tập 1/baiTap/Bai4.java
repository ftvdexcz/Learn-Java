package project1;
import java.util.Scanner;
public class Bai4 {
    private double a;
    private double b;
    private double c;
    
    public void enter(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập 3 số thực a b c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
    }
    
    // ax^2+bx+c=0
    public void solveQuadraticEquation(){ 
       if(a==0){
           if(b != 0)
               System.out.println(-c/b);
           else if(c == 0)
               System.out.println("Vô số nghiệm");
           else
               System.out.println("Vô nghiệm");
           return;
       }
       double d = b*b-4*a*c;
       if(d < 0) System.out.println("Vô nghiệm");
       else if(d == 0) System.out.println("Nghiệm kép = " + (-b/(2*a)));
       else{
           System.out.println("Nghiệm x1 = " + ((-b+Math.sqrt(d))/(2*a)));
           System.out.println("Nghiệm x2 = " + ((-b-Math.sqrt(d))/(2*a)));
       }
    }
    
    // S tam giác
    public double triangleArea(){
        if(a+b>c&&a+c>b&&b+c>a){
            double p = (a+b+c)/2;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }else{
            System.out.println("Không tồn tại tam giác!");
            return -1;
        }
    }
    
    // S hình hộp = Sxq + S2đáy
    public double rectangularArea(){
        return 2*a*(b+c) + 2*b*c;
    }
    
    // P hình hộp = 4(a+b+c)
    public double rectangularPerimeter(){
        return 4*(a+b+c);
    }
    
    public static void main(String[] args) {
        Bai4 b = new Bai4();
        b.enter();
        b.solveQuadraticEquation();
        double s = b.triangleArea();
        if(s!=-1)
            System.out.println(s);
        System.out.println(b.rectangularArea());
        System.out.println(b.rectangularPerimeter());
    }
}
