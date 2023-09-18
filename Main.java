import java.util.Scanner;
//after, PLEASE CHANGE CLASSNAME AND RENAME TO "ROCKPAPERSCISSORS" 


public class Main{
	public static void main(String[] args){

    Scanner input = new Scanner(System.in); 
    
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");

    
    Move computer = new Move("computer"); 
    Move player = new Move("player"); 
    
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);

    int roundCt = 0; 
		int roundsToWin = 2;
    int k = 0; 
    int end = 0; 

    
    int playerPoints = 0;
    int computerPoints = 0; 
    
    while(end == 0){

      roundCt = 0; 
      
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option: "); 
      System.out.println("   "); 
      System.out.println("1. Start game: "); 
      System.out.println("2. Change number of rounds: "); 
      System.out.println("3. Exit application: "); 
  
      k = input.nextInt(); 
      
      //change number of rounds
      if(k==2){
        
        System.out.println(" ");
        System.out.println("How many points are needed to win a match? "); 
        
        roundsToWin = input.nextInt(); 
  
        System.out.println("New setting has been saved!"); 
      }

      //game START


      else if(k==1){
        
          System.out.println(" ");
          System.out.println("This match will be first to " + roundsToWin + " point/s."); 
          System.out.println(" ");
        

          while(playerPoints != roundsToWin && computerPoints != roundsToWin){
            //computer move
            int random = (int) Math.floor(Math.random()*3) + 1; 
    
            if(random == 1){
              computer = rock; 
            }
    
            if(random == 2){
              computer = paper; 
            }
    
            if(random == 3){
              computer = scissors; 
            }
    
            System.out.println("The computer has selected its move. Select your move: (1-rock, 2-paper, 3-scissors)"); 
            int choice = input.nextInt(); 
    
            if(choice == 1){
              player = rock; 
            }
    
            if(choice == 2){
              player = paper; 
            }
    
            if(choice == 3){
              player = scissors; 
            }
    
            //round result
    
            System.out.println("Player chose " + player.getName() + "," + "Computer chose " + computer.getName()); 
    
            if(scissors.compareMoves(player,computer) == 0){
              System.out.println(" ");
              System.out.println("Player wins round."); 
              System.out.println(" ");
              playerPoints ++; 
            }
    
            if(scissors.compareMoves(player,computer) == 1){
              System.out.println(" ");
              System.out.println("Computer wins round."); 
              System.out.println(" ");
              computerPoints++; 
            }
    
            if(scissors.compareMoves(player,computer) == 2){
              System.out.println("Tie!"); 
            }
    
            //display roster 
    
            System.out.println("Player: " + playerPoints + ", Computer: " + computerPoints); 
  
            if(playerPoints == roundsToWin){

              System.out.println(" ");
              
              System.out.println("Player wins! ");

              System.out.println(" ");
              System.out.println(" ");
              
            }
  
            if(computerPoints == roundsToWin){
              System.out.println(" ");
              
              System.out.println("Computer wins!");
              
              System.out.println(" ");
              System.out.println(" ");
            }
            System.out.println(" ");
            System.out.println(" ");
          }
      } 
          
      //game END
      else{
        
        System.out.println("Thank you for playing! "); 
        
        end = 1; 
        break; 
      }
    
    }
		
	}
}