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
 * This class represents the primary key of the group table.
 */
public class GroupPk implements Serializable
{
	protected String numberGroup;

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
	 * Method 'GroupPk'
	 * 
	 */
	public GroupPk()
	{
	}

	/**
	 * Method 'GroupPk'
	 * 
	 * @param numberGroup
	 */
	public GroupPk(final String numberGroup)
	{
		this.numberGroup = numberGroup;
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
		
		if (!(_other instanceof GroupPk)) {
			return false;
		}
		
		final GroupPk _cast = (GroupPk) _other;
		if (numberGroup == null ? _cast.numberGroup != numberGroup : !numberGroup.equals( _cast.numberGroup )) {
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
		ret.append( "co.edu.sena.tidsplan.dto.GroupPk: " );
		ret.append( "numberGroup=" + numberGroup );
		return ret.toString();
	}

}