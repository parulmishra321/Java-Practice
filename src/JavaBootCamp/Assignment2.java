package JavaBootCamp;

//Importing Resources (Random)
import java.util.Random;

//Importing Resources (Scanner)
import java.util.Scanner;

public class Assignment2 {

  /**
   * Scanner used for input within program
   */
  public static Scanner scanner = new Scanner(System.in);

  /**
   * Main method that provides user with a menu in which each number
   * represents a different method (e.g addtion) that they can carry out
   */
  public static void main(String[] args) {

      try {
          // Declare variable for user's option and defaulting to 0
          int menuOption = 0;
          do {
              // Setting menuOption equal to return value from showMenu();
              menuOption = showMenu();

              // Switching on the value given from user
              switch (menuOption) {

              case 1:
                  add();
                  break;
              case 2:
                  subtract();
                  break;
              case 3:
                  guessRandomNumber();
                  break;
              case 4:
                  printLoop();
                  break;
              case 5:
                  System.out.println("Quitting Program...");
                  break;
              default:
                  System.out.println("Sorry, please enter valid Option");

              }// End of switch statement

          } while (menuOption != 5);

          // Exiting message when user decides to quit Program
          System.out.println("Thanks for using this Program...");

      } catch (Exception ex) {
          // Error Message
          System.out.println("Sorry problem occured within Program");
          // flushing scanner
          scanner.next();
      } finally {
          // Ensuring that scanner will always be closed and cleaning up
          // resources
          scanner.close();
      }

  }// End of main Method

  /**
   * Method that prints menu to screen and gets returns user's option from menu
   * @return Returns user Option
   */
  public static int showMenu() {

      // Declaring var for user option and defaulting to 0
      int option = 0;

      // Printing menu to screen
      System.out.println("Menu:");
      System.out.println("1.Add");
      System.out.println("2.Subtract");
      System.out.println("3.Guess a Random Number");
      System.out.println("4. Print many times");
      System.out.println("5. Quit Program");

      // Getting user option from above menu
      System.out.println("Enter Option from above...");
      option = scanner.nextInt();

      return option;

  }// End of showMenu

  /**
   * Method that adds two random numbers (from 1-100) and take a user guess
   * for the addition.Then outputs certain statements dependent if user guess
   * is correct or not.
   */
  public static void add() {

      // Setting up new random
      Random random = new Random();

      // Declaring Integers
      int num1;
      int num2;
      int result;
      int input;
      //defaulting input to 0
      input = 0;
      // Declaring boolean for valid user answer (Defaulted to false)
      boolean validAnswer = false;
      //Declaring boolean for correct user answer (default to false)
      boolean correctAnswer=false;
      do {
          // Create two random numbers between 1 and 100
          num1 = random.nextInt(100);
          num1++;
          num2 = random.nextInt(100);
          num2++;

          //Do while loop that loops until user gives valid input
          do {
              //validAnswer set to true to avoid infinite loop
              validAnswer = true;
              // Displaying numbers for user and getting user input for answer
              System.out.println("Adding numbers...");
              System.out.printf("What is: %d + %d? Please enter answer below", num1,num2);
              result = num1 + num2;
              try {
                  input = scanner.nextInt();
              } catch (Exception ex) {
                  // Print error message
                  System.out.println("Sorry, Invalid entry for Addition...Please Retry!");
                  // flush scanner
                  scanner.next();
                  validAnswer = false;
              }
          } while (!validAnswer);

          // Line break for code clarity
          System.out.println();

          // if else statement to determine if answer is correct
          if (result == input) {

              System.out.println("Well done, you guessed corectly!");
              correctAnswer = true;
          } else {

              System.out
                      .println("Sorry incorrect, Please guess another Addition");
              correctAnswer = false;
          }
      } while (!correctAnswer);

  }// End of add

  /**
   * Method that subtracts two random numbers (from 1-100) and takes a user
   * guess for the subtraction. Then outputs certain statements dependent if
   * user guess is correct or not.
   */
  public static void subtract() {

      // Setting up random
      Random random = new Random();

      // Declaring Integers
      int num1;
      int num2;
      int result;
      int input;
      //set input to 0
      input = 0;
      // Declaring boolean for validity of userAnswer (Defaulted to false)
      boolean validAnswer = false;
      //Declaring boolean for correct user answer (default to false)
      boolean correctAnswer=false;
      do {
          // Create two random numbers between 1 and 100
          num1 = random.nextInt(100);
          num1++;
          num2 = random.nextInt(100);
          num2++;

          do {
              // Set correctAnwer to true to avoid infinite iterations
              validAnswer = true;
              // Displaying numbers for user and getting user input for answer
              System.out.println("Subtracting numbers...");
              System.out.printf("What is: %d - %d? Please enter answer below", num1,num2);
              result = num1 - num2;

              try {
                  input = scanner.nextInt();
              } catch (Exception ex) {
                  // Print error message
                  System.out.println("Sorry, Invalid entry entry for subtraction...Please retry!");
                  // flush scanner
                  scanner.next();
                  validAnswer = false;
              }
          } while (!validAnswer);

          // Line break for code clarity
          System.out.println();

          // if else statement to determine if answer is correct
          if (result == input) {

              System.out.println("Well done, you guessed corectly!");
              correctAnswer = true;
          } else {

              System.out.println("Sorry incorrect, Please attempt another subtraction");
              correctAnswer = false;
          }
      } while (!correctAnswer);

  }// end of subtract

  /**
   * A method that generates a random number between 1 and 10
   * @return randomNumber (Returns random number between 1 and 10 inclusive)
   */
  public static int generateRandomNumber() {

      //setting up random
      Random random = new Random();
      // Declaring int for random number and defaulting to 0
      int randomNumber = 0;
      // Assigning randomNumber between 1 and 10
      randomNumber = random.nextInt(10);
      randomNumber++;
      //Trace code, Remember to take out!
      System.out.println("Trace: Random no is:" + randomNumber);
      return randomNumber;

  }// end of generateRandomNumber

  /**
   * Method that allows user to guess a random number between a set range. A
   * message will then be displayed on screen to let them know if they were
   * correct or not.
   */
  public static void guessRandomNumber() {

      // declare var for user guess and default to zero
      int userGuess = 0;
      // declare boolean relating to if number is valid
      boolean validNumber = false;
      // declare boolean relating to if guess is correct
      boolean correctGuess = false;
      // declaring int equal to return value from generateRandomNumber();
      int secretNumber = generateRandomNumber();

      //Do while loop that runs until user guesses correctly
      do {

          //Do while loop that runs until a valid entry is given (i.e. int)
          do {
              try {
                  //do while loop ensuring that user guess is between 1 and 10
                  do {
                      // Get user guess (between 1 and 10)
                      System.out.println("Please enter a number between 1 and 10...");
                      userGuess = scanner.nextInt();
                      if (userGuess < 1 || userGuess > 10) {
                          validNumber = false;
                          System.out.println("Please Ensure number is between 1 and 10");
                      }else {
                          validNumber=true;
                      }
                  } while (!validNumber);
              } catch (Exception ex) {
                  //Print error message
                  System.out.println("Sorry invalid entry...");
                  // Flush scanner
                  scanner.next();
                  validNumber = false;
              }
          } while (!validNumber);

          //If else statement that outputs a message informing user if guess correct
          if (userGuess == secretNumber) {

              System.out.println("Guess correct, well done!");
              correctGuess = true;

          } else {

              System.out.println("Sorry guess Incorrect please try again!");
              correctGuess = false;
          }
      } while (!correctGuess);
  }// end ofGuessRandomNumber


  /**
   * Method that allows user to enter a string they want and print it a
   * certain no of times
   */
  public static void printLoop() {
      // Declaring and initialising Variables
      int noOfTimes = 0;
      String print = null;

      try {
          System.out.println("Please enter what you would like to print");
          print = scanner.next();
      } catch (Exception ex) {
          //error message
          System.out.println("Please give a Valid Entry...");
          // flush scanner
          scanner.next();
      }

      System.out.println("Please enter how many times you wish to print...");
      noOfTimes = scanner.nextInt();

      for (int counter = 0; counter < noOfTimes; counter++) {

          System.out.println(print);
      }
  }// End of printLoop

}// End of class