/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapfile.bai1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 84362
 */
public class Main {
    public static void main(String[] args) {
        File f = new File("src/baitapfile/bai1/bai1.txt");
        Scanner in;
        try{
            in = new Scanner(f);
            int n = in.nextInt(), m = in.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            MaTranChuNhat m1 = new MaTranChuNhat(n, m);
            MaTranChuNhat m2 = new MaTranChuNhat(n, m);
            m1.nhapMaTran(a);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            m2.nhapMaTran(a);
            m1.xuat();
            m2.xuat();
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
