package com.cg.allyworld.chatsender.service;

public interface SenderService {

	void replyingMessage(Integer senderId, Integer receiverId, String message);

	void sendMessage(Integer senderId, Integer receiverId, String message);

}
