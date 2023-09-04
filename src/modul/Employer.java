package modul;

public class Employer extends Student{

    private int salary;
    public Employer(){
        super();
    }

    public Employer(int age, String name, String university, int salary) {
        super(age, name, university);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "salary=" + salary +
                '}';
    }
}
