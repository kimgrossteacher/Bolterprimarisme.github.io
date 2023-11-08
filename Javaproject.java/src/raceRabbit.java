// extension of rabbit 1 uses rabbit one as a basis for program
public class raceRabbit extends rabbit1{
    private int speed; 
    private String dexterity;
    public raceRabbit (String name, int age, String dexterity, int speed){
                // creates the different varibles for the race rabbit
        super(name, age);
        this.dexterity=dexterity;
        this.speed=speed;
}
// the exsersie is created
      public void excersise(int excersise){
      speed=speed+excersise;
      }
      // speed is created
      public int getspeed(){
      return speed;
      }
      //name is created
      public String toString() {
      return "Rabbit(name='" + name + "', age=" + age + "this rabbit is fast"+dexterity;
      }
}
