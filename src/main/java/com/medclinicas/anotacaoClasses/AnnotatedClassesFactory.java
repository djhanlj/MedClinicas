/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medclinicas.anotacaoClasses;

import com.medclinicas.dao.AbstractHibernateDao;
import com.medclinicas.dao.CriarBancoDeDados;
import com.medclinicas.dao.GenericHibernateDao;
import com.medclinicas.dao.IGenericDao;
import com.medclinicas.dao1.GenericJpaDao;
import com.medclinicas.entidade.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 01932121102
 */
public class AnnotatedClassesFactory{

	/** Lista de classes Hibernate */
	private static List<Class<?>> classesHibernate = new ArrayList<Class<?>>();

	/** Tem todas as classes: Hibernate. */
	private static List<Class<?>> classes = new ArrayList<Class<?>>();

	static {
		adicionarClassesHibernate();
		inicializarListaCompletaDeClasses();
	}

	/**
	 * Método responsável por mapear classes Hibernate.
	 */
	private static void adicionarClassesHibernate() {
		classesHibernate.add(Paciente.class);
//		classesHibernate.add(AbstractHibernateDao.class);
//                classesHibernate.add(GenericHibernateDao.class);
//                 classesHibernate.add(IGenericDao.class);
//                classesHibernate.add(CriarBancoDeDados.class);
//                classesHibernate.add(GenericJpaDao.class);
	}

	/**
	 * Método responsável por inicializar as classes do Hibernate.
	 */
	private static void inicializarListaCompletaDeClasses() {
		classes.addAll(classesHibernate);
	}

	/**
	 * Retorna uma Lista com os nomes das classes informadas.
	 * 
	 * @param classes
	 *            Lista de classe anotadas
	 * @return {@link List} Lista de nomes das classes
	 */
	@SuppressWarnings("unused")
	private static List<String> classToString(List<Class<?>> classes) {
		List<String> classesString = new ArrayList<String>();
		for (Class<?> classe : classes) {
			classesString.add(classe.getName());
		}
		return classesString;
	}

	/**
	 * Retorna a lista com todas as classes do sistema que devem ser mapeadas
	 * com o Hibernate.
	 * 
	 * @return todas as classes mapeadas
	 */
	public static List<Class<?>> getClassesAnotadas() {
		return classes;
	}

}

