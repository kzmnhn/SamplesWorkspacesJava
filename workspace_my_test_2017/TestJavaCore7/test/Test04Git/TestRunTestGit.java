package Test04Git;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRunTestGit {

	RunTestGit git = null;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp()");
		git = new RunTestGit();
	}

	@Test
	public void testFormString() {
		assertEquals("321654", git.formString());
	}

}
