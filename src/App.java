import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Holidays holidays = new Holidays();
        Scanner user = new Scanner(System.in);
        System.out.println("Você deseja ver todos os feriados? ");
        String questionOne = user.next();

        if(questionOne.equals("sim")){
            holidays.getHolidays();
        }
    }
}
