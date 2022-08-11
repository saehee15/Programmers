// 두 정수 사이의 합
public class Sum {
    public long solution(int a, int b) {
        long answer = 0;
        if(a > b){
            int temp = b;
            b = a;
            a = temp;
        }  
        for(int i= a; i <= b; i++){
            answer += i;
        }
        return answer;
    }
    // 다른 사람 코드
    // 나는 큰 숫자를 b로 바꿨는데, 삼항연산자 쓰면 간단하네
    // public long solution(int a, int b) {
    //     long answer = 0;
    //     for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
    //         answer += i;
  
    //     return answer;
    // }
}
