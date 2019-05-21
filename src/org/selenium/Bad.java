package org.selenium;

import org.junit.Test;

import junit.framework.Assert;

public class Bad {
@Test
public void atest() {
	System.out.println("Atest");
	Assert.assertTrue(true);
	Assert.assertTrue(true);
	System.out.println("Done");
}
@Test
public void ztest() {
	System.out.println("Ztest");
Assert.assertTrue(true);
Assert.assertTrue(false);
System.out.println("Done");
}
@Test
public void ctest() {
	System.out.println("Ctest");
	Assert.assertTrue(false);
	Assert.assertTrue(false);
	System.out.println("Done");

}
}
