package Java_coding_question;

import java.util.HashMap;
import java.util.Map;

public class occurance_Of_words {
    public static void main(String[] args) {

        String str="I am learning learning java java java programming";
        Map<String,Integer> map=new HashMap<String,Integer>();
        Integer count=1;
        String[] arr=str.split(" ");
         for(int i=0;i<arr.length;i++){
             if(!map.containsKey(arr[i])){
                 map.put(arr[i],count);
             }else {
                 map.put(arr[i],map.get(arr[i])+1);
             }
         }
//printing the output
        for(String x:map.keySet()){
            System.out.println("The count of word:"+x+"=" + map.get(x));
        }
    }
}
