/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapfile.bai2;

/**
 *
 * @author 84362
 */
public class MaTranVuong {
    private int n;
    private int[][] a;

    public MaTranVuong(int n) {
        this.n = n;
        a = new int[n][n];
    }
    
    public void nhap(int[][] b){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = b[i][j];
            }
        }
    }
    
    public void xuat(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
