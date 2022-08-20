// 모의고사

import java.util.ArrayList;

public class MockExam {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int count1 = 0, count2 = 0,  count3 = 0;
        
        System.out.println(0 % arr1.length);
         System.out.println(1 % arr1.length);
         System.out.println(2 % arr1.length);
         System.out.println(3 % arr1.length);
         System.out.println(4 % arr1.length);
        for(int i =0; i < answers.length; i++){
            if(arr1[i%arr1.length] == answers[i]) count1++; 
            if(arr2[i%arr2.length] == answers[i]) count2++; 
            if(arr3[i%arr3.length] == answers[i]) count3++; 
        }
        
         int max = Math.max(Math.max(count1, count2),count3); 
        
         ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==count1) list.add(1); 
        if(max==count2) list.add(2);
        if(max==count3) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}
