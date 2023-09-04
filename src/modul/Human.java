package modul;

public class Human {
    private int Age;
    protected String Name;

    public Human(int age, String name) {
        this.Age = age;
        this.Name = name;
    }

    public Human(){

    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public String say(){
        return "говорит по человечески";
    }
    @Override
    public String toString() {
        return "modul.Human{" +
                "Age=" + Age +
                ", Name='" + Name + '\'' +
                '}';
    }
}
