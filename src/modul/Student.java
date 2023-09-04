package modul;

public class Student extends Human {

    private String university;
    public Student(){
        super();
        this.university = "РГРТУ";
    }

    public Student(int age, String name, String university) {
        super(age, name);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String say() {
        return "говорит по студенчески";
    }

    @Override
    public String toString() {
        return "modul.Student{" +
                "university='" + university + '\'' +
                "name="+getName()+ '\'' +
                "Age="+getAge()+"}";
    }
}
