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

public interface HeadquartersDao
{
	/** 
	 * Inserts a new row in the headquarters table.
	 */
	public HeadquartersPk insert(Headquarters dto) throws HeadquartersDaoException;

	/** 
	 * Updates a single row in the headquarters table.
	 */
	public void update(HeadquartersPk pk, Headquarters dto) throws HeadquartersDaoException;

	/** 
	 * Deletes a single row in the headquarters table.
	 */
	public void delete(HeadquartersPk pk) throws HeadquartersDaoException;

	/** 
	 * Returns the rows from the headquarters table that matches the specified primary-key value.
	 */
	public Headquarters findByPrimaryKey(HeadquartersPk pk) throws HeadquartersDaoException;

	/** 
	 * Returns all rows from the headquarters table that match the criteria 'name_Headquarters = :nameHeadquarters'.
	 */
	public Headquarters findByPrimaryKey(String nameHeadquarters) throws HeadquartersDaoException;

	/** 
	 * Returns all rows from the headquarters table that match the criteria ''.
	 */
	public Headquarters[] findAll() throws HeadquartersDaoException;

	/** 
	 * Returns all rows from the headquarters table that match the criteria 'name_Headquarters = :nameHeadquarters'.
	 */
	public Headquarters[] findWhereNameHeadquartersEquals(String nameHeadquarters) throws HeadquartersDaoException;

	/** 
	 * Returns all rows from the headquarters table that match the criteria 'address = :address'.
	 */
	public Headquarters[] findWhereAddressEquals(String address) throws HeadquartersDaoException;

	/** 
	 * Returns all rows from the headquarters table that match the criteria 'state = :state'.
	 */
	public Headquarters[] findWhereStateEquals(short state) throws HeadquartersDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the headquarters table that match the specified arbitrary SQL statement
	 */
	public Headquarters[] findByDynamicSelect(String sql, Object[] sqlParams) throws HeadquartersDaoException;

	/** 
	 * Returns all rows from the headquarters table that match the specified arbitrary SQL statement
	 */
	public Headquarters[] findByDynamicWhere(String sql, Object[] sqlParams) throws HeadquartersDaoException;

}
