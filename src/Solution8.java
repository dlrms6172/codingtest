import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Solution8 {

        public static int[] solution(int[] arr, int divisor) {

            List<Integer> list = new ArrayList<>();

            for(int n : arr){
                if(n % divisor == 0) {
                    list.add(n);
                }
            }

            if(list.isEmpty()){
                list.add(-1);
            }

            Collections.sort(list);

            int[] answer = new int[list.size()];

            for(int i = 0; i<list.size(); i++){
                answer[i] = list.get(i);
            }

            System.out.println(answer);
            return answer;
        }


    public static void main(String[] args) {
        int[] array1={5,9,7,10};
        int[] array2={2,36,1,3};
        int[] array3={3,2,6};

        solution(array1,5);
        solution(array2,1);
        solution(array3,10);
    }
}
