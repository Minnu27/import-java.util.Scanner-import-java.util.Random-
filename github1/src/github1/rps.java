package github1;
import java.util.Scanner;
import java.util.Random;

public class rps {
	
	
	    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	        System.out.println("Enter 0 forr rock,1 for paper, 2 for scissor");
	        int userInput=sc.nextInt();
	        Random random=new Random();
	        int computerInput= random.nextInt(3);
	        if(userInput==computerInput){
	            System.out.println("Draw");
	        }
	        else if (userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1 ) {
	            System.out.println("You win!");
	        }
	        else {
	            System.out.println("Computer wins");
	        }
	        System.out.println("computer choice:"+computerInput);
	        if (computerInput==0){
	            System.out.println("Computer choice:Rock");
	        }
	        else if(computerInput==1){
	            System.out.println("computer choice : paper");
	        }
	        else{
	            System.out.println("computer choice:scissor");
	        }
	    }
	}


