class StringToNumber {
    // 문자열 처리
    // int i;
    // String s;
    // int -> String 변환 : String.valueOf(i);, 혹은 i + "";
    // String -> int 변환 : Integer.parseInt(s);
    public int solution(String s) {
        
         String[] words = {"zero", "one", "two","three","four","five","six"
                            ,"seven","eight", "nine"};
        
        for(int i =0; i < words.length; i++){
 //           s = s.replace(words[i], String.valueOf(i)); 이것도 가능
           s = s.replace(words[i], String.valueOf(i));
        }
        
        return Integer.parseInt(s);
        
    }
}