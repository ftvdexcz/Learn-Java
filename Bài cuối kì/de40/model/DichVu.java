package de40.model;

import java.io.Serializable;

public class DichVu implements Serializable{
    private int ma;
    private String ten,nhom;
    private double chiphi,giacuoc;
    private static int sma=1000;

    public DichVu() {
    }

    public DichVu(int ma,String ten, String nhom, double chiphi, double giacuoc) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.chiphi = chiphi;
        this.giacuoc = giacuoc;
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

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public double getChiphi() {
        return chiphi;
    }

    public void setChiphi(double chiphi) {
        this.chiphi = chiphi;
    }

    public double getGiacuoc() {
        return giacuoc;
    }

    public void setGiacuoc(double giacuoc) {
        this.giacuoc = giacuoc;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        DichVu.sma = sma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma,ten,nhom,chiphi,giacuoc
        };
    }
}
