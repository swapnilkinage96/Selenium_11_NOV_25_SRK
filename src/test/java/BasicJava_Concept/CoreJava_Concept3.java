package BasicJava_Concept;

import java.util.ArrayList;

public class CoreJava_Concept3 {
    public static void main(String[] args) {

        ArrayList<String> a=new ArrayList<>();
        a.add("SWAPNIL");
        a.add("shubham");
        a.add("amol");
        a.add("true");
        a.add("4");
        System.out.println(a.get(3));
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
            System.out.println("***************************************************");
        }
        for (String val :a){
            System.out.println(a);
        }
        /// item is present in ArrayList
        System.out.println(a.contains("Swapnil"));
    }
}
