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
import co.edu.sena.model.dao.dao.WorkingDayDao;
import co.edu.sena.model.dao.dto.WorkingDay;
import co.edu.sena.model.dao.exceptions.WorkingDayDaoException;
import co.edu.sena.model.dao.factory.WorkingDayDaoFactory;

public class WorkingDayDaoSample
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
		// findWhereInitialsWorkingDayEquals("");
		// findWhereNameEquals("");
		// findWhereDescriptionEquals("");
		// findWhereImageEquals(null);
		// findWhereStateEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			WorkingDayDao _dao = getWorkingDayDao();
			WorkingDay _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereInitialsWorkingDayEquals'
	 * 
	 * @param initialsWorkingDay
	 */
	public static void findWhereInitialsWorkingDayEquals(String initialsWorkingDay)
	{
		try {
			WorkingDayDao _dao = getWorkingDayDao();
			WorkingDay _result[] = _dao.findWhereInitialsWorkingDayEquals(initialsWorkingDay);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNameEquals'
	 * 
	 * @param name
	 */
	public static void findWhereNameEquals(String name)
	{
		try {
			WorkingDayDao _dao = getWorkingDayDao();
			WorkingDay _result[] = _dao.findWhereNameEquals(name);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereDescriptionEquals'
	 * 
	 * @param description
	 */
	public static void findWhereDescriptionEquals(String description)
	{
		try {
			WorkingDayDao _dao = getWorkingDayDao();
			WorkingDay _result[] = _dao.findWhereDescriptionEquals(description);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereImageEquals'
	 * 
	 * @param image
	 */
	public static void findWhereImageEquals(byte[] image)
	{
		try {
			WorkingDayDao _dao = getWorkingDayDao();
			WorkingDay _result[] = _dao.findWhereImageEquals(image);
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
			WorkingDayDao _dao = getWorkingDayDao();
			WorkingDay _result[] = _dao.findWhereStateEquals(state);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getWorkingDayDao'
	 * 
	 * @return WorkingDayDao
	 */
	public static WorkingDayDao getWorkingDayDao()
	{
		return WorkingDayDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(WorkingDay dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getInitialsWorkingDay() );
		buf.append( ", " );
		buf.append( dto.getName() );
		buf.append( ", " );
		buf.append( dto.getDescription() );
		buf.append( ", " );
		buf.append( dto.getImage() );
		buf.append( ", " );
		buf.append( dto.getState() );
		System.out.println( buf.toString() );
	}

}