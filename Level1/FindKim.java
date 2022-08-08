import java.util.ArrayList;

public class FindKim {
    public String solution(String[] seoul) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for(int i=0; i < seoul.length; i++)
        {
            arrayList.add(seoul[i]);
        }
        int index = arrayList.indexOf("Kim");
        String answer = "김서방은 " + index + "에 있다";
        return answer;
        
    }
}
