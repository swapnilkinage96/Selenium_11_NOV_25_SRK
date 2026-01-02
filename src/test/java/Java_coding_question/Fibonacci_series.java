package Java_coding_question;

public class Fibonacci_series {
    public static void main(String[] args) {
        int a=0,b=1;
        for(int i=0;i<15;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b; b=c;
        }
    }
}
