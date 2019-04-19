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

public interface LearningResultDao
{
	/** 
	 * Inserts a new row in the learning_result table.
	 */
	public LearningResultPk insert(LearningResult dto) throws LearningResultDaoException;

	/** 
	 * Updates a single row in the learning_result table.
	 */
	public void update(LearningResultPk pk, LearningResult dto) throws LearningResultDaoException;

	/** 
	 * Deletes a single row in the learning_result table.
	 */
	public void delete(LearningResultPk pk) throws LearningResultDaoException;

	/** 
	 * Returns the rows from the learning_result table that matches the specified primary-key value.
	 */
	public LearningResult findByPrimaryKey(LearningResultPk pk) throws LearningResultDaoException;

	/** 
	 * Returns all rows from the learning_result table that match the criteria 'learning_result_code = :learningResultCode AND Program_code = :programCode AND competence_code = :competenceCode AND version = :version'.
	 */
	public LearningResult findByPrimaryKey(String learningResultCode, String programCode, String competenceCode, String version) throws LearningResultDaoException;

	/** 
	 * Returns all rows from the learning_result table that match the criteria ''.
	 */
	public LearningResult[] findAll() throws LearningResultDaoException;

	/** 
	 * Returns all rows from the learning_result table that match the criteria 'Program_code = :programCode AND competence_code = :competenceCode AND version = :version'.
	 */
	public LearningResult[] findByCompetence(String programCode, String competenceCode, String version) throws LearningResultDaoException;

	/** 
	 * Returns all rows from the learning_result table that match the criteria 'learning_result_code = :learningResultCode'.
	 */
	public LearningResult[] findWhereLearningResultCodeEquals(String learningResultCode) throws LearningResultDaoException;

	/** 
	 * Returns all rows from the learning_result table that match the criteria 'description = :description'.
	 */
	public LearningResult[] findWhereDescriptionEquals(String description) throws LearningResultDaoException;

	/** 
	 * Returns all rows from the learning_result table that match the criteria 'Program_code = :programCode'.
	 */
	public LearningResult[] findWhereProgramCodeEquals(String programCode) throws LearningResultDaoException;

	/** 
	 * Returns all rows from the learning_result table that match the criteria 'competence_code = :competenceCode'.
	 */
	public LearningResult[] findWhereCompetenceCodeEquals(String competenceCode) throws LearningResultDaoException;

	/** 
	 * Returns all rows from the learning_result table that match the criteria 'version = :version'.
	 */
	public LearningResult[] findWhereVersionEquals(String version) throws LearningResultDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the learning_result table that match the specified arbitrary SQL statement
	 */
	public LearningResult[] findByDynamicSelect(String sql, Object[] sqlParams) throws LearningResultDaoException;

	/** 
	 * Returns all rows from the learning_result table that match the specified arbitrary SQL statement
	 */
	public LearningResult[] findByDynamicWhere(String sql, Object[] sqlParams) throws LearningResultDaoException;

}
