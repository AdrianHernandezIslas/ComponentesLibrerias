/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.componentes.source;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

/**
 *
 * @author Adrian
 */
public class CustomJTextField extends JTextField implements KeyListener {

    public static final int ONLY_TEXT = 2;
    public static final int ONLY_NUMBER_FLOAT = 4;//1,10,10.5,0.5,0
    public static final int ONLY_NUMBER_INTEGER = 1;//5,2,10,0

    private int typeInput;
    private boolean havePoint = false;

    public CustomJTextField() {
        super();
        this.typeInput = ONLY_TEXT;
        this.addKeyListener(this);
    }

    public CustomJTextField(int i, int typeInput) {
        super(i);
        this.typeInput = typeInput;
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char key = e.getKeyChar();

        switch (typeInput) {
            case ONLY_NUMBER_INTEGER:
                if (!Character.isDigit(key)) {
                    e.consume();
                }
                break;
            case ONLY_TEXT:
                if (Character.isDigit(key)) {
                    e.consume();
                }
                break;
            case ONLY_NUMBER_FLOAT:
                if (!validateFLoat(key)) {
                    e.consume();
                }
                break;
        }
    }

    public boolean validateFLoat(char key) {
        return (Character.isDigit(key) || key == '.' && !getText().contains("."));
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public int getTypeInput() {
        return typeInput;
    }

    public void setTypeInput(int typeInput) {
        this.typeInput = typeInput;
    }
}
