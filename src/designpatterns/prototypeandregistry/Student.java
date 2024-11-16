package designpatterns.prototypeandregistry;

public class Student implements Prototype {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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


    // Creation of copy constructor
    protected Student(Student student){
        this.name = student.name;
        this.age = student.age;
    }

    // We write the implementation for the copy method here which creates a copy of the instance of the Student class
    @Override
    public Student copy(){
        return new Student(this);
    }
}
