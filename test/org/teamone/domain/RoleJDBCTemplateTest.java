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
public class RoleJDBCTemplateTest {
	
	public RoleJDBCTemplateTest() {
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
	 * Test of setDataSource method, of class RoleJDBCTemplate.
	 */
	@Test
	public void testSetDataSource() {
		System.out.println("setDataSource");
		DataSource dataSource = null;
		RoleJDBCTemplate instance = new RoleJDBCTemplate();
		instance.setDataSource(dataSource);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getRole method, of class RoleJDBCTemplate.
	 */
	@Test
	public void testGetRole() {
		System.out.println("getRole");
		int role_id = 0;
		RoleJDBCTemplate instance = new RoleJDBCTemplate();
		Role expResult = null;
		Role result = instance.getRole(role_id);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}