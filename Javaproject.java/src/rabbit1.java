public class rabbit1 {
    public rabbit1(String string, int i) {
    }

    public class Rabbit {
        private String name;
        private int age;
    
        public Rabbit(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    
        @Override
        public String toString() {
            return "Rabbit{name='" + name + "', age=" + age + '}';
        }
    }
}
