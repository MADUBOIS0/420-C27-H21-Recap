import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

public class JListStatic extends JFrame {

    JFrame frame;
    JList list;
    JButton btnGO;
    JList<Integer> listInt;

    String[] data = {"un", "deux", "trois", "quatre", "cinq", "six"};
    Integer[] dataInt = {1,2,3,4};

    public JListStatic(){
        frame = new JFrame("ma View");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        list = new JList(data);
        list.setFixedCellWidth(100);
        list.setFixedCellHeight(20);
        // list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list.addListSelectionListener(e -> listSelectionChange(e));
        list.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN){
                    System.out.println(list.getSelectedValue());
                }
            }
        });

        btnGO = new JButton("GO");
        btnGO.addActionListener(e -> btnGOAction());

        listInt = new JList(dataInt);
        list.getSelectedValue();
        listInt.getSelectedValue();

        frame.add(btnGO);
        frame.add(new JScrollPane(list));
        frame.setVisible(true);
    }

    private void btnGOAction() {
        int[] selectedIndices = list.getSelectedIndices();
        int nbSelectedIndices = selectedIndices.length;

        // Afficher indices selectionner
        System.out.println(Arrays.toString(selectedIndices));

        //Afficher les éléments selectionner
        for (int i = 0; i < nbSelectedIndices; i++){
            System.out.println(data[selectedIndices[i]] + " ");
        }
    }

    private void listSelectionChange(ListSelectionEvent e) {
        if(e.getValueIsAdjusting()){
            System.out.println(list.getSelectedValue());
        }
    }


    public static void main(String[] args) {
        JListStatic myView = new JListStatic();
    }
}
