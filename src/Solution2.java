import java.util.Arrays;



public class Solution2 {




    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,};
        int num1=1;
        int num2=3;
        int[] answer = Arrays.copyOfRange(numbers,num1,num2+1);;


        for(int i=num1-1; i<num2; i++){
            System.out.print(answer[i]);
        }



    }


}
