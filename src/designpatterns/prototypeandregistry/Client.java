package designpatterns.prototypeandregistry;

public class Client {
    public static void main(String[] args){

        Student st1 = new Student("Sushanth", 25);

        // Here we are copying only the reference of the object not the actual object
/*        Student st2 = st1;*/
    }
}
