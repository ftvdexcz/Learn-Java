/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

/**
 *
 * @author NC
 */
public class GiaoDichTienTe extends GiaoDich implements TinhGia{
    private double tiGia;
    private String loaiTien;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(String ma, String ngayGiaoDich, double gia, int soLuong, double tiGia, String loaiTien) {
        super(ma, ngayGiaoDich, gia, soLuong);
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    @Override
    public String toString() {
        return getMa() + "\t" + getNgayGiaoDich() + "\t" + getGia() + "\t" + getSoLuong() + "\t" + tiGia + "\t" + loaiTien;
    }

    @Override
    public double getGia() {
        if (loaiTien.equals("USD") || loaiTien.equals("EURO"))
            return getSoLuong()*super.getGia()*tiGia;
        else
            return getSoLuong()*super.getGia();
    }
    
    
}
