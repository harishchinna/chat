package com.cg.allyworld.chatsender.entity;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.allyworld.chatsender.resource.SenderResource;

@RabbitListener(queues = "chatQ")
@Component
public class Receiver {
	
	@Autowired
	private SenderResource resource;
 
	@RabbitHandler
	public void replyingMessage(Object chatReply[]) {
		System.out.println(chatReply[0]+""+chatReply[1]+""+chatReply[2]);
	}
}
