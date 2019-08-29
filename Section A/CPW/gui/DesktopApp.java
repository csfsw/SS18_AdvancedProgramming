import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JViewport;

public class DesktopApp{
    public static void main(String[] args){
        MDI myapp = new MDI("Java desktop application");
        myapp.setSize(600,600);
        myapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myapp.setVisible(true);
    }
}

class MDI extends JFrame{
    JTabbedPane tab;
    JPanel pnl;
    JScrollBar sb;
    JScrollPane sp;
    JTable tble;
    JViewport jwport;
    
    
    JDesktopPane mdi = new JDesktopPane();
    static int counter = 1;
    public MDI(String appName){
        super(appName);
        JMenuBar mnubar = new JMenuBar();
        JMenu mnu = new JMenu("File");
        JMenuItem itm1 = new JMenuItem("New Window");
        JMenuItem itm2 = new JMenuItem("Exit");
        mnu.insert(itm1, 0);
        mnu.insert(itm2, 1);
        mnubar.add(mnu);
        setJMenuBar(mnubar);
        add(mdi);
        itm1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JInternalFrame newWindow = new JInternalFrame();
                JLabel lbl = new JLabel("Window no: " + counter++);
                newWindow.add(lbl);
                newWindow.setSize(200,300);
                mdi.add(newWindow);
                newWindow.pack();
                newWindow.setVisible(true);
            }
        });
    }
}