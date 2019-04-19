/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.controler.dao.dao;

import java.util.Date;
import co.edu.sena.controler.dao.dto.*;
import co.edu.sena.controler.dao.exceptions.*;

public interface ScheduleDao
{
	/** 
	 * Inserts a new row in the schedule table.
	 */
	public SchedulePk insert(Schedule dto) throws ScheduleDaoException;

	/** 
	 * Updates a single row in the schedule table.
	 */
	public void update(SchedulePk pk, Schedule dto) throws ScheduleDaoException;

	/** 
	 * Deletes a single row in the schedule table.
	 */
	public void delete(SchedulePk pk) throws ScheduleDaoException;

	/** 
	 * Returns the rows from the schedule table that matches the specified primary-key value.
	 */
	public Schedule findByPrimaryKey(SchedulePk pk) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'version = :version AND version_actuality_trimester = :versionActualityTrimester AND number_environment = :numberEnvironment AND headquarters_name = :headquartersName AND name_day = :nameDay AND document_type = :documentType AND identification_card_number = :identificationCardNumber AND groups_number = :groupsNumber AND trimester_name = :trimesterName AND working_day_initials = :workingDayInitials'.
	 */
	public Schedule findByPrimaryKey(int version, String versionActualityTrimester, String numberEnvironment, String headquartersName, String nameDay, String documentType, String identificationCardNumber, String groupsNumber, String trimesterName, String workingDayInitials) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria ''.
	 */
	public Schedule[] findAll() throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'name_day = :nameDay'.
	 */
	public Schedule[] findByDay(String nameDay) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'number_environment = :numberEnvironment AND headquarters_name = :headquartersName'.
	 */
	public Schedule[] findByEnvironment(String numberEnvironment, String headquartersName) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'groups_number = :groupsNumber AND trimester_name = :trimesterName AND working_day_initials = :workingDayInitials'.
	 */
	public Schedule[] findByGroupNumberHasTrimester(String groupsNumber, String trimesterName, String workingDayInitials) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'document_type = :documentType AND identification_card_number = :identificationCardNumber'.
	 */
	public Schedule[] findByInstructor(String documentType, String identificationCardNumber) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'name_modality = :nameModality'.
	 */
	public Schedule[] findByModality(String nameModality) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'version = :version AND version_actuality_trimester = :versionActualityTrimester'.
	 */
	public Schedule[] findByVersionSchedule(int version, String versionActualityTrimester) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'hour_start = :hourStart'.
	 */
	public Schedule[] findWhereHourStartEquals(String hourStart) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'hour_end = :hourEnd'.
	 */
	public Schedule[] findWhereHourEndEquals(String hourEnd) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'name_modality = :nameModality'.
	 */
	public Schedule[] findWhereNameModalityEquals(String nameModality) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'schedule_finish = :scheduleFinish'.
	 */
	public Schedule[] findWhereScheduleFinishEquals(Date scheduleFinish) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'version = :version'.
	 */
	public Schedule[] findWhereVersionEquals(int version) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'version_actuality_trimester = :versionActualityTrimester'.
	 */
	public Schedule[] findWhereVersionActualityTrimesterEquals(String versionActualityTrimester) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'number_environment = :numberEnvironment'.
	 */
	public Schedule[] findWhereNumberEnvironmentEquals(String numberEnvironment) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'headquarters_name = :headquartersName'.
	 */
	public Schedule[] findWhereHeadquartersNameEquals(String headquartersName) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'name_day = :nameDay'.
	 */
	public Schedule[] findWhereNameDayEquals(String nameDay) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'document_type = :documentType'.
	 */
	public Schedule[] findWhereDocumentTypeEquals(String documentType) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'identification_card_number = :identificationCardNumber'.
	 */
	public Schedule[] findWhereIdentificationCardNumberEquals(String identificationCardNumber) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'groups_number = :groupsNumber'.
	 */
	public Schedule[] findWhereGroupsNumberEquals(String groupsNumber) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'trimester_name = :trimesterName'.
	 */
	public Schedule[] findWhereTrimesterNameEquals(String trimesterName) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the criteria 'working_day_initials = :workingDayInitials'.
	 */
	public Schedule[] findWhereWorkingDayInitialsEquals(String workingDayInitials) throws ScheduleDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the schedule table that match the specified arbitrary SQL statement
	 */
	public Schedule[] findByDynamicSelect(String sql, Object[] sqlParams) throws ScheduleDaoException;

	/** 
	 * Returns all rows from the schedule table that match the specified arbitrary SQL statement
	 */
	public Schedule[] findByDynamicWhere(String sql, Object[] sqlParams) throws ScheduleDaoException;

}
