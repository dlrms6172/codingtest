public class Solution14 {

    public static int solution(int[] a, int[] b) {
        int answer = 0;


        for(int i = 0; i<a.length; i++){

            answer+= (a[i]*b[i]);

        }
        System.out.println(answer);
            return answer;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {-3,-1,0,2};
        int c[] = {-1,0,1};
        int d[] = {1,0,-1};

        solution(a,b);
        solution(c,d);
    }
}
