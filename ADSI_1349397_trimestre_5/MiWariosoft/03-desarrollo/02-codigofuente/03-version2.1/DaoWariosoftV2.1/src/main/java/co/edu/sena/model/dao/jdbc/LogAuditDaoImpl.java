/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.jdbc;

import co.edu.sena.model.dao.dao.*;
import co.edu.sena.model.dao.factory.*;
import java.util.Date;
import co.edu.sena.model.dao.dto.*;
import co.edu.sena.model.dao.exceptions.*;
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

public class LogAuditDaoImpl extends AbstractDAO implements LogAuditDao
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
	protected final String SQL_SELECT = "SELECT id_Log, level, log_Name, message, date, user FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_Log, level, log_Name, message, date, user ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_Log = ?, level = ?, log_Name = ?, message = ?, date = ?, user = ? WHERE id_Log = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_Log = ?";

	/** 
	 * Index of column id_Log
	 */
	protected static final int COLUMN_ID_LOG = 1;

	/** 
	 * Index of column level
	 */
	protected static final int COLUMN_LEVEL = 2;

	/** 
	 * Index of column log_Name
	 */
	protected static final int COLUMN_LOG_NAME = 3;

	/** 
	 * Index of column message
	 */
	protected static final int COLUMN_MESSAGE = 4;

	/** 
	 * Index of column date
	 */
	protected static final int COLUMN_DATE = 5;

	/** 
	 * Index of column user
	 */
	protected static final int COLUMN_USER = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column id_Log
	 */
	protected static final int PK_COLUMN_ID_LOG = 1;

	/** 
	 * Inserts a new row in the log_audit table.
	 */
	public LogAuditPk insert(LogAudit dto) throws LogAuditDaoException
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
			stmt.setLong( index++, dto.getIdLog() );
			stmt.setString( index++, dto.getLevel() );
			stmt.setString( index++, dto.getLogName() );
			stmt.setString( index++, dto.getMessage() );
			stmt.setTimestamp(index++, dto.getDate()==null ? null : new java.sql.Timestamp( dto.getDate().getTime() ) );
			stmt.setString( index++, dto.getUser() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new LogAuditDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the log_audit table.
	 */
	public void update(LogAuditPk pk, LogAudit dto) throws LogAuditDaoException
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
			stmt.setLong( index++, dto.getIdLog() );
			stmt.setString( index++, dto.getLevel() );
			stmt.setString( index++, dto.getLogName() );
			stmt.setString( index++, dto.getMessage() );
			stmt.setTimestamp(index++, dto.getDate()==null ? null : new java.sql.Timestamp( dto.getDate().getTime() ) );
			stmt.setString( index++, dto.getUser() );
			stmt.setLong( 7, pk.getIdLog() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new LogAuditDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the log_audit table.
	 */
	public void delete(LogAuditPk pk) throws LogAuditDaoException
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
			stmt.setLong( 1, pk.getIdLog() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new LogAuditDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the log_audit table that matches the specified primary-key value.
	 */
	public LogAudit findByPrimaryKey(LogAuditPk pk) throws LogAuditDaoException
	{
		return findByPrimaryKey( pk.getIdLog() );
	}

	/** 
	 * Returns all rows from the log_audit table that match the criteria 'id_Log = :idLog'.
	 */
	public LogAudit findByPrimaryKey(long idLog) throws LogAuditDaoException
	{
		LogAudit ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_Log = ?", new Object[] {  new Long(idLog) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the log_audit table that match the criteria ''.
	 */
	public LogAudit[] findAll() throws LogAuditDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_Log", null );
	}

	/** 
	 * Returns all rows from the log_audit table that match the criteria 'id_Log = :idLog'.
	 */
	public LogAudit[] findWhereIdLogEquals(long idLog) throws LogAuditDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_Log = ? ORDER BY id_Log", new Object[] {  new Long(idLog) } );
	}

	/** 
	 * Returns all rows from the log_audit table that match the criteria 'level = :level'.
	 */
	public LogAudit[] findWhereLevelEquals(String level) throws LogAuditDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE level = ? ORDER BY level", new Object[] { level } );
	}

	/** 
	 * Returns all rows from the log_audit table that match the criteria 'log_Name = :logName'.
	 */
	public LogAudit[] findWhereLogNameEquals(String logName) throws LogAuditDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE log_Name = ? ORDER BY log_Name", new Object[] { logName } );
	}

	/** 
	 * Returns all rows from the log_audit table that match the criteria 'message = :message'.
	 */
	public LogAudit[] findWhereMessageEquals(String message) throws LogAuditDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE message = ? ORDER BY message", new Object[] { message } );
	}

	/** 
	 * Returns all rows from the log_audit table that match the criteria 'date = :date'.
	 */
	public LogAudit[] findWhereDateEquals(Date date) throws LogAuditDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE date = ? ORDER BY date", new Object[] { date==null ? null : new java.sql.Timestamp( date.getTime() ) } );
	}

	/** 
	 * Returns all rows from the log_audit table that match the criteria 'user = :user'.
	 */
	public LogAudit[] findWhereUserEquals(String user) throws LogAuditDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user = ? ORDER BY user", new Object[] { user } );
	}

	/**
	 * Method 'LogAuditDaoImpl'
	 * 
	 */
	public LogAuditDaoImpl()
	{
	}

	/**
	 * Method 'LogAuditDaoImpl'
	 * 
	 * @param userConn
	 */
	public LogAuditDaoImpl(final java.sql.Connection userConn)
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
		return "wariosoft.log_audit";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected LogAudit fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			LogAudit dto = new LogAudit();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected LogAudit[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			LogAudit dto = new LogAudit();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		LogAudit ret[] = new LogAudit[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(LogAudit dto, ResultSet rs) throws SQLException
	{
		dto.setIdLog( rs.getLong( COLUMN_ID_LOG ) );
		dto.setLevel( rs.getString( COLUMN_LEVEL ) );
		dto.setLogName( rs.getString( COLUMN_LOG_NAME ) );
		dto.setMessage( rs.getString( COLUMN_MESSAGE ) );
		dto.setDate( rs.getTimestamp(COLUMN_DATE ) );
		dto.setUser( rs.getString( COLUMN_USER ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(LogAudit dto)
	{
	}

	/** 
	 * Returns all rows from the log_audit table that match the specified arbitrary SQL statement
	 */
	public LogAudit[] findByDynamicSelect(String sql, Object[] sqlParams) throws LogAuditDaoException
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
			throw new LogAuditDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the log_audit table that match the specified arbitrary SQL statement
	 */
	public LogAudit[] findByDynamicWhere(String sql, Object[] sqlParams) throws LogAuditDaoException
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
			throw new LogAuditDaoException( "Exception: " + _e.getMessage(), _e );
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