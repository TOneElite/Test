/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teamone.domain;

import java.util.List;
import javax.sql.DataSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kim
 */
public class UserJDBCTemplateTest {
	
	public UserJDBCTemplateTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of setDataSource method, of class UserJDBCTemplate.
	 */
	@Test
	public void testSetDataSource() {
		System.out.println("setDataSource");
		DataSource dataSource = null;
		UserJDBCTemplate instance = new UserJDBCTemplate();
		instance.setDataSource(dataSource);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getUser method, of class UserJDBCTemplate.
	 */
	@Test
	public void testGetUser() {
		System.out.println("getUser");
		int userID = 0;
		UserJDBCTemplate instance = new UserJDBCTemplate();
		User expResult = null;
		User result = instance.getUser(userID);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of listUsers method, of class UserJDBCTemplate.
	 */
	@Test
	public void testListUsers() {
		System.out.println("listUsers");
		UserJDBCTemplate instance = new UserJDBCTemplate();
		List expResult = null;
		List result = instance.listUsers();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}