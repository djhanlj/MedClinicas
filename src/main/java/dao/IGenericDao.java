/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 01932121102
 */
public interface IGenericDao<T extends Serializable> {
 
   T findOne(final long id);
 
   List<T> findAll();
 
   void create(final T entity);
 
   void update(final T entity);
 
   void delete(final T entity);
 
   void deleteById(final long entityId);
}