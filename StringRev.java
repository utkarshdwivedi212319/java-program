public class StringRev
{
    public static void main(String[] args)
    {
        String str="Vimlesh";

        StringBuffer s=new StringBuffer(str.toString());
        System.out.println(s.reverse());
        System.out.println("-----------------------------------------------------------------");
        StringBuilder d=new StringBuilder(str.toString());

        System.out.println(d.reverse());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        int lang=str.length();

        String rev=" ";

       for (int i=str.length()-1;i>=0;i--)
       {
           rev=rev+str.charAt(i);

       }

        System.out.println(rev);

        System.out.println("55555555555555555555555555555555555555555555555555555555");
       char[] charArr=str.toCharArray();

       for (int i=charArr.length-1;i>=0;i--)
       {
           System.out.print(charArr[i]);
       }
    }

}
