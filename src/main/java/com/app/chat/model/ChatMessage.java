package com.app.chat.model;

public class ChatMessage {
	private String sender;
	private String content;
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ChatMessage(String sender, String content) {
		this.sender = sender;
		this.content = content;
	}
	public ChatMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
