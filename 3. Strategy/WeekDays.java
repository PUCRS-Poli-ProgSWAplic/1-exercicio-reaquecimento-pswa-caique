package Strategy;

public class WeekDays {

  private Strategy strategy;

  public void setStrategy(Strategy st) {
    this.strategy = st;
  }

  public void dayOfTheWeek () {
   strategy.day();
  }
}
