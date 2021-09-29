# <i>Learn Java</i>
<h1>1. Java Tutorial</h1>

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
import java.util.regex.Pattern;

input = "B19DCCN386";
String regex = "^[Bb]{1}\\d{2}[A-Za-z]{4}\\d{3}$";

Pattern pattern = Pattern.compile(regex);
Matcher check = = patter.matcher(input);
if(check)
  System.out.println("True"); 
  
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
- Tính đóng gói dữ liệu: 
<ul>
  <li>class = data (fields/properties) + methods</li>
  <li>Dữ liệu phải được che đi, chỉ cho truy cập bằng đối tượng của lớp: đặt private hoặc protected cho thuộc tính</li>
  <li>Toàn bộ truy cập phải thông qua methods</li>
  <li>Có 1 hàm tạo (constructor)</li>
</ul>

- Tính kế thừa:
<ul>
  <li>Cho phép kế thừa những thuộc tính và phương thức từ 1 lớp (lớp cha và lớp con)</li>
  <li>Thuộc tính để protected cho phép lớp con có thể truy cập đến thuộc tính lớp cha</li>
  <li>Từ khóa super cho phép truy cập phương thức lớp cha</li>
  <li>Upcasting: Biến lớp cha tham chiếu tới biên lớp con</li>
  <li>Downcasting: Biến lớp con tham chiếu tới biên lớp cha</li>
</ul>

- Tính đa hình 
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
- final: 
<ul>
  <li>final class: không thể có lớp con (không cho kế thừa)</li>
  <li>final data: constant</li>
  <li>final method: can't be overridden</li>
</ul>

- static: 
<ul>
  <li>static để chỉ có thể truy cập từ lớp, không của riêng đối tượng nào</li>
  <li>static method: chỉ có thể truy cập static data, không được truy cập biến của đối tượng </li>
  <li>không được dùng keyword this</li>
</ul>

VD: kết hợp static và final định nghĩa 1 hằng số
static final double PI = 3.1415;


