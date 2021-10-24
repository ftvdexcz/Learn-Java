package Q2;

public class XeMay extends PTGT{
    private double congSuat;

    public XeMay() {
    }

    public XeMay(String ma, String hangSX, int namSX, double gia, String mau,double congSuat) {
        super(ma, hangSX, namSX, gia, mau);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    
    @Override
    public String toString(){
        return getMa() + "\t" + getHangSX() + "\t" + getNamSX() + "\t" + 
                getGia() + "\t" + getMau() + "\t" +  congSuat;
    }
}
