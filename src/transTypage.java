//Exemples tirer du cours 2021-02-04 et chapitre 1-5
//https://crlj.moodle.decclic.qc.ca/mod/book/view.php?id=91138&chapterid=2060
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class transTypage extends JFrame {
    JFrame frame;
    JRadioButton radBleu;
    JRadioButton radGris;
    JRadioButton radRed;
    JButton btnVider;

    public transTypage(){
        frame = new JFrame("transTypage");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        radBleu = new JRadioButton("bleu");
        radBleu.setBackground(Color.blue);
        radBleu.addActionListener(e -> radCouleursAction(e));

        radGris = new JRadioButton("gris");
        radGris.setBackground(Color.gray);
        radGris.addActionListener(e -> radCouleursAction(e));

        radRed = new JRadioButton("rouge");
        radRed.setBackground(Color.red);
        radRed.addActionListener(e -> radCouleursAction(e));

        for (int i=0; i<5; i++){
            frame.add(new JTextField("texte" + i));
        }

        for (int i = 0; i<10; i++){
            JButton btn = new JButton("i");
            btn.addActionListener(e -> btnAction(e));
        }

        btnVider = new JButton("Vider");
        btnVider.addActionListener(e -> btnViderAction());

        ButtonGroup btnG = new ButtonGroup();
        btnG.add(radBleu);
        btnG.add(radGris);
        btnG.add(radRed);

        frame.add(radBleu);
        frame.add(radGris);
        frame.add(radRed);
        frame.add(btnVider);
        frame.setVisible(true);
    }

    private void btnAction(ActionEvent e) {
       // JButton btn = (JButton)e.getSource();
    }

    private void radCouleursAction(ActionEvent e) {
        JRadioButton rad;
        rad = (JRadioButton)e.getSource();
        frame.getContentPane().setBackground(rad.getBackground());

        // ou frame.getContentPane().setBackground(((JRadioButton)e.getSource()).getBackground());
    }

    private void btnViderAction(){
        // Component[] c = frame.getComponents();
        for (Component comp : frame.getContentPane().getComponents()){
            if (comp instanceof JTextField){
                ((JTextField) comp).setText("");
            }
        }
    }

    public static void main(String[] args) {
        transTypage myView = new transTypage();
    }

}
