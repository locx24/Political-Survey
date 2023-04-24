# Political-Survey

This is a political survey program in Java that asks 15 political belief questions and guesses the user's political party affiliation (Democrat, Republican, Socialist, or Conservative). It stores the user's responses and the corresponding political party in separate text files.

# Getting Started

To run this program, you must have Java installed on your computer. The code for this program is provided in the Main.java file.

# How to Use the Program

When you run the program, you will be asked 15 political belief questions. For each question, you will be presented with four multiple-choice answers (A, B, C, D) and prompted to select one.

After selecting an answer for each question, the program will guess your political party affiliation based on your responses. The program will also store your responses and the corresponding political party in separate text files.

# How the Program Works

The program initializes variables for the political party scores, question number, political party question counters, and the user's political party. It also creates an array to store the 15 political belief questions and a 2D array to store the four multiple-choice answers for each question.

The program then loops through each question and presents the user with the multiple-choice answers. It stores the user's selection and updates their political party score and counter based on their selection.

The program also creates a data file for each political party and stores the user's response data in the corresponding file.

Finally, the program compares the user's scores for each political party to determine their political affiliation. If a political party's score is greater than or equal to 10, the program guesses that the user is a member of that political party and exits. If none of the political parties have a score greater than or equal to 10, the program prints a message indicating that it could not determine the user's political affiliation.
