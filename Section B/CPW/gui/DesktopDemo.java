import java.awt.event.ActionEvent;
import java.security.SecureRandom;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class DesktopDemo{
    public static void main(String[] args){
        MDI mdi = new MDI();
        mdi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mdi.setSize(800,600);
        mdi.setVisible(true);
    }
}
class MDI extends JFrame{
    private final JDesktopPane dpane = new JDesktopPane();
    private static final SecureRandom gen = new SecureRandom();
    public MDI(){
        JMenuBar mnubar = new JMenuBar();
        JMenu mnu = new JMenu("Add");
        JMenuItem itm = new JMenuItem("Add Internal Frame");
        JMenuItem itm1 = new JMenuItem("Show Message Dialog");
        mnu.insert(itm,0);
        mnu.insert(itm1,1);
        mnubar.add(mnu);
        setJMenuBar(mnubar);
        add(dpane);

        itm.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e){
                JInternalFrame iframe = new JInternalFrame("An Internal Frame",true,true,true);
                JLabel lbl = new JLabel("This is frame "+gen.nextInt(500));
                iframe.add(lbl);
                iframe.pack();
                dpane.add(iframe);
                iframe.setVisible(true);
            }
        });
        
        itm1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hi with random"+gen.nextInt(300),"Message",JOptionPane.PLAIN_MESSAGE);
            }
        });

    } 
}