/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.controler.dao.factory;

import java.sql.Connection;
import co.edu.sena.controler.dao.dao.*;
import co.edu.sena.controler.dao.jdbc.*;

public class EnvironmentDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return EnvironmentDao
	 */
	public static EnvironmentDao create()
	{
		return new EnvironmentDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return EnvironmentDao
	 */
	public static EnvironmentDao create(Connection conn)
	{
		return new EnvironmentDaoImpl( conn );
	}

}
