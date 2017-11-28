package com.imooc.web.controller;

import com.imooc.dto.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public User create(@Valid @RequestBody User user, BindingResult errors) {
        if (errors.hasErrors()) {
            errors.getAllErrors().stream().forEach(error -> System.out.println(error.getObjectName() + "==" + error.getDefaultMessage()));
        }
        System.out.println(user);
        user.setId(1);

        return user;
    }
    @GetMapping("/{id:\\d+}")
    public void getInfo( @PathVariable  String id) {
       // throw new RuntimeException("user not exist");

    }
    @PutMapping("/{id:\\d+}")
    public User update(@Valid @RequestBody User user, BindingResult errors) {
        if (errors.hasErrors()) {
            errors.getAllErrors().stream().forEach(error -> {
                        FieldError fieldError = (FieldError) error;
                        String message = fieldError.getField() + " "+error.getDefaultMessage();
                        System.out.println(message);
                    }
            );
        }
        System.out.println(user);
        user.setId(1);

        return user;
    }
}
