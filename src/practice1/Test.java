package practice1;

import practice2.Student;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Student student1=new Student("Nam", 20, "HN");
        Student student2=new Student("Hung", 21, "Hn");
        Student student3=new Student("Ha", 22, "HN");

        Map<Integer,Student> studentMap =new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3, student3);
        studentMap.put(1,student1);
        for (Map.Entry<Integer, Student> student:studentMap.entrySet()){
            System.out.println(student.getValue().getAge());
        }
    }
}
