package deMinhHoa;
import java.util.Scanner;

// Chứa menu 

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       MyNumber number = new MyNumber();
       MyString str = new MyString();
       MySquareMatrix matrix = new MySquareMatrix();
       while(true){
           System.out.println("==================== MENU ====================");
           System.out.println("1.Nhập vào số nguyên n");
           System.out.println("2.Viết ra tổng s = 1+2+...+n");
           System.out.println("3.Đưa ra dãy số nguyên tố nhỏ hơn hoặc bằng n");
           System.out.println("4.Nhập vào một xâu");
           System.out.println("5.Đưa ra độ dài của xâu");
           System.out.println("6.Đưa ra số câu của xâu");
           System.out.println("7.Nhập vào một ma trận vuông A");
           System.out.println("8.Đưa ra tổng các hàng của ma trận A");
           System.out.println("9.Tính định thức của ma trận A");
           System.out.println("0.Thoát");
           System.out.println("==============================================");
           System.out.println("Bạn chọn");
           int luachon = Integer.parseInt(in.nextLine());
           switch(luachon){
               case 1: 
                   System.out.println("1.Nhập vào số nguyên n");
                   number.enterNumber();
                   break;
               case 2:
                   System.out.println("2.Viết ra tổng s = 1+2+...+n");
                   System.out.println(number.continousSum());
                   break;
               case 3:
                   System.out.println("3.Đưa ra dãy số nguyên tố nhỏ hơn hoặc bằng n");
                   number.primeLessThanOrEqual();
                   break;
               case 4:
                   System.out.println("4.Nhập vào một xâu");
                   str.enterString();
                   break;
               case 5:
                   System.out.println("5.Đưa ra độ dài của xâu");
                   System.out.println(str.getLength());
                   break;
               case 6:
                   System.out.println("6.Đưa ra số câu của xâu");
                   System.out.println(str.numOfParagraph());
                   break;
               case 7:
                   System.out.println("7.Nhập vào một ma trận vuông A");
                   matrix.enterMatrix();
                   break;
               case 8:
                   System.out.println("8.Đưa ra tổng các hàng của ma trận");
                   matrix.sumEachRow();
                   break;
                case 9:
                   System.out.println("9.Tính định thức của ma trận A");
                   System.out.println(matrix.detMatrix(matrix.getMatrix(), matrix.getSize()));
                   break;   
               case 0:
                   System.out.println("0.Thoát");
                   System.exit(0);
                   break;
               default:
                   System.out.println("Chọn từ 0->9");
           }
       }
    }
}
