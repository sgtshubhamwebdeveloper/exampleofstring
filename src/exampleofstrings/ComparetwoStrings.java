package exampleofstrings;

public class ComparetwoStrings {
    public static void check(String string1, String string2) {
        if (string1.compareTo(string2)!=0) {
            System.out.println(string1 + " " + string2 + " : Not Equal");
        }
        else {
            System.out.println(string1 + " " + string2  + " : Equal");
        }
    }

    public static void main(String args[])  {
        String string1 = new String("Abhijeet");
        String string2 = new String("Rohit");
        String string3 = new String("Prathamesh");
        String string4 = "Harshad";
        String string5 = "Amit";
        check(string1, string2);
        check(string2, string3);
        check(string1, string4);
        check(string4, string5);
    }
}