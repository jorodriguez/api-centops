/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soflineas.api.repository;

//import api.centops.app.model.CoEmpresa;
import com.soflineas.api.base.AbstractFacade;
import com.soflineas.api.model.Usuario;
import com.soflineas.api.view.dto.UsuarioView;
import org.springframework.stereotype.Repository;
/**
 *
 * @author jorodriguez
 */
@Repository
//public class UsuarioCrudRepository extends AbstractFacade<Usuario> {
public class UsuarioRepository extends AbstractFacade<Usuario, Long, UsuarioView>{  
       
}
