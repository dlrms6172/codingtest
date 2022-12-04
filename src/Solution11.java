public class Solution11 {

    public static int solution(int n) {
        int answer = 1;

        while(n % answer != 1) {
            answer++;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(10);
        solution(12);
        solution(13);
    }
}
