package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

public class AutoGumaTest {
	private AutoGuma autoGuma;
	
	@Before
	public void setUp() throws Exception {
		autoGuma= new AutoGuma();
	}
	@After
	public void tearDown() throws Exception {
		autoGuma=null;
	}
	
	@Test
	public void testSetMarkaModela() {
		autoGuma.setMarkaModel("Tigar");
		assertEquals("Tigar", autoGuma.getMarkaModel());
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetMarkaModelaNull() {
		autoGuma.setMarkaModel(null);
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetMarkaModelaKratakString() {
		autoGuma.setMarkaModel("T");
	}
	@Test
	public void testSetPrecnik(){
		autoGuma.setPrecnik(20);
		assertEquals(20, autoGuma.getPrecnik());
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetPrecnikNedozvoljenoMali(){
		autoGuma.setPrecnik(5);
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetPrecnikNedozvoljenoVeliki(){
		autoGuma.setPrecnik(500);
	}
	@Test
	public void testSetSirina() throws Exception{
		autoGuma.setSirina(200);
		assertEquals(200, autoGuma.getSirina());
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetSirinaNedozvoljenoMala(){
		autoGuma.setSirina(5);
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetSirinaNedozvoljenoVelika(){
		autoGuma.setSirina(550);
	}
	@Test
	public void testSetVisina(){
		autoGuma.setVisina(50);
		assertEquals(50, autoGuma.getVisina());
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetVisinaNedozvoljenoMala(){
		autoGuma.setVisina(5);
	}
	

	@Test(expected=java.lang.RuntimeException.class)
	public void testSetVisinaNedozvoljenoVelika(){
		autoGuma.setVisina(500);
	}
	
	@Test
	public void testToString() {
		autoGuma.setMarkaModel("Tigar");
		autoGuma.setPrecnik(20);
		autoGuma.setVisina(50);
		autoGuma.setSirina(200);
		
		assertEquals("AutoGuma [markaModel=Tigar, precnik=20, sirina=200, visina=50]", autoGuma.toString());
		
	}
	@Test
	public void testEqualsObjectTRUE() {
		autoGuma.setMarkaModel("Tigar");
		autoGuma.setPrecnik(20);
		autoGuma.setVisina(50);
		autoGuma.setSirina(200);
		
		AutoGuma autoGuma2 = new AutoGuma();
		autoGuma2.setMarkaModel("Tigar");
		autoGuma2.setPrecnik(20);
		autoGuma2.setVisina(50);
		autoGuma2.setSirina(200);
		
		assertTrue(autoGuma.equals(autoGuma2));
	}
	
	@Test
	public void testEqualsObjectFALSE() {
		autoGuma.setMarkaModel("Tigar");
		autoGuma.setPrecnik(20);
		autoGuma.setVisina(50);
		autoGuma.setSirina(200);
		
		AutoGuma autoGuma2 = new AutoGuma();
		autoGuma2.setMarkaModel("Trayal");
		autoGuma2.setPrecnik(20);
		autoGuma2.setVisina(50);
		autoGuma2.setSirina(200);
		
		assertFalse(autoGuma.equals(autoGuma2));
	}
}
