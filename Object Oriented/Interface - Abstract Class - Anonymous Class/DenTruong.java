package InterfaceAndAbstractClass;

public interface DenTruong{ // interface chỉ được kế thừa (extends) từ interface và cho phép đa kế thừa
    // các giá trị phải là hằng số/được khởi tạo
    // các phương thức chỉ được khai báo tên, không có thân 
    // chỉ cho phép 2 chế độ: public, default
    public int max=100;
    
    // các phương thức trong interface đều là abstract
    public void mang();
    public int takeMoney();
    
    // nếu có thân thì phải để keyword static 
    public static void ngayTet(){
        System.out.println("dau nam");
    }
    
    default void ngayPhuNu(){
        System.out.println("ngay 20/10");
    }
    
    // K có constructor
}
