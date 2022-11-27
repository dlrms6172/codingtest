public class Solution9 {


        public static String solution(int num) {
            String answer = "";

            if(num %2 == 0){
                answer = "Even";
            }
            else{
                answer = "Odd";
            }
            System.out.println(answer);
            return answer;
        }


    public static void main(String[] args) {
        solution(3);
        solution(4);
    }
}
