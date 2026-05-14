import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class Darstellung
{
    /* Attribute deklarieren */
    JFrame frame;
    JPanel panel1;
    JPanel panel2;
    JLabel zahl1Label;
    JLabel operationLabel;
    JLabel zahl2Label;
    JTextField ergebnisField;
    JButton button;
    JLabel feedbackLabel;
    int zahl1;
    int zahl2;
    String operation;
    
    Darstellung(Steuerung steuerung)
    {
        /* Fenster initialisieren */
        frame = new JFrame("Rechenspiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 1));

        /* die beiden Panel initialisieren */
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(new GridLayout(0, 1));
        panel2.setLayout(new GridLayout(0, 1));

        /* übrige Objekte initialisieren */

        /* Hierarchie herstellen */

        frame.pack();
        frame.setVisible(true);
    }
}
