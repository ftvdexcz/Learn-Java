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
Matcher check = patter.matcher(input);
if(check)
  System.out.println("True");
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

