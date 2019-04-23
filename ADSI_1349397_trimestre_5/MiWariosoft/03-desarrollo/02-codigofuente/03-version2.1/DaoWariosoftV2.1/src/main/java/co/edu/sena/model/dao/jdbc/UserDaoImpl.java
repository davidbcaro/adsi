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

public class UserDaoImpl extends AbstractDAO implements UserDao
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
	protected final String SQL_SELECT = "SELECT email, password, date_Terminate, id_Document, document_Number FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( email, password, date_Terminate, id_Document, document_Number ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET email = ?, password = ?, date_Terminate = ?, id_Document = ?, document_Number = ? WHERE id_Document = ? AND document_Number = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_Document = ? AND document_Number = ?";

	/** 
	 * Index of column email
	 */
	protected static final int COLUMN_EMAIL = 1;

	/** 
	 * Index of column password
	 */
	protected static final int COLUMN_PASSWORD = 2;

	/** 
	 * Index of column date_Terminate
	 */
	protected static final int COLUMN_DATE_TERMINATE = 3;

	/** 
	 * Index of column id_Document
	 */
	protected static final int COLUMN_ID_DOCUMENT = 4;

	/** 
	 * Index of column document_Number
	 */
	protected static final int COLUMN_DOCUMENT_NUMBER = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column id_Document
	 */
	protected static final int PK_COLUMN_ID_DOCUMENT = 1;

	/** 
	 * Index of primary-key column document_Number
	 */
	protected static final int PK_COLUMN_DOCUMENT_NUMBER = 2;

	/** 
	 * Inserts a new row in the user table.
	 */
	public UserPk insert(User dto) throws UserDaoException
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
			stmt.setString( index++, dto.getEmail() );
			stmt.setString( index++, dto.getPassword() );
			stmt.setString( index++, dto.getDateTerminate() );
			stmt.setString( index++, dto.getIdDocument() );
			stmt.setString( index++, dto.getDocumentNumber() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UserDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the user table.
	 */
	public void update(UserPk pk, User dto) throws UserDaoException
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
			stmt.setString( index++, dto.getEmail() );
			stmt.setString( index++, dto.getPassword() );
			stmt.setString( index++, dto.getDateTerminate() );
			stmt.setString( index++, dto.getIdDocument() );
			stmt.setString( index++, dto.getDocumentNumber() );
			stmt.setString( 6, pk.getIdDocument() );
			stmt.setString( 7, pk.getDocumentNumber() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UserDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the user table.
	 */
	public void delete(UserPk pk) throws UserDaoException
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
			stmt.setString( 1, pk.getIdDocument() );
			stmt.setString( 2, pk.getDocumentNumber() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UserDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the user table that matches the specified primary-key value.
	 */
	public User findByPrimaryKey(UserPk pk) throws UserDaoException
	{
		return findByPrimaryKey( pk.getIdDocument(), pk.getDocumentNumber() );
	}

	/** 
	 * Returns all rows from the user table that match the criteria 'id_Document = :idDocument AND document_Number = :documentNumber'.
	 */
	public User findByPrimaryKey(String idDocument, String documentNumber) throws UserDaoException
	{
		User ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_Document = ? AND document_Number = ?", new Object[] { idDocument, documentNumber } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the user table that match the criteria ''.
	 */
	public User[] findAll() throws UserDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_Document, document_Number", null );
	}

	/** 
	 * Returns all rows from the user table that match the criteria 'id_Document = :idDocument AND document_Number = :documentNumber'.
	 */
	public User[] findByClient(String idDocument, String documentNumber) throws UserDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_Document = ? AND document_Number = ?", new Object[] { idDocument, documentNumber } );
	}

	/** 
	 * Returns all rows from the user table that match the criteria 'email = :email'.
	 */
	public User[] findWhereEmailEquals(String email) throws UserDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE email = ? ORDER BY email", new Object[] { email } );
	}

	/** 
	 * Returns all rows from the user table that match the criteria 'password = :password'.
	 */
	public User[] findWherePasswordEquals(String password) throws UserDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE password = ? ORDER BY password", new Object[] { password } );
	}

	/** 
	 * Returns all rows from the user table that match the criteria 'date_Terminate = :dateTerminate'.
	 */
	public User[] findWhereDateTerminateEquals(String dateTerminate) throws UserDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE date_Terminate = ? ORDER BY date_Terminate", new Object[] { dateTerminate } );
	}

	/** 
	 * Returns all rows from the user table that match the criteria 'id_Document = :idDocument'.
	 */
	public User[] findWhereIdDocumentEquals(String idDocument) throws UserDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_Document = ? ORDER BY id_Document", new Object[] { idDocument } );
	}

	/** 
	 * Returns all rows from the user table that match the criteria 'document_Number = :documentNumber'.
	 */
	public User[] findWhereDocumentNumberEquals(String documentNumber) throws UserDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE document_Number = ? ORDER BY document_Number", new Object[] { documentNumber } );
	}

	/**
	 * Method 'UserDaoImpl'
	 * 
	 */
	public UserDaoImpl()
	{
	}

	/**
	 * Method 'UserDaoImpl'
	 * 
	 * @param userConn
	 */
	public UserDaoImpl(final java.sql.Connection userConn)
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
		return "wariosoft.user";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected User fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			User dto = new User();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected User[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			User dto = new User();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		User ret[] = new User[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(User dto, ResultSet rs) throws SQLException
	{
		dto.setEmail( rs.getString( COLUMN_EMAIL ) );
		dto.setPassword( rs.getString( COLUMN_PASSWORD ) );
		dto.setDateTerminate( rs.getString( COLUMN_DATE_TERMINATE ) );
		dto.setIdDocument( rs.getString( COLUMN_ID_DOCUMENT ) );
		dto.setDocumentNumber( rs.getString( COLUMN_DOCUMENT_NUMBER ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(User dto)
	{
	}

	/** 
	 * Returns all rows from the user table that match the specified arbitrary SQL statement
	 */
	public User[] findByDynamicSelect(String sql, Object[] sqlParams) throws UserDaoException
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
			throw new UserDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the user table that match the specified arbitrary SQL statement
	 */
	public User[] findByDynamicWhere(String sql, Object[] sqlParams) throws UserDaoException
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
			throw new UserDaoException( "Exception: " + _e.getMessage(), _e );
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
