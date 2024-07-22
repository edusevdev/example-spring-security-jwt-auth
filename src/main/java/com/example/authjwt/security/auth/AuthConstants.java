package com.example.authjwt.security.auth;

import io.jsonwebtoken.Jwts;

import javax.crypto.SecretKey;

public final class AuthConstants {

    private AuthConstants() {
        throw new AssertionError("This class cannot be instanced!");
    }

    protected static final SecretKey SECRET_KEY = Jwts.SIG.HS256.key().build();
    protected static final String PREFIX_TOKEN = "Bearer ";
    protected static final String HEADER_AUTHORIZATION = "Authorization";
}
