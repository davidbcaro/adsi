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

public class Program implements Serializable
{
	/** 
	 * This attribute maps to the column program_code in the program table.
	 */
	protected String programCode;

	/** 
	 * This attribute maps to the column name in the program table.
	 */
	protected String name;

	/** 
	 * This attribute maps to the column version in the program table.
	 */
	protected String version;

	/** 
	 * This attribute maps to the column initials in the program table.
	 */
	protected String initials;

	/** 
	 * This attribute maps to the column status in the program table.
	 */
	protected short status;

	/** 
	 * This attribute maps to the column level_formation in the program table.
	 */
	protected String levelFormation;

	/**
	 * Method 'Program'
	 * 
	 */
	public Program()
	{
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
	 * Method 'getInitials'
	 * 
	 * @return String
	 */
	public String getInitials()
	{
		return initials;
	}

	/**
	 * Method 'setInitials'
	 * 
	 * @param initials
	 */
	public void setInitials(String initials)
	{
		this.initials = initials;
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
	}

	/**
	 * Method 'getLevelFormation'
	 * 
	 * @return String
	 */
	public String getLevelFormation()
	{
		return levelFormation;
	}

	/**
	 * Method 'setLevelFormation'
	 * 
	 * @param levelFormation
	 */
	public void setLevelFormation(String levelFormation)
	{
		this.levelFormation = levelFormation;
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
		
		if (!(_other instanceof Program)) {
			return false;
		}
		
		final Program _cast = (Program) _other;
		if (programCode == null ? _cast.programCode != programCode : !programCode.equals( _cast.programCode )) {
			return false;
		}
		
		if (name == null ? _cast.name != name : !name.equals( _cast.name )) {
			return false;
		}
		
		if (version == null ? _cast.version != version : !version.equals( _cast.version )) {
			return false;
		}
		
		if (initials == null ? _cast.initials != initials : !initials.equals( _cast.initials )) {
			return false;
		}
		
		if (status != _cast.status) {
			return false;
		}
		
		if (levelFormation == null ? _cast.levelFormation != levelFormation : !levelFormation.equals( _cast.levelFormation )) {
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
		if (programCode != null) {
			_hashCode = 29 * _hashCode + programCode.hashCode();
		}
		
		if (name != null) {
			_hashCode = 29 * _hashCode + name.hashCode();
		}
		
		if (version != null) {
			_hashCode = 29 * _hashCode + version.hashCode();
		}
		
		if (initials != null) {
			_hashCode = 29 * _hashCode + initials.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) status;
		if (levelFormation != null) {
			_hashCode = 29 * _hashCode + levelFormation.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ProgramPk
	 */
	public ProgramPk createPk()
	{
		return new ProgramPk(programCode, version);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.controler.dao.dto.Program: " );
		ret.append( "programCode=" + programCode );
		ret.append( ", name=" + name );
		ret.append( ", version=" + version );
		ret.append( ", initials=" + initials );
		ret.append( ", status=" + status );
		ret.append( ", levelFormation=" + levelFormation );
		return ret.toString();
	}

}
