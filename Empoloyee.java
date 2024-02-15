package Constructor;

class Empoloyee
{
    int age;
    String name;
     Empoloyee(int age,String name){
         this.age=age;
         this.name=name;
     }
    public static void main(String[] args)
    {
        Empoloyee emp=new Empoloyee(55,"sdhvbhsdj");
       // System.out.println(emp.age+" "+ emp.name);
        System.out.println(emp.age);
        System.out.println(emp.name);
    }
}

