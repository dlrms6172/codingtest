

public class Solution1 {


       static int solution(String s) {
            int answer=0;

            //split() 사용
            String arr[] = s.split(" ");


            for(int i=0; i<arr.length; i++){

                answer+=arr[i].charAt(0);

                if(arr[i].charAt(0)==90){
                    System.out.println(i+"번째가 Z입니다");
                }

            }


           System.out.println(answer);

            return answer;
        }



    public static void main(String[] args) {

        solution("10 20 30 40");

    }
}
