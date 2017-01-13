package gol;

public interface Universe {

	/**
	 * Advance the game universe one step, updating the states for each cell.
	 */
	public void step();

	/**
	 * @return The {@link Cell} at the given indices.
	 */
	public Cell getCell(int x, int y);
}
