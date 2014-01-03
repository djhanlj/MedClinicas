/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medclinicas.dao;

import com.medclinicas.entidade.Paciente;


/**
 *
 * @author 01932121102
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      

        IGenericDao<Paciente> dao = null;
        
        Paciente paciente = new Paciente();
        paciente.setNome("djair");
        dao.create(paciente);
        
    }
    
}
