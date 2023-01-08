public class Solution18 {
    public static boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int num = x;

        while(num != 0){
            sum += num%10;
            num /= 10;
        }

        if(x%sum == 0){
            answer = true;
        }else{
            answer = false;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(14);
        solution(117);
    }

}
