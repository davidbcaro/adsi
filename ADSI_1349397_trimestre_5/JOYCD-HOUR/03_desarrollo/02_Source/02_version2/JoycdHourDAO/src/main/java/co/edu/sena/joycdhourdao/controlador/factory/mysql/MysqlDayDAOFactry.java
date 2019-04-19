/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.joycdhourdao.controlador.factory.mysql;

import co.edu.sena.joycdhourdao.controlador.dao.DayDAO;
import co.edu.sena.joycdhourdao.controlador.dao.mysql.MysqlDayDAO;
import co.edu.sena.joycdhourdao.controlador.factory.DayDAOFactory;

/**
 *
 * @author 1349397
 */
public class MysqlDayDAOFactry implements DayDAOFactory{
    
       @Override
       public DayDAO create(){
        return new MysqlDayDAO();
}
    
}
