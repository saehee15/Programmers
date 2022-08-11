public class PAndYCount {
    boolean solution(String s) {
        boolean answer = true;
        
        char[] arry = s.toCharArray();
        
        int pCount = 0;
        int yCount = 0;
        
        for(char a : arry){
            if( a == 'p' || a == 'P' ) {  
            pCount++;
            } else if( a == 'y' || a == 'Y'){
            yCount++;
            } 
        }
        
         if(pCount == yCount){
            return answer = true;
        } else {
            return answer = false;
        }
    }
}
