package Java_coding_question;

import java.util.Arrays;

public class second_largest_no {
    public static void main(String[] args) {
        int[] a={50,10,60,8};
        Arrays.sort(a);
        System.out.println(a[a.length-4]);
    }
}
