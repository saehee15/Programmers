// 같은 숫자는 싫어
public class SameNumberNo {
    public int[] solution(int []arr) {
        int size=0;
        for(int i=1; i<arr.length; i++){
             if(arr[i] == arr[i-1]){
                size++;
            }
        }
        int[] answer = new int[arr.length - size];
        int index=0;
        answer[index++] = arr[0];
        for(int i=1; i < arr.length; i++){
             if(arr[i] != arr[i-1]){
                answer[index++] = arr[i];
            }
        }
           
        return answer;
    }
}
