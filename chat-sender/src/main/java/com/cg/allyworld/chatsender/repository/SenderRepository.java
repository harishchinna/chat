package com.cg.allyworld.chatsender.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.allyworld.chatsender.entity.ChatWebsite;

@Repository
public interface SenderRepository extends MongoRepository<ChatWebsite, Integer>{

	
}
