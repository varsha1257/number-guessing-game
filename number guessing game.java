import java.util.*;

class Guesser {
   int guessNum;

   int guessingNumber() {

      Scanner scan = new Scanner(System.in);
      System.out.println("Guesser ! Kindly guess the number");
      guessNum = scan.nextInt();
      return guessNum;
   }

}

class Player {
   int guessNum;

   int guessingNumber() {
      Scanner scan = new Scanner(System.in);
      System.out.println("Player! Kindly guess the number");
      guessNum = scan.nextInt();
      return guessNum;
   }

   int guessingNumber2() {
      Scanner scan = new Scanner(System.in);
      System.out.println("Player2! Kindly guess the number");
      guessNum = scan.nextInt();
      return guessNum;
   }

   int guessingNumber3() {
      Scanner scan = new Scanner(System.in);
      System.out.println("Player3! Kindly guess the number");
      guessNum = scan.nextInt();
      return guessNum;
   }

}

class Umpire {
   int numFromGuesser;
   int numFromPlayer1;
   int numFromPlayer2;
   int numFromPlayer3;

   void collectNumFromGuesser() {
      Guesser g = new Guesser();
      numFromGuesser = g.guessingNumber();
   }

   void collectNumFromPlayers() {
      Player p1 = new Player();
      Player p2 = new Player();
      Player p3 = new Player();

      numFromPlayer1 = p1.guessingNumber();
      numFromPlayer2 = p2.guessingNumber2();
      numFromPlayer3 = p3.guessingNumber3();

   }

   void compare() {
      if (numFromGuesser == numFromPlayer1) {
         if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
            System.out.println("Sab ne shi anwer  diya !So all are winner ");
         } else if (numFromGuesser == numFromPlayer2) {
            System.out.println("Player1 and player2 are win this game");
         } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("player1 and player3 are win this game");
         } else {
            System.out.println("Player1 wom the Game");
         }

      } else if (numFromGuesser == numFromPlayer2) {
         if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player2 and Player3 are win this game");
         } else {
            System.out.println("Player2 won the Game");
         }

      } else if (numFromGuesser == numFromPlayer3) {
         System.out.println("Player3 won the Game");

      } else {
         System.out.println("sab ka sab galat hai,App game har gaye !!");
      }
   }

}

class HelloWorld {
   public static void main(String[] args) {

      for (int i = 0; i < 4; i++) {
         System.out.println("WELCOME TO THIS GAME");
         System.out.println("Gate started ");
         System.out.println("Guys Guessing the number");

         Umpire u = new Umpire();

         u.collectNumFromGuesser();
         u.collectNumFromPlayers();

         u.compare();

         System.out.println("Playagain");
      }

   }

}

// ******************1:05 Started ************************* */