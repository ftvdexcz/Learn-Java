/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapfile.bai4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 84362
 */
public class DaThuc {
    private int n;
    private List<Double> list;

    public DaThuc(int n) {
        this.n = n;
        list = new ArrayList<>();
    }
    
    public void nhap(String s){
        String[] w = s.split("\\s+");
        for (int i = 0; i <= n; i++) {
            list.add(Double.parseDouble(w[i]));
        }
    }
    
    public void xuat(){
        for(Double d:list){
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
