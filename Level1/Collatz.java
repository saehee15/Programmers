public class Collatz {
    public int solution(int n) {
        int answer = 0;
        // 매개변수를 int 그대로 쓰면, 예제 3번에서 488이라는 결과가 나온다. 
        // 오버플로우 방지를 위해 long으로 형변환
        long num = n;
        if(num == 1){
            answer = 0;
        }
        while(num != 1){
           if(num % 2 == 0){
               num = num / 2;
           } else {
               num = num * 3 + 1;
           } 
            answer++;
            if(answer >= 500){
                return -1;
            } 
        }
        return answer;  
    }
}
