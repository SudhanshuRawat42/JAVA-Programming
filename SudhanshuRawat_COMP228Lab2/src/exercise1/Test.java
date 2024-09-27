package exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    private int correctAnswers = 0;
    private int incorrectAnswers = 0;

    public void simulateQuestion(String question, String[] options, int correctAnswer) {
        String userAnswer = JOptionPane.showInputDialog(null, question);
        int answer = Integer.parseInt(userAnswer);
        if (answer == correctAnswer) {
            correctAnswers++;
            generateMessage(true);
        } else {
            incorrectAnswers++;
            generateMessage(false);
            JOptionPane.showMessageDialog(null, "Correct answer is: " + correctAnswer);
        }
    }

    public void generateMessage(boolean isCorrect) {
        Random random = new Random();
        String[] positiveMessages = { "Excellent!", "Good!", "Keep up the good work!", "Nice work!" };
        String[] negativeMessages = { "No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying.." };
        String message = isCorrect ? positiveMessages[random.nextInt(4)] : negativeMessages[random.nextInt(4)];
        JOptionPane.showMessageDialog(null, message);
    }

    public void inputAnswer() {
        String[] options = { "1. Option A", "2. Option B", "3. Option C", "4. Option D" };
        simulateQuestion("Question 1?", options, 1);
        simulateQuestion("Question 2?", options, 2);
        simulateQuestion("Question 3?", options, 3);
        displayResults();
    }

    public void displayResults() {
        int totalQuestions = correctAnswers + incorrectAnswers;
        double percentage = ((double) correctAnswers / totalQuestions) * 100;
        JOptionPane.showMessageDialog(null, "Correct answers: " + correctAnswers +
                "\nIncorrect answers: " + incorrectAnswers + "\nPercentage: " + percentage + "%");
    }
}
