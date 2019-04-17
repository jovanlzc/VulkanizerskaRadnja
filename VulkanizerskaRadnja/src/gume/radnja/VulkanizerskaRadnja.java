package gume.radnja;
import java.util.LinkedList;
import gume.AutoGuma;
/**
 * 
 * @author Jovan Lazic
 * @version 1.0
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Kolekcija guma kao LinkedList
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	
	/**
	 * 
	 * @param a nova auto guma koja se dodaje u listu.
	 * @throws java.lang.RuntimeException ako je uneta guma null ili ako guma vec postoji.
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	/**
	 * 
	 * @param markaModel marka modela po kojoj se pretrazuje guma.
	 * @return null ako je prosledjena markaModel null ili  novaLista kao LinkedList koja sadrzi gume koje imaju marku i model koja je prosledjena 
	 * kao parametar ako markaModel nije null.
	 * 
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for(int i=0;i<gume.size();i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}