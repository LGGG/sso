package com.yufu.authserver.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class JWTUtil {
    @Autowired
    private RSAPublicKey publicKey;//Get the key instance
    @Autowired
    private RSAPrivateKey privateKey;//Get the key instance

    private int id;
}
