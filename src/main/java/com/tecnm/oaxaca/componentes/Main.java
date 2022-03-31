/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.componentes;

import com.tecnm.oaxaca.componentes.source.CustomJTextField;
import com.toedter.calendar.JCalendar;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Adrian
 */
public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setLayout(new FlowLayout());
        ventana.setLocationRelativeTo(null);
        ventana.setSize(400,400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /*CustomJTextField cuadritoLetras = new CustomJTextField();
        cuadritoLetras.setTypeInput(CustomJTextField.ONLY_TEXT);
        cuadritoLetras.setColumns(15);
        
        CustomJTextField cuadrioNumeros = new CustomJTextField();
        cuadrioNumeros.setTypeInput(CustomJTextField.ONLY_NUMBER_INTEGER);
        cuadrioNumeros.setColumns(15);
        */
        //ventana.add(cuadritoLetras);
        //ventana.add(cuadrioNumeros);
        
        JCalendar calendario = new JCalendar();
        JButton miBtn = new JButton("Ejemplo");
        miBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.err.println(calendario.getDate());
            }
        });

        ventana.add(calendario);
        ventana.add(miBtn);
        ventana.setVisible(true);
    }
}
