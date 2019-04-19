/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.controler.prueba;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import co.edu.sena.controler.dao.dao.EmailServerDao;
import co.edu.sena.controler.dao.dto.EmailServer;
import co.edu.sena.controler.dao.exceptions.EmailServerDaoException;
import co.edu.sena.controler.dao.factory.EmailServerDaoFactory;

public class EmailServerDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findWhereEmailEquals("");
		// findWherePasswordEquals("");
		// findWhereSmtpHostEquals("");
		// findWhereSmtpPortEquals(0);
		// findWhereSmtpStartTlsEnableEquals(0);
		// findWhereSmtpAuthEquals(0);
		// findWhereRecoveryOrderEquals("");
		// findWhereRecoveryMessageEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			EmailServerDao _dao = getEmailServerDao();
			EmailServer _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereEmailEquals'
	 * 
	 * @param email
	 */
	public static void findWhereEmailEquals(String email)
	{
		try {
			EmailServerDao _dao = getEmailServerDao();
			EmailServer _result[] = _dao.findWhereEmailEquals(email);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWherePasswordEquals'
	 * 
	 * @param password
	 */
	public static void findWherePasswordEquals(String password)
	{
		try {
			EmailServerDao _dao = getEmailServerDao();
			EmailServer _result[] = _dao.findWherePasswordEquals(password);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSmtpHostEquals'
	 * 
	 * @param smtpHost
	 */
	public static void findWhereSmtpHostEquals(String smtpHost)
	{
		try {
			EmailServerDao _dao = getEmailServerDao();
			EmailServer _result[] = _dao.findWhereSmtpHostEquals(smtpHost);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSmtpPortEquals'
	 * 
	 * @param smtpPort
	 */
	public static void findWhereSmtpPortEquals(int smtpPort)
	{
		try {
			EmailServerDao _dao = getEmailServerDao();
			EmailServer _result[] = _dao.findWhereSmtpPortEquals(smtpPort);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSmtpStartTlsEnableEquals'
	 * 
	 * @param smtpStartTlsEnable
	 */
	public static void findWhereSmtpStartTlsEnableEquals(short smtpStartTlsEnable)
	{
		try {
			EmailServerDao _dao = getEmailServerDao();
			EmailServer _result[] = _dao.findWhereSmtpStartTlsEnableEquals(smtpStartTlsEnable);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSmtpAuthEquals'
	 * 
	 * @param smtpAuth
	 */
	public static void findWhereSmtpAuthEquals(short smtpAuth)
	{
		try {
			EmailServerDao _dao = getEmailServerDao();
			EmailServer _result[] = _dao.findWhereSmtpAuthEquals(smtpAuth);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereRecoveryOrderEquals'
	 * 
	 * @param recoveryOrder
	 */
	public static void findWhereRecoveryOrderEquals(String recoveryOrder)
	{
		try {
			EmailServerDao _dao = getEmailServerDao();
			EmailServer _result[] = _dao.findWhereRecoveryOrderEquals(recoveryOrder);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereRecoveryMessageEquals'
	 * 
	 * @param recoveryMessage
	 */
	public static void findWhereRecoveryMessageEquals(String recoveryMessage)
	{
		try {
			EmailServerDao _dao = getEmailServerDao();
			EmailServer _result[] = _dao.findWhereRecoveryMessageEquals(recoveryMessage);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getEmailServerDao'
	 * 
	 * @return EmailServerDao
	 */
	public static EmailServerDao getEmailServerDao()
	{
		return EmailServerDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(EmailServer dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getEmail() );
		buf.append( ", " );
		buf.append( dto.getPassword() );
		buf.append( ", " );
		buf.append( dto.getSmtpHost() );
		buf.append( ", " );
		buf.append( dto.getSmtpPort() );
		buf.append( ", " );
		buf.append( dto.getSmtpStartTlsEnable() );
		buf.append( ", " );
		buf.append( dto.getSmtpAuth() );
		buf.append( ", " );
		buf.append( dto.getRecoveryOrder() );
		buf.append( ", " );
		buf.append( dto.getRecoveryMessage() );
		System.out.println( buf.toString() );
	}

}
