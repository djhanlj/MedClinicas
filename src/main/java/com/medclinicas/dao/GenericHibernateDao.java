/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medclinicas.dao;

import java.io.Serializable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 01932121102
 */
@Repository
@Scope( BeanDefinition.SCOPE_PROTOTYPE )
public class GenericHibernateDao< T extends Serializable >
  extends AbstractHibernateDao< T > implements IGenericDao< T >{

}