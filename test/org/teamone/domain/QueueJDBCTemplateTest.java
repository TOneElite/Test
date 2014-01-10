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
public class QueueJDBCTemplateTest {
	
	public QueueJDBCTemplateTest() {
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
	 * Test of setDataSource method, of class QueueJDBCTemplate.
	 */
	@Test
	public void testSetDataSource() {
		System.out.println("setDataSource");
		DataSource dataSource = null;
		QueueJDBCTemplate instance = new QueueJDBCTemplate();
		instance.setDataSource(dataSource);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getQueue method, of class QueueJDBCTemplate.
	 */
	@Test
	public void testGetQueue() {
		System.out.println("getQueue");
		int ID = 0;
		QueueJDBCTemplate instance = new QueueJDBCTemplate();
		Queue expResult = null;
		Queue result = instance.getQueue(ID);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of listQueue method, of class QueueJDBCTemplate.
	 */
	@Test
	public void testListQueue() {
		System.out.println("listQueue");
		QueueJDBCTemplate instance = new QueueJDBCTemplate();
		List expResult = null;
		List result = instance.listQueue();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of delete method, of class QueueJDBCTemplate.
	 */
	@Test
	public void testDelete() {
		System.out.println("delete");
		int id = 0;
		QueueJDBCTemplate instance = new QueueJDBCTemplate();
		instance.delete(id);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of update method, of class QueueJDBCTemplate.
	 */
	@Test
	public void testUpdate() {
		System.out.println("update");
		Queue queue = null;
		QueueJDBCTemplate instance = new QueueJDBCTemplate();
		instance.update(queue);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of create method, of class QueueJDBCTemplate.
	 */
	@Test
	public void testCreate() {
		System.out.println("create");
		Queue queue = null;
		QueueJDBCTemplate instance = new QueueJDBCTemplate();
		instance.create(queue);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}