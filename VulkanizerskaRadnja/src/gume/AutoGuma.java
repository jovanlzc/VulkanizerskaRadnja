package gume;
/**
 * @Author Jovan Lazic
 * @version 1.0
 */
public class AutoGuma {
	/**
	 * @ Marka modela kao String.
	 */
	private String markaModel = null;
	/**
	 * Precnik gume kao int.
	 */
	private int precnik = 0;
	/**
	 * Sirina gume kao int.
	 */
	private int sirina = 0;
	/**
	 * Visina gume kao int.
	 */
	private int visina = 0;
	
	/**
	 * Metoda koja vraca marku modela gume.
	 * @return markaModel kao String.
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	/**
	 * Metoda postavlja novu marku modela.
	 * @param markaModel nova vrednost za marku modela.
	 * @throws java.lang.RuntimeException ako je uneta marka null ili duzine manje od 3 slova.
	 */
	public void setMarkaModel(String markaModel){
		if (markaModel==null || markaModel.length()<3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	/**
	 * Metoda koja vraca precnik gume.
	 * @return precnik kao int.
	 */
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * Metoda koja postavlja novi precnik gume.
	 * @param precnik nova vrednost za precnik.
	 * @throws java.lang.RuntimeException ako je uneti precnik manji od 13 ili veci od 22.
	 */
	public void setPrecnik(int precnik){
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	/**
	 * Metoda koja vraca sirinu gume.
	 * @return sirina kao int
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * Metoda koja postavlja novu sirinu gume.
	 * @param sirina nova vrednost za sirinu gume.
	 * @throws java.lang.RuntimeException ako je uneta sirina manja od 135 ili veca od 355.
	 */
	public void setSirina(int sirina){
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * Metoda koja vraca visinu gume.
	 * @return visina kao int.
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * Metoda koja postavlja novu visinu gume.
	 * @param visina nova vrednost za visinu gume.
	 * @throws java.lang.RuntimeException ako je uneta visina manja od 25 ili veca od 95.
	 */
	public void setVisina(int visina){
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	/**
	 * Metoda koja vraca sve podatke o gumi.
	 * @return novi string koji sadrzi sve podatke o gumi.
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
				", sirina=" + sirina + ", visina=" + visina + "]";
	}
	/**
	 * Poredi dve gume po marki modela, precniku,sirini i visini.
	 * @return true ako su svi atributi obe gume isti, false ako ti nije slucaj.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
	

}
