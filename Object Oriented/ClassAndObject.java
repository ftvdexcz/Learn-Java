package OOP;

public class ClassAndObject {

    public static void main(String[] args) {
        // Sử dụng class Person trong Person.java
        // Các class đều là con của class Object: java.lang.Object

        // Tạo đối tượng Person bằng hàm khởi tạo 2 tham số
        Person p = new Person("Long", 20);
        p.speak(); // Gọi phương thức speak()
        System.out.println(p.getAge()); // phương thức get
        System.out.println(p.toString());
        System.out.println("---------------------------");
        // Minh họa kế thừa  
        Student s = new Student();
        s.speak(); // speak kế thừa từ Person nếu như trong Student chưa ghi đè speak
        Student s1 = new Student("A", 29, "B19");
        s1.speak();
        System.out.println("---------------------------");
        // Upcasting: Tham chiếu 1 biến kiểu lớp cha đến 1 biến lớp con, có thể ép kiểu ngầm định và tường minh
        Person p1 = new Student();
        Person p2 = s1; // ngầm định 
        Person p3 = (Person) s1; // tường minh
        p1.speak();
        p2.speak();
        // p1.doExam(); // Không thể gọi do upcasting chỉ cho phép gọi đến những phương thức lớp cha

        // Downcasting: Tham chiếu 1 biến kiểu lớp con đến 1 biến lớp cha, chỉ cho phép ép kiểu tường minh
        /* Ở trong ví dụ trên: Person p1 = new Student(); thì biến p1 có thể gọi đến
        những phương thức đã ghi đè của lớp Person tại lớp Student. Tuy nhiên khi gọi 
        phương thức của lớp Student thì không được. Khi đó cần downcasting */
        Student s2 = (Student) p1; // downcasting 
        s2.doExam(); // doExam là phương thức chỉ có ở Student và đã gọi được nhờ cơ chế downcasting

        /*Ta thấy, doExam() là phương thức chỉ có ở lớp Student. Tuy nhiên, thông qua downcasting ta hoàn toàn 
        có thể gọi ra phương thức đó thông qua đối tượng s2 mà không cần new Studet() bằng việc downcasting 
        đối tượng p1 có kiểu Person mà không xảy ra vấn đề trong quá trình biên dịch và thực thi.*/
        
        /*Tuy nhiên code trên vẫn gặp vấn đề khi p1 không phải là đối tượng thể hiện của kiểu dữ liệu Student, 
        thay vào đó code này sẽ chính xác hơn
        */
        if (p1 instanceof Student){
            Student s3 = (Student) p1;
            s3.doExam(); // thực hiện thành công vì p1 đúng là thể hiện của Student 
        }
        // Giả sử ta kiểm tra 1 đối tượng thể hiện của lớp Teacher
        Person teacher = new Teacher();
        if (teacher instanceof Student){
            Student s3 = (Student) p1;
            s3.doExam(); // không thực hiện được vì teacher không phải thể hiện của Student 
        }
        
        
        
    }
}
