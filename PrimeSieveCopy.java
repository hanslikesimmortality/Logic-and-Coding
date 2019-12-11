

import java.util.Arrays;
 

public class PrimeSieveCopy {
    public static boolean[] sieve = new boolean [1000];
        
   
 
    public static void main(String[] args) {
        Arrays.fill(sieve, true); //sets all values to true
        sieve[0] = false;
        sieve[1] = false;
  
 
  for (int i = 2; i<sieve.length; i++) {
           for (int j = 2*i; j<sieve.length; j += i) {
               sieve [j] = false; 
    
    
        
        
        
        
   
    
      }  
    } 

 System.out.println(Arrays.toString(sieve));
}
public static void collectPrimes () {
    for (int x  = 0; x<=999; x++) {
        if (sieve [x] = true); 
        
        System.out.println(); 
    }
}
}
        
    
    


 
                
        
       
            
       
       
           
           
         
           
            
            
        
       
            
        //write and implement the sieve algorithm
        
        
        //print a list of prime numbers to the console
        
    
    
        
