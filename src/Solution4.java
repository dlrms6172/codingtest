public class Solution4 {

    public static int solution(int chicken) {
        int answer = 0;
        int sum = 0;
        int rm = 0;
        int rmsum = 0;


        while(chicken>=10){

            sum = chicken/10;
            rm = chicken%10;


            chicken = sum + rm;

            answer += sum;
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
            solution(1081);
    }
}
