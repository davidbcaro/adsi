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

public class GroupNumberHasTrimesterDaoImpl extends AbstractDAO implements GroupNumberHasTrimesterDao
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
	protected final String SQL_SELECT = "SELECT groups_number, trimester_name, working_day_initials, level_formation FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( groups_number, trimester_name, working_day_initials, level_formation ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET groups_number = ?, trimester_name = ?, working_day_initials = ?, level_formation = ? WHERE groups_number = ? AND trimester_name = ? AND working_day_initials = ? AND level_formation = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE groups_number = ? AND trimester_name = ? AND working_day_initials = ? AND level_formation = ?";

	/** 
	 * Index of column groups_number
	 */
	protected static final int COLUMN_GROUPS_NUMBER = 1;

	/** 
	 * Index of column trimester_name
	 */
	protected static final int COLUMN_TRIMESTER_NAME = 2;

	/** 
	 * Index of column working_day_initials
	 */
	protected static final int COLUMN_WORKING_DAY_INITIALS = 3;

	/** 
	 * Index of column level_formation
	 */
	protected static final int COLUMN_LEVEL_FORMATION = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column groups_number
	 */
	protected static final int PK_COLUMN_GROUPS_NUMBER = 1;

	/** 
	 * Index of primary-key column trimester_name
	 */
	protected static final int PK_COLUMN_TRIMESTER_NAME = 2;

	/** 
	 * Index of primary-key column working_day_initials
	 */
	protected static final int PK_COLUMN_WORKING_DAY_INITIALS = 3;

	/** 
	 * Index of primary-key column level_formation
	 */
	protected static final int PK_COLUMN_LEVEL_FORMATION = 4;

	/** 
	 * Inserts a new row in the group_number_has_trimester table.
	 */
	public GroupNumberHasTrimesterPk insert(GroupNumberHasTrimester dto) throws GroupNumberHasTrimesterDaoException
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
			stmt.setString( index++, dto.getGroupsNumber() );
			stmt.setString( index++, dto.getTrimesterName() );
			stmt.setString( index++, dto.getWorkingDayInitials() );
			stmt.setString( index++, dto.getLevelFormation() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new GroupNumberHasTrimesterDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the group_number_has_trimester table.
	 */
	public void update(GroupNumberHasTrimesterPk pk, GroupNumberHasTrimester dto) throws GroupNumberHasTrimesterDaoException
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
			stmt.setString( index++, dto.getGroupsNumber() );
			stmt.setString( index++, dto.getTrimesterName() );
			stmt.setString( index++, dto.getWorkingDayInitials() );
			stmt.setString( index++, dto.getLevelFormation() );
			stmt.setString( 5, pk.getGroupsNumber() );
			stmt.setString( 6, pk.getTrimesterName() );
			stmt.setString( 7, pk.getWorkingDayInitials() );
			stmt.setString( 8, pk.getLevelFormation() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new GroupNumberHasTrimesterDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the group_number_has_trimester table.
	 */
	public void delete(GroupNumberHasTrimesterPk pk) throws GroupNumberHasTrimesterDaoException
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
			stmt.setString( 1, pk.getGroupsNumber() );
			stmt.setString( 2, pk.getTrimesterName() );
			stmt.setString( 3, pk.getWorkingDayInitials() );
			stmt.setString( 4, pk.getLevelFormation() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new GroupNumberHasTrimesterDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the group_number_has_trimester table that matches the specified primary-key value.
	 */
	public GroupNumberHasTrimester findByPrimaryKey(GroupNumberHasTrimesterPk pk) throws GroupNumberHasTrimesterDaoException
	{
		return findByPrimaryKey( pk.getGroupsNumber(), pk.getTrimesterName(), pk.getWorkingDayInitials(), pk.getLevelFormation() );
	}

	/** 
	 * Returns all rows from the group_number_has_trimester table that match the criteria 'groups_number = :groupsNumber AND trimester_name = :trimesterName AND working_day_initials = :workingDayInitials AND level_formation = :levelFormation'.
	 */
	public GroupNumberHasTrimester findByPrimaryKey(String groupsNumber, String trimesterName, String workingDayInitials, String levelFormation) throws GroupNumberHasTrimesterDaoException
	{
		GroupNumberHasTrimester ret[] = findByDynamicSelect( SQL_SELECT + " WHERE groups_number = ? AND trimester_name = ? AND working_day_initials = ? AND level_formation = ?", new Object[] { groupsNumber, trimesterName, workingDayInitials, levelFormation } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the group_number_has_trimester table that match the criteria ''.
	 */
	public GroupNumberHasTrimester[] findAll() throws GroupNumberHasTrimesterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY groups_number, trimester_name, working_day_initials, level_formation", null );
	}

	/** 
	 * Returns all rows from the group_number_has_trimester table that match the criteria 'groups_number = :groupsNumber'.
	 */
	public GroupNumberHasTrimester[] findByGroupNumber(String groupsNumber) throws GroupNumberHasTrimesterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE groups_number = ?", new Object[] { groupsNumber } );
	}

	/** 
	 * Returns all rows from the group_number_has_trimester table that match the criteria 'trimester_name = :trimesterName AND working_day_initials = :workingDayInitials AND level_formation = :levelFormation'.
	 */
	public GroupNumberHasTrimester[] findByTrimester(String trimesterName, String workingDayInitials, String levelFormation) throws GroupNumberHasTrimesterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE trimester_name = ? AND working_day_initials = ? AND level_formation = ?", new Object[] { trimesterName, workingDayInitials, levelFormation } );
	}

	/** 
	 * Returns all rows from the group_number_has_trimester table that match the criteria 'groups_number = :groupsNumber'.
	 */
	public GroupNumberHasTrimester[] findWhereGroupsNumberEquals(String groupsNumber) throws GroupNumberHasTrimesterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE groups_number = ? ORDER BY groups_number", new Object[] { groupsNumber } );
	}

	/** 
	 * Returns all rows from the group_number_has_trimester table that match the criteria 'trimester_name = :trimesterName'.
	 */
	public GroupNumberHasTrimester[] findWhereTrimesterNameEquals(String trimesterName) throws GroupNumberHasTrimesterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE trimester_name = ? ORDER BY trimester_name", new Object[] { trimesterName } );
	}

	/** 
	 * Returns all rows from the group_number_has_trimester table that match the criteria 'working_day_initials = :workingDayInitials'.
	 */
	public GroupNumberHasTrimester[] findWhereWorkingDayInitialsEquals(String workingDayInitials) throws GroupNumberHasTrimesterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE working_day_initials = ? ORDER BY working_day_initials", new Object[] { workingDayInitials } );
	}

	/** 
	 * Returns all rows from the group_number_has_trimester table that match the criteria 'level_formation = :levelFormation'.
	 */
	public GroupNumberHasTrimester[] findWhereLevelFormationEquals(String levelFormation) throws GroupNumberHasTrimesterDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE level_formation = ? ORDER BY level_formation", new Object[] { levelFormation } );
	}

	/**
	 * Method 'GroupNumberHasTrimesterDaoImpl'
	 * 
	 */
	public GroupNumberHasTrimesterDaoImpl()
	{
	}

	/**
	 * Method 'GroupNumberHasTrimesterDaoImpl'
	 * 
	 * @param userConn
	 */
	public GroupNumberHasTrimesterDaoImpl(final java.sql.Connection userConn)
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
		return "joycd.group_number_has_trimester";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected GroupNumberHasTrimester fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			GroupNumberHasTrimester dto = new GroupNumberHasTrimester();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected GroupNumberHasTrimester[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			GroupNumberHasTrimester dto = new GroupNumberHasTrimester();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		GroupNumberHasTrimester ret[] = new GroupNumberHasTrimester[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(GroupNumberHasTrimester dto, ResultSet rs) throws SQLException
	{
		dto.setGroupsNumber( rs.getString( COLUMN_GROUPS_NUMBER ) );
		dto.setTrimesterName( rs.getString( COLUMN_TRIMESTER_NAME ) );
		dto.setWorkingDayInitials( rs.getString( COLUMN_WORKING_DAY_INITIALS ) );
		dto.setLevelFormation( rs.getString( COLUMN_LEVEL_FORMATION ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(GroupNumberHasTrimester dto)
	{
	}

	/** 
	 * Returns all rows from the group_number_has_trimester table that match the specified arbitrary SQL statement
	 */
	public GroupNumberHasTrimester[] findByDynamicSelect(String sql, Object[] sqlParams) throws GroupNumberHasTrimesterDaoException
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
			throw new GroupNumberHasTrimesterDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the group_number_has_trimester table that match the specified arbitrary SQL statement
	 */
	public GroupNumberHasTrimester[] findByDynamicWhere(String sql, Object[] sqlParams) throws GroupNumberHasTrimesterDaoException
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
			throw new GroupNumberHasTrimesterDaoException( "Exception: " + _e.getMessage(), _e );
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
