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
public class SubjectJDBCTemplateTest {
	
	public SubjectJDBCTemplateTest() {
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
	 * Test of setDataSource method, of class SubjectJDBCTemplate.
	 */
	@Test
	public void testSetDataSource() {
		System.out.println("setDataSource");
		DataSource dataSource = null;
		SubjectJDBCTemplate instance = new SubjectJDBCTemplate();
		instance.setDataSource(dataSource);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getSubject method, of class SubjectJDBCTemplate.
	 */
	@Test
	public void testGetSubject() {
		System.out.println("getSubject");
		int subjectCode = 0;
		SubjectJDBCTemplate instance = new SubjectJDBCTemplate();
		Subject expResult = null;
		Subject result = instance.getSubject(subjectCode);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of listSubjects method, of class SubjectJDBCTemplate.
	 */
	@Test
	public void testListSubjects() {
		System.out.println("listSubjects");
		SubjectJDBCTemplate instance = new SubjectJDBCTemplate();
		List expResult = null;
		List result = instance.listSubjects();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}