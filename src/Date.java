public class Date {
  private String dateDay;
  private String holyday;

  public Date(String dateDay, String holiday){
    this.dateDay = dateDay;
    this.holyday = holiday;
  }

  public String getDateDay() {
    return dateDay;
  }

  public String getHolyday() {
    return holyday;
  }
}
