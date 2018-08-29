package fr.m2i.formation.util;

import org.apache.log4j.Logger;
import org.mindrot.jbcrypt.BCrypt;

public class EncryptUtil {
	
	private static final Logger logger = Logger.getLogger(EncryptUtil.class);
	
	public static String hashPwd(String pwd) {
		logger.info("In hashPwd ( " + pwd + ")");
		String hashed = BCrypt.hashpw(pwd,BCrypt.gensalt(12)); // degré de cryptage,12 par defaut : max 30
		logger.info("Out of hashPwd (" + pwd + "), return : " + hashed);
		return hashed;
		
	}
	
	public static boolean checkHashedPwd(String pwd, String hashed) {
		
		logger.info("In checkHashPwd ( " + pwd +", "+ hashed+ ")");
		
		
		if (BCrypt.checkpw(pwd, hashed)) {
			logger.debug("It match");
			return true;
		} else {
			logger.debug("It does not match");
			return false;
		}
		
		
	}

}
