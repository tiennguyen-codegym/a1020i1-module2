package _19_string_regex;

public class TestString {

    public static void main(String[] args) {

        // String methods
//        String str = "   a1020i1         ";
//        System.out.println(str.charAt(3));
//        System.out.println(str.concat("hello"));
//        System.out.println(str);
//        System.out.println(str.trim());
//
//        System.out.println("a1020i1".equals("A1020i1"));
//        System.out.println("a1020i1".equalsIgnoreCase("A1020i1"));
//
//        System.out.println("abc".compareTo("abd"));
//
//        System.out.println("abc".startsWith("ba"));
//
//        System.out.println("nhan".contains("N"));

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello ");
        stringBuilder.append("World");

        String strTmp = stringBuilder.toString();
        System.out.println(strTmp);

//        StringBuilder stringBuilder1 = new StringBuilder(strTmp);
    }
}
