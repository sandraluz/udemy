package com.in28minutes.rest.webservices.restfull_web_services.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	private LocalDateTime timespamp;
	private String message;
	private String details;

	public ErrorDetails(LocalDateTime timespamp, String message, String description) {
		super();
		this.timespamp = timespamp;
		this.message = message;
		this.details = description;
	}

	public LocalDateTime getTimespamp() {
		return timespamp;
	}

	public void setTimespamp(LocalDateTime timespamp) {
		this.timespamp = timespamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}


}
