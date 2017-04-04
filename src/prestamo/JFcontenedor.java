/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hugo
 */
public class JFcontenedor extends JFrame {

    private JButton testButton;
    private JPanel panelMain;
    private JPprestamo panel;

    public JFcontenedor() {
        setLayout(null);
        setPreferredSize(new Dimension(999, 500));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creating main JPanel (white)
        panelMain = new JPanel();
        panelMain.setBackground(Color.WHITE);
        panelMain.setBounds(0, 0, 999, 500);
        panelMain.setPreferredSize(new Dimension(999, 500));
        add(panelMain);

        // creating JButton in the main JPanel (white)
        testButton = new JButton("Button from main class");
        panelMain.add(testButton);

        // creating new JPanelOne object from JPanelOne class containing black JPanel
      ///  panel = new JPprestamo();

        // adding black JPanel to main JPanel (white)
        panelMain.add(panel);

        pack();

    }

    public static void main(String[] arguments) {

        // creating JFrame object and setting it visible
        JFcontenedor frame = new JFcontenedor();
        frame.setVisible(true);

    }

}
