import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student(101, "Ajay", 85);
        Student s2 = new Student(102, "Yusuf", 90);
        Student s3 = new Student(0, "", 0);
        s3.setData(103, "Zoro", 88);
        Student s4 = new Student(0, "", 0);
        s4.setData(104, "Goku", 92);
        Student s5 = new Student(0, "", 0);
        s5.setData(105, "Luffy", 95);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println(list);
    }
}