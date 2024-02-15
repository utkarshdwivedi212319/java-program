import EncapsulationAllProgram.Employee;

public class Encapsulation
{
   private int empid;

   public  void setEmpid(int eid){
       empid=eid;

   }

    public int getEmpid() {
        return empid;
    }

}

class Company
{
    public static <Employee> void main(String[] args) {
        Employee e=new Employee();
        e.getClass(55);


        System.out.println(e.getEmpid());
    }
}