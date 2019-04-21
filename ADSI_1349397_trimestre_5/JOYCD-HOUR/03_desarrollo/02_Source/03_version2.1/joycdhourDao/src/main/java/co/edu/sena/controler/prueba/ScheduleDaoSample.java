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
import co.edu.sena.controler.dao.dao.ScheduleDao;
import co.edu.sena.controler.dao.dto.Schedule;
import co.edu.sena.controler.dao.exceptions.ScheduleDaoException;
import co.edu.sena.controler.dao.factory.ScheduleDaoFactory;

public class ScheduleDaoSample
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
		// findByDay("");
		// findByEnvironment("", "");
		// findByGroupNumberHasTrimester("", "", "");
		// findByInstructor("", "");
		// findByModality("");
		// findByVersionSchedule(0, "");
		// findWhereHourStartEquals("");
		// findWhereHourEndEquals("");
		// findWhereNameModalityEquals("");
		// findWhereScheduleFinishEquals(null);
		// findWhereVersionEquals(0);
		// findWhereVersionActualityTrimesterEquals("");
		// findWhereNumberEnvironmentEquals("");
		// findWhereHeadquartersNameEquals("");
		// findWhereNameDayEquals("");
		// findWhereDocumentTypeEquals("");
		// findWhereIdentificationCardNumberEquals("");
		// findWhereGroupsNumberEquals("");
		// findWhereTrimesterNameEquals("");
		// findWhereWorkingDayInitialsEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByDay'
	 * 
	 * @param nameDay
	 */
	public static void findByDay(String nameDay)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findByDay(nameDay);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByEnvironment'
	 * 
	 * @param numberEnvironment
	 * @param headquartersName
	 */
	public static void findByEnvironment(String numberEnvironment, String headquartersName)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findByEnvironment(numberEnvironment, headquartersName);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByGroupNumberHasTrimester'
	 * 
	 * @param groupsNumber
	 * @param trimesterName
	 * @param workingDayInitials
	 */
	public static void findByGroupNumberHasTrimester(String groupsNumber, String trimesterName, String workingDayInitials)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findByGroupNumberHasTrimester(groupsNumber, trimesterName, workingDayInitials);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByInstructor'
	 * 
	 * @param documentType
	 * @param identificationCardNumber
	 */
	public static void findByInstructor(String documentType, String identificationCardNumber)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findByInstructor(documentType, identificationCardNumber);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByModality'
	 * 
	 * @param nameModality
	 */
	public static void findByModality(String nameModality)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findByModality(nameModality);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByVersionSchedule'
	 * 
	 * @param version
	 * @param versionActualityTrimester
	 */
	public static void findByVersionSchedule(int version, String versionActualityTrimester)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findByVersionSchedule(version, versionActualityTrimester);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereHourStartEquals'
	 * 
	 * @param hourStart
	 */
	public static void findWhereHourStartEquals(String hourStart)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereHourStartEquals(hourStart);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereHourEndEquals'
	 * 
	 * @param hourEnd
	 */
	public static void findWhereHourEndEquals(String hourEnd)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereHourEndEquals(hourEnd);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNameModalityEquals'
	 * 
	 * @param nameModality
	 */
	public static void findWhereNameModalityEquals(String nameModality)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereNameModalityEquals(nameModality);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereScheduleFinishEquals'
	 * 
	 * @param scheduleFinish
	 */
	public static void findWhereScheduleFinishEquals(Date scheduleFinish)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereScheduleFinishEquals(scheduleFinish);
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
	public static void findWhereVersionEquals(int version)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereVersionEquals(version);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereVersionActualityTrimesterEquals'
	 * 
	 * @param versionActualityTrimester
	 */
	public static void findWhereVersionActualityTrimesterEquals(String versionActualityTrimester)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereVersionActualityTrimesterEquals(versionActualityTrimester);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNumberEnvironmentEquals'
	 * 
	 * @param numberEnvironment
	 */
	public static void findWhereNumberEnvironmentEquals(String numberEnvironment)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereNumberEnvironmentEquals(numberEnvironment);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereHeadquartersNameEquals'
	 * 
	 * @param headquartersName
	 */
	public static void findWhereHeadquartersNameEquals(String headquartersName)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereHeadquartersNameEquals(headquartersName);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNameDayEquals'
	 * 
	 * @param nameDay
	 */
	public static void findWhereNameDayEquals(String nameDay)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereNameDayEquals(nameDay);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereDocumentTypeEquals'
	 * 
	 * @param documentType
	 */
	public static void findWhereDocumentTypeEquals(String documentType)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereDocumentTypeEquals(documentType);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdentificationCardNumberEquals'
	 * 
	 * @param identificationCardNumber
	 */
	public static void findWhereIdentificationCardNumberEquals(String identificationCardNumber)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereIdentificationCardNumberEquals(identificationCardNumber);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereGroupsNumberEquals'
	 * 
	 * @param groupsNumber
	 */
	public static void findWhereGroupsNumberEquals(String groupsNumber)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereGroupsNumberEquals(groupsNumber);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereTrimesterNameEquals'
	 * 
	 * @param trimesterName
	 */
	public static void findWhereTrimesterNameEquals(String trimesterName)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereTrimesterNameEquals(trimesterName);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereWorkingDayInitialsEquals'
	 * 
	 * @param workingDayInitials
	 */
	public static void findWhereWorkingDayInitialsEquals(String workingDayInitials)
	{
		try {
			ScheduleDao _dao = getScheduleDao();
			Schedule _result[] = _dao.findWhereWorkingDayInitialsEquals(workingDayInitials);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getScheduleDao'
	 * 
	 * @return ScheduleDao
	 */
	public static ScheduleDao getScheduleDao()
	{
		return ScheduleDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Schedule dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getHourStart() );
		buf.append( ", " );
		buf.append( dto.getHourEnd() );
		buf.append( ", " );
		buf.append( dto.getNameModality() );
		buf.append( ", " );
		buf.append( dto.getScheduleFinish() );
		buf.append( ", " );
		buf.append( dto.getVersion() );
		buf.append( ", " );
		buf.append( dto.getVersionActualityTrimester() );
		buf.append( ", " );
		buf.append( dto.getNumberEnvironment() );
		buf.append( ", " );
		buf.append( dto.getHeadquartersName() );
		buf.append( ", " );
		buf.append( dto.getNameDay() );
		buf.append( ", " );
		buf.append( dto.getDocumentType() );
		buf.append( ", " );
		buf.append( dto.getIdentificationCardNumber() );
		buf.append( ", " );
		buf.append( dto.getGroupsNumber() );
		buf.append( ", " );
		buf.append( dto.getTrimesterName() );
		buf.append( ", " );
		buf.append( dto.getWorkingDayInitials() );
		System.out.println( buf.toString() );
	}

}