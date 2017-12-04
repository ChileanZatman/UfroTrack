
package Ventanas;

import Archivos.GestorArchivo;
import Procesos.HorarioAlumno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;




public class Inicio  extends JFrame implements ActionListener {
        private String [][] tablaNombre;
<<<<<<< HEAD
=======
        private String [][] tablaSala;
>>>>>>> origin/master
        private JLabel labelClase;
        private JTextField textFieldRut, textFieldBuscar, textFieldNombre, textFieldRuta;
        private JButton botonBuscar, bt1, bt2, bt3,  bt4,  bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17,
                 bt18, bt19,bt20, bt21, bt22, bt23, bt24, bt25, bt26,bt27, bt28, bt29, bt30, bt31, bt32, bt33,
                 bt34, bt35, bt36, bt37, bt38, bt39, bt40, bt41,bt42,bt43,bt44,bt45,bt46,bt47,bt48,bt49,bt50, botonCargar;
 
    public Inicio() {
        
        super("UfroTrack");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X
        this.setSize(900, 500);//configurando tamaño de la ventana
        this.setResizable(false);
        //
        
        GestorArchivo gestor = new GestorArchivo();
        //
        if(gestor.checkFile()!=true){
            FileChooser();
        }
        HorarioAlumno horario =initHorario(gestor);
        tablaNombre=horario.getNombre();
	tablaSala=horario.getSala();
        //Labels
        labelClase = new JLabel("Hora");
        labelClase.setText("Hora");
        labelClase.setBounds(10, 60, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("8:30");
        labelClase.setText("8:30");
        labelClase.setBounds(10, 100, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("9:40");
        labelClase.setText("9:40");
        labelClase.setBounds(10, 125, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("10:50");
        labelClase.setText("10:50");
        labelClase.setBounds(10, 175, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("12:00");
        labelClase.setText("12:00");
        labelClase.setBounds(10, 200, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("14:30");
        labelClase.setText("14:30");
        labelClase.setBounds(10, 250, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("15:40");
        labelClase.setText("15:40");
        labelClase.setBounds(10, 275, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("16:50");
        labelClase.setText("16:50");
        labelClase.setBounds(10, 325, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("18:00");
        labelClase.setText("18:00");
        labelClase.setBounds(10, 350, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("19:10");
        labelClase.setText("19:10");
        labelClase.setBounds(10, 400, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("20:20");
        labelClase.setText("20:20");
        labelClase.setBounds(10, 425, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel();
        labelClase.setText("N° Matricula");
        labelClase.setBounds(580, 10, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("Nombre");
        labelClase.setText("Nombre");
        labelClase.setBounds(10+60, 10, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("Lunes");
        labelClase.setText("Lunes");
        labelClase.setBounds(10+60, 60, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("Martes");
        labelClase.setText("Martes");
        labelClase.setBounds(110+60, 60, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("Miercoles");
        labelClase.setText("Miercoles");
        labelClase.setBounds(210+60, 60, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("Jueves");
        labelClase.setText("Jueves");
        labelClase.setBounds(310+60, 60, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("Viernes");
        labelClase.setText("Viernes");
        labelClase.setBounds(410+60, 60, 100, 25);
        this.add(labelClase);
        
        //TextFields
        textFieldRut = new JTextField();
        textFieldRut.setEditable(false);
        textFieldRut.setBounds(650, 10, 200, 25);
        textFieldRut.setText(horario.getRut());
        this.add(textFieldRut);
        textFieldBuscar = new JTextField();
        textFieldBuscar.setBounds(600+60, 110, 100, 25);
        textFieldBuscar.setText("Buscar");
        this.add(textFieldBuscar);
        textFieldNombre = new JTextField();
        textFieldNombre.setEditable(false);
        textFieldNombre.setBounds(110+60, 10, 300, 25);
        textFieldNombre.setText(horario.getNombreAlumno());
        this.add(textFieldNombre);
        
        
        
        //JButtons
        //lunes
        bt1 = new JButton(tablaNombre[0][0]);
        bt1.setBounds(0+60, 100, 100, 25);
        this.add(bt1);
        setLayout(null);
        bt1.addActionListener(this);
        bt2 = new JButton(tablaNombre[0][1]);
        bt2.setBounds(0+60, 125, 100, 25);
        this.add(bt2);
        setLayout(null);
        bt2.addActionListener(this);
        bt3 = new JButton(tablaNombre[0][2]);
        bt3.setBounds(0+60, 175, 100, 25);
        this.add(bt3);
        setLayout(null);
        bt3.addActionListener(this);
        bt4 = new JButton(tablaNombre[0][3]);
        bt4.setBounds(0+60, 200, 100, 25);
        this.add(bt4);
        setLayout(null);
        bt4.addActionListener(this);
        bt5 = new JButton(tablaNombre[0][4]);
        bt5.setBounds(0+60, 250, 100, 25);
        this.add(bt5);
        setLayout(null);
        bt5.addActionListener(this);
        bt6 = new JButton(tablaNombre[0][5]);
        bt6.setBounds(0+60, 275, 100, 25);
        this.add(bt6);
        setLayout(null);
        bt6.addActionListener(this);
        bt7 = new JButton(tablaNombre[0][6]);
        bt7.setBounds(0+60, 325, 100, 25);
        this.add(bt7);
        setLayout(null);
        bt7.addActionListener(this);
        bt8 = new JButton(tablaNombre[0][7]);
        bt8.setBounds(0+60, 350, 100, 25);
        this.add(bt8);
        setLayout(null);
        bt8.addActionListener(this);
        bt9 = new JButton(tablaNombre[0][8]);
        bt9.setBounds(0+60, 400, 100, 25);
        this.add(bt9);
        setLayout(null);
        bt9.addActionListener(this);
        bt10 = new JButton(tablaNombre[0][9]);
        bt10.setBounds(0+60, 425, 100, 25);
        this.add(bt10);
        setLayout(null);
        bt10.addActionListener(this);
       // martes
        bt11 = new JButton(tablaNombre[1][0]);
        bt11.setBounds(100+60, 100, 100, 25);
        this.add(bt11);
        setLayout(null);
        bt11.addActionListener(this);
        bt12 = new JButton(tablaNombre[1][1]);
        bt12.setBounds(100+60, 125, 100, 25);
        this.add(bt12);
        setLayout(null);
        bt12.addActionListener(this);
        bt13 = new JButton(tablaNombre[1][2]);
        bt13.setBounds(100+60, 175, 100, 25);
        this.add(bt13);
        setLayout(null);
        bt13.addActionListener(this);
        bt14 = new JButton(tablaNombre[1][3]);
        bt14.setBounds(100+60, 200, 100, 25);
        this.add(bt14);
        setLayout(null);
        bt14.addActionListener(this);
        bt15 = new JButton(tablaNombre[1][4]);
        bt15.setBounds(100+60, 250, 100, 25);
        this.add(bt15);
        setLayout(null);
        bt15.addActionListener(this);
        bt16 = new JButton(tablaNombre[1][5]);
        bt16.setBounds(100+60, 275, 100, 25);
        this.add(bt16);
        setLayout(null);
        bt16.addActionListener(this);
        bt17 = new JButton(tablaNombre[1][6]);
        bt17.setBounds(100+60, 325, 100, 25);
        this.add(bt17);
        setLayout(null);
        bt17.addActionListener(this);
        bt18 = new JButton(tablaNombre[1][7]);
        bt18.setBounds(100+60, 350, 100, 25);
        this.add(bt18);
        setLayout(null);
        bt18.addActionListener(this);
        bt19 = new JButton(tablaNombre[1][8]);
        bt19.setBounds(100+60, 400, 100, 25);
        this.add(bt19);
        setLayout(null);
        bt19.addActionListener(this);
        bt20 = new JButton(tablaNombre[1][9]);
        bt20.setBounds(100+60, 425, 100, 25);
        this.add(bt20);
        setLayout(null);
        bt20.addActionListener(this); 
        //miercoles      
        bt21 = new JButton(tablaNombre[2][0]);
        bt21.setBounds(200+60, 100, 100, 25);
        this.add(bt21);
        setLayout(null);
        bt21.addActionListener(this);
        bt22 = new JButton(tablaNombre[2][1]);
        bt22.setBounds(200+60, 125, 100, 25);
        this.add(bt22);
        setLayout(null);
        bt22.addActionListener(this);
        bt23 = new JButton(tablaNombre[2][2]);
        bt23.setBounds(200+60, 175, 100, 25);
        this.add(bt23);
        setLayout(null);
        bt23.addActionListener(this);
        bt24 = new JButton(tablaNombre[2][3]);
        bt24.setBounds(200+60, 200, 100, 25);
        this.add(bt24);
        setLayout(null);
        bt24.addActionListener(this);
        bt25 = new JButton(tablaNombre[2][4]);
        bt25.setBounds(200+60, 250, 100, 25);
        this.add(bt25);
        setLayout(null);
        bt25.addActionListener(this);
        bt26 = new JButton(tablaNombre[2][5]);
        bt26.setBounds(200+60, 275, 100, 25);
        this.add(bt26);
        setLayout(null);
        bt26.addActionListener(this);
        bt27 = new JButton(tablaNombre[2][6]);
        bt27.setBounds(200+60, 325, 100, 25);
        this.add(bt27);
        setLayout(null);
        bt27.addActionListener(this);
        bt28 = new JButton(tablaNombre[2][7]);
        bt28.setBounds(200+60, 350, 100, 25);
        this.add(bt28);
        setLayout(null);
        bt28.addActionListener(this);
        bt29 = new JButton(tablaNombre[2][8]);
        bt29.setBounds(200+60, 400, 100, 25);
        this.add(bt29);
        setLayout(null);
        bt29.addActionListener(this);
        bt30 = new JButton(tablaNombre[2][9]);
        bt30.setBounds(200+60, 425, 100, 25);
        this.add(bt30);
        setLayout(null);
        bt30.addActionListener(this);
        //Jueves
        bt31 = new JButton(tablaNombre[3][0]);
        bt31.setBounds(300+60, 100, 100, 25);
        this.add(bt31);
        setLayout(null);
        bt31.addActionListener(this);
        bt32 = new JButton(tablaNombre[3][1]);
        bt32.setBounds(300+60, 125, 100, 25);
        this.add(bt32);
        setLayout(null);
        bt32.addActionListener(this);
        bt33 = new JButton(tablaNombre[3][2]);
        bt33.setBounds(300+60, 175, 100, 25);
        this.add(bt33);
        setLayout(null);
        bt33.addActionListener(this);
        bt34 = new JButton(tablaNombre[3][3]);
        bt34.setBounds(300+60, 200, 100, 25);
        this.add(bt34);
        setLayout(null);
        bt34.addActionListener(this);
        bt35 = new JButton(tablaNombre[3][4]);
        bt35.setBounds(300+60, 250, 100, 25);
        this.add(bt35);
        setLayout(null);
        bt35.addActionListener(this);
        bt36 = new JButton(tablaNombre[3][5]);
        bt36.setBounds(300+60, 275, 100, 25);
        this.add(bt36);
        setLayout(null);
        bt36.addActionListener(this);
        bt37 = new JButton(tablaNombre[3][6]);
        bt37.setBounds(300+60, 325, 100, 25);
        this.add(bt37);
        setLayout(null);
        bt37.addActionListener(this);
        bt38 = new JButton(tablaNombre[3][7]);
        bt38.setBounds(300+60, 350, 100, 25);
        this.add(bt38);
        setLayout(null);
        bt38.addActionListener(this);
        bt39 = new JButton(tablaNombre[3][8]);
        bt39.setBounds(300+60, 400, 100, 25);
        this.add(bt39);
        setLayout(null);
        bt39.addActionListener(this);
        bt40 = new JButton(tablaNombre[3][9]);
        bt40.setBounds(300+60, 425, 100, 25);
        this.add(bt40);
        setLayout(null);
        bt40.addActionListener(this);
       //Viernes
        bt41 = new JButton(tablaNombre[4][0]);
        bt41.setBounds(400+60, 100, 100, 25);
        this.add(bt41);
        setLayout(null);
        bt41.addActionListener(this);
        bt42 = new JButton(tablaNombre[4][1]);
        bt42.setBounds(400+60, 125, 100, 25);
        this.add(bt42);
        setLayout(null);
        bt42.addActionListener(this);
        bt43 = new JButton(tablaNombre[4][2]);
        bt43.setBounds(400+60, 175, 100, 25);
        this.add(bt43);
        setLayout(null);
        bt43.addActionListener(this);
        bt44 = new JButton(tablaNombre[4][3]);
        bt44.setBounds(400+60, 200, 100, 25);
        this.add(bt44);
        setLayout(null);
        bt44.addActionListener(this);
        bt45 = new JButton(tablaNombre[4][4]);
        bt45.setBounds(400+60, 250, 100, 25);
        this.add(bt45);
        setLayout(null);
        bt45.addActionListener(this);
        bt46 = new JButton(tablaNombre[4][5]);
        bt46.setBounds(400+60, 275, 100, 25);
        this.add(bt46);
        setLayout(null);
        bt46.addActionListener(this);
        bt47 = new JButton(tablaNombre[4][6]);
        bt47.setBounds(400+60, 325, 100, 25);
        this.add(bt47);
        setLayout(null);
        bt47.addActionListener(this);
        bt48 = new JButton(tablaNombre[4][7]);
        bt48.setBounds(400+60, 350, 100, 25);
        this.add(bt48);
        setLayout(null);
        bt48.addActionListener(this);
        bt49 = new JButton(tablaNombre[4][8]);
        bt49.setBounds(400+60, 400, 100, 25);
        this.add(bt49);
        setLayout(null);
        bt49.addActionListener(this);
        bt50 = new JButton(tablaNombre[4][9]);
        bt50.setBounds(400+60, 425, 100, 25);
        this.add(bt50);
        setLayout(null);
        bt50.addActionListener(this);
        
        botonBuscar = new JButton("Buscar");
        botonBuscar.setBounds(600+60, 135, 100, 25);
        this.add(botonBuscar);
        setLayout(null);
        botonBuscar.addActionListener(this);
        
        //Cargar horario
        labelClase = new JLabel();
        labelClase.setText("Ruta");
        labelClase.setBounds(630, 225, 100, 25);
        this.add(labelClase);
        textFieldRuta = new JTextField();
        textFieldRuta.setBounds(630, 250, 200, 25);
        textFieldRuta.setText(gestor.getAlumno());
        textFieldRuta.setEnabled(false);
        this.add(textFieldRuta);
        botonCargar = new JButton("Cargar excell");
        botonCargar.setBounds(630, 275, 200, 25);
        this.add(botonCargar);
        setLayout(null);
        botonCargar.addActionListener(this);
	    
	//ToolTips
<<<<<<< HEAD
        bt1.setToolTipText(tablaNombre[0][0]);
        bt2.setToolTipText(tablaNombre[0][1]);
        bt3.setToolTipText(tablaNombre[0][2]);
        bt4.setToolTipText(tablaNombre[0][3]);
        bt5.setToolTipText(tablaNombre[0][4]);
        bt6.setToolTipText(tablaNombre[0][5]);
        bt7.setToolTipText(tablaNombre[0][6]);
        bt8.setToolTipText(tablaNombre[0][7]);
        bt9.setToolTipText(tablaNombre[0][8]);
        bt10.setToolTipText(tablaNombre[0][9]);
        bt11.setToolTipText(tablaNombre[1][0]);
        bt12.setToolTipText(tablaNombre[1][1]);
        bt13.setToolTipText(tablaNombre[1][2]);
        bt14.setToolTipText(tablaNombre[1][3]);
        bt15.setToolTipText(tablaNombre[1][4]);
        bt16.setToolTipText(tablaNombre[1][5]);
        bt17.setToolTipText(tablaNombre[1][6]);
        bt18.setToolTipText(tablaNombre[1][7]);
        bt19.setToolTipText(tablaNombre[1][8]);
        bt20.setToolTipText(tablaNombre[1][9]);
        bt21.setToolTipText(tablaNombre[2][0]);
        bt22.setToolTipText(tablaNombre[2][1]);
        bt23.setToolTipText(tablaNombre[2][2]);
        bt24.setToolTipText(tablaNombre[2][3]);
        bt25.setToolTipText(tablaNombre[2][4]);
        bt26.setToolTipText(tablaNombre[2][5]);
        bt27.setToolTipText(tablaNombre[2][6]);
        bt28.setToolTipText(tablaNombre[2][7]);
        bt29.setToolTipText(tablaNombre[2][8]);
        bt30.setToolTipText(tablaNombre[2][9]);
        bt31.setToolTipText(tablaNombre[3][0]);
        bt32.setToolTipText(tablaNombre[3][1]);
        bt33.setToolTipText(tablaNombre[3][2]);
        bt34.setToolTipText(tablaNombre[3][3]);
        bt35.setToolTipText(tablaNombre[3][4]);
        bt36.setToolTipText(tablaNombre[3][5]);
        bt37.setToolTipText(tablaNombre[3][6]);
        bt38.setToolTipText(tablaNombre[3][7]);
        bt39.setToolTipText(tablaNombre[3][8]);
        bt40.setToolTipText(tablaNombre[3][9]);
        bt41.setToolTipText(tablaNombre[4][0]);
        bt42.setToolTipText(tablaNombre[4][1]);
        bt43.setToolTipText(tablaNombre[4][2]);
        bt44.setToolTipText(tablaNombre[4][3]);
        bt45.setToolTipText(tablaNombre[4][4]);
        bt46.setToolTipText(tablaNombre[4][5]);
        bt47.setToolTipText(tablaNombre[4][6]);
        bt48.setToolTipText(tablaNombre[4][7]);
        bt49.setToolTipText(tablaNombre[4][8]);
        bt50.setToolTipText(tablaNombre[4][9]);
=======
        bt1.setToolTipText(tablaNombre[0][0]+"\n"+tablaSala[0][0]);
        bt2.setToolTipText(tablaNombre[0][1]+"\n"+tablaSala[0][1]);
        bt3.setToolTipText(tablaNombre[0][2]+"\n"+tablaSala[0][2]);
        bt4.setToolTipText(tablaNombre[0][3]+"\n"+tablaSala[0][3]);
        bt5.setToolTipText(tablaNombre[0][4]+"\n"+tablaSala[0][4]);
        bt6.setToolTipText(tablaNombre[0][5]+"\n"+tablaSala[0][5]);
        bt7.setToolTipText(tablaNombre[0][6]+"\n"+tablaSala[0][6]);
        bt8.setToolTipText(tablaNombre[0][7]+"\n"+tablaSala[0][7]);
        bt9.setToolTipText(tablaNombre[0][8]+"\n"+tablaSala[0][8]);
        bt10.setToolTipText(tablaNombre[0][9]+"\n"+tablaSala[0][9]);
        bt11.setToolTipText(tablaNombre[1][0]+"\n"+tablaSala[1][0]);
        bt12.setToolTipText(tablaNombre[1][1]+"\n"+tablaSala[1][1]);
        bt13.setToolTipText(tablaNombre[1][2]+"\n"+tablaSala[1][2]);
        bt14.setToolTipText(tablaNombre[1][3]+"\n"+tablaSala[1][3]);
        bt15.setToolTipText(tablaNombre[1][4]+"\n"+tablaSala[1][4]);
        bt16.setToolTipText(tablaNombre[1][5]+"\n"+tablaSala[1][5]);
        bt17.setToolTipText(tablaNombre[1][6]+"\n"+tablaSala[1][6]);
        bt18.setToolTipText(tablaNombre[1][7]+"\n"+tablaSala[1][7]);
        bt19.setToolTipText(tablaNombre[1][8]+"\n"+tablaSala[1][8]);
        bt20.setToolTipText(tablaNombre[1][9]+"\n"+tablaSala[1][9]);
        bt21.setToolTipText(tablaNombre[2][0]+"\n"+tablaSala[2][0]);
        bt22.setToolTipText(tablaNombre[2][1]+"\n"+tablaSala[2][1]);
        bt23.setToolTipText(tablaNombre[2][2]+"\n"+tablaSala[2][2]);
        bt24.setToolTipText(tablaNombre[2][3]+"\n"+tablaSala[2][3]);
        bt25.setToolTipText(tablaNombre[2][4]+"\n"+tablaSala[2][4]);
        bt26.setToolTipText(tablaNombre[2][5]+"\n"+tablaSala[2][5]);
        bt27.setToolTipText(tablaNombre[2][6]+"\n"+tablaSala[2][6]);
        bt28.setToolTipText(tablaNombre[2][7]+"\n"+tablaSala[2][7]);
        bt29.setToolTipText(tablaNombre[2][8]+"\n"+tablaSala[2][8]);
        bt30.setToolTipText(tablaNombre[2][9]+"\n"+tablaSala[2][9]);
        bt31.setToolTipText(tablaNombre[3][0]+"\n"+tablaSala[3][0]);
        bt32.setToolTipText(tablaNombre[3][1]+"\n"+tablaSala[3][1]);
        bt33.setToolTipText(tablaNombre[3][2]+"\n"+tablaSala[3][2]);
        bt34.setToolTipText(tablaNombre[3][3]+"\n"+tablaSala[3][3]);
        bt35.setToolTipText(tablaNombre[3][4]+"\n"+tablaSala[3][4]);
        bt36.setToolTipText(tablaNombre[3][5]+"\n"+tablaSala[3][5]);
        bt37.setToolTipText(tablaNombre[3][6]+"\n"+tablaSala[3][6]);
        bt38.setToolTipText(tablaNombre[3][7]+"\n"+tablaSala[3][7]);
        bt39.setToolTipText(tablaNombre[3][8]+"\n"+tablaSala[3][8]);
        bt40.setToolTipText(tablaNombre[3][9]+"\n"+tablaSala[3][9]);
        bt41.setToolTipText(tablaNombre[4][0]+"\n"+tablaSala[4][0]);
        bt42.setToolTipText(tablaNombre[4][1]+"\n"+tablaSala[4][1]);
        bt43.setToolTipText(tablaNombre[4][2]+"\n"+tablaSala[4][2]);
        bt44.setToolTipText(tablaNombre[4][3]+"\n"+tablaSala[4][3]);
        bt45.setToolTipText(tablaNombre[4][4]+"\n"+tablaSala[4][4]);
        bt46.setToolTipText(tablaNombre[4][5]+"\n"+tablaSala[4][5]);
        bt47.setToolTipText(tablaNombre[4][6]+"\n"+tablaSala[4][6]);
        bt48.setToolTipText(tablaNombre[4][7]+"\n"+tablaSala[4][7]);
        bt49.setToolTipText(tablaNombre[4][8]+"\n"+tablaSala[4][8]);
        bt50.setToolTipText(tablaNombre[4][9]+"\n"+tablaSala[4][9]);
>>>>>>> origin/master
        
        
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == botonBuscar ){
                ResultadoBusqueda ventana = new ResultadoBusqueda(textFieldBuscar.getText().toUpperCase());
                ventana.setVisible(true);
                setVisible(false);
            
            
            
        }
        if(ae.getSource()== botonCargar){
            FileChooser();
            setVisible(false);
            JOptionPane.showMessageDialog(null, "Abra la aplicacion nuevamente para aplicar cambios");
            System.exit(0);
        }
        if (ae.getSource() == bt1) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[0][0]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt2) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[0][1]);
            ventana.setVisible(true);

        }
        if (ae.getSource() == bt3) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[0][2]);
            ventana.setVisible(true);

        }
        if (ae.getSource() == bt4) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[0][3]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt5) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[0][4]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt6) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[0][5]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt7) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[0][6]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt8) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[0][7]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt9) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[0][8]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt10) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[0][9]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt11) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[1][0]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt12) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[1][1]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt13) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[1][2]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt14) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[1][3]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt15) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[1][4]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt16) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[1][5]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt17) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[1][6]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt18) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[1][7]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt19) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[1][8]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt20) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[1][9]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt21) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[2][0]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt22) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[2][1]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt23) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[2][2]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt24) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[2][3]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt25) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[2][4]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt26) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[2][5]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt27) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[2][6]);
            ventana.setVisible(true);
        }  
        if (ae.getSource() == bt28) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[2][7]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt29) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[2][8]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt30) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[2][9]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt31) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[3][0]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt32) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[3][1]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt33) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[3][2]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt34) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[3][3]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt35) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[3][4]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt36) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[3][5]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt37) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[3][6]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt38) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[3][7]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt39) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[3][8]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt40) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[3][9]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt41) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[4][0]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt42) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[4][1]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt43) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[4][2]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt44) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[4][3]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt45) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[4][4]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt46) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[4][5]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt47) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[4][6]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt48) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[4][7]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt49) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[4][8]);
            ventana.setVisible(true);
        }
        if (ae.getSource() == bt50) {
            setVisible(false);
            ResultadoBusqueda ventana = new ResultadoBusqueda(tablaNombre[4][9]);
            ventana.setVisible(true);
        }
    }
    
    private void FileChooser(){
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	jfc.setDialogTitle("Elije la ruta de 'horario_academico.xlsx'");
	jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileFilter filter = new FileNameExtensionFilter(".xlsx","xlsx");
        jfc.addChoosableFileFilter(filter); 
        jfc.setFileFilter(filter);
        int returnValue = jfc.showOpenDialog(null);
		

            if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
                        if(selectedFile.getName().equals("horario_academico.xlsx")){
			GestorArchivo gestor = new GestorArchivo();
                        gestor.setAlumno(selectedFile.getAbsolutePath());}
                        else{
                            JOptionPane.showMessageDialog(null, "Nombre del archivo incorrecto, ingrese 'horario_academico.xlsx'");
                            FileChooser();
                        }
		}
    
    }
    
    private HorarioAlumno initHorario(GestorArchivo gestor){
            HorarioAlumno horario = null;
            try{
                horario = new HorarioAlumno();
                
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "Formato de archivo incorrecto \n Elija nuevo archivo");
                gestor.deleteFile();
                FileChooser();
                initHorario(gestor);
            }
            return horario;
        }
    }