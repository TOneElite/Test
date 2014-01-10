/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teamone.domain;

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
public class UserRightsJDBCTemplateTest {
	
	public UserRightsJDBCTemplateTest() {
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
	 * Test of setDataSource method, of class UserRightsJDBCTemplate.
	 */
	@Test
	public void testSetDataSource() {
		System.out.println("setDataSource");
		DataSource dataSource = null;
		UserRightsJDBCTemplate instance = new UserRightsJDBCTemplate();
		instance.setDataSource(dataSource);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getUserRight method, of class UserRightsJDBCTemplate.
	 */
	@Test
	public void testGetUserRight() {
		System.out.println("getUserRight");
		int user_id = 0;
		UserRightsJDBCTemplate instance = new UserRightsJDBCTemplate();
		UserRights expResult = null;
		UserRights result = instance.getUserRight(user_id);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}