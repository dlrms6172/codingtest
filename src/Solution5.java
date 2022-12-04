public class Solution5 {

    public static int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);

        for(int i =0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i,i+1));
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(1234);
        solution(930211);
    }
}
