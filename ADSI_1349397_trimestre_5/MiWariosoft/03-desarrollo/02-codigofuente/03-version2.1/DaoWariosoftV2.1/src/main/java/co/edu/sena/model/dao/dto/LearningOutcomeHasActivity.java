/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.dto;

import co.edu.sena.model.dao.dao.*;
import co.edu.sena.model.dao.factory.*;
import co.edu.sena.model.dao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class LearningOutcomeHasActivity implements Serializable
{
	/** 
	 * This attribute maps to the column l_Outcome_Code in the learning_outcome_has_activity table.
	 */
	protected String lOutcomeCode;

	/** 
	 * This attribute maps to the column program_Code in the learning_outcome_has_activity table.
	 */
	protected String programCode;

	/** 
	 * This attribute maps to the column competition_Code in the learning_outcome_has_activity table.
	 */
	protected String competitionCode;

	/** 
	 * This attribute maps to the column id_Activity in the learning_outcome_has_activity table.
	 */
	protected int idActivity;

	/** 
	 * This attribute maps to the column name_Phase in the learning_outcome_has_activity table.
	 */
	protected String namePhase;

	/** 
	 * This attribute maps to the column project_Code in the learning_outcome_has_activity table.
	 */
	protected String projectCode;

	/** 
	 * This attribute maps to the column version in the learning_outcome_has_activity table.
	 */
	protected String version;

	/**
	 * Method 'LearningOutcomeHasActivity'
	 * 
	 */
	public LearningOutcomeHasActivity()
	{
	}

	/**
	 * Method 'getLOutcomeCode'
	 * 
	 * @return String
	 */
	public String getLOutcomeCode()
	{
		return lOutcomeCode;
	}

	/**
	 * Method 'setLOutcomeCode'
	 * 
	 * @param lOutcomeCode
	 */
	public void setLOutcomeCode(String lOutcomeCode)
	{
		this.lOutcomeCode = lOutcomeCode;
	}

	/**
	 * Method 'getProgramCode'
	 * 
	 * @return String
	 */
	public String getProgramCode()
	{
		return programCode;
	}

	/**
	 * Method 'setProgramCode'
	 * 
	 * @param programCode
	 */
	public void setProgramCode(String programCode)
	{
		this.programCode = programCode;
	}

	/**
	 * Method 'getCompetitionCode'
	 * 
	 * @return String
	 */
	public String getCompetitionCode()
	{
		return competitionCode;
	}

	/**
	 * Method 'setCompetitionCode'
	 * 
	 * @param competitionCode
	 */
	public void setCompetitionCode(String competitionCode)
	{
		this.competitionCode = competitionCode;
	}

	/**
	 * Method 'getIdActivity'
	 * 
	 * @return int
	 */
	public int getIdActivity()
	{
		return idActivity;
	}

	/**
	 * Method 'setIdActivity'
	 * 
	 * @param idActivity
	 */
	public void setIdActivity(int idActivity)
	{
		this.idActivity = idActivity;
	}

	/**
	 * Method 'getNamePhase'
	 * 
	 * @return String
	 */
	public String getNamePhase()
	{
		return namePhase;
	}

	/**
	 * Method 'setNamePhase'
	 * 
	 * @param namePhase
	 */
	public void setNamePhase(String namePhase)
	{
		this.namePhase = namePhase;
	}

	/**
	 * Method 'getProjectCode'
	 * 
	 * @return String
	 */
	public String getProjectCode()
	{
		return projectCode;
	}

	/**
	 * Method 'setProjectCode'
	 * 
	 * @param projectCode
	 */
	public void setProjectCode(String projectCode)
	{
		this.projectCode = projectCode;
	}

	/**
	 * Method 'getVersion'
	 * 
	 * @return String
	 */
	public String getVersion()
	{
		return version;
	}

	/**
	 * Method 'setVersion'
	 * 
	 * @param version
	 */
	public void setVersion(String version)
	{
		this.version = version;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof LearningOutcomeHasActivity)) {
			return false;
		}
		
		final LearningOutcomeHasActivity _cast = (LearningOutcomeHasActivity) _other;
		if (lOutcomeCode == null ? _cast.lOutcomeCode != lOutcomeCode : !lOutcomeCode.equals( _cast.lOutcomeCode )) {
			return false;
		}
		
		if (programCode == null ? _cast.programCode != programCode : !programCode.equals( _cast.programCode )) {
			return false;
		}
		
		if (competitionCode == null ? _cast.competitionCode != competitionCode : !competitionCode.equals( _cast.competitionCode )) {
			return false;
		}
		
		if (idActivity != _cast.idActivity) {
			return false;
		}
		
		if (namePhase == null ? _cast.namePhase != namePhase : !namePhase.equals( _cast.namePhase )) {
			return false;
		}
		
		if (projectCode == null ? _cast.projectCode != projectCode : !projectCode.equals( _cast.projectCode )) {
			return false;
		}
		
		if (version == null ? _cast.version != version : !version.equals( _cast.version )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (lOutcomeCode != null) {
			_hashCode = 29 * _hashCode + lOutcomeCode.hashCode();
		}
		
		if (programCode != null) {
			_hashCode = 29 * _hashCode + programCode.hashCode();
		}
		
		if (competitionCode != null) {
			_hashCode = 29 * _hashCode + competitionCode.hashCode();
		}
		
		_hashCode = 29 * _hashCode + idActivity;
		if (namePhase != null) {
			_hashCode = 29 * _hashCode + namePhase.hashCode();
		}
		
		if (projectCode != null) {
			_hashCode = 29 * _hashCode + projectCode.hashCode();
		}
		
		if (version != null) {
			_hashCode = 29 * _hashCode + version.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return LearningOutcomeHasActivityPk
	 */
	public LearningOutcomeHasActivityPk createPk()
	{
		return new LearningOutcomeHasActivityPk(lOutcomeCode, competitionCode, programCode, version, idActivity, namePhase, projectCode);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.LearningOutcomeHasActivity: " );
		ret.append( "lOutcomeCode=" + lOutcomeCode );
		ret.append( ", programCode=" + programCode );
		ret.append( ", competitionCode=" + competitionCode );
		ret.append( ", idActivity=" + idActivity );
		ret.append( ", namePhase=" + namePhase );
		ret.append( ", projectCode=" + projectCode );
		ret.append( ", version=" + version );
		return ret.toString();
	}

}