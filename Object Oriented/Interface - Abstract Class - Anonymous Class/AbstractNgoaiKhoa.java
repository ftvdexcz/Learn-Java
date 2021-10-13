package InterfaceAndAbstractClass;

public abstract class AbstractNgoaiKhoa{
    private int id;
    private String name;
    
    public AbstractNgoaiKhoa(){
        
    }
    
    public AbstractNgoaiKhoa(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   
    
    // abstract methods
    public abstract void truocNhapHoc();
    public abstract void tuanDau();
    
    @Override
    public String toString(){
        return "(" + id + ", " + name + ")";
    }
    
    public void test(){
        System.out.println("parent");
    }
}
