//예산
import java.util.Arrays;
public class Budget {
    public int solution(int[] d, int budget) {
        int sum = 0;
        int answer = 0;
        
        Arrays.sort(d);
        for(int a : d){
            sum += a;
            
            if(sum > budget){
                 break;
            } else {
                 answer++;
            }
        }
        return answer;
    }
}
