/**
 * 
 */
package tournament;
import java.util.*;

import tournament.entities.*;

/**
 * @author bah01
 *
 */
public class PokemonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Tournament tournament = new Tournament(16);
		// initialisation des cris
		List<Cry> cries = new ArrayList<Cry>();
		cries.add(new StartingCry("hahahahaha"));
		cries.add(new DefeateCry("noooooooooo"));
		cries.add(new VictoryCry("yeaaaaaaaah"));
		
		/** Exemple
		
		List<Cry> cries2 = new ArrayList<Cry>();
		cries.add(new StartingCry("hahahahaha"));
		cries.add(new DefeateCry("noooooooooo"));
		cries.add(new VictoryCry("yeaaaaaaaah")); 
		
		*/
		
		// creation et ajout des pokemons
		tournament.addPokemon(new Pokemon("Brindibou", 60, 15, cries));
		tournament.addPokemon(new Pokemon("Effeche", 65, 13, cries));
		tournament.addPokemon(new Pokemon("Archeduc", 70, 15, cries));
		tournament.addPokemon(new Pokemon("Flamiaou", 50, 20, cries));
		tournament.addPokemon(new Pokemon("Matoufeu", 65, 12, cries));
		tournament.addPokemon(new Pokemon("Felinferno", 50, 17, cries));
		tournament.addPokemon(new Pokemon("Otaquin", 60, 15, cries));
		tournament.addPokemon(new Pokemon("Otarlette", 50, 25, cries));
		tournament.addPokemon(new Pokemon("Oratori", 70, 15, cries));
		tournament.addPokemon(new Pokemon("Picassaut", 60, 10, cries));
		tournament.addPokemon(new Pokemon("Piclairon", 50, 20, cries));
		tournament.addPokemon(new Pokemon("Bazoucan", 65, 17, cries));
		tournament.addPokemon(new Pokemon("Manglouton", 70, 20, cries));
		tournament.addPokemon(new Pokemon("Argouste", 65, 18, cries));
		tournament.addPokemon(new Pokemon("Larvibule", 50, 30, cries));
		tournament.addPokemon(new Pokemon("Chrysapile", 30, 25, cries));
		tournament.addPokemon(new Pokemon("Pikachu", 60, 15, cries));
		
		while (!tournament.isFinished()) {
			Map<Integer, List<Pokemon>> duels = tournament.getDuels();
			for (Integer i : duels.keySet()) {
				List<Pokemon> pokemons = duels.get(i);
				tournament.fight(pokemons.get(0), pokemons.get(1));
			}
		}
		System.out.println(tournament.getPokemons().get(0).getName() + " wins this tournament :-) ");
	}

}
