package tests;

import org.junit.Test;
import func;

public class BilliguhrTest {
	
	@Test
	public void entwickleZweitesUhrwerk() {
		Billiguhr billiguhr = new Billiguhr();
		boolean[] result = billiguhr.entwickleUhrwerk().getUhrwerk();
		
		assertTrue("erstes Uhrwerk wurde nicht erstellt", result[0]);
		assertTrue("zweites Uhrwerk wurde nicht entwickelt", result[1]);
		assertFalse("drittes Uhrwerk wurde entwickelt", result[2]);
	}
	
	@Test
	public void entwickleZweitesGehaeuse() {
		Billiguhr billiguhr = new Billiguhr();
		boolean[] result = billiguhr.entwickleGehause().getGehause();
		
		assertTrue("erstes Gehäuse wurde nicht erstellt", result[0]);
		assertTrue("zweites Gehäuse wurde nicht entwickelt", result[1]);
		assertFalse("drittes Gehäuse wurde entwickelt", result[2]);
	}
	
	@Test
	public void entwickleZweitesArmband() {
		Billiguhr billiguhr = new Billiguhr();
		boolean[] result = billiguhr.entwickleArmband().getArmband();
		
		assertTrue("erstes Armband wurde nicht erstellt", result[0]);
		assertTrue("zweites Armband wurde nicht entwickelt", result[1]);
		assertFalse("drittes Armband wurde entwickelt", result[2]);
	}

}
