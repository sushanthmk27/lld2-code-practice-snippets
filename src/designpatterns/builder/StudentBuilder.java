package designpatterns.builder;

public class StudentBuilder {

    // Here we are(can) adding all the attributes that we need to be added during OBJECT creation time

    private String name;
    private int age;
    private int gradYear;
    private String email;
    private double psp;
    private String university;

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {        // by creating a setter method this way, the setter method will return the StudentBuilder class after setting the values and then to the returned object we can add other setter values
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public double getPsp() {
        return psp;
    }

    public StudentBuilder setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public String getUniversity() {
        return university;
    }

    public StudentBuilder setUniversity(String university) {
        this.university = university;
        return this;
    }
}
