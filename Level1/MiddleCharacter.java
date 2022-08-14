// 가운데 글자 가져오기
public class MiddleCharacter {
    public String solution(String s) {
        String answer = "";
        
        int index = 0;
        if(s.length() % 2 == 0){ // 짝수일때
            index = s.length() / 2;
            for(int i = index-1; i <= index; i++){
                answer += s.charAt(i);
            }
        } else { // 홀수일때
            index = s.length() / 2;
            answer += s.charAt(index);
        }
        System.out.println(index);
        return answer;
    }

    // 다른 분들을 substring 많이 사용함
}
