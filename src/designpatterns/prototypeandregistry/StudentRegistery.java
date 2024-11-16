package designpatterns.prototypeandregistry;

import java.util.HashMap;

public class StudentRegistery {
    private HashMap<String, Student> regStdHMap;

    // In the Student registery constructor, whenever a StudentRegistry obj is created a new HashMap is created when this constructor is called
    StudentRegistery(){
        regStdHMap = new HashMap<>();
    }

    // This is a custom method to add values to the HashMap from outside the class
    public void add(String key, Student student){
        regStdHMap.put(key, student);
    }

    // This is a custom Remove method to remove the values from outside the class
    public void remove(String key){
        regStdHMap.remove(key);
    }

    // This  is a custom method to get the values from the hashMap based on the key
    public Student get(String key){
        return regStdHMap.get(key).copy();
    }

    public void fillRegistry(){
        Student jan23 = new Student("ABC", 23, "Jan23");
        Student feb23 = new Student("MNO", 29,"Feb23");
        Student mar23 = new Student("PQR", 31, "Mar23");

        regStdHMap.put("Jan23",jan23);
        regStdHMap.put("Feb23", feb23);
        regStdHMap.put("Mar23", mar23);
    }
}
