public class Solution12 {
    public static long solution(long n) {
        long answer = 0;

        for(long i=0; i*i<=n; i++){
            if(i*i == n)
                answer = (i+1) * (i+1);
            else
                answer = -1;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(121);
        solution(3);
    }
}
