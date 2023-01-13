import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        Date confraternizaçãoMundial = new Date("01/01/2023", "Confraternização mundial");
        Date carnaval = new Date("21/02/2023", "Carnaval");
        Date pascoa = new Date("17/04/2023", "Páscoa");
        Date tiradentes = new Date("21/04/2023", "Tiradentes");
        Date diaDoTrabalho = new Date("01/05/2023", "Dia do trabalho");
        Date corpusChristi = new Date("08/06/2023", "Corpus Christi");
        Date independênciaDoBrasil = new Date("07/09/2023", "Independência do Brasil");
        Date nossaSenhoraAparecida = new Date("12/10/2023", "Nossa Senhora Aparecida");
        Date finados = new Date("02/11/2023", "Finados");
        Date proclamaçãoDaRepública = new Date("15/11/2023", "Proclamação da República");
        Date natal = new Date("25/12/2023", "Natal");

        final Date[] holydays = new Date[]{confraternizaçãoMundial, carnaval, pascoa, tiradentes, diaDoTrabalho, corpusChristi, independênciaDoBrasil, nossaSenhoraAparecida, finados, proclamaçãoDaRepública, natal};

        System.out.println("Insira uma data:");
        String date = reader.next();

        String holiday = "";
        for(int i = 0; i < holydays.length; i++){
            if(Objects.equals(date, holydays[i].getDateDay())){
                holiday = holydays[i].getHolyday();
            }
        }

        if("".equals(holiday)){
            System.out.println("Nenhum feriado encontrado!");
        }else{
            System.out.println(holiday);
        }

        for(int i = 0; i < holydays.length; i++){
            System.out.println(holydays[i].getDateDay() + "==>" + holydays[i].getHolyday());
        }
    }
}
