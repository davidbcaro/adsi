/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.eon_jpa.controller.factory;

import co.edu.sena.eon_jpa.controller.dao.BondingDao;
import co.edu.sena.eon_jpa.controller.dao.mysql.BondingDaoImpl;

/**
 *
 * @author Liliana Narvaez
 */
public class BondingFactory {
     public static BondingDao create(Class entityClass){
        return new BondingDaoImpl(entityClass);
    } 
}