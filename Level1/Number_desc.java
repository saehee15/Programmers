public class Number_desc {
    public long solution(long n) {
        long answer = 0;       
        // 길이 알아내기
        String temp = n + " ";
        int[] arr = new int[temp.length()];
        // int 배열에 값 넣기
        for (int i = 0; i < temp.length()-1; i++) {
            arr[i] = temp.charAt(i) - '0';
        }
        // 내림차순
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] <arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
        // 문자로 받아서
        String s = "";
        for(int i=0; i<arr.length-1; i++){
            s += String.valueOf(arr[i]);
        }
        // long타입으로
        answer = Long.parseLong(s);
        return answer;   
    }
}
