package Ventanas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ResultadoBusqueda extends JFrame implements ActionListener {

    private JList resultados;
    DefaultListModel model = new DefaultListModel();
    private JButton botonVolver, botonSeleccionar;
    public ResultadoBusqueda() {

        super("Resultado");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 650);

        resultados = new JList();
        resultados.setBounds(15, 30, 450, 500);
        this.setLayout(null);
        this.add(resultados);
        
        botonVolver = new JButton("Volver");
        botonVolver.setBounds(15, 550, 150, 25);
        this.add(botonVolver);
        setLayout(null);
        botonVolver.addActionListener(this);
       
        botonSeleccionar = new JButton("Seleccionar");
        botonSeleccionar.setBounds( 300, 550, 150, 25);
        this.add(botonSeleccionar);
        setLayout(null);
        botonSeleccionar.addActionListener(this);
        
        

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== botonVolver){
            this.setVisible(false);
           Inicio regreso = new Inicio();
            regreso.setVisible(true);
        }
    }

}
