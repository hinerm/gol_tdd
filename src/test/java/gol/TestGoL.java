package gol;

import org.junit.Assert;
import org.junit.Test;

public class TestGoL {

	@Test
	public void testUnderpop() {
		Universe u = GameOfLife.startGame(3, 1, 1, 1);
		u.step();
		// The two edge cells should have died
		Assert.assertEquals(0, u.getCell(0, 0).getStatus());
		Assert.assertEquals(1, u.getCell(0, 1).getStatus());
		Assert.assertEquals(0, u.getCell(0, 2).getStatus());
	}

	@Test
	public void testReproduction() {
		Universe u = GameOfLife.startGame(3, 1, 0, 1, 0, 1, 0);
		u.step();
		// The mid cell of the first row should be spawned
		Assert.assertEquals(3, u.getCell(0, 1).getStatus());
	}

	@Test
	public void testOverpop() {
		Universe u = GameOfLife.startGame(3, 1, 1, 1, 0, 1, 0);
		u.step();
		// The mid cell of the first row should die from overpopulation
		Assert.assertEquals(2, u.getCell(0, 1).getStatus());
	}
}
