package BasicJava_Concept;

public class Ifelsecondition2 {
    public static void main(String[] args) {

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(arr2);
        System.out.println(arr2[2]);
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]%2==0){
                System.out.println(arr2[i]);
                break;
            }else{
                System.out.println(arr2[i]+" "+"is not multiple of 2");
            }
        }
    }
}
