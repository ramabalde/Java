/**
 * 
 */
package tournament.entities;

/**
 * @author bah01
 *
 */
public class StartingCry implements Cry {
	
	private String cry;
	
	public StartingCry (String cry) {
		this.cry = cry;
	}

	/* (non-Javadoc)
	 * @see tournament.entities.Cry#isPossible(tournament.entities.Pokemon)
	 */
	@Override
	public boolean isPossible(Pokemon pokemon) {
		return pokemon.isBeginningFight();
	}
	
	/* (non-Javadoc)
	 * @see tournament.entities.Cry#cry(tournament.entities.Pokemon)
	 */
	@Override
	public String cry() {
		return this.cry;
	}

}
