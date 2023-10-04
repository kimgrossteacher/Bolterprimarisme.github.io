// written by Stephen D 
// Done for Software Devolopment
// This is for arrays

public class Arrays {
    public static void main(String[] args) { 
     int [] count= new int [100]; 
        int sum =0;
     for(int i=0;i<count.length;i++) { 
        count [i]=i+1;
        } 
     for(int i=0;i<count.length;i++) {
        sum=sum +i ;
        if(count [i] % 2==1){
          // Calculates wether its even or  
          System.out.println(count [i]+" odd");  
          }
          else{
          System.out.println(count [i]+" even"); 
          }
        }
        System.out.println("sum="+sum);
    }  
}