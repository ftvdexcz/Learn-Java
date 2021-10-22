/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThongKe;

/**
 *
 * @author 84362
 */
public class SinhVien {
    private String ma;
    private String hoten;
    private Boolean gioiTinh;
    private String nsinh;
    private Double diem;

    public SinhVien() {
    }

    public SinhVien(String ma, String hoten, Boolean gioiTinh, String nsinh, Double diem) {
        this.ma = ma;
        this.hoten = hoten;
        this.gioiTinh = gioiTinh;
        this.nsinh = nsinh;
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNsinh() {
        return nsinh;
    }
    
    public int getThangSinh(){
        String[] w = nsinh.split("/");
        return Integer.parseInt(w[1]);
    }

    public void setNsinh(String nsinh) {
        this.nsinh = nsinh;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }
    
    @Override
    public String toString(){
        return ma + " " + hoten + " " + ((gioiTinh)?"Nam":"Nữ") + " " + nsinh + " " + diem;
    }
}
