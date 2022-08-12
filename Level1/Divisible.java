
// 나누어 떨어지는 숫자 배열
import java.util.Arrays;

public class Divisible {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        int count = 0;
        int index = 0;
        for(int i =0; i < arr.length; i++){
           if(arr[i] % divisor == 0){
                count++;
            } 
        }
        if(count == 0){
            return answer = new int[] {-1};
        }
         answer = new int[count];
         for(int i =0; i < arr.length; i++){
           if(arr[i] % divisor == 0){
               answer[index++] = arr[i];
           } 
        }
        Arrays.sort(answer);
        return answer;
    }
}
