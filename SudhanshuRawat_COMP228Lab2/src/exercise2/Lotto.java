package exercise2;

import javax.swing.JOptionPane;
import java.util.Random;

public class Lotto {
    private int[] numbers = new int[3];

    public Lotto() {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9) + 1;
        }
    }

    public int[] getLottoNumbers() {
        return numbers;
    }

    public void runGame() {
        String userInput = JOptionPane.showInputDialog("Choose a number between 3 and 27");
        int chosenNumber = Integer.parseInt(userInput);

        for (int i = 0; i < 5; i++) {
            Lotto lotto = new Lotto();
            int sum = 0;
            for (int num : lotto.getLottoNumbers()) {
                sum += num;
            }
            JOptionPane.showMessageDialog(null, "Lotto numbers sum: " + sum);
            if (sum == chosenNumber) {
                JOptionPane.showMessageDialog(null, "You win!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Computer wins!");
    }
}
