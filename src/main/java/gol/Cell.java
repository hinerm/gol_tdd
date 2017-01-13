package gol;

import java.util.List;

/**
 * An individual unit of life in the universe
 */
public interface Cell {

	/**
	 * Advance a step in time, updating the value of {@link #getStatus()} based on this cell's
	 * neighbors.
	 */
	public void step(List<Cell> neighbors);

	/**
	 * @return 0 if dead from underpopulation, 1 if survives, 2 if dead from overpopulation, 3 if reproduced
	 */
	public int getStatus();
}
