package com.jwt;

import io.jsonwebtoken.Claims;

public class Test {

	public static void main(String[] args) {

		JwtUtil jwt = new JwtUtil();
		String token = jwt.generateToken("12345", "pradeep", "zt");

		System.out.println(token);

		
		
		Claims c = jwt.getClaims("zt", token);
		System.out.println(c.getId());
		System.out.println(c.getSubject());

		System.out.println(c.getIssuer());
		
//		System.out.println(c.getIssuedAt());
		System.out.println(c.getExpiration());

	}

}
