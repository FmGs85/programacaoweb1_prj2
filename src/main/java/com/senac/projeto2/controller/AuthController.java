package com.senac.projeto2.controller;

import com.senac.projeto2.security.JwtUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> body) {
        String user = body.get("username");
        String pass = body.get("password");


        if ("admin".equals(user) && "123".equals(pass)) {
            String token = JwtUtil.generateToken(user);
            return Map.of("token", token);
        }

        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Usuário ou senha inválidos");
    }
}

