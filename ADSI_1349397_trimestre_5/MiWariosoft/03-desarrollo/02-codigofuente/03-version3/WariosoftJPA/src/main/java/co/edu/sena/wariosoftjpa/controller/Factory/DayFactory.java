/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.wariosoftjpa.controller.Factory;

import co.edu.sena.wariosoftjpa.controller.dao.DayDAO;
import co.edu.sena.wariosoftjpa.controller.dao.mysql.DayImpl;

/**
 *
 * @author Brayan
 */
public class DayFactory {
    public static DayDAO create(Class entityClass){
        return new DayImpl (entityClass);
    }
}