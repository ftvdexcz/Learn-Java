/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2.model;

/**
 *
 * @author NC
 */
public class QLMH {
    private MonHoc mh;
    private SinhVien sv;
    private String thoigian;

    public QLMH() {
    }

    public QLMH(MonHoc mh, SinhVien sv, String thoigian) {
        this.mh = mh;
        this.sv = sv;
        this.thoigian = thoigian;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }
    
    public Object[] toObject(){
        return new Object[]{
            mh.getMa(), mh.getTen(), sv.getMa(), sv.getTen(), thoigian
        };
    }
}
