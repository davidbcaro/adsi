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
import co.edu.sena.model.dao.dao.ProgramDao;
import co.edu.sena.model.dao.dto.Program;
import co.edu.sena.model.dao.exceptions.ProgramDaoException;
import co.edu.sena.model.dao.factory.ProgramDaoFactory;

public class ProgramDaoSample
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
		// findByTrainingLevel("");
		// findWhereProgramCodeEquals("");
		// findWhereNameEquals("");
		// findWhereVersionEquals("");
		// findWhereInitialsEquals("");
		// findWhereStateEquals(0);
		// findWhereTrainingLevelEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ProgramDao _dao = getProgramDao();
			Program _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByTrainingLevel'
	 * 
	 * @param trainingLevel
	 */
	public static void findByTrainingLevel(String trainingLevel)
	{
		try {
			ProgramDao _dao = getProgramDao();
			Program _result[] = _dao.findByTrainingLevel(trainingLevel);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProgramCodeEquals'
	 * 
	 * @param programCode
	 */
	public static void findWhereProgramCodeEquals(String programCode)
	{
		try {
			ProgramDao _dao = getProgramDao();
			Program _result[] = _dao.findWhereProgramCodeEquals(programCode);
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
			ProgramDao _dao = getProgramDao();
			Program _result[] = _dao.findWhereNameEquals(name);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereVersionEquals'
	 * 
	 * @param version
	 */
	public static void findWhereVersionEquals(String version)
	{
		try {
			ProgramDao _dao = getProgramDao();
			Program _result[] = _dao.findWhereVersionEquals(version);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereInitialsEquals'
	 * 
	 * @param initials
	 */
	public static void findWhereInitialsEquals(String initials)
	{
		try {
			ProgramDao _dao = getProgramDao();
			Program _result[] = _dao.findWhereInitialsEquals(initials);
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
			ProgramDao _dao = getProgramDao();
			Program _result[] = _dao.findWhereStateEquals(state);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereTrainingLevelEquals'
	 * 
	 * @param trainingLevel
	 */
	public static void findWhereTrainingLevelEquals(String trainingLevel)
	{
		try {
			ProgramDao _dao = getProgramDao();
			Program _result[] = _dao.findWhereTrainingLevelEquals(trainingLevel);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getProgramDao'
	 * 
	 * @return ProgramDao
	 */
	public static ProgramDao getProgramDao()
	{
		return ProgramDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Program dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getProgramCode() );
		buf.append( ", " );
		buf.append( dto.getName() );
		buf.append( ", " );
		buf.append( dto.getVersion() );
		buf.append( ", " );
		buf.append( dto.getInitials() );
		buf.append( ", " );
		buf.append( dto.getState() );
		buf.append( ", " );
		buf.append( dto.getTrainingLevel() );
		System.out.println( buf.toString() );
	}

}
