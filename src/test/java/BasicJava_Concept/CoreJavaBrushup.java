package BasicJava_Concept;

public class CoreJavaBrushup {
    public static void main(String[] args) {
        int mynum = 4;
        String Website = "SWAPNIL KINAGE";
        char leter = 'r';
        double dec = 4.5;
        boolean mycard = false;
        System.out.println("Hello Guys");
        System.out.println(Website);

        //Array
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 19;

        //Array optimize
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(arr2);
        System.out.println(arr2[2]);

//for loop
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        String[] name={"rahul","swapnil","pranav"};
        for(String s:name){
            System.out.println(s);
        }
    }
}
