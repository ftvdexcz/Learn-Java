package Q4;

public class GiangVienThinhGiang extends GiangVien implements TinhLuong{
    private String coQuan;

    public GiangVienThinhGiang() {
    }

    public GiangVienThinhGiang(String maGiangVien, String tenGiangVien, String email, String hocHam, 
            String hocVi, String diaChi, int dienThoai, double soGioGiangDay, String coQuan) {
        super(maGiangVien, tenGiangVien, email, hocHam, hocVi, diaChi, dienThoai, soGioGiangDay);
        this.coQuan = coQuan;
    }

    public String getCoQuan() {
        return coQuan;
    }

    public void setCoQuan(String coQuan) {
        this.coQuan = coQuan;
    }
    
    public String toString(){
        return getMaGiangVien() + "\t" + getTenGiangVien() + "\t" + getEmail() + "\t" + getHocHam() + "\t" + 
               getHocVi() + "\t" + getDiaChi() + "\t" + getDienThoai() + "\t" + getSoGioGiangDay() + "\t" + coQuan + "\t" + getLuong() + "\t" + getHeSo();
    }

    @Override
    public double getLuong(){
        return getHeSo()*getSoGioGiangDay()*200000;
    }
}
