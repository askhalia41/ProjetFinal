package fr.m2i.formation.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EncryptUtilTest {

	@Test
	public void testHashPwd() {
		
		
		String hashed = EncryptUtil.hashPwd("Trump");
		System.out.println("hashed: "+ hashed);
		
	}

	@Test
	public void testCheckHashedPwd() {
			assertTrue("",EncryptUtil.checkHashedPwd("Trump",EncryptUtil.hashPwd("Trump")));
	}

}
