import java.util.Arrays;

// 완주하지 못한 선수
public class NotFinish {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for(i=0;i<completion.length;i++)
            if(!participant[i].equals(completion[i]))
                break;

        return participant[i];
    }
}
