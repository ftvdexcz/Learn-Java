package de1.model;

import java.io.Serializable;

public class BanDoc implements Serializable{
    private int ma;
    private String hoTen, diaChi, sdt;
    
    private static int sma=10000;

    public BanDoc() {
    }

    public BanDoc(int ma, String hoTen, String diaChi, String sdt) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        BanDoc.sma = sma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, hoTen, diaChi, sdt
        };
    }
}
