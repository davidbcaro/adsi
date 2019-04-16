/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.jdbc;

import co.edu.sena.dao.*;
import co.edu.sena.factory.*;
import java.util.Date;
import co.edu.sena.dto.*;
import co.edu.sena.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class AvailabilityDaoImpl extends AbstractDAO implements AvailabilityDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT document_Number, id_Document, start_Time, end_Time, acronyms_Working_Day, name_Day FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( document_Number, id_Document, start_Time, end_Time, acronyms_Working_Day, name_Day ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET document_Number = ?, id_Document = ?, start_Time = ?, end_Time = ?, acronyms_Working_Day = ?, name_Day = ? WHERE document_Number = ? AND id_Document = ? AND start_Time = ? AND acronyms_Working_Day = ? AND name_Day = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE document_Number = ? AND id_Document = ? AND start_Time = ? AND acronyms_Working_Day = ? AND name_Day = ?";

	/** 
	 * Index of column document_Number
	 */
	protected static final int COLUMN_DOCUMENT_NUMBER = 1;

	/** 
	 * Index of column id_Document
	 */
	protected static final int COLUMN_ID_DOCUMENT = 2;

	/** 
	 * Index of column start_Time
	 */
	protected static final int COLUMN_START_TIME = 3;

	/** 
	 * Index of column end_Time
	 */
	protected static final int COLUMN_END_TIME = 4;

	/** 
	 * Index of column acronyms_Working_Day
	 */
	protected static final int COLUMN_ACRONYMS_WORKING_DAY = 5;

	/** 
	 * Index of column name_Day
	 */
	protected static final int COLUMN_NAME_DAY = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column document_Number
	 */
	protected static final int PK_COLUMN_DOCUMENT_NUMBER = 1;

	/** 
	 * Index of primary-key column id_Document
	 */
	protected static final int PK_COLUMN_ID_DOCUMENT = 2;

	/** 
	 * Index of primary-key column start_Time
	 */
	protected static final int PK_COLUMN_START_TIME = 3;

	/** 
	 * Index of primary-key column acronyms_Working_Day
	 */
	protected static final int PK_COLUMN_ACRONYMS_WORKING_DAY = 4;

	/** 
	 * Index of primary-key column name_Day
	 */
	protected static final int PK_COLUMN_NAME_DAY = 5;

	/** 
	 * Inserts a new row in the availability table.
	 */
	public AvailabilityPk insert(Availability dto) throws AvailabilityDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setString( index++, dto.getDocumentNumber() );
			stmt.setString( index++, dto.getIdDocument() );
			stmt.setTime(index++, dto.getStartTime()==null ? null : new java.sql.Time( dto.getStartTime().getTime() ) );
			stmt.setTime(index++, dto.getEndTime()==null ? null : new java.sql.Time( dto.getEndTime().getTime() ) );
			stmt.setString( index++, dto.getAcronymsWorkingDay() );
			stmt.setString( index++, dto.getNameDay() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AvailabilityDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the availability table.
	 */
	public void update(AvailabilityPk pk, Availability dto) throws AvailabilityDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setString( index++, dto.getDocumentNumber() );
			stmt.setString( index++, dto.getIdDocument() );
			stmt.setTime(index++, dto.getStartTime()==null ? null : new java.sql.Time( dto.getStartTime().getTime() ) );
			stmt.setTime(index++, dto.getEndTime()==null ? null : new java.sql.Time( dto.getEndTime().getTime() ) );
			stmt.setString( index++, dto.getAcronymsWorkingDay() );
			stmt.setString( index++, dto.getNameDay() );
			stmt.setString( 7, pk.getDocumentNumber() );
			stmt.setString( 8, pk.getIdDocument() );
			stmt.setTime(9, pk.getStartTime()==null ? null : new java.sql.Time( pk.getStartTime().getTime() ) );
			stmt.setString( 10, pk.getAcronymsWorkingDay() );
			stmt.setString( 11, pk.getNameDay() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AvailabilityDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the availability table.
	 */
	public void delete(AvailabilityPk pk) throws AvailabilityDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setString( 1, pk.getDocumentNumber() );
			stmt.setString( 2, pk.getIdDocument() );
			stmt.setTime(3, pk.getStartTime()==null ? null : new java.sql.Time( pk.getStartTime().getTime() ) );
			stmt.setString( 4, pk.getAcronymsWorkingDay() );
			stmt.setString( 5, pk.getNameDay() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AvailabilityDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the availability table that matches the specified primary-key value.
	 */
	public Availability findByPrimaryKey(AvailabilityPk pk) throws AvailabilityDaoException
	{
		return findByPrimaryKey( pk.getDocumentNumber(), pk.getIdDocument(), pk.getStartTime(), pk.getAcronymsWorkingDay(), pk.getNameDay() );
	}

	/** 
	 * Returns all rows from the availability table that match the criteria 'document_Number = :documentNumber AND id_Document = :idDocument AND start_Time = :startTime AND acronyms_Working_Day = :acronymsWorkingDay AND name_Day = :nameDay'.
	 */
	public Availability findByPrimaryKey(String documentNumber, String idDocument, Date startTime, String acronymsWorkingDay, String nameDay) throws AvailabilityDaoException
	{
		Availability ret[] = findByDynamicSelect( SQL_SELECT + " WHERE document_Number = ? AND id_Document = ? AND start_Time = ? AND acronyms_Working_Day = ? AND name_Day = ?", new Object[] { documentNumber, idDocument, startTime==null ? null : new java.sql.Time( startTime.getTime() ), acronymsWorkingDay, nameDay } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the availability table that match the criteria ''.
	 */
	public Availability[] findAll() throws AvailabilityDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY document_Number, id_Document, start_Time, acronyms_Working_Day, name_Day", null );
	}

	/** 
	 * Returns all rows from the availability table that match the criteria 'name_Day = :nameDay'.
	 */
	public Availability[] findByDay(String nameDay) throws AvailabilityDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE name_Day = ?", new Object[] { nameDay } );
	}

	/** 
	 * Returns all rows from the availability table that match the criteria 'document_Number = :documentNumber AND id_Document = :idDocument'.
	 */
	public Availability[] findByInstructor(String documentNumber, String idDocument) throws AvailabilityDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE document_Number = ? AND id_Document = ?", new Object[] { documentNumber, idDocument } );
	}

	/** 
	 * Returns all rows from the availability table that match the criteria 'acronyms_Working_Day = :acronymsWorkingDay'.
	 */
	public Availability[] findByWorkingDay(String acronymsWorkingDay) throws AvailabilityDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE acronyms_Working_Day = ?", new Object[] { acronymsWorkingDay } );
	}

	/** 
	 * Returns all rows from the availability table that match the criteria 'document_Number = :documentNumber'.
	 */
	public Availability[] findWhereDocumentNumberEquals(String documentNumber) throws AvailabilityDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE document_Number = ? ORDER BY document_Number", new Object[] { documentNumber } );
	}

	/** 
	 * Returns all rows from the availability table that match the criteria 'id_Document = :idDocument'.
	 */
	public Availability[] findWhereIdDocumentEquals(String idDocument) throws AvailabilityDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_Document = ? ORDER BY id_Document", new Object[] { idDocument } );
	}

	/** 
	 * Returns all rows from the availability table that match the criteria 'start_Time = :startTime'.
	 */
	public Availability[] findWhereStartTimeEquals(Date startTime) throws AvailabilityDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE start_Time = ? ORDER BY start_Time", new Object[] { startTime==null ? null : new java.sql.Time( startTime.getTime() ) } );
	}

	/** 
	 * Returns all rows from the availability table that match the criteria 'end_Time = :endTime'.
	 */
	public Availability[] findWhereEndTimeEquals(Date endTime) throws AvailabilityDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE end_Time = ? ORDER BY end_Time", new Object[] { endTime==null ? null : new java.sql.Time( endTime.getTime() ) } );
	}

	/** 
	 * Returns all rows from the availability table that match the criteria 'acronyms_Working_Day = :acronymsWorkingDay'.
	 */
	public Availability[] findWhereAcronymsWorkingDayEquals(String acronymsWorkingDay) throws AvailabilityDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE acronyms_Working_Day = ? ORDER BY acronyms_Working_Day", new Object[] { acronymsWorkingDay } );
	}

	/** 
	 * Returns all rows from the availability table that match the criteria 'name_Day = :nameDay'.
	 */
	public Availability[] findWhereNameDayEquals(String nameDay) throws AvailabilityDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE name_Day = ? ORDER BY name_Day", new Object[] { nameDay } );
	}

	/**
	 * Method 'AvailabilityDaoImpl'
	 * 
	 */
	public AvailabilityDaoImpl()
	{
	}

	/**
	 * Method 'AvailabilityDaoImpl'
	 * 
	 * @param userConn
	 */
	public AvailabilityDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "eon.availability";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Availability fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Availability dto = new Availability();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Availability[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Availability dto = new Availability();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Availability ret[] = new Availability[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Availability dto, ResultSet rs) throws SQLException
	{
		dto.setDocumentNumber( rs.getString( COLUMN_DOCUMENT_NUMBER ) );
		dto.setIdDocument( rs.getString( COLUMN_ID_DOCUMENT ) );
		dto.setStartTime( rs.getTime(COLUMN_START_TIME ) );
		dto.setEndTime( rs.getTime(COLUMN_END_TIME ) );
		dto.setAcronymsWorkingDay( rs.getString( COLUMN_ACRONYMS_WORKING_DAY ) );
		dto.setNameDay( rs.getString( COLUMN_NAME_DAY ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Availability dto)
	{
	}

	/** 
	 * Returns all rows from the availability table that match the specified arbitrary SQL statement
	 */
	public Availability[] findByDynamicSelect(String sql, Object[] sqlParams) throws AvailabilityDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AvailabilityDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the availability table that match the specified arbitrary SQL statement
	 */
	public Availability[] findByDynamicWhere(String sql, Object[] sqlParams) throws AvailabilityDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AvailabilityDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}