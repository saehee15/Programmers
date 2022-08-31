// 소수 찾기
public class Sosu {
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++){
            boolean flag = true;
            // j < i로만 하면 시간초과 걸림
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j == 0)  { //나누어떨어지면 소수X
                  flag = false; //falg를 false로 바꿔서 소수가 아니라고 체크
                      break; //break를 안해주면 효율성 테스트 통과 못함
                 } 
              }
         if(flag==true) //소수인 숫자는 flag가 변하지 않고 true 
            answer++; 
       }
      return answer;
   } 
}
