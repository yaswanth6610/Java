package OOP;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        System.out.println(s1.name);
        System.out.println(s1.marks);
        System.out.println(s1.rollNo);


        Student s2 = new Student(987, "sSanjay", 99.0f);

        System.out.println(s2.name);
        System.out.println(s2.marks);
        System.out.println(s2.rollNo);

    }
}

class Student {
    int rollNo;
    String name;
    float marks;

    //default constructor

    Student() {
        this.rollNo = 245;
        this.name = "Dinesh";
        marks = 56.0f;
    }
    
    // constructor with arguments
    Student (int rollNo,String name,float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

    }
}