import java.util.*;

public class CharacterDesc {
    public String solution(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr,0,arr.length));
        return sb.reverse().toString();
    }
}
