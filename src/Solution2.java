import java.util.Arrays;


public class Solution2 {

    static int[] solution(int[] numbers, int num1, int num2){

        int[] answer = Arrays.copyOfRange(numbers,num1,num2+1);

        for(int i=num1-1; i<num2; i++) {

            System.out.print(answer[i]+" ");
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

        solution(arr,1,3);




    }


}
