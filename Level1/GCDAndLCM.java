// 최대공약수를 먼저 구해준뒤,
// 두수의 곱/ 최대공약수 = 최소공배수로 구해준다.
// 예) 36과 60의 최대공약수는 12이고, 최소공배수는 180이다.
// 12 * 180 = 2160이다
// 30 * 60 = 2160이다! 
// 따라서 최대공약수를 구하고, 두 수의 곱에서 나눠주면 최소공배수가 된다

public class GCDAndLCM {
    public int[] solution(int n, int m) {
        
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        // 유클리드 호제법
        while(min != 0){
            int r = max % min;
            max = min;
            min = r;
        }
        int gcd = n* m / max;
        
        int[] answer = {max,gcd};
        return answer;
    
    }
}

