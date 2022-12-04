public class Solution7 {

    public static String solution(String polynomial) {
        String[] trans = polynomial.split(" \\+ ");

        int calcX = 0;
        int calcNum = 0;
        for(int i=0; i<trans.length; i++) {
            trans[i] = trans[i].trim();
            if(trans[i].contains("x")) {
                if(trans[i].contentEquals("x")) {
                    trans[i] = trans[i].replace("x", "1");
                    calcX += Integer.parseInt(trans[i]);
                } else {
                    trans[i] = trans[i].replace("x", "");
                    calcX += Integer.parseInt(trans[i]);
                }
            } else {
                calcNum += Integer.parseInt(trans[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (calcNum == 0) {
            sb.append(Integer.valueOf(calcX)+"x");
        } else if(calcX == 0) {
            sb.append(Integer.valueOf(calcNum));
        } else if (calcX == 1){
            sb.append("x + "+Integer.valueOf(calcNum));
        } else {
            sb.append(Integer.valueOf(calcX)+"x + "+Integer.valueOf(calcNum));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        solution("3x + 7 + x");
        solution("x + x + x");
    }
}
