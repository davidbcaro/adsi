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

public interface CustomerHasRoleDao
{
	/** 
	 * Inserts a new row in the customer_has_role table.
	 */
	public CustomerHasRolePk insert(CustomerHasRole dto) throws CustomerHasRoleDaoException;

	/** 
	 * Updates a single row in the customer_has_role table.
	 */
	public void update(CustomerHasRolePk pk, CustomerHasRole dto) throws CustomerHasRoleDaoException;

	/** 
	 * Deletes a single row in the customer_has_role table.
	 */
	public void delete(CustomerHasRolePk pk) throws CustomerHasRoleDaoException;

	/** 
	 * Returns the rows from the customer_has_role table that matches the specified primary-key value.
	 */
	public CustomerHasRole findByPrimaryKey(CustomerHasRolePk pk) throws CustomerHasRoleDaoException;

	/** 
	 * Returns all rows from the customer_has_role table that match the criteria 'person_document_type = :personDocumentType AND identification_card_number = :identificationCardNumber AND id_role = :idRole'.
	 */
	public CustomerHasRole findByPrimaryKey(String personDocumentType, String identificationCardNumber, String idRole) throws CustomerHasRoleDaoException;

	/** 
	 * Returns all rows from the customer_has_role table that match the criteria ''.
	 */
	public CustomerHasRole[] findAll() throws CustomerHasRoleDaoException;

	/** 
	 * Returns all rows from the customer_has_role table that match the criteria 'person_document_type = :personDocumentType AND identification_card_number = :identificationCardNumber'.
	 */
	public CustomerHasRole[] findByCustomer(String personDocumentType, String identificationCardNumber) throws CustomerHasRoleDaoException;

	/** 
	 * Returns all rows from the customer_has_role table that match the criteria 'id_role = :idRole'.
	 */
	public CustomerHasRole[] findByRole(String idRole) throws CustomerHasRoleDaoException;

	/** 
	 * Returns all rows from the customer_has_role table that match the criteria 'person_document_type = :personDocumentType'.
	 */
	public CustomerHasRole[] findWherePersonDocumentTypeEquals(String personDocumentType) throws CustomerHasRoleDaoException;

	/** 
	 * Returns all rows from the customer_has_role table that match the criteria 'identification_card_number = :identificationCardNumber'.
	 */
	public CustomerHasRole[] findWhereIdentificationCardNumberEquals(String identificationCardNumber) throws CustomerHasRoleDaoException;

	/** 
	 * Returns all rows from the customer_has_role table that match the criteria 'id_role = :idRole'.
	 */
	public CustomerHasRole[] findWhereIdRoleEquals(String idRole) throws CustomerHasRoleDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the customer_has_role table that match the specified arbitrary SQL statement
	 */
	public CustomerHasRole[] findByDynamicSelect(String sql, Object[] sqlParams) throws CustomerHasRoleDaoException;

	/** 
	 * Returns all rows from the customer_has_role table that match the specified arbitrary SQL statement
	 */
	public CustomerHasRole[] findByDynamicWhere(String sql, Object[] sqlParams) throws CustomerHasRoleDaoException;

}