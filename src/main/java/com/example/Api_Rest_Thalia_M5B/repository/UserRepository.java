/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Api_Rest_Thalia_M5B.repository;

import com.example.Api_Rest_Thalia_M5B.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author thalia
 */
public interface UserRepository extends JpaRepository<User, Long>{
    
}
