

public class Lec1{
    public static void main(String[] args){
        Student s1 = new Student();
        // s1.roll = 153;
        // s1.name = "Muskan";
        // s1.age = 21;
        // s1.marks = 91;

        System.out.println(s1.roll);
        // System.out.println(s1.name);
        // System.out.println(s1.age);
        // System.out.println(s1.marks);

        Student s2 = new Student(1, "Tuntun", 20, 87);
        System.out.println(s2.name);

        // s2.changeName("muskan");
        // System.out.println(s2.name);

        Student s3 = new Student(s2);
        System.out.println(s3.name);
    };
}

class Student {
    int roll;
    String name;
    int age;
    float marks;

    // constructor 
    Student(){
        this.roll = 153;
        this.name = "Muskan";
        this.age = 21;
        this.marks = 91;
    }

    // calling constructor from another constructor
    // internally: new Student(2, "Gulshan", 17, 85)

    // Student() {
    //     this (2, "Gulshan", 17, 85);
    // }
    
    // constructor with argument
    Student(int roll, String name, int age, float marks) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method (setter-method)
    void changeName(String name){
        this.name = name;
    }

    // constructor take value from another object
    Student(Student a){
        this.roll = a.roll;
        this.name = a.name;
        this.age = a.age;
        this.marks = a.marks;
    }
}