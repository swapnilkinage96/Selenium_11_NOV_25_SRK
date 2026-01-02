package Java_coding_question;

public class CountCharacterOccurance {
    public static void main(String[] args) {
        String str="Java is object oriented language";
        int result=str.length()-str.replaceAll("o","").length();
        System.out.println(result);
     }
}
