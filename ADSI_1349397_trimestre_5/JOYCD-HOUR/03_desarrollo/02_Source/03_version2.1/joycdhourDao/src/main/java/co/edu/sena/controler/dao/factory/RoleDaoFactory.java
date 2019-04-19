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

public class RoleDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return RoleDao
	 */
	public static RoleDao create()
	{
		return new RoleDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return RoleDao
	 */
	public static RoleDao create(Connection conn)
	{
		return new RoleDaoImpl( conn );
	}

}
