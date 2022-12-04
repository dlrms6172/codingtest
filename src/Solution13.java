import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution13 {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
                List<int[]> list = Arrays.asList(arr);

            }


        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        solution(arr);
    }
}
