package Q2;

public class XeTai extends PTGT{
    private double trongTai;

    public XeTai() {
    }

    public XeTai(String ma, String hangSX, int namSX, double gia, String mau, double trongTai) {
        super(ma, hangSX, namSX, gia, mau);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
    
    @Override
    public String toString(){
        return getMa() + "\t" + getHangSX() + "\t" + getNamSX() + "\t" + 
                getGia() + "\t" + getMau() + "\t" + trongTai;
    }
}
