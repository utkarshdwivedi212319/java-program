package Constructor;

public class Student
{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="kamal";
        s1.age=55;
        s1.printInfo();
    }
}


