package com.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderPasswordGenerationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder bpe = new BCryptPasswordEncoder();
		for(int i=0;i<10;i++) {
			String s=bpe.encode("vikas");
			boolean matches = bpe.matches("vikas",s);
			
			System.out.println(s+" matches = "+matches);
		}
	}

}
