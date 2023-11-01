public class rabbit1 implements Comparable {
    public String name;
    public int age;

        public rabbit1(String name, int age) {
            this.name = name;
            this.age = age;
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

        @Override
        public int compareTo(rabbit1 o) {
            return o.age - age;
        }

        @Override
        public int compareTo(Object o) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        }
       
        
}
         

