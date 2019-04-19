/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.controler.dao.dto;

import co.edu.sena.controler.dao.dao.*;
import co.edu.sena.controler.dao.factory.*;
import co.edu.sena.controler.dao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class EmailServer implements Serializable
{
	/** 
	 * This attribute maps to the column email in the email_server table.
	 */
	protected String email;

	/** 
	 * This attribute maps to the column password in the email_server table.
	 */
	protected String password;

	/** 
	 * This attribute maps to the column smtp_host in the email_server table.
	 */
	protected String smtpHost;

	/** 
	 * This attribute maps to the column smtp_port in the email_server table.
	 */
	protected int smtpPort;

	/** 
	 * This attribute represents whether the primitive attribute smtpPort is null.
	 */
	protected boolean smtpPortNull = true;

	/** 
	 * This attribute maps to the column smtp_start_tls_enable in the email_server table.
	 */
	protected short smtpStartTlsEnable;

	/** 
	 * This attribute represents whether the primitive attribute smtpStartTlsEnable is null.
	 */
	protected boolean smtpStartTlsEnableNull = true;

	/** 
	 * This attribute maps to the column smtp_auth in the email_server table.
	 */
	protected short smtpAuth;

	/** 
	 * This attribute represents whether the primitive attribute smtpAuth is null.
	 */
	protected boolean smtpAuthNull = true;

	/** 
	 * This attribute maps to the column recovery_order in the email_server table.
	 */
	protected String recoveryOrder;

	/** 
	 * This attribute maps to the column recovery_message in the email_server table.
	 */
	protected String recoveryMessage;

	/**
	 * Method 'EmailServer'
	 * 
	 */
	public EmailServer()
	{
	}

	/**
	 * Method 'getEmail'
	 * 
	 * @return String
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * Method 'setEmail'
	 * 
	 * @param email
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * Method 'getPassword'
	 * 
	 * @return String
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Method 'setPassword'
	 * 
	 * @param password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * Method 'getSmtpHost'
	 * 
	 * @return String
	 */
	public String getSmtpHost()
	{
		return smtpHost;
	}

	/**
	 * Method 'setSmtpHost'
	 * 
	 * @param smtpHost
	 */
	public void setSmtpHost(String smtpHost)
	{
		this.smtpHost = smtpHost;
	}

	/**
	 * Method 'getSmtpPort'
	 * 
	 * @return int
	 */
	public int getSmtpPort()
	{
		return smtpPort;
	}

	/**
	 * Method 'setSmtpPort'
	 * 
	 * @param smtpPort
	 */
	public void setSmtpPort(int smtpPort)
	{
		this.smtpPort = smtpPort;
		this.smtpPortNull = false;
	}

	/**
	 * Method 'setSmtpPortNull'
	 * 
	 * @param value
	 */
	public void setSmtpPortNull(boolean value)
	{
		this.smtpPortNull = value;
	}

	/**
	 * Method 'isSmtpPortNull'
	 * 
	 * @return boolean
	 */
	public boolean isSmtpPortNull()
	{
		return smtpPortNull;
	}

	/**
	 * Method 'getSmtpStartTlsEnable'
	 * 
	 * @return short
	 */
	public short getSmtpStartTlsEnable()
	{
		return smtpStartTlsEnable;
	}

	/**
	 * Method 'setSmtpStartTlsEnable'
	 * 
	 * @param smtpStartTlsEnable
	 */
	public void setSmtpStartTlsEnable(short smtpStartTlsEnable)
	{
		this.smtpStartTlsEnable = smtpStartTlsEnable;
		this.smtpStartTlsEnableNull = false;
	}

	/**
	 * Method 'setSmtpStartTlsEnableNull'
	 * 
	 * @param value
	 */
	public void setSmtpStartTlsEnableNull(boolean value)
	{
		this.smtpStartTlsEnableNull = value;
	}

	/**
	 * Method 'isSmtpStartTlsEnableNull'
	 * 
	 * @return boolean
	 */
	public boolean isSmtpStartTlsEnableNull()
	{
		return smtpStartTlsEnableNull;
	}

	/**
	 * Method 'getSmtpAuth'
	 * 
	 * @return short
	 */
	public short getSmtpAuth()
	{
		return smtpAuth;
	}

	/**
	 * Method 'setSmtpAuth'
	 * 
	 * @param smtpAuth
	 */
	public void setSmtpAuth(short smtpAuth)
	{
		this.smtpAuth = smtpAuth;
		this.smtpAuthNull = false;
	}

	/**
	 * Method 'setSmtpAuthNull'
	 * 
	 * @param value
	 */
	public void setSmtpAuthNull(boolean value)
	{
		this.smtpAuthNull = value;
	}

	/**
	 * Method 'isSmtpAuthNull'
	 * 
	 * @return boolean
	 */
	public boolean isSmtpAuthNull()
	{
		return smtpAuthNull;
	}

	/**
	 * Method 'getRecoveryOrder'
	 * 
	 * @return String
	 */
	public String getRecoveryOrder()
	{
		return recoveryOrder;
	}

	/**
	 * Method 'setRecoveryOrder'
	 * 
	 * @param recoveryOrder
	 */
	public void setRecoveryOrder(String recoveryOrder)
	{
		this.recoveryOrder = recoveryOrder;
	}

	/**
	 * Method 'getRecoveryMessage'
	 * 
	 * @return String
	 */
	public String getRecoveryMessage()
	{
		return recoveryMessage;
	}

	/**
	 * Method 'setRecoveryMessage'
	 * 
	 * @param recoveryMessage
	 */
	public void setRecoveryMessage(String recoveryMessage)
	{
		this.recoveryMessage = recoveryMessage;
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
		
		if (!(_other instanceof EmailServer)) {
			return false;
		}
		
		final EmailServer _cast = (EmailServer) _other;
		if (email == null ? _cast.email != email : !email.equals( _cast.email )) {
			return false;
		}
		
		if (password == null ? _cast.password != password : !password.equals( _cast.password )) {
			return false;
		}
		
		if (smtpHost == null ? _cast.smtpHost != smtpHost : !smtpHost.equals( _cast.smtpHost )) {
			return false;
		}
		
		if (smtpPort != _cast.smtpPort) {
			return false;
		}
		
		if (smtpPortNull != _cast.smtpPortNull) {
			return false;
		}
		
		if (smtpStartTlsEnable != _cast.smtpStartTlsEnable) {
			return false;
		}
		
		if (smtpStartTlsEnableNull != _cast.smtpStartTlsEnableNull) {
			return false;
		}
		
		if (smtpAuth != _cast.smtpAuth) {
			return false;
		}
		
		if (smtpAuthNull != _cast.smtpAuthNull) {
			return false;
		}
		
		if (recoveryOrder == null ? _cast.recoveryOrder != recoveryOrder : !recoveryOrder.equals( _cast.recoveryOrder )) {
			return false;
		}
		
		if (recoveryMessage == null ? _cast.recoveryMessage != recoveryMessage : !recoveryMessage.equals( _cast.recoveryMessage )) {
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
		
		if (password != null) {
			_hashCode = 29 * _hashCode + password.hashCode();
		}
		
		if (smtpHost != null) {
			_hashCode = 29 * _hashCode + smtpHost.hashCode();
		}
		
		_hashCode = 29 * _hashCode + smtpPort;
		_hashCode = 29 * _hashCode + (smtpPortNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) smtpStartTlsEnable;
		_hashCode = 29 * _hashCode + (smtpStartTlsEnableNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) smtpAuth;
		_hashCode = 29 * _hashCode + (smtpAuthNull ? 1 : 0);
		if (recoveryOrder != null) {
			_hashCode = 29 * _hashCode + recoveryOrder.hashCode();
		}
		
		if (recoveryMessage != null) {
			_hashCode = 29 * _hashCode + recoveryMessage.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmailServerPk
	 */
	public EmailServerPk createPk()
	{
		return new EmailServerPk(email);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.controler.dao.dto.EmailServer: " );
		ret.append( "email=" + email );
		ret.append( ", password=" + password );
		ret.append( ", smtpHost=" + smtpHost );
		ret.append( ", smtpPort=" + smtpPort );
		ret.append( ", smtpStartTlsEnable=" + smtpStartTlsEnable );
		ret.append( ", smtpAuth=" + smtpAuth );
		ret.append( ", recoveryOrder=" + recoveryOrder );
		ret.append( ", recoveryMessage=" + recoveryMessage );
		return ret.toString();
	}

}
