package OOP;

// lớp Student kế thừa từ lớp Person 
public class Student extends Person{
    // 2 thuộc tính name và age được kế thừa từ Person: phải để protected để lớp con có thể truy cập
    // Các phương thức cũng được kế thừa 
    private String id; // thuộc tính id của riêng sinh viên
    
    public Student(){
        super(); // gọi hàm khởi tạo mặc định lớp Person bằng từ khóa super
    }
    
    public Student(String name, int age, String id){
        super(name,age);
        this.id=id;
    }
    
    // ghi đè phương thức speak()
    @Override
    public void speak(){
        super.speak(); // gọi hàm speak trong lớp cha bằng super
        System.out.println("My name is " + this.name + " and I'm " + this.age + " and ID = " + this.id);
    }
    
    // Phương thức của riêng Student 
    public void doExam(){
        System.out.println("Doing Exam...");
    }
}
