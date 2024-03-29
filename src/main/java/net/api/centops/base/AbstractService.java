/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.api.centops.base;


import java.util.List;
import net.api.centops.exception.CamposRequeridosFaltantesException;
/**
 *
 * @author ihsa
 * @param <T>
 */

public abstract interface AbstractService<T extends BaseDto> {
     
    List<T> findAll();
    
    List<T> findAll(T dto);
    
    T findId(Integer id);
    
    void create(T dto) throws CamposRequeridosFaltantesException;
    
    void edit(T dto);
    
    void remove(T dto);
    
}
