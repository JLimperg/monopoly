package monopoly;

import java.util.Collection;

public interface IField {
	/**
	 * determine action to be taken by player arriving on field
	 * @param current player whose turn it is
	 * @param others  players who are just watching
	 * @param dice
	 * @return the IAction that has to be taken or null if no action necessary
	 */
	public IAction action(Player current, Collection<Player> others, IDice dice);
}
