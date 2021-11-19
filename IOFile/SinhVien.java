/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mydemo;

import java.io.Serializable;

/**
 *
 * @author NC
 */
public class SinhVien implements Serializable{
    private int ma;
    private String ten;

    public SinhVien() {
    }

    public SinhVien(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
    public String toString(){
        return ma + " " + ten;
    }
}
