// 약수의 개수의 덧셈
public class DivisorCount {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0; // 약수의 개수
        
        for(int i = left; i < right + 1; i++){
            for(int j=1; j <= i; j++){
                if( i % j == 0){
                    count++;
                }
            }
            
            if(count % 2 == 0){
                answer += i;
            } else {
                answer -= i;
            }
            count = 0; // count 초기화
            
        }
        return answer;
    }
}
