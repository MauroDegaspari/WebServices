package com.maurodegaspari.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maurodegaspari.webservices.modal.UserModel;

public interface UserRepositorio extends JpaRepository<UserModel, Long> {

}
