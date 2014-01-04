/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medclinicas.dao;

import com.medclinicas.dao1.IGenericDao1;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.support.GenericXmlContextLoader;


import com.medclinicas.entidade.Paciente;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author 01932121102
 */
public class CriarBancoDeDados {

	public static void main(String[] args) throws Exception {
		System.out.println("Inicio carregamento dos dados no banco de dados");
		carregaDados();
		System.out.println("Fim da geracao e carregamento dos banco");

	}

	private static void carregaDados() throws Exception {
                ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] { "applicationContexto.xml" });
            
//		GenericXmlContextLoader contextLoader = new GenericXmlContextLoader();
//		ConfigurableApplicationContext context = contextLoader.loadContext("classpath:/WEB-INF/applicationContext.xml");
		//NonXADataSourceBean dadosBanco = context.getBean(NonXADataSourceBean.class);
	
		System.out.println("");
		System.out.println("");
		System.out.println("");
		//System.out.println("O banco que está sendo utilizado é o :  " + dadosBanco.getUrl()
		//		+ "   :::::::::::::::::::::::::");
		System.out.println("");
		System.out.println("");

		try {
			IGenericDao1 <Paciente> usuarioDAO = context.getBean(IGenericDao1.class);
			Paciente usuario = new Paciente();
			
			usuario.setSenha(123);
			usuario.setNome("Leandro Ferreira");
			usuario.setEmail("leandro3@leandro-ferreira.com");
			usuarioDAO.save(usuario);

			usuario.setEmail("junior@leandro.com.br");
			usuario.setNome("Junior Goes");
			usuario.setSenha(321);

			usuarioDAO.save(usuario);


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
}

