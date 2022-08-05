public class Number_reverse {
    public int[] solution(long n) {    
        // 길이 알아내기
        String temp = n + "";
        int[] answer = new int[temp.length()];
        // int 배열에 값 넣기
        int index = 0;
        for (int i = temp.length()-1; i >= 0 ; i--) {
            answer[index++] = temp.charAt(i) - '0';
        }
        return answer;
    }
}
