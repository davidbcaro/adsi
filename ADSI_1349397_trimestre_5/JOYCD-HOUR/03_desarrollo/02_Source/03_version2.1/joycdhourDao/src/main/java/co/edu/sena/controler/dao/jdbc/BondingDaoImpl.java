/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.controler.dao.jdbc;

import co.edu.sena.controler.dao.dao.*;
import co.edu.sena.controler.dao.factory.*;
import co.edu.sena.controler.dao.dto.*;
import co.edu.sena.controler.dao.exceptions.*;
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

public class BondingDaoImpl extends AbstractDAO implements BondingDao
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
	protected final String SQL_SELECT = "SELECT type_bonding, hours, status FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( type_bonding, hours, status ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET type_bonding = ?, hours = ?, status = ? WHERE type_bonding = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE type_bonding = ?";

	/** 
	 * Index of column type_bonding
	 */
	protected static final int COLUMN_TYPE_BONDING = 1;

	/** 
	 * Index of column hours
	 */
	protected static final int COLUMN_HOURS = 2;

	/** 
	 * Index of column status
	 */
	protected static final int COLUMN_STATUS = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column type_bonding
	 */
	protected static final int PK_COLUMN_TYPE_BONDING = 1;

	/** 
	 * Inserts a new row in the bonding table.
	 */
	public BondingPk insert(Bonding dto) throws BondingDaoException
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
			stmt.setString( index++, dto.getTypeBonding() );
			stmt.setInt( index++, dto.getHours() );
			stmt.setShort( index++, dto.getStatus() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BondingDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the bonding table.
	 */
	public void update(BondingPk pk, Bonding dto) throws BondingDaoException
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
			stmt.setString( index++, dto.getTypeBonding() );
			stmt.setInt( index++, dto.getHours() );
			stmt.setShort( index++, dto.getStatus() );
			stmt.setString( 4, pk.getTypeBonding() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BondingDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the bonding table.
	 */
	public void delete(BondingPk pk) throws BondingDaoException
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
			stmt.setString( 1, pk.getTypeBonding() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new BondingDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the bonding table that matches the specified primary-key value.
	 */
	public Bonding findByPrimaryKey(BondingPk pk) throws BondingDaoException
	{
		return findByPrimaryKey( pk.getTypeBonding() );
	}

	/** 
	 * Returns all rows from the bonding table that match the criteria 'type_bonding = :typeBonding'.
	 */
	public Bonding findByPrimaryKey(String typeBonding) throws BondingDaoException
	{
		Bonding ret[] = findByDynamicSelect( SQL_SELECT + " WHERE type_bonding = ?", new Object[] { typeBonding } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the bonding table that match the criteria ''.
	 */
	public Bonding[] findAll() throws BondingDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY type_bonding", null );
	}

	/** 
	 * Returns all rows from the bonding table that match the criteria 'type_bonding = :typeBonding'.
	 */
	public Bonding[] findWhereTypeBondingEquals(String typeBonding) throws BondingDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE type_bonding = ? ORDER BY type_bonding", new Object[] { typeBonding } );
	}

	/** 
	 * Returns all rows from the bonding table that match the criteria 'hours = :hours'.
	 */
	public Bonding[] findWhereHoursEquals(int hours) throws BondingDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE hours = ? ORDER BY hours", new Object[] {  new Integer(hours) } );
	}

	/** 
	 * Returns all rows from the bonding table that match the criteria 'status = :status'.
	 */
	public Bonding[] findWhereStatusEquals(short status) throws BondingDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE status = ? ORDER BY status", new Object[] {  new Short(status) } );
	}

	/**
	 * Method 'BondingDaoImpl'
	 * 
	 */
	public BondingDaoImpl()
	{
	}

	/**
	 * Method 'BondingDaoImpl'
	 * 
	 * @param userConn
	 */
	public BondingDaoImpl(final java.sql.Connection userConn)
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
		return "joycd.bonding";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Bonding fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Bonding dto = new Bonding();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Bonding[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Bonding dto = new Bonding();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Bonding ret[] = new Bonding[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Bonding dto, ResultSet rs) throws SQLException
	{
		dto.setTypeBonding( rs.getString( COLUMN_TYPE_BONDING ) );
		dto.setHours( rs.getInt( COLUMN_HOURS ) );
		dto.setStatus( rs.getShort( COLUMN_STATUS ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Bonding dto)
	{
	}

	/** 
	 * Returns all rows from the bonding table that match the specified arbitrary SQL statement
	 */
	public Bonding[] findByDynamicSelect(String sql, Object[] sqlParams) throws BondingDaoException
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
			throw new BondingDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the bonding table that match the specified arbitrary SQL statement
	 */
	public Bonding[] findByDynamicWhere(String sql, Object[] sqlParams) throws BondingDaoException
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
			throw new BondingDaoException( "Exception: " + _e.getMessage(), _e );
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
