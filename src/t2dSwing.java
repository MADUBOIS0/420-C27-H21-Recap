//Baser sur NDC 2021-02-18
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class t2dSwing extends JFrame {
    JFrame frame;
    JTable tableData;

    String[] colNames = {"Prénom", "Nom", "Age"};

    String[][] data = {
            {"Déneige", "Lacour", "35"},
            {"Jean", "Bon", "50"},
            {"Alex", "Thérieur", "22"},
            {"Amphès", "Dlapen", "11"},
            {"toto", "Info", "21"},
            {"tata", "Info", "22"},
            {"titi", "Info", "23"},
            {"Alice", "Fréchette", "24"}
    };

    public t2dSwing(){
        frame = new JFrame("ma view");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        //Rendre le JTable non editable
        tableData = new JTable(data, colNames){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //Gerer la taille du JTable
        JScrollPane scroll = new JScrollPane(tableData);
        scroll.setPreferredSize(new Dimension(400, 100));

        //Gerer la largeur d'une column
        TableColumn col = tableData.getColumn("Prénom");
        col.setPreferredWidth(200);

        //écouteur sur sélection JTable
        tableData.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    tableSelectionChange();
                }
            }
        });

        //Écouteur fleche haut et bas
        tableData.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN){
                    tableSelectionChange();
                }
            }
        });

        frame.add(scroll);
        frame.setVisible(true);
    }

    private void tableSelectionChange() {
        /*//afficher la ligne sélectionner
        int selIndex = tableData.getSelectedRow();
        System.out.println(Arrays.toString(data[selIndex]));
        //parcourir les éléments de la ligne sélectionnée
        for (int iCol=0; iCol<colNames.length; iCol++){
            System.out.print(data[selIndex][iCol] + " ");
        }*/

        int[] sel = tableData.getSelectedRows();
        // System.out.println(Arrays.toString(sel));

        //afficher les lignes sélectionnées ie [Alex, Therieur, 22]
        //for (int i=0; i<sel.length; i++){
        //    System.out.println(Arrays.toString(data[sel[i]]));
        //}

        //Atteindre les éléments des lignes séléectionnés ie "Alex Therieur 22"
        for (int iLigne=0; iLigne<sel.length; iLigne++){
            for (int iCol=0; iCol<colNames.length; iCol++){
                System.out.print(data[sel[iLigne]][iCol] + " ");
            }
        }
    }

    public static void main(String[] args) {
    t2dSwing myView = new t2dSwing();
    }
}
