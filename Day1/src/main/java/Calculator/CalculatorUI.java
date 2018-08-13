package Calculator;

import javax.swing.*;

public class CalculatorUI {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Enter No 1:");
        String s2 = JOptionPane.showInputDialog("Enter No 2:");

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        JOptionPane.showConfirmDialog(
                null,
                CalculatorLogic.sum(
                        a,b), "Result is :",
                JOptionPane.YES_OPTION

        );

    }

}
