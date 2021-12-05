/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de40.model;

import java.io.Serializable;

public class QLBanHang implements Serializable{
    private DichVu dv;
    private NhanVien nv;
    private int soluong;

    public QLBanHang() {
    }

    public QLBanHang(DichVu dv, NhanVien nv, int soluong) {
        this.dv = dv;
        this.nv = nv;
        this.soluong = soluong;
    }

    public DichVu getDv() {
        return dv;
    }

    public void setDv(DichVu dv) {
        this.dv = dv;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public String getMaTen(){
        return nv.getMa() + "\t" + nv.getTen();
    }
    
    public double getLoiNhuan(){
        return 0.02*(dv.getGiacuoc()-dv.getChiphi())*soluong;
    }
    
    public Object[] toObject(){
        return new Object[]{
            dv.getMa(), dv.getTen(), nv.getMa(), nv.getTen(), soluong
        };
    }
}
