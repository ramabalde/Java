/**
 * 
 */
package tournament.entities;

/**
 * @author bah01
 *
 */
public interface Cry {
	
	/**
	 * 
	 * @param pokemon
	 * @return
	 */
	public boolean isPossible(Pokemon pokemon);
	
	/**
	 * 
	 * @return
	 */
	public String cry();
	
}
