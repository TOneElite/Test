/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.teamone.domain;

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
public class SubjectTest {
	
	public SubjectTest() {
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
	 * Test of getCode method, of class Subject.
	 */
	@Test
	public void testGetCode() {
		System.out.println("getCode");
		Subject instance = new Subject();
		int expResult = 0;
		String result = instance.getCode();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setCode method, of class Subject.
	 */
	@Test
	public void testSetCode() {
		System.out.println("setCode");
		String code = "";
		Subject instance = new Subject();
		instance.setCode(code);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getName method, of class Subject.
	 */
	@Test
	public void testGetName() {
		System.out.println("getName");
		Subject instance = new Subject();
		String expResult = "";
		String result = instance.getName();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setName method, of class Subject.
	 */
	@Test
	public void testSetName() {
		System.out.println("setName");
		String name = "";
		Subject instance = new Subject();
		instance.setName(name);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getStatus method, of class Subject.
	 */
	@Test
	public void testGetStatus() {
		System.out.println("getStatus");
		Subject instance = new Subject();
		int expResult = 0;
		int result = instance.getStatus();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setStatus method, of class Subject.
	 */
	@Test
	public void testSetStatus() {
		System.out.println("setStatus");
		int status = 0;
		Subject instance = new Subject();
		instance.setStatus(status);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of toString method, of class Subject.
	 */
	@Test
	public void testToString() {
		System.out.println("toString");
		Subject instance = new Subject();
		String expResult = "";
		String result = instance.toString();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}