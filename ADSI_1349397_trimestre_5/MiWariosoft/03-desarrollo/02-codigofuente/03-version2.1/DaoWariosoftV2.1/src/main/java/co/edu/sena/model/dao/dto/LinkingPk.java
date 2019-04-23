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
 * This class represents the primary key of the linking table.
 */
public class LinkingPk implements Serializable
{
	protected String typeLinking;

	/** 
	 * Sets the value of typeLinking
	 */
	public void setTypeLinking(String typeLinking)
	{
		this.typeLinking = typeLinking;
	}

	/** 
	 * Gets the value of typeLinking
	 */
	public String getTypeLinking()
	{
		return typeLinking;
	}

	/**
	 * Method 'LinkingPk'
	 * 
	 */
	public LinkingPk()
	{
	}

	/**
	 * Method 'LinkingPk'
	 * 
	 * @param typeLinking
	 */
	public LinkingPk(final String typeLinking)
	{
		this.typeLinking = typeLinking;
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
		
		if (!(_other instanceof LinkingPk)) {
			return false;
		}
		
		final LinkingPk _cast = (LinkingPk) _other;
		if (typeLinking == null ? _cast.typeLinking != typeLinking : !typeLinking.equals( _cast.typeLinking )) {
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
		if (typeLinking != null) {
			_hashCode = 29 * _hashCode + typeLinking.hashCode();
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
		ret.append( "co.edu.sena.model.dao.dto.LinkingPk: " );
		ret.append( "typeLinking=" + typeLinking );
		return ret.toString();
	}

}
