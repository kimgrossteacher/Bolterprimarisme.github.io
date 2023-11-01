public class raceRabbit extends rabbit1{
    private int speed; 
    private String dexterity;
    public raceRabbit (String name, int age, String dexterity, int speed){
        super(name, age);
        this.dexterity=dexterity;
        this.speed=speed;
}
      public void excersise(int excersise){
      speed=speed+excersise;
      }
      public int getspeed(){
      return speed;
      }
      public String toString() {
      return "Rabbit(name='" + name + "', age=" + age + "this rabbit is fast"+dexterity;
      }
}
