// 없는 숫자 더하기 
public class NoNumberSum {
    public int solution(int[] numbers) {
        // 0~9를 더한 숫자에서
         int answer = 45;
        // 포함하고 있는 숫자를 뺀다
         for (int n : numbers) {
             answer -= n;
         }
         return answer;
     }
}
