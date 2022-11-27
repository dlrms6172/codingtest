public class Solution10 {

    public static long solution(int a, int b) {
        long answer = 0;

        if(a<b){
            for(int i=a; i<=b; i++){
                answer += i;
            }
        }

        else if(a==b){
            answer = a;
        }

        else if(b<a){
            for(int j=b; j<=a; j++){
                answer += j;
            }
        }

        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        solution(3,5);
        solution(3,3);
        solution(5,3);
    }
}
