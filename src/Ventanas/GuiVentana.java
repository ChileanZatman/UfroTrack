/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author sebas
 */
public class GuiBotones  extends JFrame implements ActionListener {
    
 private JLabel labelClase;
 private JTextField textFieldRut, textFieldBuscar, textFieldNombre;
 private JComboBox comboCategoria;
 private JButton bt1, bt2, bt3,  bt4,  bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17,
                 bt18, bt19,bt20, bt21, bt22, bt23, bt24, bt25, bt26,bt27, bt28, bt29, bt30, bt31, bt32, bt33,
                 bt34, bt35, bt36, bt37, bt38, bt39, bt40, bt41,bt42,bt43,bt44,bt45,bt46,bt47,bt48,bt49,bt50;
 
    public GuiBotones() {
        
        super("UfroTrack");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X
        this.setSize(1000, 500);//configurando tamaño de la ventana
        
        //Labels
        labelClase = new JLabel("Rut");
        labelClase.setText("Rut");
        labelClase.setBounds(600, 10, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("Nombre");
        labelClase.setText("Nombre");
        labelClase.setBounds(10, 10, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("Lunes");
        labelClase.setText("Lunes");
        labelClase.setBounds(10, 60, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("Martes");
        labelClase.setText("Martes");
        labelClase.setBounds(110, 60, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("Miercoles");
        labelClase.setText("Miercoles");
        labelClase.setBounds(210, 60, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("Jueves");
        labelClase.setText("Jueves");
        labelClase.setBounds(310, 60, 100, 25);
        this.add(labelClase);
        labelClase = new JLabel("Viernes");
        labelClase.setText("Viernes");
        labelClase.setBounds(410, 60, 100, 25);
        this.add(labelClase);
        
        //TextFields
        textFieldRut = new JTextField();
        textFieldRut.setEditable(false);
        textFieldRut.setBounds(700, 10, 100, 25);
        textFieldRut.setText("");
        this.add(textFieldRut);
        textFieldBuscar = new JTextField();
        textFieldBuscar.setBounds(600, 110, 100, 25);
        textFieldBuscar.setText("Buscar");
        this.add(textFieldBuscar);
        textFieldNombre = new JTextField();
        textFieldNombre.setEditable(false);
        textFieldNombre.setBounds(110, 10, 100, 25);
        textFieldNombre.setText("");
        this.add(textFieldNombre);
        
        //ComboBox
        String[] opc2 = {};
        comboCategoria = new JComboBox(opc2);
        comboCategoria.setBounds(700, 110, 100, 25);
        comboCategoria.addItem("Categoria");
        comboCategoria.addActionListener(this);
        this.setLayout(null);
        this.add(comboCategoria);
        
        //JButtons
        
        bt1 = new JButton("Terminar");
        bt1.setBounds(0, 100, 100, 25);
        this.add(bt1);
        setLayout(null);
        bt1.addActionListener(this);
        bt2 = new JButton("Terminar");
        bt2.setBounds(0, 125, 100, 25);
        this.add(bt2);
        setLayout(null);
        bt2.addActionListener(this);
        bt3 = new JButton("Terminar");
        bt3.setBounds(0, 175, 100, 25);
        this.add(bt3);
        setLayout(null);
        bt3.addActionListener(this);
        bt4 = new JButton("Terminar");
        bt4.setBounds(0, 200, 100, 25);
        this.add(bt4);
        setLayout(null);
        bt4.addActionListener(this);
        bt5 = new JButton("Terminar");
        bt5.setBounds(0, 250, 100, 25);
        this.add(bt5);
        setLayout(null);
        bt5.addActionListener(this);
        bt6 = new JButton("Terminar");
        bt6.setBounds(0, 275, 100, 25);
        this.add(bt6);
        setLayout(null);
        bt6.addActionListener(this);
        bt7 = new JButton("Terminar");
        bt7.setBounds(0, 325, 100, 25);
        this.add(bt7);
        setLayout(null);
        bt7.addActionListener(this);
        bt8 = new JButton("Terminar");
        bt8.setBounds(0, 350, 100, 25);
        this.add(bt8);
        setLayout(null);
        bt8.addActionListener(this);
        bt9 = new JButton("Terminar");
        bt9.setBounds(0, 400, 100, 25);
        this.add(bt9);
        setLayout(null);
        bt9.addActionListener(this);
        bt10 = new JButton("Terminar");
        bt10.setBounds(0, 425, 100, 25);
        this.add(bt10);
        setLayout(null);
        bt10.addActionListener(this);
        bt11 = new JButton("Terminar");
        bt11.setBounds(100, 100, 100, 25);
        this.add(bt11);
        setLayout(null);
        bt11.addActionListener(this);
        bt12 = new JButton("Terminar");
        bt12.setBounds(100, 125, 100, 25);
        this.add(bt12);
        setLayout(null);
        bt12.addActionListener(this);
        bt13 = new JButton("Terminar");
        bt13.setBounds(100, 175, 100, 25);
        this.add(bt13);
        setLayout(null);
        bt13.addActionListener(this);
        bt14 = new JButton("Terminar");
        bt14.setBounds(100, 200, 100, 25);
        this.add(bt14);
        setLayout(null);
        bt14.addActionListener(this);
        bt15 = new JButton("Terminar");
        bt15.setBounds(100, 250, 100, 25);
        this.add(bt15);
        setLayout(null);
        bt15.addActionListener(this);
        bt16 = new JButton("Terminar");
        bt16.setBounds(100, 275, 100, 25);
        this.add(bt16);
        setLayout(null);
        bt16.addActionListener(this);
        bt17 = new JButton("Terminar");
        bt17.setBounds(100, 325, 100, 25);
        this.add(bt17);
        setLayout(null);
        bt17.addActionListener(this);
        bt18 = new JButton("Terminar");
        bt18.setBounds(100, 350, 100, 25);
        this.add(bt18);
        setLayout(null);
        bt18.addActionListener(this);
        bt19 = new JButton("Terminar");
        bt19.setBounds(100, 400, 100, 25);
        this.add(bt19);
        setLayout(null);
        bt19.addActionListener(this);
        bt20 = new JButton("Terminar");
        bt20.setBounds(100, 425, 100, 25);
        this.add(bt20);
        setLayout(null);
        bt20.addActionListener(this);       
        bt21 = new JButton("Terminar");
        bt21.setBounds(200, 100, 100, 25);
        this.add(bt21);
        setLayout(null);
        bt21.addActionListener(this);
        bt22 = new JButton("Terminar");
        bt22.setBounds(200, 125, 100, 25);
        this.add(bt22);
        setLayout(null);
        bt22.addActionListener(this);
        bt23 = new JButton("Terminar");
        bt23.setBounds(200, 175, 100, 25);
        this.add(bt23);
        setLayout(null);
        bt23.addActionListener(this);
        bt24 = new JButton("Terminar");
        bt24.setBounds(200, 200, 100, 25);
        this.add(bt24);
        setLayout(null);
        bt24.addActionListener(this);
        bt25 = new JButton("Terminar");
        bt25.setBounds(200, 250, 100, 25);
        this.add(bt25);
        setLayout(null);
        bt25.addActionListener(this);
        bt26 = new JButton("Terminar");
        bt26.setBounds(200, 275, 100, 25);
        this.add(bt26);
        setLayout(null);
        bt26.addActionListener(this);
        bt27 = new JButton("Terminar");
        bt27.setBounds(200, 325, 100, 25);
        this.add(bt27);
        setLayout(null);
        bt27.addActionListener(this);
        bt28 = new JButton("Terminar");
        bt28.setBounds(200, 350, 100, 25);
        this.add(bt28);
        setLayout(null);
        bt28.addActionListener(this);
        bt29 = new JButton("Terminar");
        bt29.setBounds(200, 400, 100, 25);
        this.add(bt29);
        setLayout(null);
        bt29.addActionListener(this);
        bt30 = new JButton("Terminar");
        bt30.setBounds(200, 425, 100, 25);
        this.add(bt30);
        setLayout(null);
        bt30.addActionListener(this);
        bt31 = new JButton("Terminar");
        bt31.setBounds(300, 100, 100, 25);
        this.add(bt31);
        setLayout(null);
        bt31.addActionListener(this);
        bt32 = new JButton("Terminar");
        bt32.setBounds(300, 125, 100, 25);
        this.add(bt32);
        setLayout(null);
        bt32.addActionListener(this);
        bt33 = new JButton("Terminar");
        bt33.setBounds(300, 175, 100, 25);
        this.add(bt33);
        setLayout(null);
        bt33.addActionListener(this);
        bt34 = new JButton("Terminar");
        bt34.setBounds(300, 200, 100, 25);
        this.add(bt34);
        setLayout(null);
        bt34.addActionListener(this);
        bt35 = new JButton("Terminar");
        bt35.setBounds(300, 250, 100, 25);
        this.add(bt35);
        setLayout(null);
        bt35.addActionListener(this);
        bt36 = new JButton("Terminar");
        bt36.setBounds(300, 275, 100, 25);
        this.add(bt36);
        setLayout(null);
        bt36.addActionListener(this);
        bt37 = new JButton("Terminar");
        bt37.setBounds(300, 325, 100, 25);
        this.add(bt37);
        setLayout(null);
        bt37.addActionListener(this);
        bt38 = new JButton("Terminar");
        bt38.setBounds(300, 350, 100, 25);
        this.add(bt38);
        setLayout(null);
        bt38.addActionListener(this);
        bt39 = new JButton("Terminar");
        bt39.setBounds(300, 400, 100, 25);
        this.add(bt39);
        setLayout(null);
        bt39.addActionListener(this);
        bt40 = new JButton("Terminar");
        bt40.setBounds(300, 425, 100, 25);
        this.add(bt40);
        setLayout(null);
        bt40.addActionListener(this);
        bt41 = new JButton("Terminar");
        bt41.setBounds(400, 100, 100, 25);
        this.add(bt41);
        setLayout(null);
        bt41.addActionListener(this);
        bt42 = new JButton("Terminar");
        bt42.setBounds(400, 125, 100, 25);
        this.add(bt42);
        setLayout(null);
        bt42.addActionListener(this);
        bt43 = new JButton("Terminar");
        bt43.setBounds(400, 175, 100, 25);
        this.add(bt43);
        setLayout(null);
        bt43.addActionListener(this);
        bt44 = new JButton("Terminar");
        bt44.setBounds(400, 200, 100, 25);
        this.add(bt44);
        setLayout(null);
        bt44.addActionListener(this);
        bt45 = new JButton("Terminar");
        bt45.setBounds(400, 250, 100, 25);
        this.add(bt45);
        setLayout(null);
        bt45.addActionListener(this);
        bt46 = new JButton("Terminar");
        bt46.setBounds(400, 275, 100, 25);
        this.add(bt46);
        setLayout(null);
        bt46.addActionListener(this);
        bt47 = new JButton("Terminar");
        bt47.setBounds(400, 325, 100, 25);
        this.add(bt47);
        setLayout(null);
        bt47.addActionListener(this);
        bt48 = new JButton("Terminar");
        bt48.setBounds(400, 350, 100, 25);
        this.add(bt48);
        setLayout(null);
        bt48.addActionListener(this);
        bt49 = new JButton("Terminar");
        bt49.setBounds(400, 400, 100, 25);
        this.add(bt49);
        setLayout(null);
        bt49.addActionListener(this);
        bt50 = new JButton("Terminar");
        bt50.setBounds(400, 425, 100, 25);
        this.add(bt50);
        setLayout(null);
        bt50.addActionListener(this);
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
