import javax.swing.*;
public class guidemo{
    public static void main(String args[]){
        String firstNum = JOptionPane.showInputDialog("Enter first Number");
        String secondNum = JOptionPane.showInputDialog("Enter second number");
        int total = Integer.parseInt(firstNum)+Integer.parseInt(secondNum);
        JOptionPane.showMessageDialog(null,"The total of "+firstNum+" + "+secondNum+" = "+total,"Result",JOptionPane.PLAIN_MESSAGE);
    }
}