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

public interface AvailabilityDao
{
	/** 
	 * Inserts a new row in the availability table.
	 */
	public AvailabilityPk insert(Availability dto) throws AvailabilityDaoException;

	/** 
	 * Updates a single row in the availability table.
	 */
	public void update(AvailabilityPk pk, Availability dto) throws AvailabilityDaoException;

	/** 
	 * Deletes a single row in the availability table.
	 */
	public void delete(AvailabilityPk pk) throws AvailabilityDaoException;

	/** 
	 * Returns the rows from the availability table that matches the specified primary-key value.
	 */
	public Availability findByPrimaryKey(AvailabilityPk pk) throws AvailabilityDaoException;

	/** 
	 * Returns all rows from the availability table that match the criteria 'hour_start = :hourStart AND document_type = :documentType AND identification_card = :identificationCard AND name_day = :nameDay AND working_day_initials = :workingDayInitials'.
	 */
	public Availability findByPrimaryKey(Date hourStart, String documentType, String identificationCard, String nameDay, String workingDayInitials) throws AvailabilityDaoException;

	/** 
	 * Returns all rows from the availability table that match the criteria ''.
	 */
	public Availability[] findAll() throws AvailabilityDaoException;

	/** 
	 * Returns all rows from the availability table that match the criteria 'name_day = :nameDay'.
	 */
	public Availability[] findByDay(String nameDay) throws AvailabilityDaoException;

	/** 
	 * Returns all rows from the availability table that match the criteria 'document_type = :documentType AND identification_card = :identificationCard'.
	 */
	public Availability[] findByInstructor(String documentType, String identificationCard) throws AvailabilityDaoException;

	/** 
	 * Returns all rows from the availability table that match the criteria 'working_day_initials = :workingDayInitials'.
	 */
	public Availability[] findByWorkingDay(String workingDayInitials) throws AvailabilityDaoException;

	/** 
	 * Returns all rows from the availability table that match the criteria 'hour_start = :hourStart'.
	 */
	public Availability[] findWhereHourStartEquals(Date hourStart) throws AvailabilityDaoException;

	/** 
	 * Returns all rows from the availability table that match the criteria 'hour_end = :hourEnd'.
	 */
	public Availability[] findWhereHourEndEquals(Date hourEnd) throws AvailabilityDaoException;

	/** 
	 * Returns all rows from the availability table that match the criteria 'document_type = :documentType'.
	 */
	public Availability[] findWhereDocumentTypeEquals(String documentType) throws AvailabilityDaoException;

	/** 
	 * Returns all rows from the availability table that match the criteria 'identification_card = :identificationCard'.
	 */
	public Availability[] findWhereIdentificationCardEquals(String identificationCard) throws AvailabilityDaoException;

	/** 
	 * Returns all rows from the availability table that match the criteria 'name_day = :nameDay'.
	 */
	public Availability[] findWhereNameDayEquals(String nameDay) throws AvailabilityDaoException;

	/** 
	 * Returns all rows from the availability table that match the criteria 'working_day_initials = :workingDayInitials'.
	 */
	public Availability[] findWhereWorkingDayInitialsEquals(String workingDayInitials) throws AvailabilityDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the availability table that match the specified arbitrary SQL statement
	 */
	public Availability[] findByDynamicSelect(String sql, Object[] sqlParams) throws AvailabilityDaoException;

	/** 
	 * Returns all rows from the availability table that match the specified arbitrary SQL statement
	 */
	public Availability[] findByDynamicWhere(String sql, Object[] sqlParams) throws AvailabilityDaoException;

}