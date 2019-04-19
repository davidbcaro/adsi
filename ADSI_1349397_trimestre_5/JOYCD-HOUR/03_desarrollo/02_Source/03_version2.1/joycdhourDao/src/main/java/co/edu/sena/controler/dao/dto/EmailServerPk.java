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
 * This class represents the primary key of the email_server table.
 */
public class EmailServerPk implements Serializable
{
	protected String email;

	/** 
	 * Sets the value of email
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/** 
	 * Gets the value of email
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * Method 'EmailServerPk'
	 * 
	 */
	public EmailServerPk()
	{
	}

	/**
	 * Method 'EmailServerPk'
	 * 
	 * @param email
	 */
	public EmailServerPk(final String email)
	{
		this.email = email;
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
		
		if (!(_other instanceof EmailServerPk)) {
			return false;
		}
		
		final EmailServerPk _cast = (EmailServerPk) _other;
		if (email == null ? _cast.email != email : !email.equals( _cast.email )) {
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
		if (email != null) {
			_hashCode = 29 * _hashCode + email.hashCode();
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
		ret.append( "co.edu.sena.controler.dao.dto.EmailServerPk: " );
		ret.append( "email=" + email );
		return ret.toString();
	}

}
