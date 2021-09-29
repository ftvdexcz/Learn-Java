# <i>Learn Java</i>
<h1>Một số khái niệm cơ bản Java (Same C)</h1>

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
Java cung cấp cơ chế để chuyển đổi giữa kiểu dữ liệu nguyên thủy (primitive variable) thành đối tượng (object) và ngược lại gọi là wrapper

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
