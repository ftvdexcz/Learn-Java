package Q2;

public class Oto extends PTGT{
    private String kieuDongCo;
    private int soChoNgoi;

    public Oto() {
    }

    public Oto(String ma, String hangSX, int namSX, double gia, String mau,
            String kieuDongCo, int soChoNgoi) {
        super(ma, hangSX, namSX, gia, mau);
        this.kieuDongCo = kieuDongCo;
        this.soChoNgoi = soChoNgoi;
    }

    

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }
    
    @Override
    public String toString(){
        return getMa() + "\t" + getHangSX() + "\t" + getNamSX() + "\t" + 
                getGia() + "\t" + getMau() + "\t" + kieuDongCo + "\t" + soChoNgoi;
    }
}
