/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medclinicas.dao1;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author shedler
 */
public interface IGenericDao1<T extends Serializable> {
 
   public void setClazz( Class< T > clazzToSet );
 
   public T findOne( Long id );
 
   public List< T > findAll();
 
   public void save( T entity );
 
   public void update( T entity );
 
   public void delete( T entity );
   
   public void deleteById( Long entityId );
}
