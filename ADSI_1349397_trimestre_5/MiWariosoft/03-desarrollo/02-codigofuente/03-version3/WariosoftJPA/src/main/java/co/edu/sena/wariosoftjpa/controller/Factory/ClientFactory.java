/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.wariosoftjpa.controller.Factory;

import co.edu.sena.wariosoftjpa.controller.dao.ClientDAO;
import co.edu.sena.wariosoftjpa.controller.dao.mysql.ClientImpl;

/**
 *
 * @author WINDOWS 8
 */
public class ClientFactory {
    public static ClientDAO create(Class entityClass) {
        return new ClientImpl(entityClass);
    }
    
}
