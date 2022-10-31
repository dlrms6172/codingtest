public class Solution3 {

    public static int solution(int n, int t) {
        int answer = n;



        for(int i = 0; i<t; i++)
        {
            answer *= 2;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        solution(7,15);


    }
}
