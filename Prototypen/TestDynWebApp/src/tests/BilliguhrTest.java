package tests;

import static org.junit.Assert.*;
import org.junit.*;
import func.*;

public class BilliguhrTest {
	
	@Test
	public void entwickleZweitesUhrwerk() {
		BilligUhr billiguhr = new BilligUhr();
		billiguhr.entwickleUhrwerk();
		boolean[] result = billiguhr.getUhrwerk();
		
		assertTrue("erstes Uhrwerk wurde nicht erstellt", result[0]);
		assertTrue("zweites Uhrwerk wurde nicht entwickelt", result[1]);
		assertFalse("drittes Uhrwerk wurde entwickelt", result[2]);
	}
	
	@Test
	public void entwickleZweitesGehaeuse() {
		BilligUhr billiguhr = new BilligUhr();
		billiguhr.entwickleGehause();
		boolean[] result = billiguhr.getGehaeuse();
		
		assertTrue("erstes Gehäuse wurde nicht erstellt", result[0]);
		assertTrue("zweites Gehäuse wurde nicht entwickelt", result[1]);
		assertFalse("drittes Gehäuse wurde entwickelt", result[2]);
	}
	
	@Test
	public void entwickleZweitesArmband() {
		BilligUhr billiguhr = new BilligUhr();
		billiguhr.entwickleArmband();
		boolean[] result = billiguhr.getArmband();
		
		assertTrue("erstes Armband wurde nicht erstellt", result[0]);
		assertTrue("zweites Armband wurde nicht entwickelt", result[1]);
		assertFalse("drittes Armband wurde entwickelt", result[2]);
	}

}
