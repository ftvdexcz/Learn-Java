package project1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {

    private int n;
    private int[] list;

    public Bai5() {
        n = 0;
    }

    public void enterList() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của dãy số");
        n = in.nextInt();
        list = new int[n];
        System.out.println("Nhập dãy số");
        for (int i = 0; i < n; i++) {
            list[i] = in.nextInt();
        }
    }

    public int sum() {
        int s = 0;
        for (int i : list) {
            s += i;
        }
        return s;
    }

    public double average() {
        return sum() / n;
    }

    public int max() {
        int m = list[0];
        for (int i = 1; i < n; i++) {
            if (m < list[i]) {
                m = list[i];
            }
        }
        return m;
    }

    public int min() {
        int m = list[0];
        for (int i = 1; i < n; i++) {
            if (m > list[i]) {
                m = list[i];
            }
        }
        return m;
    }
    
    private boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return true;
    }
    
    public void showPrime(){
        System.out.println("Các số nguyên tố trong dãy số là");
        for(int i = 0; i < n; i++)
            if(isPrime(list[i])) 
                System.out.print(list[i] + " ");
        System.out.println();
    }
    
    public int[] sort(boolean reverse){
        int[] a = list.clone();
        if(reverse==false){
            int min_idx = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    min_idx = i;
                    if (a[min_idx] > a[j]) {
                        min_idx = j;
                    }
                }
                int tmp = a[i];
                a[i] = a[min_idx];
                a[min_idx] = tmp;
            }
        }else{
            int max_idx = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    max_idx = i;
                    if (a[max_idx] < a[j]) {
                        max_idx = j;
                    }
                }
                int tmp = a[i];
                a[i] = a[max_idx];
                a[max_idx] = tmp;
            }
        }
        return a;
    }
    
    public boolean checkSorted(){
        if(Arrays.equals(list, sort(true)) || Arrays.equals(list, sort(false)))
            return true;
        return false;
    }
    
    public boolean reversibleArray(){
        for(int i = 0; i <= n/2; i++){
            if(list[i] != list[n-i-1]) return false;
        }
        return true;
    }
    
    public void frequencyEachElement(){
        int[] fre = new int[n];
        Arrays.fill(fre, 1);
        for(int i = 0; i < n-1; i++){
            if(fre[i]==1){
                for(int j = i+1; j < n; j++){
                    if(list[i]==list[j]){
                        fre[j]=-1;
                        fre[i]++;
                    }
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            if(fre[i]!=-1){
                System.out.println("Số lần xuất hiện của " + list[i] + " là: " + fre[i]);
            }
        }
    }
    
    public int balancePoint(){
        int l=0,r=0,i;
            for(i = 0; i < n; i++){
                r+=list[i];
            }
            r-=list[0]; i=0;
            while(l!=r){
                i++;
                if(i==n) break;
                l+=list[i-1]; r-=list[i];
            }  
            if(l==r)
                return i+1;
            else
                return -1;
    }
    
    public static void main(String[] args){
        Bai5 b = new Bai5();
        b.enterList();
        System.out.println("sum = " + b.sum());
        System.out.println("average = " + b.average());
        System.out.println("max = " + b.max());
        System.out.println("min = " + b.min());
        b.showPrime();
        Arrays.toString(b.sort(true));
        Arrays.toString(b.sort(false));
        System.out.println("Dãy số đã sắp xếp? : " + b.checkSorted());
        System.out.println("Dãy số đối xứng? : " + b.reversibleArray());
        b.frequencyEachElement();
        int idx = b.balancePoint();
        if(idx==-1)
            System.out.println("Không có điểm cân bằng");
        else
            System.out.println("Điểm cân bằng tại vị trí thứ: " + idx);
        
    }
}
