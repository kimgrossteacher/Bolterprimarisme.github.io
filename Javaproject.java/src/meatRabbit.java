public class meatRabbit extends rabbit1  {
    private int weight; 
    private String feedtype;
    public meatRabbit (String name, int age, String feedtype, int weight){
        super(name, age);
        this.feedtype=feedtype;
        this.weight=weight;
        System.out.println("created rabbit "+name+" " +age);
}
      public void feed(int feed){
      weight=weight+feed;
      }
      public int getWeight(){
      return weight;
      }
      public String toString() {
        return "Rabbit(name='" + name + "', age=" + age + "this rabbit eats "+feedtype;
    }
  }

