package com.spring.fleamarket.global.security.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;

import com.auth0.jwt.exceptions.TokenExpiredException;

public interface JwtTokenService {
	
	public Authentication getAuthentication(String token) throws TokenExpiredException, Exception;
	
	public String getJwtToken(HttpServletRequest request);

	public String generateAccessToken(int id, String username);

	public int getIdFromJwtToken(String token);

	public String getUsernameFromJwtToken(String token);
	
}