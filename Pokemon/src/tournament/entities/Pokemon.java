/**
 * 
 */
package tournament.entities;

import java.util.*;

/**
 * @author bah01
 *
 */
public class Pokemon {

		private String name;
		private int lifePoint;
		private int strengthPoint;
		private boolean beginningFight;
		private List<Cry> cries;
		
		
		public Pokemon(String name, int lifePoint, int strengthPoint, List<Cry> cries) {
			this.name = name;
			this.lifePoint = lifePoint;
			this.strengthPoint = strengthPoint;
			this.beginningFight = true;
			this.cries = cries;
		}


		/**
		 * @return the name
		 */
		public String getName() {
			return this.name;
		}


		/**
		 * @return the lifePoint
		 */
		public int getLifePoint() {
			return this.lifePoint;
		}


		/**
		 * @return the strengthPoint
		 */
		public int getStrengthPoint() {
			return this.strengthPoint;
		}


		/**
		 * @return the beginningFight
		 */
		public boolean isBeginningFight() {
			return this.beginningFight;
		}


		/**
		 * @return the cries
		 */
		public List<Cry> getCries() {
			return cries;
		}
		
		public void endingFight() {
			this.beginningFight = false;
		}
		
		public boolean isAlive() {
			return this.lifePoint > 0;
		}


		/**
		 * @param lifePoint the lifePoint to set
		 */
		public void changeLifePoint(int lifePoint) {
			this.lifePoint = lifePoint;
		}


		/**
		 * @param strengthPoint the strengthPoint to set
		 */
		public void changeStrengthPoint(int strengthPoint) {
			this.strengthPoint = strengthPoint;
		}
		
		public void cry() {
			for(Cry c : this.cries) {
				if (c.isPossible(this)) System.out.println(this.name + ": " + c.cry());
			}
		}
		
		public void attack(Pokemon pokemon) {
			pokemon.changeLifePoint(pokemon.getLifePoint()-this.getStrengthPoint());
		}
		
}
