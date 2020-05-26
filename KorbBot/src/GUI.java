import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI extends JFrame implements ActionListener

{

    boolean c = false;

    boolean s = true;

    private JLabel title;
    private JLabel gap;
    private JButton button1;
    private JButton button2;
    private JCheckBox cb1;

    public GUI()
    {
        super("Donutbot 2 Controller");
        setLayout(new FlowLayout());

        title = new JLabel("                              Donutbot 2 Controller");
        add(title);
        gap = new JLabel("                            ");
        add(gap);
        button1 = new JButton("Refresh");
        button1.setToolTipText("refresh donutbot2");
        add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cb1.isSelected())
                {
                    System.out.println("Sentient.");
                    s = true;
                }

                else if(!cb1.isSelected())
                {
                    System.out.println("Not Sentient.");
                    s = false;
                }
            }
        });
        cb1 = new JCheckBox("Sentience");
        cb1.setToolTipText("make donutbot2 sentient");
        add(cb1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Empty
    }
}
