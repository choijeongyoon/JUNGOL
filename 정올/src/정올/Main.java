package 정올;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
         
        int arr[] = new int[5];
        
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = sc.nextInt();
        }
        
        // 출력
        for(int i = 0; i < arr.length; i++) {
        	System.out.println(isPrime(arr[i]));
        }
       
    }
     public static String isPrime(int num) {
    	 if(num == 1)
    		 return "number one";
    	 for(int i = 2; i <= Math.sqrt(num); i++) {
    		 if(num % i == 0)
    			 return "composite number";
    	 }
    	 return "prime numebr";
     
    }
     
   
}

