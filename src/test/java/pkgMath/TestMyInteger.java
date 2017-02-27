package pkgMath;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMyInteger() {
		
		MyInteger k1 = new MyInteger(5);
		MyInteger k2 = new MyInteger(6);
		MyInteger k3 = new MyInteger(11);
		int value = 10;
		assertFalse(k1.isEven());
		assertTrue(k2.isEven());
		assertTrue(k1.isOdd());
		assertFalse(k2.isOdd());
		assertTrue(k1.isPrime());
		assertFalse(k2.isPrime());
		assertTrue(k3.isPrime());

		
		assertTrue(MyInteger.isEven(4));
		assertFalse(MyInteger.isEven(5));
		assertTrue(MyInteger.isOdd(5));
		assertFalse(MyInteger.isOdd(6));
		assertTrue(MyInteger.isPrime(3));
		assertFalse(MyInteger.isPrime(4));
		assertFalse(MyInteger.isPrime(6));
		assertTrue(MyInteger.isPrime(11));
		
		assertTrue(MyInteger.isEven(k2));
		assertFalse(MyInteger.isEven(k1));
		assertTrue(MyInteger.isOdd(k1));
		assertFalse(MyInteger.isOdd(k2));
		assertTrue(MyInteger.isPrime(k1));
		assertFalse(MyInteger.isPrime(k2));
		assertTrue(MyInteger.isPrime(k3));
		
		assertTrue(k1.equals(5));
		assertFalse(k1.equals(6));
		
		assertTrue(k1.equals(k1));
		assertFalse(k1.equals(k2));
			}

}
