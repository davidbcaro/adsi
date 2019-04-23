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

public class ProgramDaoImpl extends AbstractDAO implements ProgramDao
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
	protected final String SQL_SELECT = "SELECT program_Code, name, version, initials, state, training_Level FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( program_Code, name, version, initials, state, training_Level ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET program_Code = ?, name = ?, version = ?, initials = ?, state = ?, training_Level = ? WHERE program_Code = ? AND version = ? AND training_Level = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE program_Code = ? AND version = ? AND training_Level = ?";

	/** 
	 * Index of column program_Code
	 */
	protected static final int COLUMN_PROGRAM_CODE = 1;

	/** 
	 * Index of column name
	 */
	protected static final int COLUMN_NAME = 2;

	/** 
	 * Index of column version
	 */
	protected static final int COLUMN_VERSION = 3;

	/** 
	 * Index of column initials
	 */
	protected static final int COLUMN_INITIALS = 4;

	/** 
	 * Index of column state
	 */
	protected static final int COLUMN_STATE = 5;

	/** 
	 * Index of column training_Level
	 */
	protected static final int COLUMN_TRAINING_LEVEL = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column program_Code
	 */
	protected static final int PK_COLUMN_PROGRAM_CODE = 1;

	/** 
	 * Index of primary-key column version
	 */
	protected static final int PK_COLUMN_VERSION = 2;

	/** 
	 * Index of primary-key column training_Level
	 */
	protected static final int PK_COLUMN_TRAINING_LEVEL = 3;

	/** 
	 * Inserts a new row in the program table.
	 */
	public ProgramPk insert(Program dto) throws ProgramDaoException
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
			stmt.setString( index++, dto.getProgramCode() );
			stmt.setString( index++, dto.getName() );
			stmt.setString( index++, dto.getVersion() );
			stmt.setString( index++, dto.getInitials() );
			if (dto.isStateNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setShort( index++, dto.getState() );
			}
		
			stmt.setString( index++, dto.getTrainingLevel() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ProgramDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the program table.
	 */
	public void update(ProgramPk pk, Program dto) throws ProgramDaoException
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
			stmt.setString( index++, dto.getProgramCode() );
			stmt.setString( index++, dto.getName() );
			stmt.setString( index++, dto.getVersion() );
			stmt.setString( index++, dto.getInitials() );
			if (dto.isStateNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setShort( index++, dto.getState() );
			}
		
			stmt.setString( index++, dto.getTrainingLevel() );
			stmt.setString( 7, pk.getProgramCode() );
			stmt.setString( 8, pk.getVersion() );
			stmt.setString( 9, pk.getTrainingLevel() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ProgramDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the program table.
	 */
	public void delete(ProgramPk pk) throws ProgramDaoException
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
			stmt.setString( 1, pk.getProgramCode() );
			stmt.setString( 2, pk.getVersion() );
			stmt.setString( 3, pk.getTrainingLevel() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ProgramDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the program table that matches the specified primary-key value.
	 */
	public Program findByPrimaryKey(ProgramPk pk) throws ProgramDaoException
	{
		return findByPrimaryKey( pk.getProgramCode(), pk.getVersion(), pk.getTrainingLevel() );
	}

	/** 
	 * Returns all rows from the program table that match the criteria 'program_Code = :programCode AND version = :version AND training_Level = :trainingLevel'.
	 */
	public Program findByPrimaryKey(String programCode, String version, String trainingLevel) throws ProgramDaoException
	{
		Program ret[] = findByDynamicSelect( SQL_SELECT + " WHERE program_Code = ? AND version = ? AND training_Level = ?", new Object[] { programCode, version, trainingLevel } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the program table that match the criteria ''.
	 */
	public Program[] findAll() throws ProgramDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY program_Code, version, training_Level", null );
	}

	/** 
	 * Returns all rows from the program table that match the criteria 'training_Level = :trainingLevel'.
	 */
	public Program[] findByTrainingLevel(String trainingLevel) throws ProgramDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE training_Level = ?", new Object[] { trainingLevel } );
	}

	/** 
	 * Returns all rows from the program table that match the criteria 'program_Code = :programCode'.
	 */
	public Program[] findWhereProgramCodeEquals(String programCode) throws ProgramDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE program_Code = ? ORDER BY program_Code", new Object[] { programCode } );
	}

	/** 
	 * Returns all rows from the program table that match the criteria 'name = :name'.
	 */
	public Program[] findWhereNameEquals(String name) throws ProgramDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE name = ? ORDER BY name", new Object[] { name } );
	}

	/** 
	 * Returns all rows from the program table that match the criteria 'version = :version'.
	 */
	public Program[] findWhereVersionEquals(String version) throws ProgramDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE version = ? ORDER BY version", new Object[] { version } );
	}

	/** 
	 * Returns all rows from the program table that match the criteria 'initials = :initials'.
	 */
	public Program[] findWhereInitialsEquals(String initials) throws ProgramDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE initials = ? ORDER BY initials", new Object[] { initials } );
	}

	/** 
	 * Returns all rows from the program table that match the criteria 'state = :state'.
	 */
	public Program[] findWhereStateEquals(short state) throws ProgramDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE state = ? ORDER BY state", new Object[] {  new Short(state) } );
	}

	/** 
	 * Returns all rows from the program table that match the criteria 'training_Level = :trainingLevel'.
	 */
	public Program[] findWhereTrainingLevelEquals(String trainingLevel) throws ProgramDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE training_Level = ? ORDER BY training_Level", new Object[] { trainingLevel } );
	}

	/**
	 * Method 'ProgramDaoImpl'
	 * 
	 */
	public ProgramDaoImpl()
	{
	}

	/**
	 * Method 'ProgramDaoImpl'
	 * 
	 * @param userConn
	 */
	public ProgramDaoImpl(final java.sql.Connection userConn)
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
		return "wariosoft.program";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Program fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Program dto = new Program();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Program[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Program dto = new Program();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Program ret[] = new Program[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Program dto, ResultSet rs) throws SQLException
	{
		dto.setProgramCode( rs.getString( COLUMN_PROGRAM_CODE ) );
		dto.setName( rs.getString( COLUMN_NAME ) );
		dto.setVersion( rs.getString( COLUMN_VERSION ) );
		dto.setInitials( rs.getString( COLUMN_INITIALS ) );
		dto.setState( rs.getShort( COLUMN_STATE ) );
		if (rs.wasNull()) {
			dto.setStateNull( true );
		}
		
		dto.setTrainingLevel( rs.getString( COLUMN_TRAINING_LEVEL ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Program dto)
	{
	}

	/** 
	 * Returns all rows from the program table that match the specified arbitrary SQL statement
	 */
	public Program[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProgramDaoException
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
			throw new ProgramDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the program table that match the specified arbitrary SQL statement
	 */
	public Program[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProgramDaoException
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
			throw new ProgramDaoException( "Exception: " + _e.getMessage(), _e );
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
