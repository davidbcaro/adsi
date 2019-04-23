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
import co.edu.sena.model.dao.dao.CompetitionDao;
import co.edu.sena.model.dao.dto.Competition;
import co.edu.sena.model.dao.exceptions.CompetitionDaoException;
import co.edu.sena.model.dao.factory.CompetitionDaoFactory;

public class CompetitionDaoSample
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
		// findByProgram("", "");
		// findWhereCompetitionCodeEquals("");
		// findWhereDescriptionEquals("");
		// findWhereProgramCodeEquals("");
		// findWhereVersionEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			CompetitionDao _dao = getCompetitionDao();
			Competition _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByProgram'
	 * 
	 * @param programCode
	 * @param version
	 */
	public static void findByProgram(String programCode, String version)
	{
		try {
			CompetitionDao _dao = getCompetitionDao();
			Competition _result[] = _dao.findByProgram(programCode, version);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCompetitionCodeEquals'
	 * 
	 * @param competitionCode
	 */
	public static void findWhereCompetitionCodeEquals(String competitionCode)
	{
		try {
			CompetitionDao _dao = getCompetitionDao();
			Competition _result[] = _dao.findWhereCompetitionCodeEquals(competitionCode);
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
			CompetitionDao _dao = getCompetitionDao();
			Competition _result[] = _dao.findWhereDescriptionEquals(description);
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
			CompetitionDao _dao = getCompetitionDao();
			Competition _result[] = _dao.findWhereProgramCodeEquals(programCode);
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
			CompetitionDao _dao = getCompetitionDao();
			Competition _result[] = _dao.findWhereVersionEquals(version);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getCompetitionDao'
	 * 
	 * @return CompetitionDao
	 */
	public static CompetitionDao getCompetitionDao()
	{
		return CompetitionDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Competition dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getCompetitionCode() );
		buf.append( ", " );
		buf.append( dto.getDescription() );
		buf.append( ", " );
		buf.append( dto.getProgramCode() );
		buf.append( ", " );
		buf.append( dto.getVersion() );
		System.out.println( buf.toString() );
	}

}