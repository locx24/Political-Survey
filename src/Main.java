import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // create scanner for user input
        Scanner scnr = new Scanner(System.in);

        // political party score variables
        float democratScore =0;
        float republicanScore =0;
        float socialistScore =0;
        float conservativeScore =0;

        // question number variable
        int questionNumber =1;

        // political party question counter variable
        float democratCounter =0,republicanCounter =0,socialistCounter =0,conservativeCounter =0;

        // variable for users political party
        String userParty;

        // array to store political belief questions
        String[] questions = new String[15];

        //initialize array with political questions
        questions[0] = "The government should provide healthcare to its citizens for free:";
        questions[1] = "Some peoples and religions are generally more trouble than others:";
        questions[2] = "Marijuana should be legal:";
        questions[3] = "A strong military is a better foreign policy tool than a strong diplomacy:";
        questions[4] = "Free trade among countries is a good thing:";
        questions[5] = "Abortion should be legal within the first six months of pregnancy:";
        questions[6] = "School lunches for elementary and middle school aged students should be free:";
        questions[7] = "There should be stricter regulation on guns:";
        questions[8] = "A unisex bathroom should be required in every building:";
        questions[9] = "Taxpayer money should be spent on arts or sports:";
        questions[10] = "Monarchies like the royal family in England should be abolished:";
        questions[11] = "The government should provide education to its citizens for free:";
        questions[12] = "Some countries and civilizations are natural enemies:";
        questions[13] = "Capital punishment should be legal:";
        questions[14] = "Increases in taxes help the infrastructure of society:";

        // create and initialize array to store answers to political questions
        String[][] answers = {{"A. Strongly Agree"},
                             {"B. Agree"},
                             {"C. Disagree"},
                             {"D. Strongly Disagree"}};

        // loop through political questions
        for (int i =0; i<questions.length;i++){
                System.out.println(questionNumber++ + ".) " + questions[i] + "\n");

        // loops through multiple choice answers
            for(int j =0;j<answers.length;j++){
                for(int k =0; k< answers[0].length;k++) {
                    System.out.println(answers[j][k] + "\n");
                }
            }

            // store user's selection
           char input = scnr.next().charAt(0);

            // create data file for Democrat and store response data. Added try-catch block for error handling
            if (input == 'A') {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("democrat.txt"));
                    writer.write(questionNumber++ + ".) " + questions[i] + "\n" + input + "\n");
                    writer.close();
                }
            catch(IOException e){
                        e.printStackTrace();
                    }
                }

            // create data file for Republican and store response data. Added try-catch block for error handling
            if (input == 'B') {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("republican.txt"));
                    writer.write(questionNumber++ + ".) " + questions[i] + "\n" + input + "\n");
                    writer.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }

            // create data file for Socialist and store response data. Added try-catch block for error handling

            if (input == 'C') {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("socialist.txt"));
                    writer.write(questionNumber++ + ".) " + questions[i] + "\n" + input + "\n");
                    writer.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }

            // create data file for Conservative and store response data. Added try-catch block for error handling

            if (input == 'D') {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("conservative.txt"));
                    writer.write(questionNumber++ + ".) " + questions[i] + "\n" + input + "\n");
                    writer.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }

            //update user's score based on their selection and weigh answers on differing levels. Increment counters

            if(input == 'A'){
                democratScore += 2.5;
                socialistScore += 1;

                democratCounter++;
                socialistCounter += .5;
            }
            else if(input == 'B'){
                republicanScore+= 2.5;
                conservativeScore += 1;

                republicanCounter++;
                conservativeCounter+= .5;
            }
            else if(input == 'C'){
                socialistScore += 2.5;
                democratScore +=1;

                socialistCounter++;
                democratCounter += .5;
            }
            else{
                conservativeScore += 2.5;
                republicanScore +=1;

                conservativeCounter++;
                republicanCounter +=.5;
            }

            /*if democrat score is greater than or equal to 10, guess if user is a democrat. If yes
            break out of the program and thank the user. If No, continue answering questions.
            */

            if (democratScore >= 10){
                System.out.println("Prediction: Are you a Democrat? Please enter Yes or No:");

                // store user's second selection
                char input2 = scnr.next().charAt(0);

                if (input2 == 'Y'){
                break;
                }
            }

            /* if republican score is greater than or equal to 10, predict if user is a democrat. If yes
            break out of the program and thank the user. If No, continue answering questions.
            */

            if (republicanScore > 10){
                System.out.println("Prediction: Are you a Republican? Please enter Yes or No:");

                // store user's second selection
                 char input2 = scnr.next().charAt(0);

                if (input2 == 'Y'){
                    break;
                }
            }

             /*if socialist score is greater than or equal to 10, predict if user is a democrat. If yes
            break out of the program and thank the user. If No, continue answering questions.
            */

            if (socialistScore > 10){
                System.out.println("Prediction: Are you a Socialist? Please enter Yes or No:");

                // store user's second selection
                char input2 = scnr.next().charAt(0);

                if (input2 == 'Y'){
                    break;
                }
            }

             /*if conservative score is greater than or equal to 10, predict if user is a democrat. If yes
            break out of the program and thank the user. If No, continue answering questions.
            */

            if (conservativeScore > 10){
                System.out.println("Prediction: Are you a Conservative? Please enter Yes or No:");

                // store user's second selection
                char input2 = scnr.next().charAt(0);

                if (input2 == 'Y'){
                    break;
                }
            }
        } // end outer-loop

        // Ask user which political party they affiliate with
        System.out.println("Which political party do you affiliate with? Ex: Democrat, Republican, Socialist, or Conservative");

        // return scanner from previous user input
        userParty=scnr.nextLine();

        // get users political party
          userParty = scnr.next();

        System.out.println("Thank you for your participation in this survey! As stated, you identify as a " + userParty + " and the score for your political party is: " + Collections.max(Arrays.asList(democratCounter,republicanCounter,socialistCounter,conservativeCounter)));
    }
}