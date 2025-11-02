package br.com.phamtecnologia.controllers;

import br.com.phamtecnologia.dtos.requests.CreateUserRequest;
import br.com.phamtecnologia.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class CreateUserController {

    @Autowired
    private UserService userService;

    @PostMapping("create")
    public ResponseEntity<?> create(@RequestBody CreateUserRequest request) {
        return ResponseEntity.ok().body(userService.createUser(request));
    }
}
