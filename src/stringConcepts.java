public class stringConcepts {

    public static void stringvs(String s1)
    {
      s1 = s1+ "Sekar";
    //  s1.concat("Sekar");
    }


    public static void stringBufferingConcept(StringBuffer s2)
    {
        s2.append(" Sekar");
    }


    public static void stringBuilderConcept(StringBuilder s3)
    {
        s3.append("ji");
    }

    public static void main(String args[])
    {
       String s1 = "Gnana";   //String is Immutable
       stringvs(s1);
       System.out.println(s1);

       StringBuffer sbuffer = new StringBuffer("Gnana");  //String Buffer is Immutable, single Thread
       stringBufferingConcept(sbuffer);
        System.out.println(sbuffer);

        StringBuffer sbuffer2 = new StringBuffer("Rakesh");  //String Buffer is Immutable, single Thread
        stringBufferingConcept(sbuffer2);
        System.out.println(sbuffer2);

        StringBuilder sbuilder = new StringBuilder("Sekar "); //String Builder is Immutable . Multi thread
        stringBuilderConcept(sbuilder);
        System.out.println(sbuilder);
       // System.out.println(obj.append("sekarji"));

    }
}
