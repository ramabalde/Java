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
public class Tournament {

	private List<Pokemon> pokemons;
	private int nbPokemons;
	
	/**
	 * 
	 * @param nbPokemons
	 */
	public Tournament(int nbPokemons) {
		this.nbPokemons = nbPokemons;
		this.pokemons = new ArrayList<Pokemon>();
	}
	
	
	/**
	 * @return the pokemons
	 */
	public List<Pokemon> getPokemons() {
		return pokemons;
	}


	/**
	 * @return the nbPokemons
	 */
	public int getNbPokemons() {
		return nbPokemons;
	}
	
	/**
	 * 
	 * @return
	 */
	public Map<Integer, List<Pokemon>> getDuels() {
		Collections.shuffle(this.pokemons);
		Map<Integer, List<Pokemon>> duels = new HashMap<Integer, List<Pokemon>>();
		int size = this.pokemons.size();
		int mid = size / 2;
		int j = 0; // numero coorespondant au duel
		if (size % 2 == 0) {
			for (int i = 0; i < mid; i++) {
				List<Pokemon> list = new ArrayList<Pokemon>(); // les deux pokemons qui s'affronteront
				list.add(this.pokemons.get(i));
				list.add(this.pokemons.get(i+mid));
				duels.put(j, list);
			}
		} else {
			for (int i = 0; i < mid; i++) {
				List<Pokemon> list = new ArrayList<Pokemon>(); // les deux pokemons qui s'affronteront
				list.add(this.pokemons.get(i));
				list.add(this.pokemons.get(i+mid+1));
				duels.put(j, list);
			}
		}
		return duels;
	}
	
	/**
	 * 
	 * @param p1
	 * @param p2
	 */
	public void fight(Pokemon p1, Pokemon p2) {
		p1.cry();
		p2.cry();
		while (p1.isAlive() && p2.isAlive()) {
			p1.attack(p2);
			System.out.println(p1.getName() + " attacks " + p2.getName() + ", " + p2.getName() + " lost " + p1.getStrengthPoint() + " life points " + " and got now " + p2.getLifePoint() + " life points ");
			if (p2.isAlive()) {
				p2.attack(p1);
				System.out.println(p2.getName() + " against attacks " + p1.getName() + ", " + p1.getName() + " lost " + p2.getStrengthPoint() + " life points " + " and got now " + p1.getLifePoint() + " life points ");
			}
		}
		p1.endingFight();
		p2.endingFight();
		if (p1.isAlive()) {
			this.removePokemon(p2);
			p1.cry();
			p2.cry();
			System.out.println(p1.getName() + " wins this battle :-)");
		} else {
			this.removePokemon(p1);
			p1.cry();
			p2.cry();
			System.out.println(p2.getName() + " wins this battle :-)");
		}
		System.out.println();
	}
	/**
	 * 
	 * @return
	 */
	public boolean isFinished() {
		return this.pokemons.size() == 1;
 	}
	
	/**
	 * 
	 */
	public void addPokemon(Pokemon p) {
		this.pokemons.add(p);
	}
	
	/**
	 * 
	 */
	public void removePokemon(Pokemon p) {
		this.pokemons.remove(p);
	}
	
}
