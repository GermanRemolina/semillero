package com.semillero.login.servicios;

import com.semillero.login.modelo.UserModel;
import com.semillero.login.repositorio.IUserReoisitorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service

public class userServicios {
    
    @Autowired
    IUserReoisitorio userRepositorio;
    
    public ArrayList <UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepositorio.findAll();
    }

    public UserModel saveUser(UserModel user){
        return userRepositorio.save(user);
    }

    public Optional<UserModel> getByid(long id){
        return userRepositorio.findById(id);
    }
}
