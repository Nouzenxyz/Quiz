import java.util.*;

public class Quiz {
    public static void main(String[] args) {
        Scanner jlc = new Scanner(System.in);

       
        String[] questions = {
            "Who is the main character of the series Breaking Bad?",
            "Who is Walter White's son?",
            "Saul's birth name was?",
            "Who is the main antagonist of the series?",
            "What street do Walt and Skyler live on?"
        };
        String[] options = {
            "Walter White, Jessie Pinkman, Dominique Evangelista",
            "Daniel, Flynn, Walter Jr.",
            "Jason Belveth, Dave Cleofe, Jimmy McGill",
            "Gus Fring, Denver Arrojo, Tuco",
            "Catmon Lane, Negra Arroyo Lane, Tagalag Street"
        };
        String[] answers = {
            "Walter White",
            "Walter Jr.",
            "Jimmy McGill",
            "Gus Fring",
            "Negra Arroyo Lane"
        };

        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println("Options: " + options[i]);
            System.out.print("Answer: ");
            String response = jlc.nextLine();

            if (response.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + answers[i]);
            }
        }

        System.out.println("Quiz complete. Your score is " + score + " out of " + questions.length);
    }
}
