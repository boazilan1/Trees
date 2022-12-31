import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void size() {
		Tree tree = new Tree();
		Assertions.assertEquals(0, tree.size());
		tree.add(1);
		Assertions.assertEquals(1, tree.size());
		tree.add(2);
		Assertions.assertEquals(2, tree.size());
	}
	
	@Test
	void isEmpty() {
		Tree tree = new Tree();
		Assertions.assertTrue(tree.isEmpty());
		tree.add(1);
		Assertions.assertFalse(tree.isEmpty());		
	}
	@Test
	void get() {
		Tree tree = new Tree();
		tree.add(1);
		Assertions.assertEquals(1,tree.get(1));
		tree.add(2);
		Assertions.assertEquals(2,tree.get(2));
		
		Assertions.assertEquals(2,tree.get(3));
	}
	

}
