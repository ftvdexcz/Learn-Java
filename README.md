# <i>Learn Java</i>
<h1>1. Java Basic</h1>

<h2>Variable</h2> 
Quy tắc đặt tên biến giống trong C: chỉ gồm chữ cái, chữ số, _, $. Có phân biệt chữ hoa thường và không bắt đầu bằng số

<h2>Data Types</h2> 
- Các kiểu dữ liệu nguyên thủy
<ul>
  <li>int</li>
  <li>float</li>
  <li>double</li>
  <li>boolean</li>
  <li>char</li>
  <li>byte</li>
  <li>short</li>
</ul>
- Kiểu dữ liệu đối tượng 

<h2>Pass by value and Pass by reference</h2>
Tham chiếu và tham trị

* Cần lưu ý giữa việc truyền giá trị vào hàm làm thay đổi giá trị đó (tham trị) và thay đổi thuộc tính class (tham chiếu)

```
public class Foo {
    int value = 10;
    Foo(){
    };
    // truyền value vào và chỉ thay đổi value trong hàm (không thay đổi gì bên ngoài => tham trị. Cái này giống C) 
    void change(int value) {
        value += 10; // nếu ở đây thay bằng this.value thì hiểu là thuộc tính đối tượng => value thay đổi giá trị, ví dụ dưới sẽ thấy) 
    }
    public static void main(String args[]) {
        Foo obj = new Foo();
        System.out.println("Trước khi thay đổi: " + obj.value); // 10
        obj.change(10);
        System.out.println("Sau khi thay đổi: " + obj.value); // 10
    }
}
```

```
public class Person {
    private String Name;
    private int Age;
    public Person(String name) {
        this.Name = name;
    }
    // từ khóa this.Age là thay đổi thuộc tính của đối tượng hiện tại
    public void setAge(int age) {
        this.Age = age;
    }
    public int getAge() {
        return this.Age;
    }
}
public class MyClass {
    public static void main(String[] args) {
        Person person = new Person("John");
        person.setAge(20);
        celebrateBirthday(j);
        System.out.println(person.getAge()); // 21
    }
    static void celebrateBirthday(Person p) {
        p.setAge(p.getAge() + 1);
    }
}
```

<h2>Assign Variable</h2>
Gán kiểu dữ liệu nguyên thủy: tạo ra bản sao 

```
int x = 7;
int y = x;
y = 5; // y = x = 5
System.out.println(x); // 5
System.out.println(y); // 5
```

Gán kiểu dữ liệu đối tượng: gán 2 object cho nhau thì thay đổi object này cũng ảnh hưởng tới object kia 
```
int x[] = {1,2,3,4}
int y[] = x; 
x[0] = 11; // y = x = {11,2,3,4} do gán 2 đối tượng thì thay đổi x cũng làm thay đổi y
x = new int[2]; // x = {0,0} , y = {11,2,3,4} do x được cấp phát mới nên không ảnh hưởng đến y nữa 
```

<h2>Type Casting</h2>
- byte->short->int->long->float->double chuyển đổi ngầm định (implicit)
- double->float->long->int->short->byte chuyển đổi tường minh (explicit) 

<h2>If else condition, loop control, operators</h2>
Cú pháp giống hệt trong C 

<h2>Array, list</h2>
- Mảng trong java cần biết trước số lượng phần tử khi khởi tạo (mảng tĩnh): type[] name = new type[array_size];
- Lặp mảng (for each): for(type var: array) // do something 

<h2>Wrapper Class</h2> 
Java cung cấp cơ chế để chuyển đổi giữa kiểu dữ liệu nguyên thủy (primitive variable) thành đối tượng (object) và ngược lại gọi là wrapper: 

Kiểu nguyên thủy -> wrapper (autoboxing) | wapper -> Kiểu nguyên thủy (autounboxing)

<table>
  <tr>
    <th>Kiểu nguyên thủy</th>
    <th>Kiểu Wrapper</th>
  </tr>
  <tr>
    <td>boolean</td>
    <td>Boolean</td>
  </tr>
  <tr>
    <td>int</td>
    <td>Integer</td>
  </tr>
  <tr>
    <td>float</td>
    <td>Float</td>
  </tr>
  <tr>
    <td>double</td>
    <td>Double</td>
  </tr>
  <tr>
    <td>char</td>
    <td>Character</td>
  </tr>
  <tr>
    <td>long</td>
    <td>Long</td>
  </tr>
  <tr>
    <td>byte</td>
    <td>Byte</td>
  </tr>
  <tr>
    <td>short</td>
    <td>Short</td>
  </tr>
</table>

<h2>Kiểu dữ liệu String</h2>
String methods: https://www.tutorialspoint.com/java/java_strings.html
- Khi làm việc với dữ liệu kiểu text trong Java cung cấp 3 class String, StringBuffer và StringBuilder.
- Cơ bản về 3 class này như sau:
<ul>
  <li>String là không thể thay đổi (immutable), và không cho phép có class con.</li>
  <li>StringBuffer, StringBuilder có thể thay đổi (mutable)</li>
  <li>StringBuilder và StringBuffer là giống nhau, nó chỉ khác biệt tình huống sử dụng có liên quan tới đa luồng (Multi Thread). => về tốc độ xử lý StringBuilder là tốt nhất,     sau đó StringBuffer và cuối cùng mới là String.</li>
</ul>
- Ngoài ra còn có StringTokenizer để tách các từ trong String

<h2>Regex</h2>
<table>
  <tr>
    <th>Modifier</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>^</td>
    <td>Bắt đầu kiểm tra từ đầu chuỗi</td>
  </tr>
  <tr>
    <td>$</td>
    <td>Bắt đầu kiểm tra cuối chuỗi</td>
  </tr>
  <tr>
    <td>[]</td>
    <td>Kiểm tra các kí tự có trong tập</td>
  </tr>
  <tr>
    <td>[^]</td>
    <td>Kiểm tra các kí tự không có trong tập</td>
  </tr>
  <tr>
    <td>\w</td>
    <td>Kiểm tra số và chữ và gạch chân</td>
  </tr>
  <tr>
    <td>\d</td>
    <td>Kiểm tra số</td>
  </tr>
  <tr>
    <td>\s</td>
    <td>Kiểm tra space</td>
  </tr>
  <tr>
    <td>?</td>
    <td>Có 1 hoặc 0</td>
  </tr>
  <tr>
    <td>*</td>
    <td>Có 0 hoặc nhiều</td>
  </tr>
  <tr>
    <td>+</td>
    <td>Có 1 hoặc nhiều</td>
  </tr>
  <tr>
    <td>()</td>
    <td>Kiểm tra chuỗi kí tụ trong dấu ngoặc</td>
  </tr>
  <tr>
    <td>{n}</td>
    <td>Có n phần tử</td>
  </tr>
  <tr>
    <td>{n,m}</td>
    <td>Có ít nhất n và nhiều nhất m phần tử</td>
  </tr>
</table>

VD: Kiểm tra mã sv PTIT 
```
import java.util.regex.Pattern;

input = "B19DCCN386";
String regex = "^[Bb]{1}\\d{2}[A-Za-z]{4}\\d{3}$";

Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(input);
if(matcher.find())
  System.out.println("True");
```  

Lưu ý 2 cách viết sau
```
String text1 = "Hello java regex2-12-2018, hello world 12/12/2018";
        String regex = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text1);
        
        if(matcher.find()) 
            System.out.println("TRUE"); // có in bởi text1 có chứa chuỗi dạng regex. Nếu bắt chặt đk regex = "^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$" thì giống code dưới
        
        if(text1.matches(regex))
            System.out.println("TRUE"); // không in bởi text1 phải có dạng regex
```
  
<h2>Một số class hay sử dụng trong Java</h2>
<ol>
  <li>java.lang.String</li>
  <li>java.lang.System</li>
  <li>java.lang.Exception</li>
  <li>java.util.ArrayList</li>
  <li>java.util.HashMap</li>
  <li>java.lang.Object</li>
  <li>java.lang.Thread</li>
  <li>java.util.Collections</li>
  <li>java.util.Scanner</li>
  <li>java.math.BigInteger (java.lang.Object -> java.lang.Number -> java.lang.BigInteger)</li>
</ol>

<h1>2. Java Object Oriented</h1>
<h2>OOP Concept: 4 tính chất gồm đóng gói dữ liệu (encapsulation), kế thừa (inheritance), đa hình (polymorphism), trừu tượng (abstract)</h2>

Tính đóng gói dữ liệu: 
<ul>
  <li>class = data (fields/properties) + methods</li>
  <li>Dữ liệu phải được che đi, chỉ cho truy cập bằng đối tượng của lớp: đặt private hoặc protected cho thuộc tính</li>
  <li>Toàn bộ truy cập phải thông qua methods</li>
  <li>Có 1 hàm tạo (constructor)</li>
</ul>

Tính kế thừa:
<ul>
  <li>Cho phép kế thừa những thuộc tính và phương thức từ 1 lớp (lớp cha và lớp con)</li>
  <li>Thuộc tính để protected cho phép lớp con có thể truy cập đến thuộc tính lớp cha</li>
  <li>Từ khóa super cho phép truy cập phương thức lớp cha</li>
  <li>Upcasting: Biến lớp cha tham chiếu tới biến lớp con, lưu ý: Với cơ chế upcasting, đối tượng không thể gọi phương thức của riêng lớp con. Nếu 1
  phương thức bị ghi đè thì khi gọi nó sẽ gọi đến phương thức ở lớp con</li>
  <li>Downcasting: Biến lớp con tham chiếu tới biến lớp cha để biến đó có thể truy cập phương thức lớp con mà không cần tạo ra đối tượng mới bằng new class()</li>
</ul>

Tính đa hình:
<ul>
  <li>Ghi đè (Overriding) Một phương thức lớp cha có thể bị ghi đè bởi 1 phương thức cùng tên trong lớp con</li>
  <li>Nạp chồng (Overloading) Có thể có nhiều phương thức giống tên nhau nhưng khác về đối số</li>
</ul>

<h2>Access Modifier</h2>
Chỉ dùng private, protected cho member của class hoặc interface, Có thể dùng 2 chế độ còn lại cho tất cả (class/interface/member)

all > subclass-outside package > same package > class only
- public: all
- protected: subclass-outside package
- default: same package
- private: class only

<i> Lưu ý: lớp con phải có chế độ "mở" hơn lớp cha </i>

<h2>final and static keyword</h2>

final: 
<ul>
  <li>final class: không thể có lớp con (không cho kế thừa)</li>
  <li>final data: constant</li>
  <li>final method: can't be overridden</li>
</ul> 

static: 
<ul>
  <li>static để chỉ có thể truy cập từ lớp, không của riêng đối tượng nào</li>
  <li>static method: chỉ có thể truy cập static data, không được truy cập biến của đối tượng </li>
  <li>không được dùng keyword this</li>
</ul>

VD: kết hợp static và final định nghĩa 1 hằng số
```
static final double PI = 3.1415;
```

<h2>Outer Inner class</h2>
VD: 

```
class CPU {
    double price;
    // nested class
    class Processor{

        // members of nested class
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    // nested protected class
    protected class RAM{

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // create object of Outer class CPU
        CPU cpu = new CPU();

       // create an object of inner class Processor using outer class
        CPU.Processor processor = cpu.new Processor();

        // create an object of inner class RAM using outer class CPU
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}
```

Access member của outer class ở trong inner class 

```
class Car {
    String carName;
    String carType;

    // assign values using constructor
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    // private method
    private String getCarName() {
        return this.carName;
    }

// inner class
    class Engine {
        String engineType;
        void setEngine() {

           // Accessing the carType property of Car
            if(Car.this.carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if(Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }

            }else{
                this.engineType = "Bigger";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
    }
}

public class Main {
    public static void main(String[] args) {

// create an object of the outer class Car
        Car car1 = new Car("Mazda", "8WD");

        // create an object of inner class using the outer class
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());

        Car car2 = new Car("Crysler", "4WD");
        Car.Engine c2engine = car2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
    }
}
```

<h2>Abstract Class</h2>

 Không thể tạo đối tượng bằng từ khóa new với abstract class

```
// create an abstract class
abstract class Language {
  // fields and methods
}
...

// try to create an object Language
// throws an error
Language obj = new Language(); 
```

Giống class vì có thể chứa các methods (kể cả constructor) và giống interface vì có bao gồm abstract class (phải có từ khóa abstract, không được để trống giống interface)

```
abstract class Language {

  // abstract method: method doesn't have it's body 
  abstract void method1();

  // regular method
  void method2() {
    System.out.println("This is regular method");
  }
}
```

abstract method phải được chứa trong abstract class, không thì sẽ lỗi 

```
// error
// class should be abstract
class Language {

  // abstract method
  abstract void method1();
}
```

abstract class cũng cho phép extends (kế thừa) 1 class và ngược lại

```
// Ví dụ tạo 1 class kế thừa abstract class và tạo 1 đối tượng của lớp con (Các quy tắc vẫn giống như upcasting: nếu ở lớp con có phương thức 
// ghi đè thì sẽ gọi đến phương thức ghi đè (display() nếu có)

public abstract class Language {

  // method of abstract class
  public void display() {
    System.out.println("This is Java Programming");
  }
}

class Main extends Language {

  public static void main(String[] args) {
    
    // create an object of Main
    Main obj = new Main();

    // access method of abstract class
    // using object of Main class
    obj.display();
  }
}
```

Nếu abstract class có abstract method thì các class kế thừa nó phải cài đặt các abstract method này (override), nếu không thì class kế thừa đó vẫn là abstract class 

```
abstract class Animal {
  abstract void makeSound();
  
  public void eat() {
    System.out.println("I can eat.");
  }
}

class Dog extends Animal {
  // provide implementation of abstract method: if not Dog is abstract class 
  public void makeSound() {
    System.out.println("Bark bark");
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of Dog class
    Dog d1 = new Dog();

    d1.makeSound();
    d1.eat(); // nếu trong class Dog có phương thức ghi đè eat() thì ở đây eat() trong Dog class được gọi (tính ghi đè trong kế thừa) 
  }
}
```

<h2>Interface</h2>

Giống với abstract class, ta không thể tạo một đối tượng interface (Giống)

```
<interface_name> obj = new <interface_name>(); // error 
```

interface chỉ chứa các abstract method (không có body), chỉ chứa biến đã được khai báo (với access public or default) hoặc hằng số (static final). Từ java8 có thể 
khai báo thân hàm static (gọi bằng tên interface) hoặc default

```
public interface Language {
  // initialized variable or const 
  
  // only abstract method 
  
  // static method / default method
}
```

Một class có thể implements (cài đặt) 1 interface hoặc nhiều interface (==> interface cho phép đa kế thừa bằng từ khóa implements) 
```
// create an interface
interface Language {
  void getName(String name);
}

// class implements interface
class ProgrammingLanguage implements Language {

  // implementation of abstract method
  public void getName(String name) {
    System.out.println("Programming Language: " + name);
  }
}

class Main {
  public static void main(String[] args) {
    ProgrammingLanguage language = new ProgrammingLanguage();
    language.getName("Java");
  }
}
```

Tính kế thừa giữa các interface (interface chỉ có thể kế thừa hoặc đa kế thừa interface): chỉ có class hoặc abstract class kế thừa interface mới sử dụng từ khóa implements, còn lại dùng extends
```
interface A {
   ...
}
interface B {
   ... 
}

interface C extends A, B {
   ...
}
```

Interface có tác dụng ?

<ul>
  <li>Liệt kê chức năng (khung)</li>
  <li>Giao diện bắt sự kiện đối tượng (k cần nhúng đối tượng vào)</li>
  <li>1 lớp bị kế thừa 1 lớp (không cho phép đa kế thừa) => cần interface </li>
  <li>Quản lý 2 - nhiều class không liên quan đến nhau </li>
</ul>

Bảng so sánh abstract class và interface 

<table>
<tr><th>Abstract class</th><th>Interface</th></tr>
<tr><td>1) Abstract class can <strong>have abstract and non-abstract</strong> methods.</td><td>Interface can have <strong>only abstract</strong> methods. Since Java 8, it can have <strong>default and static methods</strong> also.</td></tr>
<tr><td>2) Abstract class <strong>doesn't support multiple inheritance</strong>.</td><td>Interface <strong>supports multiple inheritance</strong>.</td></tr>
<tr><td>3) Abstract class <strong>can have final, non-final, static and non-static variables</strong>.</td><td>Interface has <strong>only static and final variables</strong>.</td></tr>
<tr><td>4) Abstract class <strong>can provide the implementation of interface</strong>.</td><td>Interface <strong>can't provide the implementation of abstract class</strong>.</td></tr>
<tr><td>5) The <strong>abstract keyword</strong> is used to declare abstract class.</td><td>The <strong>interface keyword</strong> is used to declare interface.</td></tr>
<tr><td>6) An <strong>abstract class</strong> can extend another Java class and implement multiple Java interfaces.</td><td>An <strong>interface</strong> can extend another Java interface only.</td></tr>
<tr><td>7) An <strong>abstract class</strong> can be extended using keyword "extends".</td><td> An <strong>interface</strong> can be implemented using keyword "implements".</td></tr>
<tr><td>8) A Java <strong>abstract class</strong> can have class members like private, protected, etc.</td><td>Members of a Java interface are public by default. </td></tr>
<tr><td>9)<strong>Example:</strong><br> public abstract class Shape{<br>public abstract void draw();<br>}</td><td><strong>Example:</strong><br> public interface Drawable{<br>void draw();<br>}</td></tr>
</table>

<h2>Anonymous Class</h2>

Anonymous class (lớp ẩn danh) là lớp được định nghĩa ngay trong lớp khác 

```
class outerClass {
    // defining anonymous class
    object1 = new Type(parameterList) {
         // body of the anonymous class
    };
    // use anonymous class
    object1.<method_name>();
}
```

VD1: Kế thừa 1 class

```
class Polygon {
   public void display() {
      System.out.println("Inside the Polygon class");
   }
}

class AnonymousDemo {
   public void createClass() {

      // creation of anonymous class extending class Polygon
      Polygon p1 = new Polygon() {
         public void display() {
            System.out.println("Inside an anonymous class.");
         }
      };
      p1.display();
   }
}

class Main {
   public static void main(String[] args) {
       AnonymousDemo an = new AnonymousDemo();
       an.createClass(); // output: Inside an anonymous class 
   }
}
```

VD2: Kế thừa 1 interface: Vì interface không thể tạo đối tượng bằng từ khóa new nên ta có thể dùng lớp ẩn danh để cài đặt ngay trong lớp khác

```
interface Polygon {
   public void display();
}

class AnonymousDemo {
   public void createClass() {

      // anonymous class implementing interface
      Polygon p1 = new Polygon() {
         public void display() {
            System.out.println("Inside an anonymous class.");
         }
      };
      p1.display();
   }
}

class Main {
   public static void main(String[] args) {
      AnonymousDemo an = new AnonymousDemo();
      an.createClass(); // output: Inside an anonymous class 
   }
}
```

Anonymous class tạo đối tượng ngay khi yêu cầu => giúp code ngắn gọn 

```
Object = new Example() {
   public void display() {
      System.out.println("Anonymous class overrides the method display()."); // ghi đè display()
   }
};
```

<h2>Upcasting và Downcasting</h2>

Upcasting: Tham chiếu 1 biến kiểu lớp cha đến 1 biến lớp con, có thể ép kiểu ngầm định và tường minh

```
Person p1 = new Student();
Person p2 = s1; // ngầm định 
Person p3 = (Person) s1; // tường minh
p1.speak();
p2.speak();
// p1.doExam(); // Không thể gọi do upcasting chỉ cho phép gọi đến những phương thức lớp cha
```

Downcasting: Tham chiếu 1 biến kiểu lớp con đến 1 biến lớp cha, chỉ cho phép ép kiểu tường minh

```
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
```
Tham khảo thêm bài viết về upcasting và downcasting: https://gpcoder.com/2406-co-che-upcasting-va-downcasting-trong-java/
 
<h2>Exception</h2>
<p>Checked Exceptions: Là một ngoại lệ được kiểm tra và thông báo bởi trình biên dịch tại thời điểm biên dịch, chúng cũng có thể được gọi là ngoại lệ thời gian biên dịch (Compile-time Exceptions). Và lập trình viên không thể lường trước.

Ví dụ: Bạn muốn mở một file để đọc nhưng tệp được chỉ định lại không tồn tại. Thì FileNotFoundExeption sẻ xảy ra và trình biên dịch sẽ thông báo tới lập trình viên nhằm xử lý ngoại lệ đó.</p>

<p>Unchecked Exceptions: Là một ngoại lệ không được kiểm tra trong quá trình biên dịch. Chúng cũng được gọi là ngoại lệ thời gian chạy (Runtime Exceptions). Là ngoại lệ có thể tránh được bởi lập trình viên. Unchecked Exceptions kế thừa từ Runtime Exception.

Ví dụ: ArithmaticException, ArrayIndexOutOfBoundsException, NullPointerException,…chúng được kiểm tra tại Runtime.</p>

<h2>Vào ra file</h2>
<p>Có 2 loại file: file text, file nhị phân. File text: đọc theo kí tự (mỗi kí tự 1 byte, kí tự unicode 2 byte), file nhị phân đọc theo byte</p>
Tạo ra đối tượng file

```
String filename = "src/iofile/hanoi.txt";
File f = new File(filename);
System.out.println(f.getAbsoluteFile());
System.out.println(f.getName());
System.out.println(new Date(f.lastModified()));
System.out.println(f.length());
System.out.println(f.exists());
```

<h4>1.Đọc file</h4>
Đọc file bằng FileReader

```
String filename = "src/iofile/hanoi.txt";
FileReader r;
try{
    r = new FileReader(filename);
    int k;
    while(true){
        k = r.read();
        if(k==-1) break; // đã đọc hết file
        char c = (char) k;
        System.out.print(c);
    }
    r.close();
}catch(FileNotFoundException e){
    System.out.println(e);
}catch(IOException e){
    System.out.println(e);
}     
```
Đọc file bằng BufferedReader
```
String filename = "src/iofile/hanoi.txt";
BufferedReader br;
try{
    br = new BufferedReader(new FileReader(filename));
    String line="";
    while((line=br.readLine()) != null){
        System.out.println(line);
    }
    br.close();
}catch(FileNotFoundException e){
    System.out.println(e);
}catch(IOException e){
    System.out.println(e);
}
```
Đọc file bằng Scanner
```
String filename = "src/iofile/hanoi.txt";
File file = new File(filename);
try {
    Scanner sc = new Scanner(file);
    while (sc.hasNextLine()) {
        String i = sc.nextLine();
        System.out.println(i);
    }
    sc.close();
} 
catch (FileNotFoundException e) {
    e.printStackTrace();
}

```
<h4>2.Ghi file</h4>

Ghi file bằng PrintWriter
```
String fout="src/demo/out.txt";
PrintWriter p;
try{
    p = new PrintWriter(fout);
    p.print("Tong:"+sum);
    p.close();
}catch(FileNotFoundException e){
    System.out.println(e);
}        
```

<h4>3.Đọc và ghi object</h4>
<p>Đọc ghi dưới dạng file binary, ghi và đọc theo cùng 1 cách</p>
<p>Đọc ghi bằng ObjectOutputStream, FileInputStream, ObjectOutputStream, FileOutputStream</p>

Đọc file 
```
public static <T> List<T> doc(String file){
    List<T> list = new ArrayList<>();
    try{
        ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
        list = (List<T>) o.readObject();
        o.close();
    }catch(IOException e){
        System.out.println(e);
    }catch(ClassNotFoundException e){
        System.out.println(e);
    }
    return list;
}
```
Ghi file 
```
public static <T> void viet(String file, List<T> arr){
    try{
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(file));
        o.writeObject(arr);
        o.close();
    }catch(IOException e){
        System.out.println(e);
    }
}
```

<i>Update: 14/10/2021 00:21</i>
<hr>
Tham khảo: <br>
1. https://data-flair.training/blogs/java-tutorial/ <br>
2. https://www.programiz.com/java-programming <br>
3. https://www.javatpoint.com/java-tutorial <br>

