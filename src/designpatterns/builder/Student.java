package designpatterns.builder;

public class Student {
    private String name;
    private int age;
    private int gradYear;
    private String email;
    private double psp;
    private String university;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.getName();

        if(studentBuilder.getAge() < 20){
            throw new IllegalArgumentException("Age cant be less than 20");
        }
        this.age = studentBuilder.getAge();
        this.gradYear = studentBuilder.getGradYear();

        if(studentBuilder.getEmail().length() >50){
            throw new IllegalArgumentException("Length of the character is greater than 50");
        }
        this.email = studentBuilder.getEmail();
        this.psp = studentBuilder.getPsp();
        this.university = studentBuilder.getUniversity();


    }

    public static StudentBuilder getStudentBuilderInstance(){
        return new StudentBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
