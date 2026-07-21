import java.util.Scanner;

public class primenumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a number:");
        int num=sc.nextInt();

        int count=2;
    
        
        for(int i =2; i< num;i++){
            if(num % i == 0){
                 count++;

            }
        }
            if(count==28){
                System.out.println("the number is prime");
            }
            else{
                System.out.println("the number is not prime");
            }
             
        
        



    }
} 
    

