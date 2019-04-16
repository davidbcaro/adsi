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

public class ModalityDaoImpl extends AbstractDAO implements ModalityDao
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
	protected final String SQL_SELECT = "SELECT modality_Name, State FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( modality_Name, State ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET modality_Name = ?, State = ? WHERE modality_Name = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE modality_Name = ?";

	/** 
	 * Index of column modality_Name
	 */
	protected static final int COLUMN_MODALITY_NAME = 1;

	/** 
	 * Index of column State
	 */
	protected static final int COLUMN_STATE = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column modality_Name
	 */
	protected static final int PK_COLUMN_MODALITY_NAME = 1;

	/** 
	 * Inserts a new row in the modality table.
	 */
	public ModalityPk insert(Modality dto) throws ModalityDaoException
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
			stmt.setString( index++, dto.getModalityName() );
			if (dto.isStateNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setShort( index++, dto.getState() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ModalityDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the modality table.
	 */
	public void update(ModalityPk pk, Modality dto) throws ModalityDaoException
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
			stmt.setString( index++, dto.getModalityName() );
			if (dto.isStateNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setShort( index++, dto.getState() );
			}
		
			stmt.setString( 3, pk.getModalityName() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ModalityDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the modality table.
	 */
	public void delete(ModalityPk pk) throws ModalityDaoException
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
			stmt.setString( 1, pk.getModalityName() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ModalityDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the modality table that matches the specified primary-key value.
	 */
	public Modality findByPrimaryKey(ModalityPk pk) throws ModalityDaoException
	{
		return findByPrimaryKey( pk.getModalityName() );
	}

	/** 
	 * Returns all rows from the modality table that match the criteria 'modality_Name = :modalityName'.
	 */
	public Modality findByPrimaryKey(String modalityName) throws ModalityDaoException
	{
		Modality ret[] = findByDynamicSelect( SQL_SELECT + " WHERE modality_Name = ?", new Object[] { modalityName } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the modality table that match the criteria ''.
	 */
	public Modality[] findAll() throws ModalityDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY modality_Name", null );
	}

	/** 
	 * Returns all rows from the modality table that match the criteria 'modality_Name = :modalityName'.
	 */
	public Modality[] findWhereModalityNameEquals(String modalityName) throws ModalityDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE modality_Name = ? ORDER BY modality_Name", new Object[] { modalityName } );
	}

	/** 
	 * Returns all rows from the modality table that match the criteria 'State = :state'.
	 */
	public Modality[] findWhereStateEquals(short state) throws ModalityDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE State = ? ORDER BY State", new Object[] {  new Short(state) } );
	}

	/**
	 * Method 'ModalityDaoImpl'
	 * 
	 */
	public ModalityDaoImpl()
	{
	}

	/**
	 * Method 'ModalityDaoImpl'
	 * 
	 * @param userConn
	 */
	public ModalityDaoImpl(final java.sql.Connection userConn)
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
		return "eon.modality";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Modality fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Modality dto = new Modality();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Modality[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Modality dto = new Modality();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Modality ret[] = new Modality[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Modality dto, ResultSet rs) throws SQLException
	{
		dto.setModalityName( rs.getString( COLUMN_MODALITY_NAME ) );
		dto.setState( rs.getShort( COLUMN_STATE ) );
		if (rs.wasNull()) {
			dto.setStateNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Modality dto)
	{
	}

	/** 
	 * Returns all rows from the modality table that match the specified arbitrary SQL statement
	 */
	public Modality[] findByDynamicSelect(String sql, Object[] sqlParams) throws ModalityDaoException
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
			throw new ModalityDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the modality table that match the specified arbitrary SQL statement
	 */
	public Modality[] findByDynamicWhere(String sql, Object[] sqlParams) throws ModalityDaoException
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
			throw new ModalityDaoException( "Exception: " + _e.getMessage(), _e );
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