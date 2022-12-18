public class Solution15 {
    public static String solution(int n) {
        String answer = "";


        String su = "수";
        String bak = "박";

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer += su;
                System.out.println(answer);
            } else {
                answer += bak;
                System.out.println(answer);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        solution(3);
        solution(4);
    }
}
