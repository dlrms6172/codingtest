import java.util.ArrayList;

/**
 * 같은 숫자는 싫어
 */
public class Solution16 {
    public static int[] solution(int []arr) {
        int[] answer = {};
        int num = -1;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i : arr){
            if(i != num){
                list.add(i);
                num = i;
            }

        }


        answer = new int[list.size()];

        for(int j=0; j<list.size(); j++){
            answer[j] = list.get(j).intValue();
        }

        for(int i=0; i<answer.length;i++){
            System.out.println(answer[i]);
        }


        return answer;
    }
    public static void main(String[] args) {
        int[] answer = {1,1,3,3,0,1,1};
        solution(answer);
    }
}
