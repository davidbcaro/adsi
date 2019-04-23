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

public interface LearningOutcomeHasActivityDao
{
	/** 
	 * Inserts a new row in the learning_outcome_has_activity table.
	 */
	public LearningOutcomeHasActivityPk insert(LearningOutcomeHasActivity dto) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Updates a single row in the learning_outcome_has_activity table.
	 */
	public void update(LearningOutcomeHasActivityPk pk, LearningOutcomeHasActivity dto) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Deletes a single row in the learning_outcome_has_activity table.
	 */
	public void delete(LearningOutcomeHasActivityPk pk) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Returns the rows from the learning_outcome_has_activity table that matches the specified primary-key value.
	 */
	public LearningOutcomeHasActivity findByPrimaryKey(LearningOutcomeHasActivityPk pk) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Returns all rows from the learning_outcome_has_activity table that match the criteria 'l_Outcome_Code = :lOutcomeCode AND competition_Code = :competitionCode AND program_Code = :programCode AND version = :version AND id_Activity = :idActivity AND name_Phase = :namePhase AND project_Code = :projectCode'.
	 */
	public LearningOutcomeHasActivity findByPrimaryKey(String lOutcomeCode, String competitionCode, String programCode, String version, int idActivity, String namePhase, String projectCode) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Returns all rows from the learning_outcome_has_activity table that match the criteria ''.
	 */
	public LearningOutcomeHasActivity[] findAll() throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Returns all rows from the learning_outcome_has_activity table that match the criteria 'id_Activity = :idActivity AND name_Phase = :namePhase AND project_Code = :projectCode'.
	 */
	public LearningOutcomeHasActivity[] findByActivity(int idActivity, String namePhase, String projectCode) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Returns all rows from the learning_outcome_has_activity table that match the criteria 'l_Outcome_Code = :lOutcomeCode AND competition_Code = :competitionCode AND program_Code = :programCode AND version = :version'.
	 */
	public LearningOutcomeHasActivity[] findByLearningOutcome(String lOutcomeCode, String competitionCode, String programCode, String version) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Returns all rows from the learning_outcome_has_activity table that match the criteria 'l_Outcome_Code = :lOutcomeCode'.
	 */
	public LearningOutcomeHasActivity[] findWhereLOutcomeCodeEquals(String lOutcomeCode) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Returns all rows from the learning_outcome_has_activity table that match the criteria 'program_Code = :programCode'.
	 */
	public LearningOutcomeHasActivity[] findWhereProgramCodeEquals(String programCode) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Returns all rows from the learning_outcome_has_activity table that match the criteria 'competition_Code = :competitionCode'.
	 */
	public LearningOutcomeHasActivity[] findWhereCompetitionCodeEquals(String competitionCode) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Returns all rows from the learning_outcome_has_activity table that match the criteria 'id_Activity = :idActivity'.
	 */
	public LearningOutcomeHasActivity[] findWhereIdActivityEquals(int idActivity) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Returns all rows from the learning_outcome_has_activity table that match the criteria 'name_Phase = :namePhase'.
	 */
	public LearningOutcomeHasActivity[] findWhereNamePhaseEquals(String namePhase) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Returns all rows from the learning_outcome_has_activity table that match the criteria 'project_Code = :projectCode'.
	 */
	public LearningOutcomeHasActivity[] findWhereProjectCodeEquals(String projectCode) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Returns all rows from the learning_outcome_has_activity table that match the criteria 'version = :version'.
	 */
	public LearningOutcomeHasActivity[] findWhereVersionEquals(String version) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the learning_outcome_has_activity table that match the specified arbitrary SQL statement
	 */
	public LearningOutcomeHasActivity[] findByDynamicSelect(String sql, Object[] sqlParams) throws LearningOutcomeHasActivityDaoException;

	/** 
	 * Returns all rows from the learning_outcome_has_activity table that match the specified arbitrary SQL statement
	 */
	public LearningOutcomeHasActivity[] findByDynamicWhere(String sql, Object[] sqlParams) throws LearningOutcomeHasActivityDaoException;

}