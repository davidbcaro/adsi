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

public class Project implements Serializable
{
	/** 
	 * This attribute maps to the column code_project in the project table.
	 */
	protected String codeProject;

	/** 
	 * This attribute maps to the column name_project in the project table.
	 */
	protected String nameProject;

	/** 
	 * This attribute maps to the column status_project in the project table.
	 */
	protected short statusProject;

	/**
	 * Method 'Project'
	 * 
	 */
	public Project()
	{
	}

	/**
	 * Method 'getCodeProject'
	 * 
	 * @return String
	 */
	public String getCodeProject()
	{
		return codeProject;
	}

	/**
	 * Method 'setCodeProject'
	 * 
	 * @param codeProject
	 */
	public void setCodeProject(String codeProject)
	{
		this.codeProject = codeProject;
	}

	/**
	 * Method 'getNameProject'
	 * 
	 * @return String
	 */
	public String getNameProject()
	{
		return nameProject;
	}

	/**
	 * Method 'setNameProject'
	 * 
	 * @param nameProject
	 */
	public void setNameProject(String nameProject)
	{
		this.nameProject = nameProject;
	}

	/**
	 * Method 'getStatusProject'
	 * 
	 * @return short
	 */
	public short getStatusProject()
	{
		return statusProject;
	}

	/**
	 * Method 'setStatusProject'
	 * 
	 * @param statusProject
	 */
	public void setStatusProject(short statusProject)
	{
		this.statusProject = statusProject;
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
		
		if (!(_other instanceof Project)) {
			return false;
		}
		
		final Project _cast = (Project) _other;
		if (codeProject == null ? _cast.codeProject != codeProject : !codeProject.equals( _cast.codeProject )) {
			return false;
		}
		
		if (nameProject == null ? _cast.nameProject != nameProject : !nameProject.equals( _cast.nameProject )) {
			return false;
		}
		
		if (statusProject != _cast.statusProject) {
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
		if (codeProject != null) {
			_hashCode = 29 * _hashCode + codeProject.hashCode();
		}
		
		if (nameProject != null) {
			_hashCode = 29 * _hashCode + nameProject.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) statusProject;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ProjectPk
	 */
	public ProjectPk createPk()
	{
		return new ProjectPk(codeProject);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.controler.dao.dto.Project: " );
		ret.append( "codeProject=" + codeProject );
		ret.append( ", nameProject=" + nameProject );
		ret.append( ", statusProject=" + statusProject );
		return ret.toString();
	}

}