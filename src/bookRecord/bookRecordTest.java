package bookRecord;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class bookRecordTest {
	bookRecord me;
	@Before
	public void setUp() {
		me = new bookRecord();
	}
	@Test
	public void testAdd() {
		me.add("MineCraft 101");
		me.add("CSGO: sniping 102");
		me.add("silver to global elite in 1 month");
		assertEquals(3, me.size());
		me.add("Knox college survival guide");
		assertEquals(4, me.size());
	}
	
	public void testTotal() {
		me.add("MineCraft 101");
		me.add("CSGO: sniping 102");
		me.add("silver to global elite in 1 month");
		String placebo = me.total();
		assertEquals(placebo.contains("MineCraft 101"), true);
		assertEquals(placebo.contains("hello kitty"), false);
	}
	

}
