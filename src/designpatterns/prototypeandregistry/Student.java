package designpatterns.prototypeandregistry;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String batch;

    public Student(String name, int age, String batch) {
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }


    // Creation of copy constructor
    protected Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
    }

    // We write the implementation for the copy method here which creates a copy of the instance of the Student class
    @Override
    public Student copy(){
        return new Student(this);
    }
}
