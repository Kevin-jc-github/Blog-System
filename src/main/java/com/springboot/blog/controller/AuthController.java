package com.springboot.blog.controller;

<<<<<<< HEAD
<<<<<<< HEAD
=======
import com.springboot.blog.dto.JWTAuthResponse;
>>>>>>> 5f653ff (update with JWT function)
=======
import com.springboot.blog.dto.JWTAuthResponse;
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
import com.springboot.blog.dto.LoginDto;
import com.springboot.blog.dto.RegisterDto;
import com.springboot.blog.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
<<<<<<< HEAD
@RequestMapping("/api/auth")
=======
@RequestMapping("/api/v1/auth")
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
public class AuthController {

    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    //Build Login REST API
    @PostMapping(value = {"/login", "/signin"})
<<<<<<< HEAD
<<<<<<< HEAD
    public ResponseEntity<String> login(@RequestBody LoginDto loginDto){
        String response = authService.login(loginDto);
        return ResponseEntity.ok(response);
=======
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
    public ResponseEntity<JWTAuthResponse> login(@RequestBody LoginDto loginDto){
        String token = authService.login(loginDto);

        JWTAuthResponse jwtAuthResponse = new JWTAuthResponse();
        jwtAuthResponse.setAccessToken(token);

        return ResponseEntity.ok(jwtAuthResponse);
<<<<<<< HEAD
>>>>>>> 5f653ff (update with JWT function)
=======
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
    }

    //Build Register REST API
    @PostMapping(value = {"/register", "/signup"})
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto){
        String response = authService.register(registerDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
