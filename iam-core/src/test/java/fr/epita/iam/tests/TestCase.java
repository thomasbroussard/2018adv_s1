/**
 * Ce fichier est la propriété de Thomas BROUSSARD Code application : Composant :
 */
package fr.epita.iam.tests;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.iam.Identity;

/**
 * <h3>Description</h3>
 * <p>
 * This class allows to ...
 * </p>
 *
 * <h3>Usage</h3>
 * <p>
 * This class should be used as follows:
 *
 * <pre>
 * <code>${type_name} instance = new ${type_name}();</code>
 * </pre>
 * </p>
 *
 * @since $${version}
 * @see See also $${link}
 * @author ${user}
 *
 *         ${tags}
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestCase {

	private static final Logger LOGGER = LogManager.getLogger(TestCase.class);

	@Autowired
	private Identity id;

	@Autowired
	private DataSource ds;

	@BeforeClass
	public static void globalSetup() {
		LOGGER.info("globalSetup");
	}


	@Before
	public void setUp() {
		LOGGER.info("Before method");
	}

	@Test
	public void test3() {
		Assert.assertNotNull(id);
		ds.getConnection();
		LOGGER.info("test3");
	}

	@Test
	public void test() {
		LOGGER.info("test");
	}

	@Test
	public void test2() {
		LOGGER.info("test2");
	}

	@After
	public void tearDown() {
		LOGGER.debug("After method");
	}


	@AfterClass
	public static void globalTeardown() {
		LOGGER.trace("Global TearDown");
	}

}
