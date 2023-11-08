// extension of rabbit 1 uses rabbit one as a basis for program
public class meatRabbit extends rabbit1  {
    private int weight; 
    private String feedtype;
    public meatRabbit (String name, int age, String feedtype, int weight){
        // creates the different varibles for the meat rabbit
        super(name, age);
        this.feedtype=feedtype;
        this.weight=weight;
// feed type is registerd
}
      public void feed(int feed){
      weight=weight+feed;
      }
      // weight is registerd
      public int getWeight(){
      return weight;
      }
      //name is registerd
      public String toString() {
        return "Rabbit(name='" + name + "', age=" + age + "this rabbit eats "+feedtype;
    }
  }

