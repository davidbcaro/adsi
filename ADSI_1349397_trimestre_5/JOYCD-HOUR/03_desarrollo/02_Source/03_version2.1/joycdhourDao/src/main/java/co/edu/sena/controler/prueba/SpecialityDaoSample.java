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
import co.edu.sena.controler.dao.dao.SpecialityDao;
import co.edu.sena.controler.dao.dto.Speciality;
import co.edu.sena.controler.dao.exceptions.SpecialityDaoException;
import co.edu.sena.controler.dao.factory.SpecialityDaoFactory;

public class SpecialityDaoSample
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
		// findWhereNameSpecialityEquals("");
		// findWhereStatusEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			SpecialityDao _dao = getSpecialityDao();
			Speciality _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNameSpecialityEquals'
	 * 
	 * @param nameSpeciality
	 */
	public static void findWhereNameSpecialityEquals(String nameSpeciality)
	{
		try {
			SpecialityDao _dao = getSpecialityDao();
			Speciality _result[] = _dao.findWhereNameSpecialityEquals(nameSpeciality);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereStatusEquals'
	 * 
	 * @param status
	 */
	public static void findWhereStatusEquals(short status)
	{
		try {
			SpecialityDao _dao = getSpecialityDao();
			Speciality _result[] = _dao.findWhereStatusEquals(status);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getSpecialityDao'
	 * 
	 * @return SpecialityDao
	 */
	public static SpecialityDao getSpecialityDao()
	{
		return SpecialityDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Speciality dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getNameSpeciality() );
		buf.append( ", " );
		buf.append( dto.getStatus() );
		System.out.println( buf.toString() );
	}

}
