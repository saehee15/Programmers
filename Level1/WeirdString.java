public class WeirdString {
        public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split(""); //regex는 뭐지, vscode로 작성하니 이상한게 생김
 
        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
        System.out.println(answer);
        return answer;
    }
}
