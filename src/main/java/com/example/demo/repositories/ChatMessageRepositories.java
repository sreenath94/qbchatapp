package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserMessages;

public interface ChatMessageRepositories extends JpaRepository<UserMessages, Integer> {

}
