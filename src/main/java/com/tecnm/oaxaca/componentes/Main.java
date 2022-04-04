/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.componentes;

import com.tecnm.oaxaca.componentes.cuestion.Cuestion;
import com.tecnm.oaxaca.componentes.cuestion.JCuestion;
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
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Cuestion cuestion = new Cuestion("Valor de PI?",2,new String[]{"-1","0","3.1415","Ninguna"});
        JCuestion jCuestion = new JCuestion(cuestion);//This
        
        
        //JCuestion jCuestion2 = new JCuestion("Valor de e?",3,new String[]{"-1","0","9","Ninguna"});
        /*Cuestion cuestion = new Cuestion("Valor de PI?", 2, new String[]{"-1", "0", "3.1415", "Ninguna"});
        JCuestion jCuestion = new JCuestion();
        jCuestion.setCuestion(cuestion);*/

        JButton miBtn = new JButton("Ejemplo");
        miBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Respuesta correcta: "+(jCuestion.isSelectCorrect()?"Si":"No"));
                System.out.println(jCuestion.getCuestion());
                cuestion.setCuestion("Cambio pregunta");
                cuestion.getResponses()[0] = "otra cosas";
            }
        });

        
        ventana.add(miBtn);
        ventana.add(jCuestion);
        ventana.setVisible(true);
    }
}
