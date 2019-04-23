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

public class WorkingDay implements Serializable
{
	/** 
	 * This attribute maps to the column initials_Working_Day in the working_day table.
	 */
	protected String initialsWorkingDay;

	/** 
	 * This attribute maps to the column name in the working_day table.
	 */
	protected String name;

	/** 
	 * This attribute maps to the column description in the working_day table.
	 */
	protected String description;

	/** 
	 * This attribute maps to the column image in the working_day table.
	 */
	protected byte[] image;

	/** 
	 * This attribute maps to the column state in the working_day table.
	 */
	protected short state;

	/** 
	 * This attribute represents whether the primitive attribute state is null.
	 */
	protected boolean stateNull = true;

	/**
	 * Method 'WorkingDay'
	 * 
	 */
	public WorkingDay()
	{
	}

	/**
	 * Method 'getInitialsWorkingDay'
	 * 
	 * @return String
	 */
	public String getInitialsWorkingDay()
	{
		return initialsWorkingDay;
	}

	/**
	 * Method 'setInitialsWorkingDay'
	 * 
	 * @param initialsWorkingDay
	 */
	public void setInitialsWorkingDay(String initialsWorkingDay)
	{
		this.initialsWorkingDay = initialsWorkingDay;
	}

	/**
	 * Method 'getName'
	 * 
	 * @return String
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Method 'setName'
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Method 'getDescription'
	 * 
	 * @return String
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Method 'setDescription'
	 * 
	 * @param description
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * Method 'getImage'
	 * 
	 * @return byte[]
	 */
	public byte[] getImage()
	{
		return image;
	}

	/**
	 * Method 'setImage'
	 * 
	 * @param image
	 */
	public void setImage(byte[] image)
	{
		this.image = image;
	}

	/**
	 * Method 'getState'
	 * 
	 * @return short
	 */
	public short getState()
	{
		return state;
	}

	/**
	 * Method 'setState'
	 * 
	 * @param state
	 */
	public void setState(short state)
	{
		this.state = state;
		this.stateNull = false;
	}

	/**
	 * Method 'setStateNull'
	 * 
	 * @param value
	 */
	public void setStateNull(boolean value)
	{
		this.stateNull = value;
	}

	/**
	 * Method 'isStateNull'
	 * 
	 * @return boolean
	 */
	public boolean isStateNull()
	{
		return stateNull;
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
		
		if (!(_other instanceof WorkingDay)) {
			return false;
		}
		
		final WorkingDay _cast = (WorkingDay) _other;
		if (initialsWorkingDay == null ? _cast.initialsWorkingDay != initialsWorkingDay : !initialsWorkingDay.equals( _cast.initialsWorkingDay )) {
			return false;
		}
		
		if (name == null ? _cast.name != name : !name.equals( _cast.name )) {
			return false;
		}
		
		if (description == null ? _cast.description != description : !description.equals( _cast.description )) {
			return false;
		}
		
		if (image == null ? _cast.image != image : !image.equals( _cast.image )) {
			return false;
		}
		
		if (state != _cast.state) {
			return false;
		}
		
		if (stateNull != _cast.stateNull) {
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
		if (initialsWorkingDay != null) {
			_hashCode = 29 * _hashCode + initialsWorkingDay.hashCode();
		}
		
		if (name != null) {
			_hashCode = 29 * _hashCode + name.hashCode();
		}
		
		if (description != null) {
			_hashCode = 29 * _hashCode + description.hashCode();
		}
		
		if (image != null) {
			_hashCode = 29 * _hashCode + image.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) state;
		_hashCode = 29 * _hashCode + (stateNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return WorkingDayPk
	 */
	public WorkingDayPk createPk()
	{
		return new WorkingDayPk(initialsWorkingDay);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.WorkingDay: " );
		ret.append( "initialsWorkingDay=" + initialsWorkingDay );
		ret.append( ", name=" + name );
		ret.append( ", description=" + description );
		ret.append( ", image=" + image );
		ret.append( ", state=" + state );
		return ret.toString();
	}

}
