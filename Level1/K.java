// K번쨰수

import java.util.Arrays;

public class K {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            // copyOfRange  배열의 지정된 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}

