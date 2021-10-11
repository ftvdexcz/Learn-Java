/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayObj;

/**
 *
 * @author 84362
 */
public class TaiLieu {
    private int ma;
    private String ten;
    private String tacGia;
    private double gia;
    
    public TaiLieu(){
        
    }

    public TaiLieu(int ma, String ten, String tacGia, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.tacGia = tacGia;
        this.gia = gia;
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

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
}
