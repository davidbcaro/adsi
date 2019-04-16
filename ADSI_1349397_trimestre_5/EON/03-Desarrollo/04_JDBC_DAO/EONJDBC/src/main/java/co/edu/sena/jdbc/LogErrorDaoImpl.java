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

public class LogErrorDaoImpl extends AbstractDAO implements LogErrorDao
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
	protected final String SQL_SELECT = "SELECT id_Log, Level, log_Name, Message, Date, User FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_Log, Level, log_Name, Message, Date, User ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_Log = ?, Level = ?, log_Name = ?, Message = ?, Date = ?, User = ? WHERE id_Log = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_Log = ?";

	/** 
	 * Index of column id_Log
	 */
	protected static final int COLUMN_ID_LOG = 1;

	/** 
	 * Index of column Level
	 */
	protected static final int COLUMN_LEVEL = 2;

	/** 
	 * Index of column log_Name
	 */
	protected static final int COLUMN_LOG_NAME = 3;

	/** 
	 * Index of column Message
	 */
	protected static final int COLUMN_MESSAGE = 4;

	/** 
	 * Index of column Date
	 */
	protected static final int COLUMN_DATE = 5;

	/** 
	 * Index of column User
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
	 * Inserts a new row in the log_error table.
	 */
	public LogErrorPk insert(LogError dto) throws LogErrorDaoException
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
			throw new LogErrorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the log_error table.
	 */
	public void update(LogErrorPk pk, LogError dto) throws LogErrorDaoException
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
			throw new LogErrorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the log_error table.
	 */
	public void delete(LogErrorPk pk) throws LogErrorDaoException
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
			throw new LogErrorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the log_error table that matches the specified primary-key value.
	 */
	public LogError findByPrimaryKey(LogErrorPk pk) throws LogErrorDaoException
	{
		return findByPrimaryKey( pk.getIdLog() );
	}

	/** 
	 * Returns all rows from the log_error table that match the criteria 'id_Log = :idLog'.
	 */
	public LogError findByPrimaryKey(long idLog) throws LogErrorDaoException
	{
		LogError ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_Log = ?", new Object[] {  new Long(idLog) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the log_error table that match the criteria ''.
	 */
	public LogError[] findAll() throws LogErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_Log", null );
	}

	/** 
	 * Returns all rows from the log_error table that match the criteria 'id_Log = :idLog'.
	 */
	public LogError[] findWhereIdLogEquals(long idLog) throws LogErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_Log = ? ORDER BY id_Log", new Object[] {  new Long(idLog) } );
	}

	/** 
	 * Returns all rows from the log_error table that match the criteria 'Level = :level'.
	 */
	public LogError[] findWhereLevelEquals(String level) throws LogErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Level = ? ORDER BY Level", new Object[] { level } );
	}

	/** 
	 * Returns all rows from the log_error table that match the criteria 'log_Name = :logName'.
	 */
	public LogError[] findWhereLogNameEquals(String logName) throws LogErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE log_Name = ? ORDER BY log_Name", new Object[] { logName } );
	}

	/** 
	 * Returns all rows from the log_error table that match the criteria 'Message = :message'.
	 */
	public LogError[] findWhereMessageEquals(String message) throws LogErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Message = ? ORDER BY Message", new Object[] { message } );
	}

	/** 
	 * Returns all rows from the log_error table that match the criteria 'Date = :date'.
	 */
	public LogError[] findWhereDateEquals(Date date) throws LogErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Date = ? ORDER BY Date", new Object[] { date==null ? null : new java.sql.Timestamp( date.getTime() ) } );
	}

	/** 
	 * Returns all rows from the log_error table that match the criteria 'User = :user'.
	 */
	public LogError[] findWhereUserEquals(String user) throws LogErrorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE User = ? ORDER BY User", new Object[] { user } );
	}

	/**
	 * Method 'LogErrorDaoImpl'
	 * 
	 */
	public LogErrorDaoImpl()
	{
	}

	/**
	 * Method 'LogErrorDaoImpl'
	 * 
	 * @param userConn
	 */
	public LogErrorDaoImpl(final java.sql.Connection userConn)
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
		return "eon.log_error";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected LogError fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			LogError dto = new LogError();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected LogError[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			LogError dto = new LogError();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		LogError ret[] = new LogError[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(LogError dto, ResultSet rs) throws SQLException
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
	protected void reset(LogError dto)
	{
	}

	/** 
	 * Returns all rows from the log_error table that match the specified arbitrary SQL statement
	 */
	public LogError[] findByDynamicSelect(String sql, Object[] sqlParams) throws LogErrorDaoException
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
			throw new LogErrorDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the log_error table that match the specified arbitrary SQL statement
	 */
	public LogError[] findByDynamicWhere(String sql, Object[] sqlParams) throws LogErrorDaoException
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
			throw new LogErrorDaoException( "Exception: " + _e.getMessage(), _e );
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