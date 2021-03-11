import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook gradeBook1;
	private GradeBook gradeBook2;
	
	@BeforeEach
	void setUp() throws Exception {
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);
		
		gradeBook1.addScore(80);
		gradeBook1.addScore(70);
		gradeBook2.addScore(64);
		gradeBook2.addScore(99);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue((gradeBook1.toString()).equals("80.0 70.0 "));
		assertTrue((gradeBook2.toString()).equals("64.0 99.0 "));
		
		assertEquals(2, gradeBook1.getScoreSize());
		assertEquals(2, gradeBook2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(150, gradeBook1.sum());
		assertEquals(163, gradeBook2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(70, gradeBook1.minimum());
		assertEquals(64, gradeBook2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(80, gradeBook1.finalScore());
		assertEquals(99, gradeBook2.finalScore());
	}

}
