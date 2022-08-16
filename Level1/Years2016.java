import java.time.DayOfWeek;
import java.time.LocalDate;

class Years2016 {
    public String solution(int a, int b) {
        String answer = "";
        
        LocalDate date = LocalDate.of(2016, a, b);    
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        return answer = dayOfWeek.toString().substring(0,3);

    }
}