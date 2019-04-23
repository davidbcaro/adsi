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
import co.edu.sena.model.dao.dao.LearningOutcomeHasActivityDao;
import co.edu.sena.model.dao.dto.LearningOutcomeHasActivity;
import co.edu.sena.model.dao.exceptions.LearningOutcomeHasActivityDaoException;
import co.edu.sena.model.dao.factory.LearningOutcomeHasActivityDaoFactory;

public class LearningOutcomeHasActivityDaoSample
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
		// findByActivity(0, "", "");
		// findByLearningOutcome("", "", "", "");
		// findWhereLOutcomeCodeEquals("");
		// findWhereProgramCodeEquals("");
		// findWhereCompetitionCodeEquals("");
		// findWhereIdActivityEquals(0);
		// findWhereNamePhaseEquals("");
		// findWhereProjectCodeEquals("");
		// findWhereVersionEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			LearningOutcomeHasActivityDao _dao = getLearningOutcomeHasActivityDao();
			LearningOutcomeHasActivity _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByActivity'
	 * 
	 * @param idActivity
	 * @param namePhase
	 * @param projectCode
	 */
	public static void findByActivity(int idActivity, String namePhase, String projectCode)
	{
		try {
			LearningOutcomeHasActivityDao _dao = getLearningOutcomeHasActivityDao();
			LearningOutcomeHasActivity _result[] = _dao.findByActivity(idActivity, namePhase, projectCode);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByLearningOutcome'
	 * 
	 * @param lOutcomeCode
	 * @param competitionCode
	 * @param programCode
	 * @param version
	 */
	public static void findByLearningOutcome(String lOutcomeCode, String competitionCode, String programCode, String version)
	{
		try {
			LearningOutcomeHasActivityDao _dao = getLearningOutcomeHasActivityDao();
			LearningOutcomeHasActivity _result[] = _dao.findByLearningOutcome(lOutcomeCode, competitionCode, programCode, version);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereLOutcomeCodeEquals'
	 * 
	 * @param lOutcomeCode
	 */
	public static void findWhereLOutcomeCodeEquals(String lOutcomeCode)
	{
		try {
			LearningOutcomeHasActivityDao _dao = getLearningOutcomeHasActivityDao();
			LearningOutcomeHasActivity _result[] = _dao.findWhereLOutcomeCodeEquals(lOutcomeCode);
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
			LearningOutcomeHasActivityDao _dao = getLearningOutcomeHasActivityDao();
			LearningOutcomeHasActivity _result[] = _dao.findWhereProgramCodeEquals(programCode);
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
			LearningOutcomeHasActivityDao _dao = getLearningOutcomeHasActivityDao();
			LearningOutcomeHasActivity _result[] = _dao.findWhereCompetitionCodeEquals(competitionCode);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdActivityEquals'
	 * 
	 * @param idActivity
	 */
	public static void findWhereIdActivityEquals(int idActivity)
	{
		try {
			LearningOutcomeHasActivityDao _dao = getLearningOutcomeHasActivityDao();
			LearningOutcomeHasActivity _result[] = _dao.findWhereIdActivityEquals(idActivity);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNamePhaseEquals'
	 * 
	 * @param namePhase
	 */
	public static void findWhereNamePhaseEquals(String namePhase)
	{
		try {
			LearningOutcomeHasActivityDao _dao = getLearningOutcomeHasActivityDao();
			LearningOutcomeHasActivity _result[] = _dao.findWhereNamePhaseEquals(namePhase);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProjectCodeEquals'
	 * 
	 * @param projectCode
	 */
	public static void findWhereProjectCodeEquals(String projectCode)
	{
		try {
			LearningOutcomeHasActivityDao _dao = getLearningOutcomeHasActivityDao();
			LearningOutcomeHasActivity _result[] = _dao.findWhereProjectCodeEquals(projectCode);
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
			LearningOutcomeHasActivityDao _dao = getLearningOutcomeHasActivityDao();
			LearningOutcomeHasActivity _result[] = _dao.findWhereVersionEquals(version);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getLearningOutcomeHasActivityDao'
	 * 
	 * @return LearningOutcomeHasActivityDao
	 */
	public static LearningOutcomeHasActivityDao getLearningOutcomeHasActivityDao()
	{
		return LearningOutcomeHasActivityDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(LearningOutcomeHasActivity dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getLOutcomeCode() );
		buf.append( ", " );
		buf.append( dto.getProgramCode() );
		buf.append( ", " );
		buf.append( dto.getCompetitionCode() );
		buf.append( ", " );
		buf.append( dto.getIdActivity() );
		buf.append( ", " );
		buf.append( dto.getNamePhase() );
		buf.append( ", " );
		buf.append( dto.getProjectCode() );
		buf.append( ", " );
		buf.append( dto.getVersion() );
		System.out.println( buf.toString() );
	}

}
