/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import mainPackage.KhongRongException;
import mainPackage.SoDuongException;

/**
 *
 * @author NC
 */
public class SinhVien {
    private int ma;
    private String ten;

    public SinhVien() {
    }

    public SinhVien(int ma, String ten)  {
//        if(ten.equals("")) throw new KhongRongException("ten khong de trong");
//        if(ma <= 0) throw new SoDuongException("Ma la so duong");
        this.ma = ma;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten;
    }
}
