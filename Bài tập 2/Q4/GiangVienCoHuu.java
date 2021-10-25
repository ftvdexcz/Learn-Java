package Q4;

public class GiangVienCoHuu extends GiangVien implements TinhLuong{
    private double luongCung;
    static final double soGioQuyDinh = 40;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(double luongCung, String maGiangVien, 
            String tenGiangVien, String email, String hocHam, String hocVi, String diaChi, 
            int dienThoai, double soGioGiangDay) {
        super(maGiangVien, tenGiangVien, email, hocHam, hocVi, diaChi, dienThoai, soGioGiangDay);
        this.luongCung = luongCung;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }
    
    @Override
    public String toString(){
        return getMaGiangVien() + "\t" + getTenGiangVien() + "\t" + getEmail() + "\t" + getHocHam() + "\t" + 
               getHocVi() + "\t" + getDiaChi() + "\t" + getDienThoai() + "\t" + getSoGioGiangDay() + "\t" + luongCung + "\t" + getLuong() + "\t" + getHeSo();
    }

    @Override
    public double getLuong() {
        return luongCung*getHeSo() + (getSoGioGiangDay()-soGioQuyDinh)*50000;
    }
}
