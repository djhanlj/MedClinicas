/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Paciente;

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
        Paciente paciente = new Paciente();
        GenericHibernateDao<Paciente> dao = null;
        paciente.setNome("djair");
        dao.create(paciente);
        
    }
}
