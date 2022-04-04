/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.componentes.cuestion;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Adrian
 */
public class JCuestion extends JPanel {

    private Cuestion cuestion;
    private JRadioButton optionsRadioButtons[];
    private ButtonGroup optionsButtonGroup;
    private JLabel cuestionLabel;
    
    private Container cuestionContainer;
    private Container optionsContainer;

    public JCuestion() {
        cuestion = new Cuestion();
        initComponent();
    }
    
    public JCuestion(Cuestion cuestion){
        this.cuestion = cuestion;
        initComponent();
    }

    public JCuestion(String cuestionText, int indexResponse, String[] responses) {
        cuestion = new Cuestion(cuestionText,indexResponse,responses);
        initComponent();
    }

    private void initComponent() {
        configureCuestionLabel();
        configureOptionsRadioButtons();
        configureOptionsButtonGroup();
        configureCuestionContainer();
        configureOptionsContainer();
        addElementsCuestionContainer();
        addElementsOptionsContainer();
        configureJCuestion();
    }

    private void configureCuestionLabel() {
        cuestionLabel = new JLabel(cuestion.getCuestion());
    }

    private void configureOptionsRadioButtons() {
        String responses[] = cuestion.getResponses();
        int indexResponse = cuestion.getIndexResponse();
        if(optionsRadioButtons == null){
            optionsRadioButtons = new JRadioButton[responses.length];
        }
        for (int i = 0; i < responses.length; i++) {
            String response = responses[i];
            if(optionsRadioButtons[i] == null){
                 optionsRadioButtons[i] = new JRadioButton(response, i == indexResponse);
            }else{
                optionsRadioButtons[i].setText(response);
                optionsRadioButtons[i].setSelected(i == indexResponse);
            }
           
        }
    }

    private void configureOptionsButtonGroup() {
        optionsButtonGroup = new ButtonGroup();
        for (JRadioButton optionsRadioButton : optionsRadioButtons) {
            optionsButtonGroup.add(optionsRadioButton);
        }
    }

    private void configureCuestionContainer() {
        cuestionContainer = new Container();
        cuestionContainer.setLayout(new FlowLayout());
    }

    private void configureOptionsContainer() {
        optionsContainer = new Container();
        optionsContainer.setLayout(new GridLayout(0, cuestion.getResponses().length));
    }

    private void addElementsCuestionContainer() {
        cuestionContainer.add(cuestionLabel);
    }

    private void addElementsOptionsContainer() {
        for (JRadioButton optionsRadioButton : optionsRadioButtons) {
            optionsContainer.add(optionsRadioButton);
        }
    }

    private void configureJCuestion() {
        setLayout(new BorderLayout());
        add(cuestionContainer, BorderLayout.NORTH);
        add(optionsContainer, BorderLayout.SOUTH);
        setVisible(true);
    }

    public Cuestion getCuestion() {
        return new Cuestion(cuestion.getCuestion(), cuestion.getIndexResponse(), cuestion.getResponses());
    }

    public void setCuestion(Cuestion cuestion) {
        this.cuestion = cuestion;
    }
    
    public boolean isSelectCorrect(){
        return optionsRadioButtons[cuestion.getIndexResponse()].isSelected();
    }
}
