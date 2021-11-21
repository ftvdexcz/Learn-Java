/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapfile.bai5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 84362
 */
public class Main {
    public static void main(String[] args) {
        File f = new File("src/baitapfile/bai5/bai5.txt");
        Scanner in;
        try{
            in = new Scanner(f);
            int tu, mau;
            tu = in.nextInt();
            mau = in.nextInt();
            PhanSo p1 = new PhanSo(tu, mau);
            
            tu = in.nextInt();
            mau = in.nextInt();
            PhanSo p2 = new PhanSo(tu, mau);
            
            tu = in.nextInt();
            mau = in.nextInt();
            PhanSo p3 = new PhanSo(tu, mau);
            p1.nhan(p2);
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
