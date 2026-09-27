import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;
    Student(String name,int rno,double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }
    public int compareTo(Student s){
        return Double.compare(s.cgpa,this.cgpa);
    }
}
public class customComparator {
    public static void main(String[] args) {
        Student s1 = new Student("Gopi",200,8.3);
        Student s2 = new Student("Bhumi",69,8.7);
        Student s3 = new Student("Karan",49,6.3);
        Student s4 = new Student("Kholi",86,7.9);
        Student s5 = new Student("Messi",119,8.3);
        Student[] arr = {s1,s2,s3,s4,s5};
        Arrays.sort(arr);
        for(Student s : arr){
            System.out.println(s.name+" "+s.rno+" "+s.cgpa);
        }
    }
}
