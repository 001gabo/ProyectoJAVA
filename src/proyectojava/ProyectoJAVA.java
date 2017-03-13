package proyectojava;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager; 

public class ProyectoJAVA extends JFrame { 
    
    public ProyectoJAVA() {
        //con esto se va de una pantalla a otra
        this.setVisible(false);
        new Login().setVisible(true);
    } 
    
    public static void main(String[] args){
        ProyectoJAVA pj = new ProyectoJAVA();
    }
}
