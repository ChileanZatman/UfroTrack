package Ventanas;
import java.util.ArrayList;
import Procesos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;


public class ResultadoBusqueda extends JFrame implements ActionListener {
    private ArrayList<Asignatura>resultados;
    private final JList list;
    DefaultListModel model = new DefaultListModel();
    private JButton botonVolver, botonSeleccionar;
    public ResultadoBusqueda() {

        super("Resultado");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 650);

        list = new JList(model);
        list.setBounds(15, 30, 450, 500);
        this.setLayout(null);
        this.add(list);
        
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
    public void llenarLista(){
    for(int i=0;i<resultados.size();i++){
        String texto =resultados.get(i).getCodigo()+" "+resultados.get(i).getNombre()+"  "+resultados.get(i).getProfesor();
        model.addElement(texto);
    }
    }
    
    

}
