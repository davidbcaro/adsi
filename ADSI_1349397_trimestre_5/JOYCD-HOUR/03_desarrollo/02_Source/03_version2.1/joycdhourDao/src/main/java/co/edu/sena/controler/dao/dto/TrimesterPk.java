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
 * This class represents the primary key of the trimester table.
 */
public class TrimesterPk implements Serializable
{
	protected String trimesterName;

	protected String workingDayInitials;

	protected String levelFormation;

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
	 * Method 'TrimesterPk'
	 * 
	 */
	public TrimesterPk()
	{
	}

	/**
	 * Method 'TrimesterPk'
	 * 
	 * @param trimesterName
	 * @param workingDayInitials
	 * @param levelFormation
	 */
	public TrimesterPk(final String trimesterName, final String workingDayInitials, final String levelFormation)
	{
		this.trimesterName = trimesterName;
		this.workingDayInitials = workingDayInitials;
		this.levelFormation = levelFormation;
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
		
		if (!(_other instanceof TrimesterPk)) {
			return false;
		}
		
		final TrimesterPk _cast = (TrimesterPk) _other;
		if (trimesterName == null ? _cast.trimesterName != trimesterName : !trimesterName.equals( _cast.trimesterName )) {
			return false;
		}
		
		if (workingDayInitials == null ? _cast.workingDayInitials != workingDayInitials : !workingDayInitials.equals( _cast.workingDayInitials )) {
			return false;
		}
		
		if (levelFormation == null ? _cast.levelFormation != levelFormation : !levelFormation.equals( _cast.levelFormation )) {
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
		if (trimesterName != null) {
			_hashCode = 29 * _hashCode + trimesterName.hashCode();
		}
		
		if (workingDayInitials != null) {
			_hashCode = 29 * _hashCode + workingDayInitials.hashCode();
		}
		
		if (levelFormation != null) {
			_hashCode = 29 * _hashCode + levelFormation.hashCode();
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
		ret.append( "co.edu.sena.controler.dao.dto.TrimesterPk: " );
		ret.append( "trimesterName=" + trimesterName );
		ret.append( ", workingDayInitials=" + workingDayInitials );
		ret.append( ", levelFormation=" + levelFormation );
		return ret.toString();
	}

}
