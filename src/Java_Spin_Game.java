/*
 * Hello, this is my first code, it's a board spinning game.
 *
 * Guess the number between 10 to 99, you'll enter in the game with 200 chips and for every success attempt you'll receive 100 more chips and for invalid attempt you'll loose 50 chips.
 *
 * Love to hear your response in comment, also upvote if you like this game.
 *
 * Version : v1.0.0
 *
 * @author: xswern.5
 */


import java.util.Random;
import java.util.Scanner;

public
class Java_Spin_Game {

    public String name;
    public double amount;
    public int trial;

    Java_Spin_Game(String name, double amount) {
        System.out.println("Hello " + name + " Welcome! You have " + amount + " to spend here!");
        this.name = name;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        Java_Spin_Game jb = new Java_Spin_Game("User", 200);
        jb.playGame();
    }

    public void playGame() {

        while (getAmount() > 50 && trial < 5) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("---------------------------------------------------");
                System.out.println("Please enter number between 10 to 99. \nType quit to quit the game.");
                String userInput = sc.nextLine();

                if (!userInput.equalsIgnoreCase("quit")) {
                    if (Integer.parseInt(userInput) >= 10 && Integer.parseInt(userInput) <= 99) {
                        int number = spinBoard();
                        betResult(Integer.parseInt(userInput), number);
                    } else {
                        System.out.println("---------------------------------------------------");
                        System.out.println(
                                "Invalid Number, amount deducted for trial! \nKeep your number between 10 to 99 only.");
                        amount -= 50;
                        setAmount(amount);
                    }
                } else {
                    System.out.println("Bye Bye,  you're quitting game with amount : " + getAmount()
                            + "\nHope you liked this game!"
                            + "\nThis is my first code in SoloLearn. \nPlease upvote if you liked this.\nThank You!");
                }
            } catch (Exception e) {
                System.err.println("Please enter number between 10 to 99 only.");
                amount -= 50;
                setAmount(amount);
            } finally {
                trial++;
            }
            break;
        }

        if (getAmount() < 50) {
            System.out.println("---------------------------------------------------");
            System.out.println("---------------------------------------------------");
            System.out.println("You have not enough money to play : " + getAmount() + "\nAdd " + (51 - getAmount())
                    + " in your balance to play game again.");
            System.out.println("Bye Bye\nHope you liked this game!"
                    + "\nThis is my first code in SoloLearn. \nPlease upvote if you liked this.\nThank You!");
            System.out.println("---------------------------------------------------");
            System.out.println("---------------------------------------------------");
        } else if (trial >= 5) {
            System.out.println("---------------------------------------------------");
            System.out.println("---------------------------------------------------");
            System.out.println("uh oh, looks like your trial completed, dont worry! You are carrying : " + getAmount()
                    + " Congraulations!");
            System.out.println("Bye Bye\nHope you liked this game!"
                    + "\nThis is my first code in SoloLearn. \nPlease upvote if you liked this.\nThank You!");
            System.out.println("---------------------------------------------------");
            System.out.println("---------------------------------------------------");
        } else {
            System.out.println(
                    "Bye Bye,  you're quitting game with amount : " + getAmount() + "\nHope you liked this game!"
                            + "\nThis is my first code in SoloLearn. \nPlease upvote if you liked this.\nThank You!");
        }

    }

    private static int spinBoard() {
        int boardNumber = new Random().nextInt(90) + 10;
        System.out.println("Spinning...");
        System.out.println("****");
        System.out.println("Number in board : " + boardNumber);
        System.out.println("****");
        return boardNumber;
    }

    private void betResult(int num1, int num2) {
        if (num1 == num2) {
            amount += 100;
            setAmount(amount);
            System.out.println("---------------------------------------------------");
            System.out.println("Yippieee!!! You won 100 chips! \nTotal Amount : " + getAmount());
            System.out.println("---------------------------------------------------");
        } else {
            amount -= 50;
            setAmount(amount);
            System.out.println("---------------------------------------------------");
            System.out.println(
                    "OOPS!!! Wrong guess, Try again! \nType Quit to quit game. \nTotal Amount : " + getAmount());
            System.out.println("---------------------------------------------------");
        }
    }
}
