public class SumDigit {
    public int solution(int n) {
        int answer = 0;
      
        // 길이 알아내기
        String temp = n + " ";
        int[] arr = new int[temp.length()];
        // int 배열에 값 넣기
        for (int i = 0; i < temp.length()-1; i++) {
            arr[i] = temp.charAt(i) - '0';
        }
        // answer에 더하기
        for(int i=0; i<arr.length-1; i++){
            answer += arr[i];
        }
        return answer;
    }

    // 이건 다른 사람코드! 이러면 형변환도 없이 가능하네
    // public int solution(int n) {
    //     int answer = 0;

    //     while(true){
    //         answer+=n%10;
    //         if(n<10)
    //             break;

    //         n=n/10;
    //     }
    //     return answer;
    // }
}
