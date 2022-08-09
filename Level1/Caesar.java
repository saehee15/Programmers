// 시저의 암호
import java.util.Arrays;

public class Caesar {
    public String solution(String s, int n) {
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < s.length(); j++){
                if(arr[j] == ' ') continue;
                //만약 z 또는 Z일때, a,A가 되기 위해 26 빼줌, 아스키코드
                else if(arr[j] == 'z' || arr[j] == 'Z') arr[j] -= 26;
                arr[j] += 1;
            }
        }

        String answer = new String(arr);
        System.out.println(answer);
        return answer;
    }

}
