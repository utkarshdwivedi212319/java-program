package ALLJAVAREVISIONBYDEEPAKSIR;

public class Variable
{
    int a=10;//instance variable
    static  int b=20;//static variable
    public static void main(String[] args)
    {
        System.out.println(Variable.b);

        Variable v=new Variable();

        System.out.println(v.a);

    }

}
