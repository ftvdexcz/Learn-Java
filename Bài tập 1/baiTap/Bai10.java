package baiTap;
import java.util.Scanner;

public class Bai10 {
    private int n;
    private int[][] arr;
    
    public void enter(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập kích thước của ma trận");
        n = in.nextInt();
        System.out.println("Nhập ma trận");
        arr = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = in.nextInt();
    }
    
    public int hangCoTongLonNhat(){
        int s=0, idx=0;
        for(int i = 0; i < n; i++){
            int tmp=0;
            for(int j = 0; j < n; j++){
                tmp += arr[i][j];
            }
            if(tmp>s){
                s=tmp;
                idx=i;        
            }
        }
        return idx+1;
    }
    
    public int cotCoTongLonNhat(){
        int s=0, idx=0;
        for(int i = 0; i < n; i++){
            int tmp=0;
            for(int j = 0; j < n; j++){
                tmp+=arr[j][i];
            }
            if(tmp>s){
                s=tmp;
                idx=i;        
            }
        }
        return idx+1;
    }
    
    public int[][] arrT(){
        int[][] arrT = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arrT[i][j] = arr[j][i];
            }
        }
        return arrT;
    }
    
    public boolean symmetryMatrix(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(arr[i][j]!=arr[j][i]) return false;
            }
        }
        return true;
    }
    
    public int[][] getArr(){
        return arr;
    }
    
    public int getN(){
        return n;
    }
    
    public int detA(int arr[][], int n){
        if(n==0){
            System.out.println("Bạn chưa nhập ma trận");
            return -1;
        }
        
        if(n==1) return arr[0][0];
        if(n==2) return arr[0][0]*arr[1][1]-arr[1][0]*arr[0][1];
        
        int s=0, sig;
        for(int k = 0; k < n; k++){
            int[][] newMatrix = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 1; j < n; j++){
                    if(i<k) newMatrix[i][j-1] = arr[i][j];
                    else if(i>k) newMatrix[i-1][j-1] = arr[i][j];
                }
            }
            
            if(k%2==0) sig=1;
            else sig=-1;
            s+=arr[k][0]*sig*detA(newMatrix,n-1);
        }
        return s;
    }
    
}
