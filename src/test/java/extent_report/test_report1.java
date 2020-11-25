package extent_report;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class test_report1 extends extent_frame{
	@Test(groups = "Smoke")
	public void Rtest1() {
		System.out.println("I am in Rtest1");
		assertTrue(5==5);
	}
	@Test(groups = "Sanity")
	public void Rtest2() {
		System.out.println("I am in Rtest2");
		assertTrue(4==4);
	}
	@Test(groups = "Sanity")
	public void Rtest3() {
		System.out.println("I am in Rtest3");
		assertTrue(5==5);
	}
	

}
