public class rabbit1 {
    public String name;
    public String age;

    public rabbit1(String string, int i) {
    }

    public class Rabbit {
        private String name;
        private int age;

        public Rabbit(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("created rabbit "+name+" " +age);
        }
    
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    
        public String toString() {
            return "Rabbit{name='" + name + "', age=" + age + '}';
        }
    }
}
