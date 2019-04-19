/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.controler.dao.dao;

import co.edu.sena.controler.dao.dto.*;
import co.edu.sena.controler.dao.exceptions.*;

public interface TrimesterDao
{
	/** 
	 * Inserts a new row in the trimester table.
	 */
	public TrimesterPk insert(Trimester dto) throws TrimesterDaoException;

	/** 
	 * Updates a single row in the trimester table.
	 */
	public void update(TrimesterPk pk, Trimester dto) throws TrimesterDaoException;

	/** 
	 * Deletes a single row in the trimester table.
	 */
	public void delete(TrimesterPk pk) throws TrimesterDaoException;

	/** 
	 * Returns the rows from the trimester table that matches the specified primary-key value.
	 */
	public Trimester findByPrimaryKey(TrimesterPk pk) throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the criteria 'trimester_name = :trimesterName AND working_day_initials = :workingDayInitials AND level_formation = :levelFormation'.
	 */
	public Trimester findByPrimaryKey(String trimesterName, String workingDayInitials, String levelFormation) throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the criteria ''.
	 */
	public Trimester[] findAll() throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the criteria 'level_formation = :levelFormation'.
	 */
	public Trimester[] findByLevelFormation(String levelFormation) throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the criteria 'working_day_initials = :workingDayInitials'.
	 */
	public Trimester[] findByWorkingDay(String workingDayInitials) throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the criteria 'trimester_name = :trimesterName'.
	 */
	public Trimester[] findWhereTrimesterNameEquals(String trimesterName) throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the criteria 'working_day_initials = :workingDayInitials'.
	 */
	public Trimester[] findWhereWorkingDayInitialsEquals(String workingDayInitials) throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the criteria 'level_formation = :levelFormation'.
	 */
	public Trimester[] findWhereLevelFormationEquals(String levelFormation) throws TrimesterDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the trimester table that match the specified arbitrary SQL statement
	 */
	public Trimester[] findByDynamicSelect(String sql, Object[] sqlParams) throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the specified arbitrary SQL statement
	 */
	public Trimester[] findByDynamicWhere(String sql, Object[] sqlParams) throws TrimesterDaoException;

}
