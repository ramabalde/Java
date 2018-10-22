package tournament.entities;

public class VictoryCry implements Cry {
	
	private String cry;
		
		public VictoryCry (String cry) {
			this.cry = cry;
		}
		
		/* (non-Javadoc)
		 * @see tournament.entities.Cry#cry(tournament.entities.Pokemon)
		 */
		@Override
		public String cry() {
			return this.cry;
		}
	
		/* (non-Javadoc)
		 * @see tournament.entities.Cry#isPossible(tournament.entities.Pokemon)
		 */
		@Override
		public boolean isPossible(Pokemon pokemon) {
			return !pokemon.isBeginningFight() && pokemon.isAlive();
		}

}
