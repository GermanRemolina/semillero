package com.semillero.login.repositorio;

import com.semillero.login.modelo.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IUserReoisitorio extends JpaRepository<UserModel, Long> {

}
