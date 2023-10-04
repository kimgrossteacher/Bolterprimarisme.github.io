// written by Stephen D 
// Done for Software Devolopment
// This is a loop and counter


public class App {
    public static void main(String[] args) { 
  
      int sum =0;   
        System.out.println("Hello, World!");
//This starts my loop that counts from 1-100

        for(int i=1;i<=100;i++) { 
          sum=sum +i ;
             if(i % 2==1){
             
// Calculates wether its even or  
             System.out.println(i+" odd");  
             }
             else{
              System.out.println(i+" even"); 
             }
            }
            System.out.println("sum="+sum);
          }
    }
            