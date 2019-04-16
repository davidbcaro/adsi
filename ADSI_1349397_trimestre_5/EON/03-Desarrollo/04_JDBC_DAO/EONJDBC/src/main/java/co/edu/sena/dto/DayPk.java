/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the day table.
 */
public class DayPk implements Serializable
{
	protected String nameDay;

	/** 
	 * Sets the value of nameDay
	 */
	public void setNameDay(String nameDay)
	{
		this.nameDay = nameDay;
	}

	/** 
	 * Gets the value of nameDay
	 */
	public String getNameDay()
	{
		return nameDay;
	}

	/**
	 * Method 'DayPk'
	 * 
	 */
	public DayPk()
	{
	}

	/**
	 * Method 'DayPk'
	 * 
	 * @param nameDay
	 */
	public DayPk(final String nameDay)
	{
		this.nameDay = nameDay;
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
		
		if (!(_other instanceof DayPk)) {
			return false;
		}
		
		final DayPk _cast = (DayPk) _other;
		if (nameDay == null ? _cast.nameDay != nameDay : !nameDay.equals( _cast.nameDay )) {
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
		if (nameDay != null) {
			_hashCode = 29 * _hashCode + nameDay.hashCode();
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
		ret.append( "co.edu.sena.dto.DayPk: " );
		ret.append( "nameDay=" + nameDay );
		return ret.toString();
	}

}