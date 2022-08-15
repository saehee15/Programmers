// 부족한 금액 계산하기
public class PriceCalculate {
    public long solution(long price, long money, long count) {
        long answer = 0;
        long result = 0;
        
        for(int i =0; i <= count; i++ ){
            result += price * i;
        }
        
        if(result > money){
            answer = result - money;
        } 
        return answer;
    }
}
