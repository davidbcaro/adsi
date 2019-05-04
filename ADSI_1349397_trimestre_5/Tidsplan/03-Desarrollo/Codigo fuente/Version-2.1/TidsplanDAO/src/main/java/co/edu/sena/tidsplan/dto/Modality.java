/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.tidsplan.dto;

import co.edu.sena.tidsplan.dao.*;
import co.edu.sena.tidsplan.factory.*;
import co.edu.sena.tidsplan.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Modality implements Serializable
{
	/** 
	 * This attribute maps to the column name_modality in the modality table.
	 */
	protected String nameModality;

	/** 
	 * This attribute maps to the column status in the modality table.
	 */
	protected short status;

	/** 
	 * This attribute represents whether the primitive attribute status is null.
	 */
	protected boolean statusNull = true;

	/**
	 * Method 'Modality'
	 * 
	 */
	public Modality()
	{
	}

	/**
	 * Method 'getNameModality'
	 * 
	 * @return String
	 */
	public String getNameModality()
	{
		return nameModality;
	}

	/**
	 * Method 'setNameModality'
	 * 
	 * @param nameModality
	 */
	public void setNameModality(String nameModality)
	{
		this.nameModality = nameModality;
	}

	/**
	 * Method 'getStatus'
	 * 
	 * @return short
	 */
	public short getStatus()
	{
		return status;
	}

	/**
	 * Method 'setStatus'
	 * 
	 * @param status
	 */
	public void setStatus(short status)
	{
		this.status = status;
		this.statusNull = false;
	}

	/**
	 * Method 'setStatusNull'
	 * 
	 * @param value
	 */
	public void setStatusNull(boolean value)
	{
		this.statusNull = value;
	}

	/**
	 * Method 'isStatusNull'
	 * 
	 * @return boolean
	 */
	public boolean isStatusNull()
	{
		return statusNull;
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
		
		if (!(_other instanceof Modality)) {
			return false;
		}
		
		final Modality _cast = (Modality) _other;
		if (nameModality == null ? _cast.nameModality != nameModality : !nameModality.equals( _cast.nameModality )) {
			return false;
		}
		
		if (status != _cast.status) {
			return false;
		}
		
		if (statusNull != _cast.statusNull) {
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
		if (nameModality != null) {
			_hashCode = 29 * _hashCode + nameModality.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) status;
		_hashCode = 29 * _hashCode + (statusNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ModalityPk
	 */
	public ModalityPk createPk()
	{
		return new ModalityPk(nameModality);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.tidsplan.dto.Modality: " );
		ret.append( "nameModality=" + nameModality );
		ret.append( ", status=" + status );
		return ret.toString();
	}

}