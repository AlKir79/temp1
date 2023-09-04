import modul.Employer;
import modul.Human;
import modul.Student;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(20);
        human.setName("Ivan");
        System.out.println(human);
        Student student = new Student();
        student.setAge(30);
        student.setName("Vasya");
        student.setUniversity("РГРТУ");
        System.out.println(student);
        System.out.println(student.say());
        System.out.println(human.say());

        Human[]humans =  new Human[3];
        humans[0] = human;
        humans[1] = student;
        humans[2] = new Employer(35,"Oleg","РГУ",60000);

        for (int i=3;i<humans.length;i++){
            System.out.println(humans[i]);
            System.out.println(humans[i].say());
        }

    //    if(student instanceof Human){
    //        System.out.println("human is Human");
    //    }else{
    //        System.out.println("human is not Human");
    //    }
    }
}