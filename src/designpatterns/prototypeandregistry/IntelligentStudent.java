package designpatterns.prototypeandregistry;

public class IntelligentStudent extends Student{

    private int iq;

    public IntelligentStudent(String name, int age, int iq) {
        super(name, age);
        this.iq = iq;
    }

    // We are creating the copy constructor for IntelligentStudent class
    private IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    // Here we are overriding the copy() implementation from the extended Student class
    @Override
    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }

}
