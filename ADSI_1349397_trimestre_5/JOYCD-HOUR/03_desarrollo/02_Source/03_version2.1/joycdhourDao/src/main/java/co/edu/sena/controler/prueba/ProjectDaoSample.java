/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.controler.prueba;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import co.edu.sena.controler.dao.dao.ProjectDao;
import co.edu.sena.controler.dao.dto.Project;
import co.edu.sena.controler.dao.exceptions.ProjectDaoException;
import co.edu.sena.controler.dao.factory.ProjectDaoFactory;

public class ProjectDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findWhereCodeProjectEquals("");
		// findWhereNameProjectEquals("");
		// findWhereStatusProjectEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ProjectDao _dao = getProjectDao();
			Project _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCodeProjectEquals'
	 * 
	 * @param codeProject
	 */
	public static void findWhereCodeProjectEquals(String codeProject)
	{
		try {
			ProjectDao _dao = getProjectDao();
			Project _result[] = _dao.findWhereCodeProjectEquals(codeProject);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNameProjectEquals'
	 * 
	 * @param nameProject
	 */
	public static void findWhereNameProjectEquals(String nameProject)
	{
		try {
			ProjectDao _dao = getProjectDao();
			Project _result[] = _dao.findWhereNameProjectEquals(nameProject);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereStatusProjectEquals'
	 * 
	 * @param statusProject
	 */
	public static void findWhereStatusProjectEquals(short statusProject)
	{
		try {
			ProjectDao _dao = getProjectDao();
			Project _result[] = _dao.findWhereStatusProjectEquals(statusProject);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getProjectDao'
	 * 
	 * @return ProjectDao
	 */
	public static ProjectDao getProjectDao()
	{
		return ProjectDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Project dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getCodeProject() );
		buf.append( ", " );
		buf.append( dto.getNameProject() );
		buf.append( ", " );
		buf.append( dto.getStatusProject() );
		System.out.println( buf.toString() );
	}

}