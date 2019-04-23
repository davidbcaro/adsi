/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import co.edu.sena.model.dao.dao.StateNumberGroupDao;
import co.edu.sena.model.dao.dto.StateNumberGroup;
import co.edu.sena.model.dao.exceptions.StateNumberGroupDaoException;
import co.edu.sena.model.dao.factory.StateNumberGroupDaoFactory;

public class StateNumberGroupDaoSample
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
		
		 findAll();
		// findWhereNameStateEquals("");
		// findWhereStateEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			StateNumberGroupDao _dao = getStateNumberGroupDao();
			StateNumberGroup _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNameStateEquals'
	 * 
	 * @param nameState
	 */
	public static void findWhereNameStateEquals(String nameState)
	{
		try {
			StateNumberGroupDao _dao = getStateNumberGroupDao();
			StateNumberGroup _result[] = _dao.findWhereNameStateEquals(nameState);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereStateEquals'
	 * 
	 * @param state
	 */
	public static void findWhereStateEquals(short state)
	{
		try {
			StateNumberGroupDao _dao = getStateNumberGroupDao();
			StateNumberGroup _result[] = _dao.findWhereStateEquals(state);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getStateNumberGroupDao'
	 * 
	 * @return StateNumberGroupDao
	 */
	public static StateNumberGroupDao getStateNumberGroupDao()
	{
		return StateNumberGroupDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(StateNumberGroup dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getNameState() );
		buf.append( ", " );
		buf.append( dto.getState() );
		System.out.println( buf.toString() );
	}

}
