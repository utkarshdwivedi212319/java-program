package ALLJAVAREVISIONBYDEEPAKSIR;

public class LocalVarable
{

    void show()
    {
        int a=20;
        int b=30,c;
        c=a+b;
        System.out.println(c);
    }

    boolean vim()
    {
        int d=40,e;// local variable ki default value nahi hoti hai stack memory me locate hota hai
      //  d=a+b+c;//a+b+c these are local variable i can not use another method because local variable scope is only one method with his method

        System.out.println(d);
        return false;
    }
    public static void main(String[] args)
    {
        LocalVarable b=new LocalVarable();
        b.show();
        System.out.println(b.vim());
    }
}
