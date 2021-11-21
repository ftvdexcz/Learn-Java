/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapfile.bai1;

/**
 *
 * @author 84362
 */
public class MaTranChuNhat {
    private int n;
    private int m;
    private int[][] a;

    public MaTranChuNhat(int n, int m) {
        this.n = n;
        this.m = m;
        a = new int[n][m];
    }
    
    public void nhapMaTran(int b[][]){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = b[i][j];
            }
        }
    }
    
    public void xuat(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
