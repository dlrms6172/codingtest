public class Solution6 {
    public static int solution(int n) {
        int answer = 0;

        for(int i =0; i<=n; i++)
        {
            if(i%2==0)
                answer+=i;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution(6);
    }
}
