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

public class NumberGroup implements Serializable
{
	/** 
	 * This attribute maps to the column number_Group in the number_group table.
	 */
	protected String numberGroup;

	/** 
	 * This attribute maps to the column start_Date in the number_group table.
	 */
	protected Date startDate;

	/** 
	 * This attribute maps to the column end_Date in the number_group table.
	 */
	protected Date endDate;

	/** 
	 * This attribute maps to the column route in the number_group table.
	 */
	protected String route;

	/** 
	 * This attribute maps to the column name_State in the number_group table.
	 */
	protected String nameState;

	/** 
	 * This attribute maps to the column program_Code in the number_group table.
	 */
	protected String programCode;

	/** 
	 * This attribute maps to the column version in the number_group table.
	 */
	protected String version;

	/**
	 * Method 'NumberGroup'
	 * 
	 */
	public NumberGroup()
	{
	}

	/**
	 * Method 'getNumberGroup'
	 * 
	 * @return String
	 */
	public String getNumberGroup()
	{
		return numberGroup;
	}

	/**
	 * Method 'setNumberGroup'
	 * 
	 * @param numberGroup
	 */
	public void setNumberGroup(String numberGroup)
	{
		this.numberGroup = numberGroup;
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
	 * Method 'getRoute'
	 * 
	 * @return String
	 */
	public String getRoute()
	{
		return route;
	}

	/**
	 * Method 'setRoute'
	 * 
	 * @param route
	 */
	public void setRoute(String route)
	{
		this.route = route;
	}

	/**
	 * Method 'getNameState'
	 * 
	 * @return String
	 */
	public String getNameState()
	{
		return nameState;
	}

	/**
	 * Method 'setNameState'
	 * 
	 * @param nameState
	 */
	public void setNameState(String nameState)
	{
		this.nameState = nameState;
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
		
		if (!(_other instanceof NumberGroup)) {
			return false;
		}
		
		final NumberGroup _cast = (NumberGroup) _other;
		if (numberGroup == null ? _cast.numberGroup != numberGroup : !numberGroup.equals( _cast.numberGroup )) {
			return false;
		}
		
		if (startDate == null ? _cast.startDate != startDate : !startDate.equals( _cast.startDate )) {
			return false;
		}
		
		if (endDate == null ? _cast.endDate != endDate : !endDate.equals( _cast.endDate )) {
			return false;
		}
		
		if (route == null ? _cast.route != route : !route.equals( _cast.route )) {
			return false;
		}
		
		if (nameState == null ? _cast.nameState != nameState : !nameState.equals( _cast.nameState )) {
			return false;
		}
		
		if (programCode == null ? _cast.programCode != programCode : !programCode.equals( _cast.programCode )) {
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
		if (numberGroup != null) {
			_hashCode = 29 * _hashCode + numberGroup.hashCode();
		}
		
		if (startDate != null) {
			_hashCode = 29 * _hashCode + startDate.hashCode();
		}
		
		if (endDate != null) {
			_hashCode = 29 * _hashCode + endDate.hashCode();
		}
		
		if (route != null) {
			_hashCode = 29 * _hashCode + route.hashCode();
		}
		
		if (nameState != null) {
			_hashCode = 29 * _hashCode + nameState.hashCode();
		}
		
		if (programCode != null) {
			_hashCode = 29 * _hashCode + programCode.hashCode();
		}
		
		if (version != null) {
			_hashCode = 29 * _hashCode + version.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return NumberGroupPk
	 */
	public NumberGroupPk createPk()
	{
		return new NumberGroupPk(numberGroup, version);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.NumberGroup: " );
		ret.append( "numberGroup=" + numberGroup );
		ret.append( ", startDate=" + startDate );
		ret.append( ", endDate=" + endDate );
		ret.append( ", route=" + route );
		ret.append( ", nameState=" + nameState );
		ret.append( ", programCode=" + programCode );
		ret.append( ", version=" + version );
		return ret.toString();
	}

}
