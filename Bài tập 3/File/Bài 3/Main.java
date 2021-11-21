/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapfile.bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 84362
 */
public class Main {
    public static void main(String[] args) {
        File f = new File("src/baitapfile/bai3/bai3.txt");
        Scanner in;
        try{
            in = new Scanner(f);
            List<Integer> list = new ArrayList<>();
            String line = in.nextLine();
            String[] w = line.split("\\s+");
            for(String s: w){
                list.add(Integer.parseInt(s));
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
