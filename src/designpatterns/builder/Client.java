package designpatterns.builder;

public class Client {

    public static void doSomething(Student student){
//        student.exam.id;
    }

    public static void main(String[] args) {

        // Way 1
/*        Student s1 = new Student(name);
        Student s2 = new Student(name, email);
        Student s3 = new Student(name, email, age);
        Student s4 = new Student(name, age, university);*/

        //Way 2
/*
        Student s = new Student();
        // before the Student is ready we have supplied the object to the caller
        doSomething(s);

        s.setAge(2);
        s.setEmail("abcd@");
        s.setPsp(23.36);
*/

        // Way 3
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setAge(25);
        studentBuilder.setEmail("abcd@123");
        studentBuilder.setName("Sushanth");

        Student s = new Student(studentBuilder);
    }
}
