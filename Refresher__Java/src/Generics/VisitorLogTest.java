package Generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class VisitorLogTest {

	@Test
	public void test() {
		VisitorLog<VisitorInformation> vl = new VisitorLog<VisitorInformation>();
		vl.addVisitor(new VisitorInformation("Venkatesh", 2001, "Casual Visit"));
		vl.addVisitor(new VisitorInformation("Ramanujam", 2002 ,"To renew membership"));
		int length = vl.getSize();
		assertEquals(2, length);
		assertEquals(2002,vl.getVisitor(1).id);
	}
	@Test
	public void test1() {
		VisitorLog<VisitorInformation> vl = new VisitorLog<VisitorInformation>();
		for(int i = 0; i < 100; i++)
			vl.addVisitor(new VisitorInformation("Venkatesh", i, "Casual Visit"));
		//vl.addVisitor(new VisitorInformation("Ramanujam", 2002 ,"To renew membership"));
		int length = vl.getSize();
		assertEquals(100, length);
		assertEquals(99,vl.getVisitor(99).id);
	}
}
