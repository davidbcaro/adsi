/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.daowariosoft.controller.dao;

import co.edu.sena.daowariosoft.model.dto.RoleDTO;
import java.util.Collection;

/**
 *
 * @author 1349397
 */
public interface RoleDAO {
   public int insert(RoleDTO role);
   public int update(RoleDTO role, String llave);
   public int delete(String llave);
   public Collection<RoleDTO> findAll();
   public RoleDTO findPk(String llave);
}
