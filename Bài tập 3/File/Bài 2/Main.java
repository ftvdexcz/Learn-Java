/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapfile.bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 84362
 */
public class Main {
    public static void main(String[] args) {
        File f = new File("src/baitapfile/bai2/bai2.txt");
        Scanner in;
        try{
            in = new Scanner(f);
            int n = in.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            MaTranVuong m = new MaTranVuong(n);
            m.nhap(a);
            m.xuat();
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
