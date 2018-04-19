import javax.swing.JOptionPane;
public class guidemo{
    public static void main(String[] args){
        String input1 = JOptionPane.showInputDialog("Enter first number");
        String input2 = JOptionPane.showInputDialog("Enter second number");
        int result = Integer.parseInt(input1)+Integer.parseInt(input2);
        JOptionPane.showMessageDialog(null,"The "+input1+" + "+input2+" ="+result, "Sum Result", JOptionPane.PLAIN_MESSAGE);
    }
}