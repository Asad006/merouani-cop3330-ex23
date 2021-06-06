package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */


import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();

        String answer;

        System.out.println("'y' for yes and 'n' for no");
        System.out.println("Is the car silent when you turn the key?");
        answer = scanner.nextLine();
        if (answer.equals("y")){
            System.out.println("Are the battery terminals corroded?");
            answer = scanner.nextLine();
            if (answer.equals("y")){
                System.out.println("Clean terminals and try starting again");
            }else {
                System.out.println("Replace cables and try again.");
            }
        }else if(answer.equals("n")){
            System.out.println("Does the car make a slicking noise?");
            answer= scanner.nextLine();
            if (answer.equals("y")){
                System.out.println("Replace the battery.");
            }else if (answer.equals("n")){
                System.out.println("Does the car crank up but fail to start?");
                answer = scanner.nextLine();
                if (answer.equals("y")){
                    System.out.println("Check spark plug connections.");
                } else if (answer.equals("n")){
                    System.out.println("Does the engine start and then die?");
                    answer= scanner.nextLine();
                    if(answer.equals("y")){
                        System.out.println("Does you car have fuel injection?");
                        answer= scanner.nextLine();
                        if (answer.equals("y")){
                            System.out.println("Get it in for service.");
                        }else if (answer.equals("n")){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }else if (answer.equals("n")){
                        System.out.println("This should not be possible.");
                    }

                }
            }
        }
    }
}
