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

public class LinkingDaoImpl extends AbstractDAO implements LinkingDao
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
	protected final String SQL_SELECT = "SELECT type_Linking, hours, state FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( type_Linking, hours, state ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET type_Linking = ?, hours = ?, state = ? WHERE type_Linking = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE type_Linking = ?";

	/** 
	 * Index of column type_Linking
	 */
	protected static final int COLUMN_TYPE_LINKING = 1;

	/** 
	 * Index of column hours
	 */
	protected static final int COLUMN_HOURS = 2;

	/** 
	 * Index of column state
	 */
	protected static final int COLUMN_STATE = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column type_Linking
	 */
	protected static final int PK_COLUMN_TYPE_LINKING = 1;

	/** 
	 * Inserts a new row in the linking table.
	 */
	public LinkingPk insert(Linking dto) throws LinkingDaoException
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
			stmt.setString( index++, dto.getTypeLinking() );
			stmt.setInt( index++, dto.getHours() );
			stmt.setShort( index++, dto.getState() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new LinkingDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the linking table.
	 */
	public void update(LinkingPk pk, Linking dto) throws LinkingDaoException
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
			stmt.setString( index++, dto.getTypeLinking() );
			stmt.setInt( index++, dto.getHours() );
			stmt.setShort( index++, dto.getState() );
			stmt.setString( 4, pk.getTypeLinking() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new LinkingDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the linking table.
	 */
	public void delete(LinkingPk pk) throws LinkingDaoException
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
			stmt.setString( 1, pk.getTypeLinking() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new LinkingDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the linking table that matches the specified primary-key value.
	 */
	public Linking findByPrimaryKey(LinkingPk pk) throws LinkingDaoException
	{
		return findByPrimaryKey( pk.getTypeLinking() );
	}

	/** 
	 * Returns all rows from the linking table that match the criteria 'type_Linking = :typeLinking'.
	 */
	public Linking findByPrimaryKey(String typeLinking) throws LinkingDaoException
	{
		Linking ret[] = findByDynamicSelect( SQL_SELECT + " WHERE type_Linking = ?", new Object[] { typeLinking } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the linking table that match the criteria ''.
	 */
	public Linking[] findAll() throws LinkingDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY type_Linking", null );
	}

	/** 
	 * Returns all rows from the linking table that match the criteria 'type_Linking = :typeLinking'.
	 */
	public Linking[] findWhereTypeLinkingEquals(String typeLinking) throws LinkingDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE type_Linking = ? ORDER BY type_Linking", new Object[] { typeLinking } );
	}

	/** 
	 * Returns all rows from the linking table that match the criteria 'hours = :hours'.
	 */
	public Linking[] findWhereHoursEquals(int hours) throws LinkingDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE hours = ? ORDER BY hours", new Object[] {  new Integer(hours) } );
	}

	/** 
	 * Returns all rows from the linking table that match the criteria 'state = :state'.
	 */
	public Linking[] findWhereStateEquals(short state) throws LinkingDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE state = ? ORDER BY state", new Object[] {  new Short(state) } );
	}

	/**
	 * Method 'LinkingDaoImpl'
	 * 
	 */
	public LinkingDaoImpl()
	{
	}

	/**
	 * Method 'LinkingDaoImpl'
	 * 
	 * @param userConn
	 */
	public LinkingDaoImpl(final java.sql.Connection userConn)
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
		return "wariosoft.linking";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Linking fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Linking dto = new Linking();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Linking[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Linking dto = new Linking();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Linking ret[] = new Linking[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Linking dto, ResultSet rs) throws SQLException
	{
		dto.setTypeLinking( rs.getString( COLUMN_TYPE_LINKING ) );
		dto.setHours( rs.getInt( COLUMN_HOURS ) );
		dto.setState( rs.getShort( COLUMN_STATE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Linking dto)
	{
	}

	/** 
	 * Returns all rows from the linking table that match the specified arbitrary SQL statement
	 */
	public Linking[] findByDynamicSelect(String sql, Object[] sqlParams) throws LinkingDaoException
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
			throw new LinkingDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the linking table that match the specified arbitrary SQL statement
	 */
	public Linking[] findByDynamicWhere(String sql, Object[] sqlParams) throws LinkingDaoException
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
			throw new LinkingDaoException( "Exception: " + _e.getMessage(), _e );
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
