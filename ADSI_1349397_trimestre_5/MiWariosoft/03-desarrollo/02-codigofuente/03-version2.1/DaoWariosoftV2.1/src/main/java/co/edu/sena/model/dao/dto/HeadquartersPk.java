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
 * This class represents the primary key of the headquarters table.
 */
public class HeadquartersPk implements Serializable
{
	protected String nameHeadquarters;

	/** 
	 * Sets the value of nameHeadquarters
	 */
	public void setNameHeadquarters(String nameHeadquarters)
	{
		this.nameHeadquarters = nameHeadquarters;
	}

	/** 
	 * Gets the value of nameHeadquarters
	 */
	public String getNameHeadquarters()
	{
		return nameHeadquarters;
	}

	/**
	 * Method 'HeadquartersPk'
	 * 
	 */
	public HeadquartersPk()
	{
	}

	/**
	 * Method 'HeadquartersPk'
	 * 
	 * @param nameHeadquarters
	 */
	public HeadquartersPk(final String nameHeadquarters)
	{
		this.nameHeadquarters = nameHeadquarters;
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
		
		if (!(_other instanceof HeadquartersPk)) {
			return false;
		}
		
		final HeadquartersPk _cast = (HeadquartersPk) _other;
		if (nameHeadquarters == null ? _cast.nameHeadquarters != nameHeadquarters : !nameHeadquarters.equals( _cast.nameHeadquarters )) {
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
		if (nameHeadquarters != null) {
			_hashCode = 29 * _hashCode + nameHeadquarters.hashCode();
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
		ret.append( "co.edu.sena.model.dao.dto.HeadquartersPk: " );
		ret.append( "nameHeadquarters=" + nameHeadquarters );
		return ret.toString();
	}

}
