package collections;


public class Student implements Comparable<Student>{
    private String name;
    private double mark;

    public Student() {
    }

    public Student(double mark, String name) {
        this.name = name;
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public int compareTo(Student o) {
//         return (int) (this.mark - o.getMark());
           return (int) Double.compare(mark, o.mark);
    }
    
    public String toString(){
        return mark + "\t" + name;
    }
}
