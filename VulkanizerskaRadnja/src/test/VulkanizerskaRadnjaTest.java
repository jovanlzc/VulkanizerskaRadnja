package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja vr;
	@Before
	public void setUp() throws Exception {
		vr= new VulkanizerskaRadnja();
	}
	@After
	public void tearDown() throws Exception {
		vr=null;
	}
	
	@Test
	public void dodajGumuTest() {
		AutoGuma autoGuma = new AutoGuma();
		autoGuma.setMarkaModel("Tigar");
		autoGuma.setPrecnik(20);
		autoGuma.setVisina(50);
		autoGuma.setSirina(200);
		vr.dodajGumu(autoGuma);
		assertEquals(autoGuma, vr.pronadjiGumu("Tigar").getFirst());
	}
	
	@Test(expected=java.lang.RuntimeException.class)
	public void dodajGumuTestNull() {
		vr.dodajGumu(null);
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void dodajGumuTestVecSadrzi() {
		AutoGuma autoGuma = new AutoGuma();
		autoGuma.setMarkaModel("Tigar");
		autoGuma.setPrecnik(20);
		autoGuma.setVisina(50);
		autoGuma.setSirina(200);
		vr.dodajGumu(autoGuma);
		vr.dodajGumu(autoGuma);
	}
	
	@Test 
	public void pronadjiGumuTest() {
		AutoGuma autoGuma = new AutoGuma();
		autoGuma.setMarkaModel("Tigar");
		autoGuma.setPrecnik(20);
		autoGuma.setVisina(50);
		autoGuma.setSirina(200);
		vr.dodajGumu(autoGuma);
		assertEquals(autoGuma, vr.pronadjiGumu("Tigar").getFirst());
	}
	
	@Test
	public void pronadjiGumuTestNull() {
		assertTrue(null==vr.pronadjiGumu(null));
	}
	
	@Test
	public void pronadjiGumuTestNepostojeca() {
		AutoGuma autoGuma = new AutoGuma();
		autoGuma.setMarkaModel("Tigar");
		autoGuma.setPrecnik(20);
		autoGuma.setVisina(50);
		autoGuma.setSirina(200);
		vr.dodajGumu(autoGuma);
		LinkedList<AutoGuma> gume = vr.pronadjiGumu("asd");
		assertTrue(gume.isEmpty());
	}
	@Test 
	public void pronadjiGumuTestViseGuma() {
		AutoGuma autoGuma = new AutoGuma();
		autoGuma.setMarkaModel("Tigar");
		autoGuma.setPrecnik(20);
		autoGuma.setVisina(50);
		autoGuma.setSirina(200);
		AutoGuma autoGuma1 = new AutoGuma();
		autoGuma1.setMarkaModel("Tigar");
		autoGuma1.setPrecnik(21);
		autoGuma1.setVisina(51);
		autoGuma1.setSirina(201);
		vr.dodajGumu(autoGuma);
		vr.dodajGumu(autoGuma1);
		LinkedList<AutoGuma> gume = vr.pronadjiGumu("Tigar");
		assertTrue(2==gume.size());
	}
}	
