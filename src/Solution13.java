import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution13 {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> arr2 = new ArrayList<>();
        int min = 0;

        if(arr.length <= 1){
            answer = new int[]{-1};
            for(int i =0; i<answer.length; i++){
                System.out.println(answer[i]);
            }
            return answer;
        }

        for(int i=0; i<arr.length; i++){
            arr2.add(arr[i]);
        }

        for(int i=1; i<arr.length; i++){
            if(arr[min] > arr[i]){
                min = i;
            }
        }

        arr2.remove(min);

        answer = new int[arr2.size()];

        for(int i =0; i<arr2.size(); i++){
            answer[i] = arr2.get(i);
        }
        for(int i =0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr= {4,3,2,1};
        int[] arr2 = {10};
        solution(arr);
        solution(arr2);
    }
}
