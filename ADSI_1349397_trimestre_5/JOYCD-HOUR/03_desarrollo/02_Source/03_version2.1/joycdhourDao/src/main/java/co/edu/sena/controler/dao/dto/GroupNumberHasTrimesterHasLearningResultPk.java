/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.controler.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the group_number_has_trimester_has_learning_result table.
 */
public class GroupNumberHasTrimesterHasLearningResultPk implements Serializable
{
	protected String groupNumber;

	protected String trimesterName;

	protected String workingDayInitials;

	protected String levelFormation;

	protected String learningResultCode;

	protected String programCode;

	protected String competenceCode;

	protected String version;

	/** 
	 * Sets the value of groupNumber
	 */
	public void setGroupNumber(String groupNumber)
	{
		this.groupNumber = groupNumber;
	}

	/** 
	 * Gets the value of groupNumber
	 */
	public String getGroupNumber()
	{
		return groupNumber;
	}

	/** 
	 * Sets the value of trimesterName
	 */
	public void setTrimesterName(String trimesterName)
	{
		this.trimesterName = trimesterName;
	}

	/** 
	 * Gets the value of trimesterName
	 */
	public String getTrimesterName()
	{
		return trimesterName;
	}

	/** 
	 * Sets the value of workingDayInitials
	 */
	public void setWorkingDayInitials(String workingDayInitials)
	{
		this.workingDayInitials = workingDayInitials;
	}

	/** 
	 * Gets the value of workingDayInitials
	 */
	public String getWorkingDayInitials()
	{
		return workingDayInitials;
	}

	/** 
	 * Sets the value of levelFormation
	 */
	public void setLevelFormation(String levelFormation)
	{
		this.levelFormation = levelFormation;
	}

	/** 
	 * Gets the value of levelFormation
	 */
	public String getLevelFormation()
	{
		return levelFormation;
	}

	/** 
	 * Sets the value of learningResultCode
	 */
	public void setLearningResultCode(String learningResultCode)
	{
		this.learningResultCode = learningResultCode;
	}

	/** 
	 * Gets the value of learningResultCode
	 */
	public String getLearningResultCode()
	{
		return learningResultCode;
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
	 * Sets the value of competenceCode
	 */
	public void setCompetenceCode(String competenceCode)
	{
		this.competenceCode = competenceCode;
	}

	/** 
	 * Gets the value of competenceCode
	 */
	public String getCompetenceCode()
	{
		return competenceCode;
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
	 * Method 'GroupNumberHasTrimesterHasLearningResultPk'
	 * 
	 */
	public GroupNumberHasTrimesterHasLearningResultPk()
	{
	}

	/**
	 * Method 'GroupNumberHasTrimesterHasLearningResultPk'
	 * 
	 * @param groupNumber
	 * @param trimesterName
	 * @param workingDayInitials
	 * @param levelFormation
	 * @param learningResultCode
	 * @param programCode
	 * @param competenceCode
	 * @param version
	 */
	public GroupNumberHasTrimesterHasLearningResultPk(final String groupNumber, final String trimesterName, final String workingDayInitials, final String levelFormation, final String learningResultCode, final String programCode, final String competenceCode, final String version)
	{
		this.groupNumber = groupNumber;
		this.trimesterName = trimesterName;
		this.workingDayInitials = workingDayInitials;
		this.levelFormation = levelFormation;
		this.learningResultCode = learningResultCode;
		this.programCode = programCode;
		this.competenceCode = competenceCode;
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
		
		if (!(_other instanceof GroupNumberHasTrimesterHasLearningResultPk)) {
			return false;
		}
		
		final GroupNumberHasTrimesterHasLearningResultPk _cast = (GroupNumberHasTrimesterHasLearningResultPk) _other;
		if (groupNumber == null ? _cast.groupNumber != groupNumber : !groupNumber.equals( _cast.groupNumber )) {
			return false;
		}
		
		if (trimesterName == null ? _cast.trimesterName != trimesterName : !trimesterName.equals( _cast.trimesterName )) {
			return false;
		}
		
		if (workingDayInitials == null ? _cast.workingDayInitials != workingDayInitials : !workingDayInitials.equals( _cast.workingDayInitials )) {
			return false;
		}
		
		if (levelFormation == null ? _cast.levelFormation != levelFormation : !levelFormation.equals( _cast.levelFormation )) {
			return false;
		}
		
		if (learningResultCode == null ? _cast.learningResultCode != learningResultCode : !learningResultCode.equals( _cast.learningResultCode )) {
			return false;
		}
		
		if (programCode == null ? _cast.programCode != programCode : !programCode.equals( _cast.programCode )) {
			return false;
		}
		
		if (competenceCode == null ? _cast.competenceCode != competenceCode : !competenceCode.equals( _cast.competenceCode )) {
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
		if (groupNumber != null) {
			_hashCode = 29 * _hashCode + groupNumber.hashCode();
		}
		
		if (trimesterName != null) {
			_hashCode = 29 * _hashCode + trimesterName.hashCode();
		}
		
		if (workingDayInitials != null) {
			_hashCode = 29 * _hashCode + workingDayInitials.hashCode();
		}
		
		if (levelFormation != null) {
			_hashCode = 29 * _hashCode + levelFormation.hashCode();
		}
		
		if (learningResultCode != null) {
			_hashCode = 29 * _hashCode + learningResultCode.hashCode();
		}
		
		if (programCode != null) {
			_hashCode = 29 * _hashCode + programCode.hashCode();
		}
		
		if (competenceCode != null) {
			_hashCode = 29 * _hashCode + competenceCode.hashCode();
		}
		
		if (version != null) {
			_hashCode = 29 * _hashCode + version.hashCode();
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
		ret.append( "co.edu.sena.controler.dao.dto.GroupNumberHasTrimesterHasLearningResultPk: " );
		ret.append( "groupNumber=" + groupNumber );
		ret.append( ", trimesterName=" + trimesterName );
		ret.append( ", workingDayInitials=" + workingDayInitials );
		ret.append( ", levelFormation=" + levelFormation );
		ret.append( ", learningResultCode=" + learningResultCode );
		ret.append( ", programCode=" + programCode );
		ret.append( ", competenceCode=" + competenceCode );
		ret.append( ", version=" + version );
		return ret.toString();
	}

}
