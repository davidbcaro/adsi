/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the learning_outcome_has_number_group_has_trimester table.
 */
public class LearningOutcomeHasNumberGroupHasTrimesterPk implements Serializable
{
	protected String lOutcomeCode;

	protected String competitionCode;

	protected String programCode;

	protected String version;

	protected String numberGroup;

	protected String nameTrimester;

	protected String initialsWorkingDay;

	protected String trainingLevel;

	/** 
	 * Sets the value of lOutcomeCode
	 */
	public void setLOutcomeCode(String lOutcomeCode)
	{
		this.lOutcomeCode = lOutcomeCode;
	}

	/** 
	 * Gets the value of lOutcomeCode
	 */
	public String getLOutcomeCode()
	{
		return lOutcomeCode;
	}

	/** 
	 * Sets the value of competitionCode
	 */
	public void setCompetitionCode(String competitionCode)
	{
		this.competitionCode = competitionCode;
	}

	/** 
	 * Gets the value of competitionCode
	 */
	public String getCompetitionCode()
	{
		return competitionCode;
	}

	/** 
	 * Sets the value of programCode
	 */
	public void setProgramCode(String programCode)
	{
		this.programCode = programCode;
	}

	/** 
	 * Gets the value of programCode
	 */
	public String getProgramCode()
	{
		return programCode;
	}

	/** 
	 * Sets the value of version
	 */
	public void setVersion(String version)
	{
		this.version = version;
	}

	/** 
	 * Gets the value of version
	 */
	public String getVersion()
	{
		return version;
	}

	/** 
	 * Sets the value of numberGroup
	 */
	public void setNumberGroup(String numberGroup)
	{
		this.numberGroup = numberGroup;
	}

	/** 
	 * Gets the value of numberGroup
	 */
	public String getNumberGroup()
	{
		return numberGroup;
	}

	/** 
	 * Sets the value of nameTrimester
	 */
	public void setNameTrimester(String nameTrimester)
	{
		this.nameTrimester = nameTrimester;
	}

	/** 
	 * Gets the value of nameTrimester
	 */
	public String getNameTrimester()
	{
		return nameTrimester;
	}

	/** 
	 * Sets the value of initialsWorkingDay
	 */
	public void setInitialsWorkingDay(String initialsWorkingDay)
	{
		this.initialsWorkingDay = initialsWorkingDay;
	}

	/** 
	 * Gets the value of initialsWorkingDay
	 */
	public String getInitialsWorkingDay()
	{
		return initialsWorkingDay;
	}

	/** 
	 * Sets the value of trainingLevel
	 */
	public void setTrainingLevel(String trainingLevel)
	{
		this.trainingLevel = trainingLevel;
	}

	/** 
	 * Gets the value of trainingLevel
	 */
	public String getTrainingLevel()
	{
		return trainingLevel;
	}

	/**
	 * Method 'LearningOutcomeHasNumberGroupHasTrimesterPk'
	 * 
	 */
	public LearningOutcomeHasNumberGroupHasTrimesterPk()
	{
	}

	/**
	 * Method 'LearningOutcomeHasNumberGroupHasTrimesterPk'
	 * 
	 * @param lOutcomeCode
	 * @param competitionCode
	 * @param programCode
	 * @param version
	 * @param numberGroup
	 * @param nameTrimester
	 * @param initialsWorkingDay
	 * @param trainingLevel
	 */
	public LearningOutcomeHasNumberGroupHasTrimesterPk(final String lOutcomeCode, final String competitionCode, final String programCode, final String version, final String numberGroup, final String nameTrimester, final String initialsWorkingDay, final String trainingLevel)
	{
		this.lOutcomeCode = lOutcomeCode;
		this.competitionCode = competitionCode;
		this.programCode = programCode;
		this.version = version;
		this.numberGroup = numberGroup;
		this.nameTrimester = nameTrimester;
		this.initialsWorkingDay = initialsWorkingDay;
		this.trainingLevel = trainingLevel;
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
		
		if (!(_other instanceof LearningOutcomeHasNumberGroupHasTrimesterPk)) {
			return false;
		}
		
		final LearningOutcomeHasNumberGroupHasTrimesterPk _cast = (LearningOutcomeHasNumberGroupHasTrimesterPk) _other;
		if (lOutcomeCode == null ? _cast.lOutcomeCode != lOutcomeCode : !lOutcomeCode.equals( _cast.lOutcomeCode )) {
			return false;
		}
		
		if (competitionCode == null ? _cast.competitionCode != competitionCode : !competitionCode.equals( _cast.competitionCode )) {
			return false;
		}
		
		if (programCode == null ? _cast.programCode != programCode : !programCode.equals( _cast.programCode )) {
			return false;
		}
		
		if (version == null ? _cast.version != version : !version.equals( _cast.version )) {
			return false;
		}
		
		if (numberGroup == null ? _cast.numberGroup != numberGroup : !numberGroup.equals( _cast.numberGroup )) {
			return false;
		}
		
		if (nameTrimester == null ? _cast.nameTrimester != nameTrimester : !nameTrimester.equals( _cast.nameTrimester )) {
			return false;
		}
		
		if (initialsWorkingDay == null ? _cast.initialsWorkingDay != initialsWorkingDay : !initialsWorkingDay.equals( _cast.initialsWorkingDay )) {
			return false;
		}
		
		if (trainingLevel == null ? _cast.trainingLevel != trainingLevel : !trainingLevel.equals( _cast.trainingLevel )) {
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
		
		if (competitionCode != null) {
			_hashCode = 29 * _hashCode + competitionCode.hashCode();
		}
		
		if (programCode != null) {
			_hashCode = 29 * _hashCode + programCode.hashCode();
		}
		
		if (version != null) {
			_hashCode = 29 * _hashCode + version.hashCode();
		}
		
		if (numberGroup != null) {
			_hashCode = 29 * _hashCode + numberGroup.hashCode();
		}
		
		if (nameTrimester != null) {
			_hashCode = 29 * _hashCode + nameTrimester.hashCode();
		}
		
		if (initialsWorkingDay != null) {
			_hashCode = 29 * _hashCode + initialsWorkingDay.hashCode();
		}
		
		if (trainingLevel != null) {
			_hashCode = 29 * _hashCode + trainingLevel.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.LearningOutcomeHasNumberGroupHasTrimesterPk: " );
		ret.append( "lOutcomeCode=" + lOutcomeCode );
		ret.append( ", competitionCode=" + competitionCode );
		ret.append( ", programCode=" + programCode );
		ret.append( ", version=" + version );
		ret.append( ", numberGroup=" + numberGroup );
		ret.append( ", nameTrimester=" + nameTrimester );
		ret.append( ", initialsWorkingDay=" + initialsWorkingDay );
		ret.append( ", trainingLevel=" + trainingLevel );
		return ret.toString();
	}

}
