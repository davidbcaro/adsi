/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.tidsplan.dto;

import co.edu.sena.tidsplan.dao.*;
import co.edu.sena.tidsplan.factory.*;
import co.edu.sena.tidsplan.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Instructor implements Serializable
{
	/** 
	 * This attribute maps to the column document in the instructor table.
	 */
	protected String document;

	/** 
	 * This attribute maps to the column document_number in the instructor table.
	 */
	protected String documentNumber;

	/** 
	 * This attribute maps to the column type_employment_relationship in the instructor table.
	 */
	protected String typeEmploymentRelationship;

	/** 
	 * This attribute maps to the column name_speciality in the instructor table.
	 */
	protected String nameSpeciality;

	/**
	 * Method 'Instructor'
	 * 
	 */
	public Instructor()
	{
	}

	/**
	 * Method 'getDocument'
	 * 
	 * @return String
	 */
	public String getDocument()
	{
		return document;
	}

	/**
	 * Method 'setDocument'
	 * 
	 * @param document
	 */
	public void setDocument(String document)
	{
		this.document = document;
	}

	/**
	 * Method 'getDocumentNumber'
	 * 
	 * @return String
	 */
	public String getDocumentNumber()
	{
		return documentNumber;
	}

	/**
	 * Method 'setDocumentNumber'
	 * 
	 * @param documentNumber
	 */
	public void setDocumentNumber(String documentNumber)
	{
		this.documentNumber = documentNumber;
	}

	/**
	 * Method 'getTypeEmploymentRelationship'
	 * 
	 * @return String
	 */
	public String getTypeEmploymentRelationship()
	{
		return typeEmploymentRelationship;
	}

	/**
	 * Method 'setTypeEmploymentRelationship'
	 * 
	 * @param typeEmploymentRelationship
	 */
	public void setTypeEmploymentRelationship(String typeEmploymentRelationship)
	{
		this.typeEmploymentRelationship = typeEmploymentRelationship;
	}

	/**
	 * Method 'getNameSpeciality'
	 * 
	 * @return String
	 */
	public String getNameSpeciality()
	{
		return nameSpeciality;
	}

	/**
	 * Method 'setNameSpeciality'
	 * 
	 * @param nameSpeciality
	 */
	public void setNameSpeciality(String nameSpeciality)
	{
		this.nameSpeciality = nameSpeciality;
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
		
		if (!(_other instanceof Instructor)) {
			return false;
		}
		
		final Instructor _cast = (Instructor) _other;
		if (document == null ? _cast.document != document : !document.equals( _cast.document )) {
			return false;
		}
		
		if (documentNumber == null ? _cast.documentNumber != documentNumber : !documentNumber.equals( _cast.documentNumber )) {
			return false;
		}
		
		if (typeEmploymentRelationship == null ? _cast.typeEmploymentRelationship != typeEmploymentRelationship : !typeEmploymentRelationship.equals( _cast.typeEmploymentRelationship )) {
			return false;
		}
		
		if (nameSpeciality == null ? _cast.nameSpeciality != nameSpeciality : !nameSpeciality.equals( _cast.nameSpeciality )) {
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
		if (document != null) {
			_hashCode = 29 * _hashCode + document.hashCode();
		}
		
		if (documentNumber != null) {
			_hashCode = 29 * _hashCode + documentNumber.hashCode();
		}
		
		if (typeEmploymentRelationship != null) {
			_hashCode = 29 * _hashCode + typeEmploymentRelationship.hashCode();
		}
		
		if (nameSpeciality != null) {
			_hashCode = 29 * _hashCode + nameSpeciality.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return InstructorPk
	 */
	public InstructorPk createPk()
	{
		return new InstructorPk(documentNumber, document);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.tidsplan.dto.Instructor: " );
		ret.append( "document=" + document );
		ret.append( ", documentNumber=" + documentNumber );
		ret.append( ", typeEmploymentRelationship=" + typeEmploymentRelationship );
		ret.append( ", nameSpeciality=" + nameSpeciality );
		return ret.toString();
	}

}