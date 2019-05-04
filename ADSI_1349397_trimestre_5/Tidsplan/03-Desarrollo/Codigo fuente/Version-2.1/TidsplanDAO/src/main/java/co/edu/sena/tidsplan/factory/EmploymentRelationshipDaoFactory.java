/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.tidsplan.factory;

import java.sql.Connection;
import co.edu.sena.tidsplan.dao.*;
import co.edu.sena.tidsplan.jdbc.*;

public class EmploymentRelationshipDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return EmploymentRelationshipDao
	 */
	public static EmploymentRelationshipDao create()
	{
		return new EmploymentRelationshipDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return EmploymentRelationshipDao
	 */
	public static EmploymentRelationshipDao create(Connection conn)
	{
		return new EmploymentRelationshipDaoImpl( conn );
	}

}