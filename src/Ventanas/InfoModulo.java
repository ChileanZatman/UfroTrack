package Ventanas;

import Procesos.Asignatura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class InfoModulo extends JFrame implements ActionListener {
     private JLabel labelAsignatura;
     private JButton bt1;
     private JTextArea area;
     
    public InfoModulo(Asignatura obj){
        
    
       super("UfroTrack");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 600);
        
        labelAsignatura = new JLabel();
        labelAsignatura.setText("Codigo asignatura:  "+obj.getCodigo());
        labelAsignatura.setBounds(40, 10, 200, 25);
        this.add(labelAsignatura);
        labelAsignatura = new JLabel();
        labelAsignatura.setText("Nombre asignatura:  "+obj.getNombre());
        labelAsignatura.setBounds(40, 35, 200, 25);
        this.add(labelAsignatura);
        labelAsignatura = new JLabel();
        labelAsignatura.setText("Nombre profesor:  "+obj.getProfesor());
        labelAsignatura.setBounds(40, 60, 200, 25);
        this.add(labelAsignatura);
        labelAsignatura = new JLabel();
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
        area.setText(obj.getHorarios());
        this.add(area);
        setLayout(null);
        
}

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==bt1){
           setVisible(false);
       }
    }
}