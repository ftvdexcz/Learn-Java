package deMinhHoa;

import java.util.Scanner;

public class MySquareMatrix {
    private int size;
    private int[][] matrix;
    
    public MySquareMatrix(){
        size=0;
    }

    public void enterMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập kích thước ma trận vuông A");
        size = in.nextInt();
        matrix = new int[size][size];
        System.out.println("Nhập các phần tử ma trận");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
    }

    // Tính tổng các hàng của ma trận 
    public void sumEachRow(){
        if(size==0){
            System.out.println("Bạn chưa nhập ma trận!");
            return;
        }
        for(int i = 0; i < size; i++){
            int s=0;
            for(int j = 0; j < size; j++) s+= matrix[i][j];
            System.out.println("Tổng hàng thứ " + (i+1) + " của ma trận A = " + s);
        }
    }

    public int getSize() {
        return size;
    }

    public int[][] getMatrix() {
        return matrix;
    }
    
    
    // Tính định thức của ma trận A: khai triển theo cột đầu tiên
    public int detMatrix(int matrix[][],int size){
        int s,sum=0;
        if(size==0){
            System.out.println("Bạn chưa nhập ma trận!");
            return -1;
        }
        if(size==1) return matrix[0][0];
        if(size==2)
            return (matrix[0][0]*matrix[1][1]-matrix[1][0]*matrix[0][1]);
        
        for(int k = 0; k < size; k++){
            int[][] res_matrix = new int[size][size];
            for(int i = 0; i < size; i++){
                for(int j = 1; j < size; j++){
                    if(i < k) res_matrix[i][j-1] = matrix[i][j];
                    else if(i > k) res_matrix[i-1][j-1] = matrix[i][j];
                }
            }
            
            if(k%2==0) s = 1;
            else s = -1;
            
            sum += matrix[k][0]*s*detMatrix(res_matrix, size-1);
        }
        return sum;
    }
}
