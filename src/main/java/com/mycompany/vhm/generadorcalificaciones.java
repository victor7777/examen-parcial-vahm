/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vhm;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class generadorcalificaciones {
    
 private ArrayList<Evaluacion> generarCalificaciones(){
        ArrayList<Evaluacion> a = new ArrayList<>();
            a.add(new Evaluacion("Petra", (float) 5.8));
            a.add(new Evaluacion("Jose", (float) 7.4));
            a.add(new Evaluacion("Roberta", (float) 8.6));
            return a;


}
