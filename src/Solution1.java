import java.util.Stack;

public class Solution1 {


       static int solution(String s) {
            int answer=0;

           Stack<Integer> stack = new Stack<>();

           for(String t:s.split(" ")){
               if(t.equals("Z")){
                   if(!stack.isEmpty())
                       answer -= stack.pop();
               }
               else
                   answer += stack.push(Integer.parseInt(t));
           }

           System.out.println(answer);
            return answer;
        }



    public static void main(String[] args) {

        solution("10 20 Z 30 40");

    }
}
