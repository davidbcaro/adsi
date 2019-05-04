/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.tidsplanjpa.controller.factory;

import co.edu.sena.tidsplanjpa.controller.dao.LearningResultDao;
import co.edu.sena.tidsplanjpa.controller.dao.mysql.LearningResultDaoImpl;





/**
 *
 * @author 1349397
 */
public class LearningResultFactory {
    public static LearningResultDao create(Class entityClass){
        return new LearningResultDaoImpl(entityClass);
    }

}