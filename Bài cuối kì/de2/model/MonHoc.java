package de2.model;

import java.io.Serializable;

public class MonHoc implements Serializable{
    private String ten, loaiMH;
    private int ma, tongso;
    private static int sma=100;

    public MonHoc() {
    }

    public MonHoc(String ten, String loaiMH, int ma, int tongso) {
        this.ten = ten;
        this.loaiMH = loaiMH;
        this.ma = ma;
        this.tongso = tongso;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoaiMH() {
        return loaiMH;
    }

    public void setLoaiMH(String loaiMH) {
        this.loaiMH = loaiMH;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getTongso() {
        return tongso;
    }

    public void setTongso(int tongso) {
        this.tongso = tongso;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MonHoc.sma = sma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, ten, tongso, loaiMH
        };
    }
}
