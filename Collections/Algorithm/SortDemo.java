package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortDemo {
    public static void main(String[] args) {
        // Sorting an ArrayList of Integer (Sort trực tiếp nếu không phải Object)
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(4);
        a.add(1);
        a.add(5);
        a.add(0);
        a.add(-1);
        System.out.println("Trước khi sắp xếp:");
        System.out.println(a);
        Collections.sort(a); // sort mặc định theo thứ tự tăng dần
        System.out.println("Sau khi sắp xếp tăng dần:");
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder()); // sort mặc định theo thứ tự giảm dần
        System.out.println("Sau khi sắp xếp giảm dần:");
        System.out.println(a);
        
        // Sorting an ArrayList of Student by mark (Với 1 list các Object có 2 cách)
        ArrayList<Student> s = new ArrayList<Student>();
        s.add(new Student(9.6,"B"));
        s.add(new Student(10,"C"));
        s.add(new Student(7,"A"));
        s.add(new Student(5,"BBD"));
        s.add(new Student(1,"AADDC"));
        s.add(new Student(6,"BB"));
        System.out.println("Trước khi sắp xếp");
        System.out.println(s);
        // 1. Using coparator for sorting
//        Comparator<Student> compareMark = (Student s1, Student s2) ->
//                Double.compare(s1.getMark(), s2.getMark());
//        Collections.sort(s,compareMark);
//        System.out.println("Sau khi sắp xếp tăng dần");
//        System.out.println(s);
//        Collections.sort(s,compareMark.reversed());
//        System.out.println("Sau khi sắp xếp giảm dần");
//        System.out.println(s);
        
        // 2. Implements Comparable     
        Collections.sort(s);
        System.out.println("Sau khi sắp xếp tăng dần");
        System.out.println(s);
        Collections.sort(s,Collections.reverseOrder());
        System.out.println("Sau khi sắp xếp giảm dần");
        System.out.println(s);
    }
}