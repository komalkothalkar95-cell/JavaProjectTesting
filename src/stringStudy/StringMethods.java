package stringStudy;

import java.util.Locale;

public class StringMethods
{
    public static void main(String[] args) {
        String s = "Welcome to velocity";
        int s5= s.length();

        System.out.println(s5);
        String s1= s.toLowerCase();
        System.out.println(s1);
        String s2= s.toUpperCase();
        System.out.println(s2);
        boolean s3= s.equals("wewf");
        System.out.println(s3);
       boolean s6= s.equalsIgnoreCase("welcome  to velocity");
        System.out.println(s6);
        boolean s7= s.contains("oci");
        System.out.println(s7);
        System.out.println("************is blanl is emty********************");
        String a= "   ";// is empty count space
        String a1= ""; // is blank will count only char
        System.out.println(a.isBlank());
        System.out.println(a1.isEmpty());
        String b= "komal kothalkar ajay";
        System.out.println("********************************");
        System.out.println(b.charAt(5)); // space
        System.out.println(b.endsWith("lkar"));
        System.out.println(b.startsWith("mal"));
        System.out.println(b.substring(5));
        System.out.println(b.substring(5,9));
        System.out.println("********************************");
        System.out.println(b.indexOf('a'));
        System.out.println(b.lastIndexOf('a'));
        System.out.println(b.replace("kothalkar","komal"));
        System.out.println(b.indexOf('a',4));
        System.out.println("********************************");
        String b1 =b.replaceAll("komal kothalkar ajay","xyz");
        System.out.println(b1);
        String b2 = b.replaceFirst("komal","immy");
        System.out.println(b2);


        String p = "java";
        String p1= "java";
        String p2= new String("java");
        String p3 = new String("java1");
        System.out.println(p==p1); // true
        System.out.println(p==p2); // false
        System.out.println(p.equals(p1)); // value true
        System.out.println(p.equals(p3)); // false
        //== operator--> it will compare memory location
        //equals --> will compare content/ value







    }
}
