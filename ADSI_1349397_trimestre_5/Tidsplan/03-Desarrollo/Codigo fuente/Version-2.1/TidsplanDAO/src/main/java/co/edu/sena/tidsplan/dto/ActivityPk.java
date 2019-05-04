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
 * This class represents the primary key of the activity table.
 */
public class ActivityPk implements Serializable
{
	protected String idActivity;

	protected String namePhase;

	protected String projectCode;

	/** 
	 * Sets the value of idActivity
	 */
	public void setIdActivity(String idActivity)
	{
		this.idActivity = idActivity;
	}

	/** 
	 * Gets the value of idActivity
	 */
	public String getIdActivity()
	{
		return idActivity;
	}

	/** 
	 * Sets the value of namePhase
	 */
	public void setNamePhase(String namePhase)
	{
		this.namePhase = namePhase;
	}

	/** 
	 * Gets the value of namePhase
	 */
	public String getNamePhase()
	{
		return namePhase;
	}

	/** 
	 * Sets the value of projectCode
	 */
	public void setProjectCode(String projectCode)
	{
		this.projectCode = projectCode;
	}

	/** 
	 * Gets the value of projectCode
	 */
	public String getProjectCode()
	{
		return projectCode;
	}

	/**
	 * Method 'ActivityPk'
	 * 
	 */
	public ActivityPk()
	{
	}

	/**
	 * Method 'ActivityPk'
	 * 
	 * @param idActivity
	 * @param namePhase
	 * @param projectCode
	 */
	public ActivityPk(final String idActivity, final String namePhase, final String projectCode)
	{
		this.idActivity = idActivity;
		this.namePhase = namePhase;
		this.projectCode = projectCode;
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
		
		if (!(_other instanceof ActivityPk)) {
			return false;
		}
		
		final ActivityPk _cast = (ActivityPk) _other;
		if (idActivity == null ? _cast.idActivity != idActivity : !idActivity.equals( _cast.idActivity )) {
			return false;
		}
		
		if (namePhase == null ? _cast.namePhase != namePhase : !namePhase.equals( _cast.namePhase )) {
			return false;
		}
		
		if (projectCode == null ? _cast.projectCode != projectCode : !projectCode.equals( _cast.projectCode )) {
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
		if (idActivity != null) {
			_hashCode = 29 * _hashCode + idActivity.hashCode();
		}
		
		if (namePhase != null) {
			_hashCode = 29 * _hashCode + namePhase.hashCode();
		}
		
		if (projectCode != null) {
			_hashCode = 29 * _hashCode + projectCode.hashCode();
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
		ret.append( "co.edu.sena.tidsplan.dto.ActivityPk: " );
		ret.append( "idActivity=" + idActivity );
		ret.append( ", namePhase=" + namePhase );
		ret.append( ", projectCode=" + projectCode );
		return ret.toString();
	}

}