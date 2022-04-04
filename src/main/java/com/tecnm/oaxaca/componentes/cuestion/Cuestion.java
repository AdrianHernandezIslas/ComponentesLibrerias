/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnm.oaxaca.componentes.cuestion;

import java.util.Arrays;

/**
 *
 * @author Adrian
 */
public class Cuestion {

    private String cuestion;
    private int indexResponse;
    private String responses[];

    public Cuestion() {
        cuestion = "Default cuestion?";
        indexResponse = 0;
        responses = new String[]{"Response [0]", "Response [1]", "Response [2]", "Response [3]"};
    }

    public Cuestion(String cuestion, int indexResponse, String[] responses) {
        this.cuestion = cuestion;
        this.indexResponse = indexResponse;
        this.responses = responses;
    }

    public String getCuestion() {
        return cuestion;
    }

    public void setCuestion(String cuestion) {
        this.cuestion = cuestion;
    }

    public int getIndexResponse() {
        return indexResponse;
    }

    public void setIndexResponse(int indexResponse) {
        this.indexResponse = indexResponse;
    }

    public String[] getResponses() {
        return responses;
    }

    public void setResponses(String[] responses) {
        this.responses = responses;
    }

    @Override
    public String toString() {
        return "Cuestion{" + "cuestion=" + cuestion + ", indexResponse=" + indexResponse + ", responses=" + Arrays.toString(responses) + '}';
    }
}
