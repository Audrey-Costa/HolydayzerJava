import java.util.Objects;
import java.util.Scanner;

public class DateFinder {
  Date[] holydays = new Date[11];
  public DateFinder(Date[] holydays){
    this.holydays = holydays;
  }

  public String findHolyday() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Insira uma data:");
        String date = reader.next();

        String holiday = "";
        for(int i = 0; i < holydays.length; i++){
            if(Objects.equals(date, holydays[i].getDateDay())){
                holiday = holydays[i].getHolyday();
            }
        }

        if("".equals(holiday)){
            return "Nenhum feriado encontrado!";
        }else{
            return holiday;
        }
  }

  public void findHolydays(){
    for(int i = 0; i < holydays.length; i++){
      System.out.println(holydays[i].getDateDay() + " ==> " + holydays[i].getHolyday());
    }
  }
}
