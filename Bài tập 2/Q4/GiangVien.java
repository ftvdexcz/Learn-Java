package Q4;

public class GiangVien {
    private String maGiangVien;
    private String tenGiangVien;
    private String email;
    private String hocHam;
    private String hocVi;
    private String diaChi;
    private int dienThoai;
    private double soGioGiangDay;
    private double luong;
    private double heSo;

    public GiangVien() {
    }

    public GiangVien(String maGiangVien, String tenGiangVien, String email, String hocHam, String hocVi,
            String diaChi, int dienThoai, double soGioGiangDay) {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
        this.email = email;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.soGioGiangDay = soGioGiangDay;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(int dienThoai) {
        this.dienThoai = dienThoai;
    }

    public double getSoGioGiangDay() {
        return soGioGiangDay;
    }

    public void setSoGioGiangDay(double soGioGiangDay) {
        this.soGioGiangDay = soGioGiangDay;
    }
    
    public double getLuong(){
        return luong;
    }

    public double getHeSo(){
        if(getHocVi().equalsIgnoreCase("dai hoc"))
            heSo = 1;
        else if(getHocVi().equalsIgnoreCase("thac si"))
            heSo = 1.1;
        else
            heSo = 1.2;
        
        if(getHocHam().equalsIgnoreCase("giao su"))
            heSo += 0.2;
        else if(getHocHam().equalsIgnoreCase("pho giao su"))
            heSo += 0.1;
        return heSo;
    }  
}
