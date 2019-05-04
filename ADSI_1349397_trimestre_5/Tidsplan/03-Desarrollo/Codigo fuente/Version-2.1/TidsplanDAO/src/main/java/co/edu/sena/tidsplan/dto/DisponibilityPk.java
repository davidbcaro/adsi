/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.tidsplan.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the disponibility table.
 */
public class DisponibilityPk implements Serializable
{
	protected Date startHour;

	protected String nameDay;

	protected String workingDayInitials;

	protected String documentNumber;

	protected String document;

	/** 
	 * Sets the value of startHour
	 */
	public void setStartHour(Date startHour)
	{
		this.startHour = startHour;
	}

	/** 
	 * Gets the value of startHour
	 */
	public Date getStartHour()
	{
		return startHour;
	}

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
	 * Sets the value of documentNumber
	 */
	public void setDocumentNumber(String documentNumber)
	{
		this.documentNumber = documentNumber;
	}

	/** 
	 * Gets the value of documentNumber
	 */
	public String getDocumentNumber()
	{
		return documentNumber;
	}

	/** 
	 * Sets the value of document
	 */
	public void setDocument(String document)
	{
		this.document = document;
	}

	/** 
	 * Gets the value of document
	 */
	public String getDocument()
	{
		return document;
	}

	/**
	 * Method 'DisponibilityPk'
	 * 
	 */
	public DisponibilityPk()
	{
	}

	/**
	 * Method 'DisponibilityPk'
	 * 
	 * @param startHour
	 * @param nameDay
	 * @param workingDayInitials
	 * @param documentNumber
	 * @param document
	 */
	public DisponibilityPk(final Date startHour, final String nameDay, final String workingDayInitials, final String documentNumber, final String document)
	{
		this.startHour = startHour;
		this.nameDay = nameDay;
		this.workingDayInitials = workingDayInitials;
		this.documentNumber = documentNumber;
		this.document = document;
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
		
		if (!(_other instanceof DisponibilityPk)) {
			return false;
		}
		
		final DisponibilityPk _cast = (DisponibilityPk) _other;
		if (startHour == null ? _cast.startHour != startHour : !startHour.equals( _cast.startHour )) {
			return false;
		}
		
		if (nameDay == null ? _cast.nameDay != nameDay : !nameDay.equals( _cast.nameDay )) {
			return false;
		}
		
		if (workingDayInitials == null ? _cast.workingDayInitials != workingDayInitials : !workingDayInitials.equals( _cast.workingDayInitials )) {
			return false;
		}
		
		if (documentNumber == null ? _cast.documentNumber != documentNumber : !documentNumber.equals( _cast.documentNumber )) {
			return false;
		}
		
		if (document == null ? _cast.document != document : !document.equals( _cast.document )) {
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
		if (startHour != null) {
			_hashCode = 29 * _hashCode + startHour.hashCode();
		}
		
		if (nameDay != null) {
			_hashCode = 29 * _hashCode + nameDay.hashCode();
		}
		
		if (workingDayInitials != null) {
			_hashCode = 29 * _hashCode + workingDayInitials.hashCode();
		}
		
		if (documentNumber != null) {
			_hashCode = 29 * _hashCode + documentNumber.hashCode();
		}
		
		if (document != null) {
			_hashCode = 29 * _hashCode + document.hashCode();
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
		ret.append( "co.edu.sena.tidsplan.dto.DisponibilityPk: " );
		ret.append( "startHour=" + startHour );
		ret.append( ", nameDay=" + nameDay );
		ret.append( ", workingDayInitials=" + workingDayInitials );
		ret.append( ", documentNumber=" + documentNumber );
		ret.append( ", document=" + document );
		return ret.toString();
	}

}