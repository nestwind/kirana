package com.kirana.services;

import java.security.SecureRandom;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class CommonUtils {
	
	public String getHash(String passTxt)
	{
		String retVar="";
		try
		{
			int strength = 10;
			 BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(strength, new SecureRandom());
			 retVar = bCryptPasswordEncoder.encode(passTxt);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return retVar;	
	}
}
