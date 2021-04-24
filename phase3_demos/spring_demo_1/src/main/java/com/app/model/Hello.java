package com.app.model;

public class Hello {

	private String message;
	public Hello() {
		// TODO Auto-generated constructor stub
		System.out.println("Empty constructor was called");
	}
	public String getMessage() {
		
		return message;
	}
	public void setMessage(String message) {
		System.out.println("setter was called with message "+message);
		this.message = message;
	}
	public Hello(String message) {
		super();
		System.out.println("constructor with message was  called with message : "+message);
		this.message = message;
	}
	@Override
	public String toString() {
		return "Hello [message=" + message + "]";
	}
	
}
