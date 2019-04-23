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
 * This class represents the primary key of the program table.
 */
public class ProgramPk implements Serializable
{
	protected String programCode;

	protected String version;

	protected String trainingLevel;

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
	 * Method 'ProgramPk'
	 * 
	 */
	public ProgramPk()
	{
	}

	/**
	 * Method 'ProgramPk'
	 * 
	 * @param programCode
	 * @param version
	 * @param trainingLevel
	 */
	public ProgramPk(final String programCode, final String version, final String trainingLevel)
	{
		this.programCode = programCode;
		this.version = version;
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
		
		if (!(_other instanceof ProgramPk)) {
			return false;
		}
		
		final ProgramPk _cast = (ProgramPk) _other;
		if (programCode == null ? _cast.programCode != programCode : !programCode.equals( _cast.programCode )) {
			return false;
		}
		
		if (version == null ? _cast.version != version : !version.equals( _cast.version )) {
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
		if (programCode != null) {
			_hashCode = 29 * _hashCode + programCode.hashCode();
		}
		
		if (version != null) {
			_hashCode = 29 * _hashCode + version.hashCode();
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
		ret.append( "co.edu.sena.model.dao.dto.ProgramPk: " );
		ret.append( "programCode=" + programCode );
		ret.append( ", version=" + version );
		ret.append( ", trainingLevel=" + trainingLevel );
		return ret.toString();
	}

}
