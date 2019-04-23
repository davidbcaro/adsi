/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.dao;

import co.edu.sena.model.dao.dto.*;
import co.edu.sena.model.dao.exceptions.*;

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
	 * Returns all rows from the trimester table that match the criteria 'name_Trimester = :nameTrimester AND initials_Working_Day = :initialsWorkingDay AND training_Level = :trainingLevel'.
	 */
	public Trimester findByPrimaryKey(String nameTrimester, String initialsWorkingDay, String trainingLevel) throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the criteria ''.
	 */
	public Trimester[] findAll() throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the criteria 'training_Level = :trainingLevel'.
	 */
	public Trimester[] findByTrainingLevel(String trainingLevel) throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the criteria 'initials_Working_Day = :initialsWorkingDay'.
	 */
	public Trimester[] findByWorkingDay(String initialsWorkingDay) throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the criteria 'name_Trimester = :nameTrimester'.
	 */
	public Trimester[] findWhereNameTrimesterEquals(String nameTrimester) throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the criteria 'training_Level = :trainingLevel'.
	 */
	public Trimester[] findWhereTrainingLevelEquals(String trainingLevel) throws TrimesterDaoException;

	/** 
	 * Returns all rows from the trimester table that match the criteria 'initials_Working_Day = :initialsWorkingDay'.
	 */
	public Trimester[] findWhereInitialsWorkingDayEquals(String initialsWorkingDay) throws TrimesterDaoException;

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