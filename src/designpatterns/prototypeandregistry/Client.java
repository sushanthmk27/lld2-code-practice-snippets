package designpatterns.prototypeandregistry;

public class Client {
    public static void main(String[] args){

        Student st1 = new Student("Sushanth", 25, "Sample Dummy Batch");

        // Here we are copying only the reference of the object not the actual object
/*        Student st2 = st1;*/

        StudentRegistery studentRegistery = new StudentRegistery();
        studentRegistery.fillRegistry();

        Student st2 = studentRegistery.get("ABC");
        st2.setName("XYZ");




    }
}
