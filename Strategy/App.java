package Strategy;

public class App {
  public static void main(String[] args) {
    WeekDays wd = new WeekDays();
    
    wd.setStrategy(new Monday());
    wd.dayOfTheWeek();

    wd.setStrategy(new Tuesday());
    wd.dayOfTheWeek();

    wd.setStrategy(new Wednesday());
    wd.dayOfTheWeek();

    wd.setStrategy(new Thursday());
    wd.dayOfTheWeek();
    
    wd.setStrategy(new Friday());
    wd.dayOfTheWeek();

    wd.setStrategy(new Saturday());
    wd.dayOfTheWeek();

    wd.setStrategy(new Sunday());
    wd.dayOfTheWeek();
  }
}
