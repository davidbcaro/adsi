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

public class IdentificationCardDaoImpl extends AbstractDAO implements IdentificationCardDao
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
	protected final String SQL_SELECT = "SELECT id_identification_card_number, name, status FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_identification_card_number, name, status ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_identification_card_number = ?, name = ?, status = ? WHERE id_identification_card_number = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_identification_card_number = ?";

	/** 
	 * Index of column id_identification_card_number
	 */
	protected static final int COLUMN_ID_IDENTIFICATION_CARD_NUMBER = 1;

	/** 
	 * Index of column name
	 */
	protected static final int COLUMN_NAME = 2;

	/** 
	 * Index of column status
	 */
	protected static final int COLUMN_STATUS = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column id_identification_card_number
	 */
	protected static final int PK_COLUMN_ID_IDENTIFICATION_CARD_NUMBER = 1;

	/** 
	 * Inserts a new row in the identification_card table.
	 */
	public IdentificationCardPk insert(IdentificationCard dto) throws IdentificationCardDaoException
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
			stmt.setString( index++, dto.getIdIdentificationCardNumber() );
			stmt.setString( index++, dto.getName() );
			if (dto.isStatusNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setShort( index++, dto.getStatus() );
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
			throw new IdentificationCardDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the identification_card table.
	 */
	public void update(IdentificationCardPk pk, IdentificationCard dto) throws IdentificationCardDaoException
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
			stmt.setString( index++, dto.getIdIdentificationCardNumber() );
			stmt.setString( index++, dto.getName() );
			if (dto.isStatusNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setShort( index++, dto.getStatus() );
			}
		
			stmt.setString( 4, pk.getIdIdentificationCardNumber() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new IdentificationCardDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the identification_card table.
	 */
	public void delete(IdentificationCardPk pk) throws IdentificationCardDaoException
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
			stmt.setString( 1, pk.getIdIdentificationCardNumber() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new IdentificationCardDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the identification_card table that matches the specified primary-key value.
	 */
	public IdentificationCard findByPrimaryKey(IdentificationCardPk pk) throws IdentificationCardDaoException
	{
		return findByPrimaryKey( pk.getIdIdentificationCardNumber() );
	}

	/** 
	 * Returns all rows from the identification_card table that match the criteria 'id_identification_card_number = :idIdentificationCardNumber'.
	 */
	public IdentificationCard findByPrimaryKey(String idIdentificationCardNumber) throws IdentificationCardDaoException
	{
		IdentificationCard ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_identification_card_number = ?", new Object[] { idIdentificationCardNumber } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the identification_card table that match the criteria ''.
	 */
	public IdentificationCard[] findAll() throws IdentificationCardDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_identification_card_number", null );
	}

	/** 
	 * Returns all rows from the identification_card table that match the criteria 'id_identification_card_number = :idIdentificationCardNumber'.
	 */
	public IdentificationCard[] findWhereIdIdentificationCardNumberEquals(String idIdentificationCardNumber) throws IdentificationCardDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_identification_card_number = ? ORDER BY id_identification_card_number", new Object[] { idIdentificationCardNumber } );
	}

	/** 
	 * Returns all rows from the identification_card table that match the criteria 'name = :name'.
	 */
	public IdentificationCard[] findWhereNameEquals(String name) throws IdentificationCardDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE name = ? ORDER BY name", new Object[] { name } );
	}

	/** 
	 * Returns all rows from the identification_card table that match the criteria 'status = :status'.
	 */
	public IdentificationCard[] findWhereStatusEquals(short status) throws IdentificationCardDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE status = ? ORDER BY status", new Object[] {  new Short(status) } );
	}

	/**
	 * Method 'IdentificationCardDaoImpl'
	 * 
	 */
	public IdentificationCardDaoImpl()
	{
	}

	/**
	 * Method 'IdentificationCardDaoImpl'
	 * 
	 * @param userConn
	 */
	public IdentificationCardDaoImpl(final java.sql.Connection userConn)
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
		return "joycd.identification_card";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected IdentificationCard fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			IdentificationCard dto = new IdentificationCard();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected IdentificationCard[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			IdentificationCard dto = new IdentificationCard();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		IdentificationCard ret[] = new IdentificationCard[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(IdentificationCard dto, ResultSet rs) throws SQLException
	{
		dto.setIdIdentificationCardNumber( rs.getString( COLUMN_ID_IDENTIFICATION_CARD_NUMBER ) );
		dto.setName( rs.getString( COLUMN_NAME ) );
		dto.setStatus( rs.getShort( COLUMN_STATUS ) );
		if (rs.wasNull()) {
			dto.setStatusNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(IdentificationCard dto)
	{
	}

	/** 
	 * Returns all rows from the identification_card table that match the specified arbitrary SQL statement
	 */
	public IdentificationCard[] findByDynamicSelect(String sql, Object[] sqlParams) throws IdentificationCardDaoException
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
			throw new IdentificationCardDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the identification_card table that match the specified arbitrary SQL statement
	 */
	public IdentificationCard[] findByDynamicWhere(String sql, Object[] sqlParams) throws IdentificationCardDaoException
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
			throw new IdentificationCardDaoException( "Exception: " + _e.getMessage(), _e );
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
