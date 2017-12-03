package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author sebas
 */
public class InfoModulo extends JFrame implements ActionListener {
     private JLabel labelAsignatura;
     private JButton bt1;
     private JTextArea area;
     
    public InfoModulo(){
        
    
       super("UfroTrack");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 600);
        
        labelAsignatura = new JLabel("Codigo asignatura:");
        labelAsignatura.setText("Codigo asignatura:");
        labelAsignatura.setBounds(40, 10, 200, 25);
        this.add(labelAsignatura);
        labelAsignatura = new JLabel("Nombre asignatura:");
        labelAsignatura.setText("Nombre asignatura:");
        labelAsignatura.setBounds(40, 35, 200, 25);
        this.add(labelAsignatura);
        labelAsignatura = new JLabel("Nombre profesor:");
        labelAsignatura.setText("Nombre profesor:");
        labelAsignatura.setBounds(40, 60, 200, 25);
        this.add(labelAsignatura);
        labelAsignatura = new JLabel("Horarios: ");
        labelAsignatura.setText("Horarios:");
        labelAsignatura.setBounds(40, 85, 200, 25);
        this.add(labelAsignatura);
        
        
        bt1 = new JButton("Volver");
        bt1.setBounds(340, 10, 100, 25);
        this.add(bt1);
        setLayout(null);
        bt1.addActionListener(this);
        
        
        area = new JTextArea();
        area.setBounds(40, 120, 400, 400);
        this.add(area);
        setLayout(null);
        
}

    @Override
    public void actionPerformed(ActionEvent ae) {
       
    }
}
