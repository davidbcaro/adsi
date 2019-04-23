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

public class ServerEmail implements Serializable
{
	/** 
	 * This attribute maps to the column email in the server_email table.
	 */
	protected String email;

	/** 
	 * This attribute maps to the column password in the server_email table.
	 */
	protected String password;

	/** 
	 * This attribute maps to the column smtp_host in the server_email table.
	 */
	protected String smtpHost;

	/** 
	 * This attribute maps to the column smtp_Port in the server_email table.
	 */
	protected int smtpPort;

	/** 
	 * This attribute maps to the column smtp_Start_Tls_Enable in the server_email table.
	 */
	protected short smtpStartTlsEnable;

	/** 
	 * This attribute maps to the column smtp_Auth in the server_email table.
	 */
	protected short smtpAuth;

	/** 
	 * This attribute maps to the column affair_Recovery in the server_email table.
	 */
	protected String affairRecovery;

	/** 
	 * This attribute maps to the column recovery_Case in the server_email table.
	 */
	protected String recoveryCase;

	/**
	 * Method 'ServerEmail'
	 * 
	 */
	public ServerEmail()
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
	}

	/**
	 * Method 'getAffairRecovery'
	 * 
	 * @return String
	 */
	public String getAffairRecovery()
	{
		return affairRecovery;
	}

	/**
	 * Method 'setAffairRecovery'
	 * 
	 * @param affairRecovery
	 */
	public void setAffairRecovery(String affairRecovery)
	{
		this.affairRecovery = affairRecovery;
	}

	/**
	 * Method 'getRecoveryCase'
	 * 
	 * @return String
	 */
	public String getRecoveryCase()
	{
		return recoveryCase;
	}

	/**
	 * Method 'setRecoveryCase'
	 * 
	 * @param recoveryCase
	 */
	public void setRecoveryCase(String recoveryCase)
	{
		this.recoveryCase = recoveryCase;
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
		
		if (!(_other instanceof ServerEmail)) {
			return false;
		}
		
		final ServerEmail _cast = (ServerEmail) _other;
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
		
		if (smtpStartTlsEnable != _cast.smtpStartTlsEnable) {
			return false;
		}
		
		if (smtpAuth != _cast.smtpAuth) {
			return false;
		}
		
		if (affairRecovery == null ? _cast.affairRecovery != affairRecovery : !affairRecovery.equals( _cast.affairRecovery )) {
			return false;
		}
		
		if (recoveryCase == null ? _cast.recoveryCase != recoveryCase : !recoveryCase.equals( _cast.recoveryCase )) {
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
		_hashCode = 29 * _hashCode + (int) smtpStartTlsEnable;
		_hashCode = 29 * _hashCode + (int) smtpAuth;
		if (affairRecovery != null) {
			_hashCode = 29 * _hashCode + affairRecovery.hashCode();
		}
		
		if (recoveryCase != null) {
			_hashCode = 29 * _hashCode + recoveryCase.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ServerEmailPk
	 */
	public ServerEmailPk createPk()
	{
		return new ServerEmailPk(email);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.ServerEmail: " );
		ret.append( "email=" + email );
		ret.append( ", password=" + password );
		ret.append( ", smtpHost=" + smtpHost );
		ret.append( ", smtpPort=" + smtpPort );
		ret.append( ", smtpStartTlsEnable=" + smtpStartTlsEnable );
		ret.append( ", smtpAuth=" + smtpAuth );
		ret.append( ", affairRecovery=" + affairRecovery );
		ret.append( ", recoveryCase=" + recoveryCase );
		return ret.toString();
	}

}
