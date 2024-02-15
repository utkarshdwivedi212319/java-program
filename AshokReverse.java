public class AshokReverse
{
    public static void main(String[] args)
    {
        String str="Vimlesh";
        char[] charArr=str.toCharArray();
        for (int i=str.length()-1;i>=0;i--)
        {
            System.out.print(charArr[i]);
        }

        System.out.println("");

        System.out.println("2nd reverse string++++++++++++++++++++++++++++++");
        StringBuffer sb=new StringBuffer(str);
        System.out.print(sb.reverse());

        System.out.println("5555555555555555555555555555555555555555");

        StringBuilder sb1=new StringBuilder(str);
        System.out.println(sb1.reverse());

        System.out.println("++++++++++++++++++++++++++fourth aproach");

        for (int i=str.length()-1;i>=0;i--){

            System.out.print(str.charAt(i));
        }


    }
}
