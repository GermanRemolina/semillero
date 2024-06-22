package com.semillero.login.controlador;


import com.semillero.login.modelo.UserModel;
import com.semillero.login.servicios.userServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")

public class userControlador {

    @Autowired
    private userServicios userServicios;

    @GetMapping
    public ArrayList<UserModel> getUsers(){
        return this.userServicios.getUsers();
    }
    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user){
        return  this.userServicios.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable){
        return this.userServicios.getByid(id)
    }

}
