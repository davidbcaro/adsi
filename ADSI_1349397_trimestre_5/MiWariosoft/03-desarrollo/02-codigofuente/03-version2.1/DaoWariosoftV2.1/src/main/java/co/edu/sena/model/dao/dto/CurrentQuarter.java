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
import java.util.Date;

public class CurrentQuarter implements Serializable
{
	/** 
	 * This attribute maps to the column id_Current_Quarter in the current_quarter table.
	 */
	protected String idCurrentQuarter;

	/** 
	 * This attribute maps to the column start_Date in the current_quarter table.
	 */
	protected Date startDate;

	/** 
	 * This attribute maps to the column end_Date in the current_quarter table.
	 */
	protected Date endDate;

	/**
	 * Method 'CurrentQuarter'
	 * 
	 */
	public CurrentQuarter()
	{
	}

	/**
	 * Method 'getIdCurrentQuarter'
	 * 
	 * @return String
	 */
	public String getIdCurrentQuarter()
	{
		return idCurrentQuarter;
	}

	/**
	 * Method 'setIdCurrentQuarter'
	 * 
	 * @param idCurrentQuarter
	 */
	public void setIdCurrentQuarter(String idCurrentQuarter)
	{
		this.idCurrentQuarter = idCurrentQuarter;
	}

	/**
	 * Method 'getStartDate'
	 * 
	 * @return Date
	 */
	public Date getStartDate()
	{
		return startDate;
	}

	/**
	 * Method 'setStartDate'
	 * 
	 * @param startDate
	 */
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}

	/**
	 * Method 'getEndDate'
	 * 
	 * @return Date
	 */
	public Date getEndDate()
	{
		return endDate;
	}

	/**
	 * Method 'setEndDate'
	 * 
	 * @param endDate
	 */
	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
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
		
		if (!(_other instanceof CurrentQuarter)) {
			return false;
		}
		
		final CurrentQuarter _cast = (CurrentQuarter) _other;
		if (idCurrentQuarter == null ? _cast.idCurrentQuarter != idCurrentQuarter : !idCurrentQuarter.equals( _cast.idCurrentQuarter )) {
			return false;
		}
		
		if (startDate == null ? _cast.startDate != startDate : !startDate.equals( _cast.startDate )) {
			return false;
		}
		
		if (endDate == null ? _cast.endDate != endDate : !endDate.equals( _cast.endDate )) {
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
		if (idCurrentQuarter != null) {
			_hashCode = 29 * _hashCode + idCurrentQuarter.hashCode();
		}
		
		if (startDate != null) {
			_hashCode = 29 * _hashCode + startDate.hashCode();
		}
		
		if (endDate != null) {
			_hashCode = 29 * _hashCode + endDate.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CurrentQuarterPk
	 */
	public CurrentQuarterPk createPk()
	{
		return new CurrentQuarterPk(idCurrentQuarter);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.CurrentQuarter: " );
		ret.append( "idCurrentQuarter=" + idCurrentQuarter );
		ret.append( ", startDate=" + startDate );
		ret.append( ", endDate=" + endDate );
		return ret.toString();
	}

}