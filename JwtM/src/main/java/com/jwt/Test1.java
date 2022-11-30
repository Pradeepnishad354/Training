//package com.jwt;
//
//import java.util.Base64;
//import java.util.Date;
//import java.util.concurrent.TimeUnit;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//public class Test1 {
//	
//	public static void main(String[] args) {
//		
//	// token generation
//		
//		String key="mahadev";
//		
//		String token=
//		
//		Jwts.builder()
//		.setId("256") //id 
//		.setSubject("pradeep")// subject
//		.setIssuer("zt")      //provider
//		.setIssuedAt(new Date(System.currentTimeMillis()))// token generation date
//		.setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(10)))// valid until
//		.signWith(SignatureAlgorithm.HS256,// algo 
//				Base64.getEncoder().encode(key.getBytes()))// secret key
//		
//		.compact();// String 
//		
//		System.out.println(token);
//		
////	-----	Read token /Parse token ---------
//		
//		Claims c=
//		Jwts.parser()
//		.setSigningKey(Base64.getEncoder().encode(key.getBytes()))
//		.parseClaimsJws(token)
//		.getBody();
//		
//		System.out.println(c.getId());
//		System.out.println(c.getSubject());
//		System.out.println(c.getIssuer());
//		System.out.println(c.getIssuedAt());
//		System.out.println(c.getExpiration());
//		
//		
//	}
//
//}
