<h1>Collections</h1>

![alt text](https://viettuts.vn/images/java/java-collection/he-thong-cap-bac-colection-trong-java.png)

Dưới đây là mô tả những interface chính của Collection
<ul>
<li>Set: là một collection không thể chứa 2 giá trị trùng lặp. Set được sử dụng để biểu diễn các bộ, chẳng hạn như bộ tú lu khơ, thời khóa biểu của học sinh, các tiến trình đang chạy trên máy tính...</li>
<li>List: là một collection có thứ tự (đôi khi còn được gọi là một chuỗi). List có thể chứa các phần tử trùng lặp. Thường có quyền kiểm soát chính xác vị trí các phần tử được chèn vào và có thể truy cập chúng bằng chỉ số (vị trí của chúng).</li>
<li>Queue (hàng đợi): là một collection được sử dụng để chứa nhiều phần tử trước khi xử lý. Bên cạnh các thao tác cơ bản của collection, Queue cung cấp các thao tác bổ sung như chèn, lấy ra và kiểm tra. Queue có thể được sử dụng như là FIFO (first-in, first-out - vào trước, ra trước)</li>
<li>Deque: là một collection được sử dụng để chứa nhiều phần tử trước khi xử lý. Ngoài các thao tác cơ bản của collection, một Deque cung cấp các thao tác bổ sung như chèn, lấy ra và kiểm tra. Deques có thể được sử dụng như là FIFO (first-in, first-out - vào trước, ra trước) và LIFO (last-in, first-out - vào sau, ra trước). Trong một Deque, tất cả các phần tử mới có thể được chèn vào, lấy ra và lấy ra ở cả hai đầu.</li>
<li>Map: là một đối tượng ánh xạ mỗi key tương úng với một giá trị. Map không thể chứa giá trị trùng lặp. Mỗi key có thể ánh xạ đến nhiều nhất một giá trị.</li>
</ul>

Dưới đây là mô tả 2 interface được sắp xếp của Set mà Map
<ul>
  <li>SortedSet: là một Set chứa các phần tử theo thứ tự tăng dần.</li>
<li>SortedMap: là một Map chứa các phần tử được sắp xếp theo thứ tự tăng dần của key của chúng. Các SortedMap được sử dụng cho các collection theo thứ tự tự nhiên của cặp key/value, chẳng hạn như từ điển và danh bạ điện thoại.</li>
</ul>

<h2>List câu hỏi phỏng vấn Java Collection</h2>

<p> Trong java, câu hỏi phỏng vấn collection thường được hỏi thường xuyên bởi người phỏng vấn. Dưới đây là list câu hỏi phỏng vấn Java Collection </p>
<p> Trước khi đi chi tiết vào các câu hỏi phỏng vấn, bạn cần phải biết <strong>Legacy Class</strong> trong java là gì? </p>
<p> Phiên bản Java đầu tiên không bao gồm Collection Framework. Nó chỉ định nghĩa một vài lớp và interface cung cấp các phương thức để lưu trữ các đối tượng. Khi Collection Framework được thêm vào trong J2SE 1.2, các lớp gốc đã được tái cấu trúc để hỗ trợ các collection interface. Các lớp này còn được gọi là lớp Legacy. Tất cả các lớp và interface Legacy được thiết kế lại bởi JDK 5 để hỗ trợ Generics. </p>
<p> Dưới đây là các Legacy Class được định nghĩa trong package <strong>java.util</strong>: </p>
<ol>
<li>Dictionary</li>
<li>HashTable</li>
<li>Properties</li>
<li>Stack</li>
<li>Vector</li>
</ol>
<p> Dưới đây là list câu hỏi phỏng vấn java collection: </p>
<hr>

<h3> 1. Sự khác nhau giữa ArrayList và Vector là gì? </h3>
<table class="alt">
<tbody><tr><th>No.</th><th>ArrayList</th><th>Vector</th></tr>
<tr><td>1)</td><td> ArrayList là KHÔNG synchronized.</td><td>Vector là synchronized.</td></tr>
<tr><td>1)</td><td> ArrayList không phải là legacy class.</td><td>Vector là legacy class.</td></tr>
<tr><td>2)</td><td> ArrayList tăng kích thước của nó bằng 50% kích thước mảng.</td><td>Vector tăng kích thước của nó bằng cách nhân đôi kích thước mảng.</td></tr>
</tbody></table>
<hr>

<h3> 2. Sự khác nhau giữa ArrayList và LinkedList là gì? </h3>
<table class="alt">
<tbody><tr><th>No.</th><th>ArrayList</th><th>LinkedList</th></tr>
<tr><td>1)</td><td> ArrayList sử dụng một mảng động.</td><td> LinkedList sử dụng danh sách liên kết doubly.</td></tr>
<tr><td>2)</td><td> ArrayList không hiệu quả với thao tác vì cần nhiều chuyển đổi.</td><td> LinkedList là hiệu quả cho thao tác.
</td></tr>
<tr><td>3)</td><td> ArrayList là tốt hơn để lưu trữ và lấy dữ liệu.</td><td> LinkedList là tốt hơn để thao tác dữ liệu.</td></tr>
</tbody></table>
<hr>

<h3> 3. Sự khác nhau giữa Iterator và ListIterator là gì? </h3>
<p> Iterator duyệt các phần tử chỉ theo một chiều hướng là chuyển tiếp, trong khi ListIterator duyệt các phần tử theo hai hướng là chuyển tiếp và ngược lại. </p>
<p> Iterator có thể được sử dụng trong List, Set và Queue. </p>
<p> ListIterator chỉ có thể được sử dụng trong List. </p>
<hr>

<h3> 4. Sự khác biệt giữa Iterator và Enumeration là gì? </h3>
<table class="alt">
<tbody><tr><th>No.</th><th>Iterator</th><th>Enumeration</th></tr>
<tr><td>1) </td><td> Iterator duyệt các phần tử legacy và non-legacy.</td><td> Enumeration chỉ có thể duyệt các phần tử legacy.</td></tr>
<tr><td>2) </td><td> Iterator là chậm hơn Enumeration.</td><td> Enumeration là nhanh hơn Iterator.</td></tr>
</tbody></table>
<hr>

<h3> 5. Sự khác nhau giữa List và Set là gì? </h3>
<p> List có thể chứa các phần tử <strong>trùng lặp (dublicate)</strong>, trong khi Set chỉ chứa các phần tử duy nhất. </p>
<hr>

<h3> 6. Sự khác nhau giữa HashSet và TreeSet là gì? </h3>
<p> HashSet <strong>không</strong> duy trì <strong>thứ tự nào</strong>, trong khi TreeSet duy trì <strong>thứ tự tăng dần</strong>. </p>
<hr>

<h3> 7. Sự khác nhau giữa Set và Map là gì? </h3>
<p> Set chỉ chứa giá trị, trong khi Map chứa cặp key và value. </p>
<hr>

<h3> 8. Sự khác biệt giữa HashSet và HashMap là gì? </h3>
<p> HashSet chỉ chứa giá trị, trong khi HashMap chứa cặp key và value. </p>
<hr>

<h3> 9. Sự khác nhau giữa HashMap và TreeMap là gì? </h3>
<p> HashMap duy trì <strong>không có thứ tự</strong>, trong khi TreeMap duy trì <strong>thứ tự tăng dần</strong>. </p>
<hr>

<h3> 10. Sự khác nhau giữa HashMap và Hashtable là gì? </h3>
<table class="alt">
<tbody><tr><th>No.</th><th>HashMap</th><th>Hashtable</th></tr>
<tr><td>1)</td><td> HashMap là KHÔNG synchronized.</td><td> Hashtable là synchronized.</td></tr>
<tr><td>2)</td><td> HashMap có thể chứa một khóa null và nhiều giá trị null.</td><td> Hashtable không thể chứa bất kỳ khóa null hoặc giá trị null.</td></tr>
</tbody></table>
<hr>

<h3> 11. Sự khác nhau giữa Collection và Collections là gì? </h3>
<p> Collection là một interface, trong khi Collections là một lớp. Collecion interface cung cấp các chức năng về cấu trức dữ liệu cho List, Set, Queue. Nhưng lớp Collections là để sắp xếp và đồng bộ các phần tử Collection. </p>
<hr>

<h3> 12. Sự khác nhau giữa Comparable và Comparator là gì? </h3>
<table class="alt">
<tbody><tr><th>No.</th><th>Comparable</th><th>Comparator</th></tr>
<tr><td>2)</td><td> Nó cung cấp phương thức compareTo().</td><td> Nó cung cấp phương thức compare().</td></tr>
<tr><td>3)</td><td> Nó được đặt trong java.lang package.</td><td> Nó được đặt trong java.util package.</td></tr>
<tr><td>4)</td><td> Nếu chúng ta một lớp được implement Comparable interface, thì lớp đó phải được sửa đổi.</td><td> Lớp không bị sửa đổi.</td></tr>
</tbody></table>
<hr>

<h3> 13. Lợi thế của Properties file là gì? </h3>
<p> Nếu bạn thay đổi giá trị trong tệp thuộc tính, bạn không cần phải biên dịch lại lớp java. Vì vậy, nó làm cho ứng dụng dễ quản lý. </p>
<hr>

<h3> 14. Phương thức hashCode() là gì? </h3>
<p> Phương thức hashCode() trả về một giá trị mã băm (một số nguyên). </p>
<p> Phương thức hashCode() trả về cùng số nguyên, nếu hai keys (bằng phương thức equals()) giống nhau. </p>
<p> Tuy nhiên, có thể hai mã băm có thể có các keys khác nhau hoặc giống nhau. </p>
<hr>

<h3> 15. Tại sao chúng ta phải nghi đè phương thức equals()? </h3>
<p> Phương thức equals() được sử dụng để kiểm tra xem hai đối tượng có giống nhau hay không. Nó cần phải được ghi đè nếu chúng ta muốn kiểm tra các đối tượng dựa trên thuộc tính của chúng. </p>
<p> Ví dụ, Nhanvien là một lớp có 3 thành viên dữ liệu: id, ten và luong. Nhưng, chúng ta muốn kiểm tra sự giống nhau của đối tượng nhân viên trên cơ sở tiền lương. Khi đó, chúng ta cần ghi đè bằng phương thức equals(). </p>
<hr>

<h3> 16. Làm thế nào để đồng bộ List, Set và Map? </h3>
<p> Lớp Collection cung cấp phương thức để làm cho các phần tử List, Set và Map là đồng bộ: </p>
<table class="alt">
<tbody><tr><td>public static List synchronizedList(List l){}</td></tr>
<tr><td>public static Set synchronizedSet(Set s){}</td></tr>
<tr><td>public static SortedSet synchronizedSortedSet(SortedSet s){}</td></tr>
<tr><td>public static Map synchronizedMap(Map m){}</td></tr>
<tr><td>public static SortedMap synchronizedSortedMap(SortedMap m){}</td></tr>
</tbody></table>
<hr>

<h3> 17. Lợi ích của generic collection là gì? </h3>
<p> Nếu chúng ta sử dụng lớp generic, chúng ta không cần typecasting. Nó là typesafe và kiểm tra tại thời gian biên dịch. </p>
<hr>

<h3> 18. Hash-collision trong Hashtable là gì? Và nó được xử lý như thế nào? </h3>
<p> Hai keys khác nhau có cùng giá trị băm được gọi là sự va chạm băm (hash-collision). Hai mục khác nhau sẽ được giữ trong một chậu băm đơn để tránh va chạm. </p>
<hr>

<h3> 19. Lớp Dictionary là gì? </h3>
<p> Lớp Dictionary cung cấp khả năng lưu trữ các cặp key-value. </p>
<hr>

<h3> 20. Sự khác nhau giữa Array và ArrayList là gì? </h3>
<p> <strong>Sự khác nhau giữa Array với ArrayList</strong> được tóm tắt lại như trong bảng sau: </p>
<table class="alt">
<tbody><tr><th width="50%">Array</th><th>ArrayList</th></tr>
<tr><td>1) Kích thước <strong>cố định</strong>.</td><td>Kích thước có thể <strong>thay đổi được</strong>.</td></tr>
<tr><td>2) Có thể lưu trữ dữ liệu kiểu <strong>nguyên thủy</strong> và <strong>đối tượng</strong>.</td><td>Chỉ có thể lưu trữ dữ liệu kiểu <strong>đối tượng</strong>. Kể từ Java 5, kiểu nguyên thủy được tự động chuyển đổi trong các đối tượng được gọi là <strong>auto-boxing</strong>.</td></tr>
<tr><td>3) Tốc độ lưu trữ và thao tác <strong>nhanh hơn</strong>.</td><td>Tốc độ lưu trữ vào thao tác <strong>chậm hơn</strong>.</td></tr>
<tr><td>4) Chỉ có thuộc tính <strong>length</strong>.</td><td> Có nhiều phương thức để thao tác với dữ liệu.</td></tr>
</tbody></table>
