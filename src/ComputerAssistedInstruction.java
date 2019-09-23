//Computer Assisted Instruction - this program will ask a user for the answer to multiplication problems
//CSIS 212 - Fall 2019 B03

import java.security.SecureRandom; //import SecureRandom and Scanner classes for use in program
import java.util.Scanner;


public class ComputerAssistedInstruction {
    
    public static int counter = 0; //create counter that can be used in all methods of class ComputerAssistedInstruction
    
    public static void main(String[] args){
        
        System.out.println("Alex Jones - Computer Assisted Instruction"); 
        
        newQuestion(); //call newQuestion method to generate question
    }
    
    //method to generate a question: What is __ x __ ?
    public static void newQuestion(){
        
       Scanner input = new Scanner( System.in ); 
       SecureRandom randomNumbers = new SecureRandom(); //randomNumbers object will produce secure random numbers
       
       //variables x and y will pick random integers from 1 to 9
       int x = 1 + randomNumbers.nextInt(9);
       int y = 1 + randomNumbers.nextInt(9);
       
       int answer = x * y; //initializes and assigns x times y to answer
       
       while ( counter <= 4 ) { //loops 5 times
       
       System.out.printf( "What is %d x %d? ", x, y);
       
    
       int userAnswer = input.nextInt();
       
          //if userAnswer is same as answer, message prints, counter adds 1, and newQuestion method call creates new question
           if ( userAnswer == answer ){
               
               System.out.printf("Very Good!%n");
               
               counter++;
               
               newQuestion();
           }
           
           //if the userAnswer is not the same as answer, loops while incorrect, message prints, same question will show until it is answered correctly
           if ( userAnswer != answer ){
               
               while (userAnswer != answer){ 
                   
                   System.out.printf("No. Please try again.%n"); 
                   
                   System.out.printf( "What is %d x %d? ", x, y);
                   
                   userAnswer = input.nextInt();
                   
                if (userAnswer == answer){ // if answered correctly message prints, counter incremented and new question is generated
                    
                    System.out.printf("Very Good!%n");
               
                    counter++;
               
                    newQuestion();
                } 
                }
           }
        }
    }
}
