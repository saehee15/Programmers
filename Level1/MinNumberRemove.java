

public class MinNumberRemove {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[] {-1};
		int[] answer = new int[arr.length-1];
        
        int min = arr[0]; 
        		
        // 최소값 구하기, arr[0]을 최소값이라고 가정하에
        for(int i=0;i<arr.length;i++) {
          	//for문 돌리면서 다음값이랑 비교
            if(min>arr[i]) {
            	min = arr[i];
            }
        }
        
        int index =0;
        // 최소값 제외하고 answer에 넣기
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] != min) {
        		answer[index++] = arr[i];
        	} 
        }
        return answer;
    }  
}