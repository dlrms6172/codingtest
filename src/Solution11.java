public class Solution11 {

    public static int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if(n % i != 1){
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(10);
        solution(12);
    }
}
