/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapfile.bai5;

/**
 *
 * @author 84362
 */
public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }
    
    public void nhan(PhanSo p){
        System.out.println(tu*p.getTu() + "/" + mau*p.getMau());
    }
}
