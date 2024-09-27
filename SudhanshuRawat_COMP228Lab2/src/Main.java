////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//          //  System.out.println("i = " + i);
//   //     }
//    }
//}


import javax.swing.JOptionPane;
import exercise1.Test;
import exercise2.Lotto;
import exercise3.OverloadExample;

public class Main {
    public static void main(String[] args) {
        String[] options = {"Exercise 1 - Test Simulation", "Exercise 2 - Lotto Game", "Exercise 3 - Overloaded Methods"};
        int choice = JOptionPane.showOptionDialog(null, "Choose an exercise to run:", "Exercise Selector",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        switch (choice) {
            case 0:
                // Run Exercise 1: Test Simulation
                Test test = new Test();
                test.inputAnswer();
                break;
            case 1:
                // Run Exercise 2: Lotto Game
                Lotto lotto = new Lotto();
                lotto.runGame();
                break;
            case 2:
                // Run Exercise 3: Overloaded Methods
                OverloadExample.display(10);
                OverloadExample.display("Hello");
                OverloadExample.display(5.5);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No valid option selected!");
                break;
        }
    }
}
