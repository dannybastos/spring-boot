package com.example.springboot.dto;

public class HiResponseDTO {

	private String message;
	private String clientIp;
	private String serverIp;
	
	public HiResponseDTO(String message, String clientIp, String serverIp) {
		super();
		this.message = message;
		this.clientIp = clientIp;
		this.serverIp = serverIp;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public String getServerIp() {
		return serverIp;
	}
	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

}
