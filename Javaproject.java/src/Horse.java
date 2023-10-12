public class Horse {
        // Instance variables
        private String name;
        private int age;
        private String color;
        private String hair;
    
        // Constructor
        public Horse(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    
        // Getter methods
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    
        public String getColor() {
            return color;
        }
    
        // Setter methods
        public void setName(String name) {
            this.name = name;
        }
    
        public void setAge(int age) {
            this.age = age;
        }
    
        public void setColor(String color) {
            this.color = color;
        }
    
        // Method to make the horse gallop
        public void gallop() {
            System.out.println(name + " is galloping!");
        }
    
        // Method to display horse information
        public String toString() {
            String outputt="";
            outputt=outputt +"Name: " + name;
            outputt=outputt +"Age: " + age + " years";
            outputt=outputt +"Color: " + color;
            outputt=outputt +"hair: " + hair;
            return outputt;
        }
    }



