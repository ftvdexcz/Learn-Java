/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapfile.bai4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 84362
 */
public class Main {
    public static void main(String[] args) {
        File f = new File("src/baitapfile/bai4/bai4.txt");
        Scanner in;
        try{
            in = new Scanner(f);
            int n;
            String s;
            n = Integer.parseInt(in.nextLine());
            s = in.nextLine();
            DaThuc d1 = new DaThuc(n);
            d1.nhap(s);
            n = Integer.parseInt(in.nextLine());
            s = in.nextLine();
            DaThuc d2 = new DaThuc(n);
            d2.nhap(s);
            d1.xuat(); d2.xuat();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
