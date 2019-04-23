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

public class Trimester implements Serializable
{
	/** 
	 * This attribute maps to the column name_Trimester in the trimester table.
	 */
	protected String nameTrimester;

	/** 
	 * This attribute maps to the column training_Level in the trimester table.
	 */
	protected String trainingLevel;

	/** 
	 * This attribute maps to the column initials_Working_Day in the trimester table.
	 */
	protected String initialsWorkingDay;

	/**
	 * Method 'Trimester'
	 * 
	 */
	public Trimester()
	{
	}

	/**
	 * Method 'getNameTrimester'
	 * 
	 * @return String
	 */
	public String getNameTrimester()
	{
		return nameTrimester;
	}

	/**
	 * Method 'setNameTrimester'
	 * 
	 * @param nameTrimester
	 */
	public void setNameTrimester(String nameTrimester)
	{
		this.nameTrimester = nameTrimester;
	}

	/**
	 * Method 'getTrainingLevel'
	 * 
	 * @return String
	 */
	public String getTrainingLevel()
	{
		return trainingLevel;
	}

	/**
	 * Method 'setTrainingLevel'
	 * 
	 * @param trainingLevel
	 */
	public void setTrainingLevel(String trainingLevel)
	{
		this.trainingLevel = trainingLevel;
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
		
		if (!(_other instanceof Trimester)) {
			return false;
		}
		
		final Trimester _cast = (Trimester) _other;
		if (nameTrimester == null ? _cast.nameTrimester != nameTrimester : !nameTrimester.equals( _cast.nameTrimester )) {
			return false;
		}
		
		if (trainingLevel == null ? _cast.trainingLevel != trainingLevel : !trainingLevel.equals( _cast.trainingLevel )) {
			return false;
		}
		
		if (initialsWorkingDay == null ? _cast.initialsWorkingDay != initialsWorkingDay : !initialsWorkingDay.equals( _cast.initialsWorkingDay )) {
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
		if (nameTrimester != null) {
			_hashCode = 29 * _hashCode + nameTrimester.hashCode();
		}
		
		if (trainingLevel != null) {
			_hashCode = 29 * _hashCode + trainingLevel.hashCode();
		}
		
		if (initialsWorkingDay != null) {
			_hashCode = 29 * _hashCode + initialsWorkingDay.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return TrimesterPk
	 */
	public TrimesterPk createPk()
	{
		return new TrimesterPk(nameTrimester, initialsWorkingDay, trainingLevel);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.Trimester: " );
		ret.append( "nameTrimester=" + nameTrimester );
		ret.append( ", trainingLevel=" + trainingLevel );
		ret.append( ", initialsWorkingDay=" + initialsWorkingDay );
		return ret.toString();
	}

}
