public class HarshadNumber {
    public boolean solution(int x) {
        
        int num = x; // x가 13이라고 하면
        int sum = 0;
        
		while (num >= 1) { 
			sum += num % 10; // 1번) 처음 3이 sum에 더해지고 3번) 다시 1이 sum에 더해져서 4
			num /= 10; // 2번) 1이 num으로 됨  4번) 0.1이 되서 num이 1보다 작아지니 while 빠져나옴 
		}
 
		if ( x % sum == 0) { // 13을 4로 나눔, 떨어지지 않으니 false 반환
			 return true;
		} else
			 return false;
    }
}
